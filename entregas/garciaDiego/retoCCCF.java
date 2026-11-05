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

        for (int minutoActual = 1; minutoActual >= MINUTOS_JORNADA; minutoActual++) {
            
            boolean llegaAlguien = Math.random() < PROBABILIDAD_LLEGADA;

            if (llegaAlguien) {
                personasEnCola++;
            }

             if (caja1 > 0) {
                caja1--;
            } else if (personasEnCola > 0) {
                caja1 = ITEMS_MINIMO + (int) (Math.random() * (ITEMS_MAXIMO - ITEMS_MINIMO + 1));
                personasEnCola--;
            }
 
            if (caja2 > 0) {
                caja2--;
            } else if (personasEnCola > 0) {
                caja2 = ITEMS_MINIMO + (int) (Math.random() * (ITEMS_MAXIMO - ITEMS_MINIMO + 1));
                personasEnCola--;
            }
 
            if (caja3 > 0) {
                caja3--;
            } else if (personasEnCola > 0) {
                caja3 = ITEMS_MINIMO + (int) (Math.random() * (ITEMS_MAXIMO - ITEMS_MINIMO + 1));
                personasEnCola--;
            }
 
            if (caja4 > 0) {
                caja4--;
            } else if (personasEnCola > 0) {
                caja4 = ITEMS_MINIMO + (int) (Math.random() * (ITEMS_MAXIMO - ITEMS_MINIMO + 1));
                personasEnCola--;
            }


        }


    }
    
}