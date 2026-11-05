import java.util.Scanner;

class CCCF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("SUPERADMINISTRADOR - Ingrese la cantidad de cajas activas (1 a 6): ");
        int cajasDeseadas = scanner.nextInt();

        final int HORARIO = 12;
        final int MINUTOS_EN_HORA = 60;
        final int MINUTOS_TOTAL_ATENCIÓN = HORARIO * MINUTOS_EN_HORA;
        final double PROBABILIDAD_LLEGADA_CLIENTES = 0.6;
        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int caja5 = 0;
        int caja6 = 0;
        final int MIN_PACKS = 5;
        final int MAX_PACKS = 15;

        int clientesEnFila = 0;
        int minutoActual = 0;
        int minutosSinCola = 0;
        int totalClientesAtendidos = 0;
        int totalItemsVendidos = 0;

        boolean caja6Activa = false;
        int atendidosCaja6EstaRonda = 0;
        
        boolean caja1Encendida = (cajasDeseadas >= 1);
        boolean caja2Encendida = (cajasDeseadas >= 2);
        boolean caja3Encendida = (cajasDeseadas >= 3);
        boolean caja4Encendida = (cajasDeseadas >= 4);
        boolean caja5Encendida = (cajasDeseadas >= 5);
        boolean caja6Encendida = (cajasDeseadas >= 6);

        while (minutoActual < MINUTOS_TOTAL_ATENCIÓN) {
            minutoActual++;
            System.out.print("Minuto " + minutoActual + " - ");

            boolean llegoCliente;
            llegoCliente = (Math.random() <= PROBABILIDAD_LLEGADA_CLIENTES);

            if (llegoCliente){
                clientesEnFila++;
                System.out.print("    Llego un cliente    - ");
            } else {
                System.out.print("No llegó nungún cliente - ");
            }

            if (clientesEnFila > 15 && caja6Encendida) {
                caja6Activa = true;
            }

            if (caja1Encendida && caja1 == 0 && clientesEnFila > 0) {
                caja1 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                clientesEnFila--;
            }
            if (caja2Encendida && caja2 == 0 && clientesEnFila > 0){
                caja2 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                clientesEnFila--;
            } 
            if (caja3Encendida && caja3 == 0 && clientesEnFila > 0){
                caja3 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                clientesEnFila--;
            } 
            if (caja4Encendida && caja4 == 0 && clientesEnFila > 0){
                caja4 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                clientesEnFila--;
            }
            if (caja5Encendida && caja5 == 0 && clientesEnFila > 0){
                caja5 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                clientesEnFila--;
            }

            if (caja6Encendida && caja6Activa && caja6 == 0 && clientesEnFila > 0) {
                caja6 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                clientesEnFila--;
                atendidosCaja6EstaRonda++;
            }

            if (clientesEnFila == 0) {
                minutosSinCola++;
            }

            if (caja1Encendida && caja1 == 1) totalClientesAtendidos++;
            if (caja1Encendida && caja1 > 0) {
                caja1--;
                totalItemsVendidos++;
            }

            if (caja2Encendida && caja2 == 1) totalClientesAtendidos++;
            if (caja2Encendida && caja2 > 0) {
                caja2--;
                totalItemsVendidos++;
            }

            if (caja3Encendida && caja3 == 1) totalClientesAtendidos++;
            if (caja3Encendida && caja3 > 0) {
                caja3--;
                totalItemsVendidos++;
            }

            if (caja4Encendida && caja4 == 1) totalClientesAtendidos++;
            if (caja4Encendida && caja4 > 0) {
                caja4--;
                totalItemsVendidos++;
            }

            if (caja5Encendida && caja5 == 1) totalClientesAtendidos++;
            if (caja5Encendida && caja5 > 0) {
                caja5--;
                totalItemsVendidos++;
            }

            if (caja6Encendida && caja6 == 1) totalClientesAtendidos++;
            if (caja6Encendida && caja6 > 0) {
                caja6--;
                totalItemsVendidos++;
            }

            if (caja6Encendida && caja6Activa && caja6 == 0 && atendidosCaja6EstaRonda >= 5 && clientesEnFila <= 15) {
                caja6Activa = false;
                atendidosCaja6EstaRonda = 0;
            }

            System.out.println("En cola: " + clientesEnFila);
            System.out.print("Caja 1: " + (caja1Encendida ? "[" + caja1 + "]" : "(OFF)") + " | ");
            System.out.print("Caja 2: " + (caja2Encendida ? "[" + caja2 + "]" : "(OFF)") + " | ");
            System.out.print("Caja 3: " + (caja3Encendida ? "[" + caja3 + "]" : "(OFF)") + " | ");
            System.out.print("Caja 4: " + (caja4Encendida ? "[" + caja4 + "]" : "(OFF)") + " | ");
            System.out.print("Caja 5: " + (caja5Encendida ? "[" + caja5 + "]" : "(OFF)") + " | ");
            System.out.println("Caja 6 (Extra): " + (!caja6Encendida ? "(OFF BY ADMIN)" : (caja6Activa ? "[" + caja6 + "] (ACTIVA)" : "(INACTIVA)")));
            System.out.println("───────────────────────────────────────────────────────────");
        }
        System.out.println("                      Resumen del día");
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("Minutos totales sin cola                    : " + minutosSinCola);
        System.out.println("Clientes en cola al final del día           : " + clientesEnFila);
        System.out.println("Total de personas atendidas durante el día  : " + totalClientesAtendidos);
        System.out.println("Total de items vendidos en el día           : " + totalItemsVendidos);
        System.out.println("═══════════════════════════════════════════════════════════");
    }
}
