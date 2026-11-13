class RetoCCCF {
    public static void main(String[] args) {

        final int MINUTOS_POR_DIA = 720;
        final double PROBABILIDAD_CLIENTE_NUEVO = 0.6;
        final int CANTIDAD_MINIMA_PACKS_CLIENTE = 5;
        final int CANTIDAD_MAXIMA_PACKS_CLIENTE = 15;

        double probabilidadClienteNuevo;
        int minutoActual = 0;
        int clientesAtendidos = 0;
        int clientesEnFila = 0;
        int packsClienteCajaUno = 0;
        int packsClienteCajaDos = 0;
        int packsClienteCajaTres = 0;
        int packsClienteCajaCuatro = 0;
        int minutosSinFila = 0;
        int packsVendidos = 0;

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
                packsClienteCajaUno = (int) (Math.random()
                        * (CANTIDAD_MAXIMA_PACKS_CLIENTE - CANTIDAD_MINIMA_PACKS_CLIENTE + 1))
                        + CANTIDAD_MINIMA_PACKS_CLIENTE;

            }

            if (cajaUnoLibre == true) {
                System.out.print("Caja1:["+packsClienteCajaUno+"] | ");
            } else if (cajaUnoLibre == false) {
                packsClienteCajaUno--;
                packsVendidos ++;
                System.out.print("Caja1:["+packsClienteCajaUno+"] | ");

                if (packsClienteCajaUno == 0) {
                    cajaUnoLibre = true;
                    clientesAtendidos++;
                }
                procesadoCompraCajaUno = true;
            }

            if (cajaDosLibre == true && clientesEnFila > 0) {

                procesadoCompraCajaDos = false;

                cajaDosLibre = false;
                clientesEnFila--;
                packsClienteCajaDos = (int) (Math.random()
                        * (CANTIDAD_MAXIMA_PACKS_CLIENTE - CANTIDAD_MINIMA_PACKS_CLIENTE + 1))
                        + CANTIDAD_MINIMA_PACKS_CLIENTE;

            }

            if (cajaDosLibre == true) {
                System.out.print(" Caja2:["+packsClienteCajaDos+"] | ");
            } else if (cajaDosLibre == false) {
                packsClienteCajaDos--;
                packsVendidos ++;
                System.out.print(" Caja2:["+packsClienteCajaDos+"] | ");

                if (packsClienteCajaDos == 0) {
                    cajaDosLibre = true;
                    clientesAtendidos++;
                }
                procesadoCompraCajaDos = true;

            }
            
            if (cajaTresLibre == true && clientesEnFila > 0) {

                procesadoCompraCajaTres = false;

                cajaTresLibre = false;
                clientesEnFila--;
                packsClienteCajaTres = (int) (Math.random()
                        * (CANTIDAD_MAXIMA_PACKS_CLIENTE - CANTIDAD_MINIMA_PACKS_CLIENTE + 1))
                        + CANTIDAD_MINIMA_PACKS_CLIENTE;

            }

            if (cajaTresLibre == true) {
                System.out.print(" Caja3:["+packsClienteCajaTres+"] | ");
            } else if (cajaTresLibre == false) {
                packsClienteCajaTres--;
                packsVendidos ++;
                System.out.print(" Caja3:["+packsClienteCajaTres+"] | ");

                if (packsClienteCajaTres == 0) {
                    cajaTresLibre = true;
                    clientesAtendidos++;
                }
                procesadoCompraCajaTres = true;

            }

            if (cajaCuatroLibre == true && clientesEnFila > 0) {

                procesadoCompraCajaCuatro = false;

                cajaCuatroLibre = false;
                clientesEnFila--;
                packsClienteCajaCuatro = (int) (Math.random()
                        * (CANTIDAD_MAXIMA_PACKS_CLIENTE - CANTIDAD_MINIMA_PACKS_CLIENTE + 1))
                        + CANTIDAD_MINIMA_PACKS_CLIENTE;

            }

            if (cajaCuatroLibre == true) {
                System.out.println(" Caja4:["+packsClienteCajaCuatro+"] | ");
            } else if (cajaCuatroLibre == false) {
                packsClienteCajaCuatro--;
                packsVendidos ++;
                System.out.println(" Caja4:["+packsClienteCajaCuatro+"] | ");

                if (packsClienteCajaCuatro == 0) {
                    cajaCuatroLibre = true;
                    clientesAtendidos ++;
                }
                procesadoCompraCajaCuatro = true;

            }

            while (clientesEnFila >= 15) {
                clientesEnFila = clientesEnFila - 5;
            }

            if (clientesEnFila == 0) {
                minutosSinFila ++;
            }



            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        } while (minutoActual < MINUTOS_POR_DIA);

        System.out.println("RESUMEN");
        System.out.println("=============================================================");
        System.out.println("Minutos con cola en cero: " + minutosSinFila);
        System.out.println("Personas en la cola al cierre: " + clientesEnFila);
        System.out.println("Pesronas atendidas en el día: " + clientesAtendidos);
        System.out.println("Artículos vendidos en el día: " + packsVendidos);



    }
}