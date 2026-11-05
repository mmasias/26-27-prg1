class RetoCCCF {
    public static void main(String[] args) {

        final int MINUTOS_POR_DIA = 720;
        final double PROBABILIDAD_CLIENTE_NUEVO = 0.6;
        final int CAJAS = 4;
        final int CANTIDAD_MINIMA_PACKS_CLIENTE = 5;
        final int CANTIDAD_MAXIMA_PACKS_CLIENTE = 15;

        double probabilidadClienteNuevo;
        int minutoActual = 0;
        int clientesTotales = 0;
        int clientesEnFila = 0;
        int clientesEnCaja = 0;
        int packsClienteCajaUno = 0;
        int packsClienteCajaDos;
        int packsClienteCajaTres;
        int packsClienteCajaCuatro;
        int packsProcesados = 0;

        Boolean cajaUnoLibre = true;
        Boolean cajaDosLibre = true;
        Boolean cajaTresLibre = true;
        Boolean cajaCuatroLibre = true;
        Boolean llegaUnaPersona = false;

        Boolean procesadoCompraCajaUno = false;

        do {
            minutoActual++;
            probabilidadClienteNuevo = Math.random();

            if (probabilidadClienteNuevo <= PROBABILIDAD_CLIENTE_NUEVO) {
                clientesEnFila++;
                llegaUnaPersona = true;
            } else {
                llegaUnaPersona = false;
            }

            System.out.print("Minuto: " + minutoActual + "- ");
            if (llegaUnaPersona == true) {
                System.out.print("Llega 1 persona - ");
            } else {
                System.out.print("No llega nadie - ");
            }
            System.out.println("En cola: " + clientesEnFila);

            if (cajaUnoLibre == true && clientesEnFila > 0) {

                procesadoCompraCajaUno = false;

                cajaUnoLibre = false;
                clientesEnFila--;
                clientesEnCaja++;
                packsClienteCajaUno = (int) (Math.random()
                        * (CANTIDAD_MAXIMA_PACKS_CLIENTE - CANTIDAD_MINIMA_PACKS_CLIENTE + 1))
                        + CANTIDAD_MINIMA_PACKS_CLIENTE;

            }

            if (cajaUnoLibre == false) {

                System.out.println("Caja1: [" + packsClienteCajaUno + "]");

                packsClienteCajaUno--;
                procesadoCompraCajaUno = true;

            }
            

        } while (minutoActual < 10);

    }
}