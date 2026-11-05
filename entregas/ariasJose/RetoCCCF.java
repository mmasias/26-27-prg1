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
        int packsClienteCajaDos = 0;
        int packsClienteCajaTres = 0;
        int packsClienteCajaCuatro = 0;
        int packsProcesados = 0;

        Boolean cajaUnoLibre = true;
        Boolean cajaDosLibre = true;
        Boolean cajaTresLibre = true;
        Boolean cajaCuatroLibre = true;
        Boolean llegaUnaPersona = false;

        Boolean procesadoCompraCajaUno = false;
        Boolean procesadoCompraCajaDos = false;
        Boolean procesadoCompraCajaTres = false;
        Boolean procesadoCompraCajaCuatro = false;

        do {
            minutoActual++;
            probabilidadClienteNuevo = Math.random();

            if (probabilidadClienteNuevo <= PROBABILIDAD_CLIENTE_NUEVO) {
                clientesEnFila++;
                llegaUnaPersona = true;
            } else {
                llegaUnaPersona = false;
            }

            System.out.print("MINUTO " + minutoActual + " - ");
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

            if (cajaUnoLibre == true) {
                System.out.print("Caja1:["+packsClienteCajaUno+"] | ");
            } else if (cajaUnoLibre == false) {
                packsClienteCajaUno--;
                System.out.print("Caja1:["+packsClienteCajaUno+"] | ");

                if (packsClienteCajaUno == 0) {
                    cajaUnoLibre = true;
                }
                procesadoCompraCajaUno = true;
            }

            if (cajaDosLibre == true && clientesEnFila > 0) {

                procesadoCompraCajaDos = false;

                cajaDosLibre = false;
                clientesEnFila--;
                clientesEnCaja++;
                packsClienteCajaDos = (int) (Math.random()
                        * (CANTIDAD_MAXIMA_PACKS_CLIENTE - CANTIDAD_MINIMA_PACKS_CLIENTE + 1))
                        + CANTIDAD_MINIMA_PACKS_CLIENTE;

            }

            if (cajaDosLibre == true) {
                System.out.print(" Caja2:["+packsClienteCajaDos+"] | ");
            } else if (cajaDosLibre == false) {
                packsClienteCajaDos--;
                System.out.print(" Caja2:["+packsClienteCajaDos+"] | ");

                if (packsClienteCajaDos == 0) {
                    cajaDosLibre = true;
                }
                procesadoCompraCajaDos = true;

            }
            
            if (cajaTresLibre == true && clientesEnFila > 0) {

                procesadoCompraCajaTres = false;

                cajaTresLibre = false;
                clientesEnFila--;
                clientesEnCaja++;
                packsClienteCajaTres = (int) (Math.random()
                        * (CANTIDAD_MAXIMA_PACKS_CLIENTE - CANTIDAD_MINIMA_PACKS_CLIENTE + 1))
                        + CANTIDAD_MINIMA_PACKS_CLIENTE;

            }

            if (cajaTresLibre == true) {
                System.out.print(" Caja3:["+packsClienteCajaTres+"] | ");
            } else if (cajaTresLibre == false) {
                packsClienteCajaTres--;
                System.out.print(" Caja3:["+packsClienteCajaTres+"] | ");

                if (packsClienteCajaTres == 0) {
                    cajaTresLibre = true;
                }
                procesadoCompraCajaTres = true;

            }

            if (cajaCuatroLibre == true && clientesEnFila > 0) {

                procesadoCompraCajaCuatro = false;

                cajaCuatroLibre = false;
                clientesEnFila--;
                clientesEnCaja++;
                packsClienteCajaCuatro = (int) (Math.random()
                        * (CANTIDAD_MAXIMA_PACKS_CLIENTE - CANTIDAD_MINIMA_PACKS_CLIENTE + 1))
                        + CANTIDAD_MINIMA_PACKS_CLIENTE;

            }

            if (cajaCuatroLibre == true) {
                System.out.println(" Caja4:["+packsClienteCajaCuatro+"] | ");
            } else if (cajaCuatroLibre == false) {
                packsClienteCajaCuatro--;
                System.out.println(" Caja4:["+packsClienteCajaCuatro+"] | ");

                if (packsClienteCajaCuatro == 0) {
                    cajaCuatroLibre = true;
                }
                procesadoCompraCajaCuatro = true;

            }

            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        } while (minutoActual < MINUTOS_POR_DIA);

    }
}