class CCCF {

    public static void main(String[] args) {

        final int HORARIO = 12;
        final int MINUTOS_EN_HORA = 60;
        final int MINUTOS_TOTAL_ATENCIÓN = HORARIO * MINUTOS_EN_HORA;
        final double PROBABILIDAD_LLEGADA_CLIENTES = 0.6;
        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        final int MIN_PACKS = 5;
        final int MAX_PACKS = 15;

        int clientesEnFila = 0;
        int minutoActual = 0;
        int minutosSinCola = 0;
        int totalClientesAtendidos = 0;
        int totalItemsVendidos = 0;

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

            if (caja1 == 0 && clientesEnFila > 0) {
                caja1 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                clientesEnFila--;
            }
            if (caja2 == 0 && clientesEnFila > 0){
                caja2 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                clientesEnFila--;
            } 
            if (caja3 == 0 && clientesEnFila > 0){
                caja3 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                clientesEnFila--;
            } 
            if (caja4 == 0 && clientesEnFila > 0){
                caja4 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                clientesEnFila--;
            }

            if (clientesEnFila == 0) {
                minutosSinCola++;
            }

            if (caja1 == 1) totalClientesAtendidos++;
            if (caja1 > 0) {
                caja1--;
                totalItemsVendidos++;
            }

            if (caja2 == 1) totalClientesAtendidos++;
            if (caja2 > 0) {
                caja2--;
                totalItemsVendidos++;
            }

            if (caja3 == 1) totalClientesAtendidos++;
            if (caja3 > 0) {
                caja3--;
                totalItemsVendidos++;
            }

            if (caja4 == 1) totalClientesAtendidos++;
            if (caja4 > 0) {
                caja4--;
                totalItemsVendidos++;
            }

            System.out.println("En cola: " + clientesEnFila);
            System.out.print("Caja 1: [" + caja1 + "] | ");
            System.out.print("Caja 2: [" + caja2 + "] | ");
            System.out.print("Caja 3: [" + caja3 + "] | ");
            System.out.println("Caja 4: [" + caja4 + "]");
            System.out.println("───────────────────────────────────────────────────────────");
        }

        System.out.println("Minutos totales sin cola: " + minutosSinCola);
        System.out.println("Clientes en cola al final del día: " + clientesEnFila);
        System.out.println("Total de personas atendidas durante el día: " + totalClientesAtendidos);
        System.out.println("Total de items vendidos en el día: " + totalItemsVendidos);
        System.out.println("═══════════════════════════════════════════════════════════");
    }
}
