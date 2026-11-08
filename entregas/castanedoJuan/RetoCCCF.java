package entregas.castanedoJuan;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RetoCCCF {

    // Datos del enunciado
    static final int MINUTOS_JORNADA = 720;      // de 9:00 a 21:00
    static final double PROB_LLEGADA = 0.6;      // 60% por minuto
    static final int MIN_PACKS = 5;
    static final int MAX_PACKS = 15;

    // Reto ampliado
    static final int MAX_CAJAS = 6;              // cajas que puede gestionar el admin
    static final int CAJA_EXTRA = 6;             // posicion de la caja extra en los arrays
    static final int LIMITE_COLA = 15;
    static final int MIN_ATENDIDOS_EXTRA = 5;

    // Cada posicion es una caja (0 a 5 normales, 6 la extra)
    static int[] cajas = new int[7];             // packs que le quedan al cliente de esa caja
    static int[] totalCliente = new int[7];      // packs totales del cliente que esta atendiendo
    static boolean[] activa = new boolean[7];    // si la caja esta encendida
    static ArrayList<Integer> cola = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // al principio hay 4 cajas encendidas
        for (int i = 0; i < 4; i++) {
            activa[i] = true;
        }

        // datos para el resumen
        int minutosColaVacia = 0;
        int personasAtendidas = 0;
        int itemsVendidos = 0;
        int atendidosExtra = 0;

        System.out.print("¿Entrar como superadministrador? (s/n): ");
        boolean admin = sc.nextLine().trim().equalsIgnoreCase("s");
        if (admin) {
            gestionarCajas(sc);
        }

        for (int minuto = 1; minuto <= MINUTOS_JORNADA; minuto++) {
            String aviso = "";

            // el admin puede cambiar las cajas cada hora
            if (admin && minuto > 1 && (minuto - 1) % 60 == 0) {
                System.out.println("*** Ha pasado una hora, el admin puede cambiar las cajas ***");
                gestionarCajas(sc);
            }

            // si hay mas de 15 en cola se abre la caja extra
            if (cola.size() > LIMITE_COLA && !activa[CAJA_EXTRA]) {
                activa[CAJA_EXTRA] = true;
                atendidosExtra = 0;
                aviso = ">> Mas de 15 personas en cola: se abre la caja extra";
            }

            // vemos que cajas estaban ocupadas al empezar el minuto
            boolean[] ocupada = new boolean[7];
            for (int i = 0; i < 7; i++) {
                ocupada[i] = cajas[i] > 0;
            }

            // las cajas libres cogen gente de la cola
            asignarClientes();

            // las cajas que estaban ocupadas atienden un pack
            for (int i = 0; i < 7; i++) {
                if (ocupada[i]) {
                    cajas[i]--;
                    if (cajas[i] == 0) {
                        // ha terminado con el cliente
                        personasAtendidas++;
                        itemsVendidos += totalCliente[i];
                        if (i == CAJA_EXTRA) {
                            atendidosExtra++;
                        }
                    }
                }
            }

            // llegada de un cliente nuevo
            boolean llega = random.nextDouble() < PROB_LLEGADA;
            if (llega) {
                int packs = MIN_PACKS + random.nextInt(MAX_PACKS - MIN_PACKS + 1);
                cola.add(packs);
            }

            // si hay alguna caja libre pasa directo
            asignarClientes();

            // cerrar la caja extra: tiene que estar libre, haber atendido a 5
            // y que ya no haya mas de 15 en cola
            if (activa[CAJA_EXTRA] && cajas[CAJA_EXTRA] == 0
                    && atendidosExtra >= MIN_ATENDIDOS_EXTRA && cola.size() <= LIMITE_COLA) {
                activa[CAJA_EXTRA] = false;
                aviso = ">> Se cierra la caja extra";
            }

            if (cola.isEmpty()) {
                minutosColaVacia++;
            }

            // mostrar el minuto
            String textoLlegada = llega ? "Llega 1 persona" : "No llega nadie ";
            System.out.println("MINUTO " + minuto + " - " + textoLlegada + " - En Cola: " + cola.size());

            String linea = "";
            for (int i = 0; i < 7; i++) {
                if (activa[i] || cajas[i] > 0) {
                    if (!linea.equals("")) {
                        linea += " | ";
                    }
                    if (i == CAJA_EXTRA) {
                        linea += "CajaExtra:[" + cajas[i] + "]";
                    } else {
                        linea += "Caja" + (i + 1) + ":[" + cajas[i] + "]";
                    }
                }
            }
            System.out.println(linea);
            if (!aviso.equals("")) {
                System.out.println(aviso);
            }
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }

        // resumen final
        System.out.println("RESUMEN");
        System.out.println("============================================================");
        System.out.println("Minutos con cola en cero      : " + minutosColaVacia);
        System.out.println("Personas en la cola al cierre : " + cola.size());
        System.out.println("Personas atendidas en el dia  : " + personasAtendidas);
        System.out.println("Articulos vendidos en el dia  : " + itemsVendidos);
        System.out.println("============================================================");

        sc.close();
    }

    // Mete a los clientes de la cola en las cajas que estan libres y encendidas
    static void asignarClientes() {
        for (int i = 0; i < 7; i++) {
            if (activa[i] && cajas[i] == 0 && !cola.isEmpty()) {
                int packs = cola.remove(0);
                cajas[i] = packs;
                totalCliente[i] = packs;
            }
        }
    }

    // Menu del superadministrador para encender y apagar cajas
    static void gestionarCajas(Scanner sc) {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("--- GESTION DE CAJAS ---");
            for (int i = 0; i < MAX_CAJAS; i++) {
                System.out.println("Caja" + (i + 1) + ": " + (activa[i] ? "ENCENDIDA" : "APAGADA"));
            }
            System.out.print("Numero de caja para encender/apagar (1-6), 0 para continuar: ");
            try {
                opcion = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Opcion no valida");
                continue;
            }

            if (opcion >= 1 && opcion <= MAX_CAJAS) {
                int pos = opcion - 1;
                if (activa[pos] && contarEncendidas() == 1) {
                    System.out.println("No se puede apagar la ultima caja");
                } else {
                    activa[pos] = !activa[pos];
                }
            } else if (opcion != 0) {
                System.out.println("Opcion no valida");
            }
        }
    }

    // Cuenta cuantas cajas normales estan encendidas
    static int contarEncendidas() {
        int cuenta = 0;
        for (int i = 0; i < MAX_CAJAS; i++) {
            if (activa[i]) {
                cuenta++;
            }
        }
        return cuenta;
    }
}