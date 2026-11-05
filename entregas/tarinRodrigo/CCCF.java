class ClaseJava {
    public static void main(String[] args) {
        final int HORAS_JORNADA = 12;
        final int MINUTOS_POR_HORA = 60;
        final double PROBABILIDAD_LLEGADA = 0.60;
        final int ITEMS_MIN = 5;
        final int ITEMS_MAX = 15;

        int cola = 0;
        int minutosJornada = HORAS_JORNADA * MINUTOS_POR_HORA;

        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;

        int minutosColaVacia = 0;
        int personasAtendidas = 0;
        int itemsVendidos = 0;

        for (int minuto = 1; minuto <= minutosJornada; minuto++) {
            boolean llegaPersona = Math.random() < PROBABILIDAD_LLEGADA;

            if (llegaPersona) {
                cola++;
                System.out.println("MINUTO " + minuto + " - Llega 1 persona - En Cola: " + cola);
            } else {
                System.out.println("MINUTO " + minuto + " - No llega nadie  - En Cola: " + cola);
            }

            if (caja1 > 0)
                caja1--;
            if (caja2 > 0)
                caja2--;
            if (caja3 > 0)
                caja3--;
            if (caja4 > 0)
                caja4--;

            if (cola > 0 && caja1 == 0) {
                int items = (int) (Math.random() * (ITEMS_MAX - ITEMS_MIN + 1)) + ITEMS_MIN;
                caja1 = items;
                itemsVendidos += items;
                personasAtendidas++;
                cola--;
            }
            if (cola > 0 && caja2 == 0) {
                int items = (int) (Math.random() * (ITEMS_MAX - ITEMS_MIN + 1)) + ITEMS_MIN;
                caja2 = items;
                itemsVendidos += items;
                personasAtendidas++;
                cola--;
            }
            if (cola > 0 && caja3 == 0) {
                int items = (int) (Math.random() * (ITEMS_MAX - ITEMS_MIN + 1)) + ITEMS_MIN;
                caja3 = items;
                itemsVendidos += items;
                personasAtendidas++;
                cola--;
            }
            if (cola > 0 && caja4 == 0) {
                int items = (int) (Math.random() * (ITEMS_MAX - ITEMS_MIN + 1)) + ITEMS_MIN;
                caja4 = items;
                itemsVendidos += items;
                personasAtendidas++;
                cola--;
            }

            if (cola == 0) {
                minutosColaVacia++;
            }

            System.out.println("Caja1:[" + caja1 + "] | Caja2:[" + caja2 + "] | Caja3:[" + caja3 + "] | Caja4:[" + caja4 + "]");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }

        System.out.println("\nRESUMEN");
        System.out.println("============================================================");
        System.out.println("Minutos con cola en cero       : " + minutosColaVacia);
        System.out.println("Personas en la cola al cierre  : " + cola);
        System.out.println("Personas atendidas en el dia   : " + personasAtendidas);
        System.out.println("Articulos vendidos en el dia   : " + itemsVendidos);
        System.out.println("============================================================");
    }
}