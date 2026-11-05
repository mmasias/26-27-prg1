package entregas.garciaDiego;

class retoCCCF {

    public static void main(String[] args) {

        final int MINUTOS_JORNADA = 720;
        final double PROBABILIDAD_LLEGADA = 0.6;
        final int ITEMS_MINIMO = 5;
        final int ITEMS_MAXIMO = 15;
        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int personasEnCola = 0;
        int minutosSinCola = 0;
        int personasAtendidas = 0;
        int itemsVendidos = 0;

        for (int minutoActual = 1; minutoActual <= MINUTOS_JORNADA; minutoActual++) {

            boolean llegaAlguien = Math.random() < PROBABILIDAD_LLEGADA;

            if (llegaAlguien) {
                personasEnCola++;
            }

            if (caja1 > 0) {
                caja1--;
                itemsVendidos++;
            } else if (personasEnCola > 0) {
                caja1 = ITEMS_MINIMO + (int) (Math.random() * (ITEMS_MAXIMO - ITEMS_MINIMO + 1));
                personasEnCola--;
                personasAtendidas++;
            }

            if (caja2 > 0) {
                caja2--;
                itemsVendidos++;
            } else if (personasEnCola > 0) {
                caja2 = ITEMS_MINIMO + (int) (Math.random() * (ITEMS_MAXIMO - ITEMS_MINIMO + 1));
                personasEnCola--;
                personasAtendidas++;
            }

            if (caja3 > 0) {
                caja3--;
                itemsVendidos++;
            } else if (personasEnCola > 0) {
                caja3 = ITEMS_MINIMO + (int) (Math.random() * (ITEMS_MAXIMO - ITEMS_MINIMO + 1));
                personasEnCola--;
                personasAtendidas++;
            }

            if (caja4 > 0) {
                caja4--;
                itemsVendidos++;
            } else if (personasEnCola > 0) {
                caja4 = ITEMS_MINIMO + (int) (Math.random() * (ITEMS_MAXIMO - ITEMS_MINIMO + 1));
                personasEnCola--;
                personasAtendidas++;
            }

            if (personasEnCola == 0) {
                minutosSinCola++;
            }

            String textoLlegada;
            if (llegaAlguien) {
                textoLlegada = "Llega 1 persona";
            } else {
                textoLlegada = "No llega nadie ";
            }

            System.out.println("MINUTO " + minutoActual + " - " + textoLlegada + " - En Cola: " + personasEnCola);
            System.out.println(
                    "Caja1:[" + caja1 + "] | Caja2:[" + caja2 + "] | Caja3:[" + caja3 + "] | Caja4:[" + caja4 + "]");
            System.out.println("_".repeat(48));

            if (minutoActual == MINUTOS_JORNADA) {
                System.out.println();
                System.out.println("RESUMEN");
                System.out.println("=".repeat(48));
                System.out.println("Minutos con cola en cero      : " + minutosSinCola);
                System.out.println("Personas en la cola al cierre : " + personasEnCola);
                System.out.println("Personas atendidas en el dia  : " + personasAtendidas);
                System.out.println("Articulos vendidos en el dia  : " + itemsVendidos);
                System.out.println("=".repeat(48));
            }

        }

    }

}