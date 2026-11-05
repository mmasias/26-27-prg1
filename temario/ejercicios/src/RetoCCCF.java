
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class RetoCCCF {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        Queue<Cliente> cola = new LinkedList<>();

        // Arrays para las 6 cajas
        int[] cajas = new int[6];
        int[] packsOriginales = new int[6];
        boolean[] cajasActivas = new boolean[6];

        // Las primeras 4 cajas empiezan encendidas
        for (int i = 0; i < 4; i++) {
            cajasActivas[i] = true;
        }

        // Variables del resumen
        int personasAtendidas = 0;
        int itemsVendidos = 0;
        int minutosSinCola = 0;
        int siguienteCliente = 1;

        // Variables de la caja automatica
        int cajaAutomatica = -1;
        int clientesCajaAutomatica = 0;

        // MENU DEL SUPERADMINISTRADOR
        int opcion = 0;

        System.out.println("=== SUPERADMINISTRADOR ===");

        while (opcion != 3) {

            System.out.println("\n1. Encender una caja");
            System.out.println("2. Apagar una caja");
            System.out.println("3. Iniciar simulacion");
            System.out.print("Elige una opcion: ");

            opcion = teclado.nextInt();

            if (opcion == 1 || opcion == 2) {

                System.out.print("Numero de caja (1-6): ");
                int numeroCaja = teclado.nextInt();

                if (numeroCaja >= 1 && numeroCaja <= 6) {

                    int indice = numeroCaja - 1;

                    if (opcion == 1) {

                        cajasActivas[indice] = true;
                        System.out.println("Caja " + numeroCaja
                                + " encendida.");

                    } else {

                        if (cajaAutomatica == indice) {
                            System.out.println(
                                    "No puedes apagar la caja automatica.");
                        } else if (cajas[indice] > 0) {
                            System.out.println(
                                    "No puedes apagar una caja ocupada.");
                        } else {
                            cajasActivas[indice] = false;
                            System.out.println("Caja " + numeroCaja
                                    + " apagada.");
                        }
                    }

                } else {
                    System.out.println("Numero de caja incorrecto.");
                }

            } else if (opcion != 3) {
                System.out.println("Opcion incorrecta.");
            }
        }

        System.out.println("\n=== INICIO DE LA SIMULACION ===");

        // SIMULACION DE 720 MINUTOS
        for (int minuto = 1; minuto <= 720; minuto++) {

            System.out.println("\nMINUTO " + minuto);

            // 1. Llegada de clientes
            if (random.nextInt(100) < 60) {

                int packs = random.nextInt(11) + 5;

                Cliente cliente = new Cliente(
                        siguienteCliente, packs);

                cola.add(cliente);

                System.out.println("- Llega 1 persona");

                siguienteCliente++;

            } else {

                System.out.println("- No llega nadie");
            }

            // 2. Abrir una caja automatica si hay mas de 15 personas
            if (cola.size() > 15 && cajaAutomatica == -1) {

                for (int i = 4; i < 6; i++) {

                    if (!cajasActivas[i]) {

                        cajaAutomatica = i;
                        cajasActivas[i] = true;
                        clientesCajaAutomatica = 0;

                        System.out.println("Se abre automaticamente "
                                + "la caja " + (i + 1));

                        break;
                    }
                }
            }

            // 3. Asignar clientes a las cajas libres
            for (int i = 0; i < cajas.length; i++) {

                if (cajasActivas[i] && cajas[i] == 0
                        && !cola.isEmpty()) {

                    Cliente cliente = cola.poll();

                    cajas[i] = cliente.packs;
                    packsOriginales[i] = cliente.packs;

                }
            }

            // 4. Contar minutos sin cola
            if (cola.isEmpty()) {
                minutosSinCola++;
            }

            // 5. Atender clientes
            for (int i = 0; i < cajas.length; i++) {

                if (cajasActivas[i] && cajas[i] > 0) {

                    cajas[i]--;

                    // Comprobar si termina el cliente
                    if (cajas[i] == 0) {

                        personasAtendidas++;

                        itemsVendidos += packsOriginales[i];

                        packsOriginales[i] = 0;

                        // Contar clientes atendidos por caja automatica
                        if (i == cajaAutomatica) {
                            clientesCajaAutomatica++;
                        }
                    }
                }
            }

            // 6. Cerrar caja automatica cuando corresponda
            if (cajaAutomatica != -1
                    && clientesCajaAutomatica >= 5
                    && cola.size() <= 15
                    && cajas[cajaAutomatica] == 0) {

                System.out.println("Se cierra automaticamente la caja "
                        + (cajaAutomatica + 1));

                cajasActivas[cajaAutomatica] = false;

                cajas[cajaAutomatica] = 0;
                packsOriginales[cajaAutomatica] = 0;

                cajaAutomatica = -1;
                clientesCajaAutomatica = 0;
            }

            // 7. Mostrar personas en cola
            System.out.println("- En Cola: " + cola.size());

            // 8. Mostrar estado de las cajas
            for (int i = 0; i < cajas.length; i++) {

                System.out.print("Caja" + (i + 1) + ":");

                if (!cajasActivas[i]) {

                    System.out.print("[Apagada]");

                } else {

                    System.out.print("[" + cajas[i] + "]");
                }

                if (i < cajas.length - 1) {
                    System.out.print(" | ");
                }
            }

            System.out.println();
            System.out.println("----------------------------------------");
        }

        // RESUMEN FINAL
        System.out.println("\nRESUMEN");
        System.out.println("================================================");
        System.out.println("Minutos con cola en cero       : "
                + minutosSinCola);
        System.out.println("Personas en la cola al cierre  : "
                + cola.size());
        System.out.println("Personas atendidas en el dia   : "
                + personasAtendidas);
        System.out.println("Articulos vendidos en el dia   : "
                + itemsVendidos);
        System.out.println("================================================");

        teclado.close();
    }
}

// CLASE CLIENTE
class Cliente {

    int id;
    int packs;

    public Cliente(int id, int packs) {
        this.id = id;
        this.packs = packs;
    }
}