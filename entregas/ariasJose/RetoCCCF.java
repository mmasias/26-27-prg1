class RetoCCCF {
    public static void main(String[] args) {
        
        final int MINUTOS_POR_DIA = 720;
        final double PROBABILIDAD_CLIENTE_NUEVO_POR_MINUTO = 0.6;
        final int CAJAS = 4;
        final int CANTIDAD_MINIMA_PACKS_CLIENTE = 5;
        final int CANTIDAD_MAXIMA_PACKS_CLIENTE = 15;

        int minutoActual = 0;
        int clientesTotales = 0;
        int clientesEnFila = 0;
        int clientesEnCaja = 0;
        int PacksClienteCajaUno;
        int PacksClienteCajaDos;
        int PacksClienteCajaTres;
        int PacksClienteCajaCuatro;


        Boolean cajaUnoLibre = false;
        Boolean cajaDosLibre = false;
        Boolean cajaTresLibre = false;
        Boolean cajaCuatroLibre = false;

        Boolean procesadoCompraCajaUno = false;

        do {
            minutoActual ++;

            if (cajaUnoLibre == true && clientesEnFila > 0) {

            clientesEnFila = clientesEnFila -1;
            clientesEnCaja ++;

            PacksClienteCajaUno = (int) (Math.random() * (CANTIDAD_MAXIMA_PACKS_CLIENTE - CANTIDAD_MINIMA_PACKS_CLIENTE + 1)) + CANTIDAD_MINIMA_PACKS_CLIENTE;
            
                while (procesadoCompraCajaUno == false) {

                }
            }

            System.out.println("Minuto: " + minutoActual);

        }
        while (minutoActual < MINUTOS_POR_DIA);

    }
}