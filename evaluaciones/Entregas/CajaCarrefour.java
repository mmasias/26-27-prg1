
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class CajaCarrefour {

    static final int MINUTOS = 720;
    static final int TOTAL_CAJAS = 6;
    static final double PROBABILIDAD_LLEGADA = 0.60;

    static Random aleatorio = new Random();
    static Scanner teclado = new Scanner(System.in);

    static Queue<Integer> cola = new LinkedList<>();

    static int[] tiempo = new int[TOTAL_CAJAS];
    static int[] compra = new int[TOTAL_CAJAS];
    static boolean[] activas = new boolean[TOTAL_CAJAS];

    static int minutosSinCola = 0;
    static int clientesAtendidos = 0;
    static int itemsVendidos = 0;

    // Control de la caja de apoyo
    static boolean apoyoAutomatico = false;
    static int clientesTerminadosApoyo = 0;
    static boolean apoyoManual = false;

    public static void main(String[] args) {

        // Las cuatro primeras cajas comienzan abiertas
        for (int i = 0; i < 4; i++) {
            activas[i] = true;
        }

        System.out.println("CENTRO COMERCIAL CF - EL ALISAL");
        System.out.println("Horario: 9:00 AM - 9:00 PM");
        System.out.println("================================");

        int opcion;

        do {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Iniciar simulacion");
            System.out.println("2. Superadministrador");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();

            if (opcion == 2) {
                superadministrador();
            } else if (opcion != 1) {
                System.out.println("Opcion no valida");
            }

        } while (opcion != 1);

        simular();
        teclado.close();
    }

    public static void simular() {

        for (int minuto = 1; minuto <= MINUTOS; minuto++) {

            // 1. Avanzar un minuto de atencion
            for (int i = 0; i < TOTAL_CAJAS; i++) {

                if (tiempo[i] > 0) {

                    tiempo[i]--;

                    // Un cliente termina su compra
                    if (tiempo[i] == 0) {

                        clientesAtendidos++;
                        itemsVendidos += compra[i];
                        compra[i] = 0;

                        if (i == 4 && apoyoAutomatico) {
                            clientesTerminadosApoyo++;
                        }
                    }
                }
            }

            // 2. Llegada de un nuevo cliente
            boolean llega = aleatorio.nextDouble()
                    < PROBABILIDAD_LLEGADA;

            if (llega) {

                // Compra aleatoria entre 5 y 15 packs
                int packs = aleatorio.nextInt(11) + 5;
                cola.add(packs);
            }

            // 3. Abrir caja de apoyo si hay mas
            // de 15 personas esperando
            if (cola.size() > 15 && !activas[4]) {

                activas[4] = true;
                apoyoAutomatico = true;
                clientesTerminadosApoyo = 0;
            }

            // 4. Comprobar si puede cerrarse el apoyo
            actualizarApoyo();

            // 5. Asignar clientes a cajas libres
            for (int i = 0; i < TOTAL_CAJAS; i++) {

                if (!activas[i] || tiempo[i] != 0
                        || cola.isEmpty()) {
                    continue;
                }

                // Caja de apoyo: debe completar 5 clientes
                // o continuar mientras la cola sea > 15
                if (i == 4 && apoyoAutomatico
                        && clientesTerminadosApoyo >= 5
                        && cola.size() <= 15) {
                    continue;
                }

                int packs = cola.poll();

                tiempo[i] = packs;
                compra[i] = packs;
            }

            // 6. Contar minutos con cola vacia
            if (cola.isEmpty()) {
                minutosSinCola++;
            }

            // 7. Mostrar lo ocurrido en el minuto
            System.out.print("MINUTO " + minuto + " - ");

            if (llega) {
                System.out.print("Llega 1 persona");
            } else {
                System.out.print("No llega nadie");
            }

            System.out.print(" - En Cola: " + cola.size());

            boolean primeraCaja = true;

            for (int i = 0; i < TOTAL_CAJAS; i++) {

                if (activas[i] || tiempo[i] > 0) {

                    if (!primeraCaja) {
                        System.out.print(" | ");
                    } else {
                        System.out.print(" ");
                    }

                    System.out.print(
                        "Caja" + (i + 1) + ":[" + tiempo[i] + "]"
                    );

                    primeraCaja = false;
                }
            }

            System.out.println();
            System.out.println(
                "------------------------------------------------"
            );
        }

        mostrarResumen();
    }

    // Control de cierre de la caja de apoyo
    public static void actualizarApoyo() {

        if (!apoyoAutomatico) {
            return;
        }

        boolean minimoCumplido =
                clientesTerminadosApoyo >= 5;

        boolean colaControlada =
                cola.size() <= 15;

        boolean cajaLibre =
                tiempo[4] == 0;

        // Solo cerrar cuando se cumplen
        // todas las condiciones
        if (minimoCumplido && colaControlada && cajaLibre) {

            activas[4] = false;
            apoyoAutomatico = false;
            clientesTerminadosApoyo = 0;
        }
    }

    // Resumen del reto extendido
    public static void mostrarResumen() {

        System.out.println();
        System.out.println("RESUMEN");
        System.out.println("================================================");

        System.out.println(
            "Minutos con cola en cero      : " + minutosSinCola
        );

        System.out.println(
            "Personas en cola al cierre    : " + cola.size()
        );

        System.out.println(
            "Personas atendidas en el dia  : " + clientesAtendidos
        );

        System.out.println(
            "Items vendidos en el dia      : " + itemsVendidos
        );

        System.out.println("================================================");
    }

    // Gestion manual de las seis cajas
    public static void superadministrador() {

        int opcion;

        do {
            System.out.println("\nSUPERADMINISTRADOR");
            System.out.println("1. Encender caja");
            System.out.println("2. Apagar caja");
            System.out.println("3. Consultar cajas");
            System.out.println("4. Volver al menu");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();

            if (opcion == 1 || opcion == 2) {

                System.out.print("Numero de caja (1-6): ");
                int numero = teclado.nextInt();

                if (numero < 1 || numero > 6) {
                    System.out.println("Caja no valida");
                    continue;
                }

                int indice = numero - 1;

                if (opcion == 1) {

                    activas[indice] = true;

                    if (indice == 4) {
                        apoyoManual = true;
                        apoyoAutomatico = false;
                    }

                    System.out.println("Caja encendida");

                } else {

                    activas[indice] = false;

                    if (indice == 4) {
                        apoyoManual = false;
                        apoyoAutomatico = false;
                    }

                    System.out.println("Caja apagada");
                }

            } else if (opcion == 3) {

                for (int i = 0; i < TOTAL_CAJAS; i++) {

                    String estado = activas[i]
                            ? "ENCENDIDA" : "APAGADA";

                    System.out.println(
                        "Caja " + (i + 1) + ": " + estado
                    );
                }

            } else if (opcion != 4) {

                System.out.println("Opcion no valida");
            }

        } while (opcion != 4);
    }
}
