public class RetoCCCF {
    public static void main(String[] args) {

        final int MINUTOS_POR_DIA = 720;
        final double PROBABILIDAD_CLIENTE_NUEVO = 0.6;
        final int CANTIDAD_MINIMA_PACKS_CLIENTE = 5;
        final int CANTIDAD_MAXIMA_PACKS_CLIENTE = 15;

        int minutoActual = 0;
        int clientesLlegados = 0;
        int clientesEnFila = 0;
        int clientesAtendidos = 0;
        int minutosSinFila = 0;
        int packsVendidos = 0;

        int packsClienteCajaUno = 0;
        int packsClienteCajaDos = 0;
        int packsClienteCajaTres = 0;
        int packsClienteCajaCuatro = 0;

        boolean cajaUnoLibre = true;
        boolean cajaDosLibre = true;
        boolean cajaTresLibre = true;
        boolean cajaCuatroLibre = true;

        double probabilidadClienteNuevo;
        boolean llegaUnaPersona = false;


        System.out.println("SIMULADOR CENTRO COMERCIAL CF");
        System.out.println("Horario: 09:00 - 21:00");
        System.out.println("================================================");
        
        do {
            minutoActual++;

            if (cajaUnoLibre == false) {
                packsClienteCajaUno--;
                packsVendidos++;

                if (packsClienteCajaUno == 0) {
                    cajaUnoLibre = true;
                    clientesAtendidos++;
                }
            }

            if (cajaDosLibre == false) {
                packsClienteCajaDos--;
                packsVendidos++;

                if (packsClienteCajaDos == 0) {
                    cajaDosLibre = true;
                    clientesAtendidos++;
                }
            }

            if (cajaTresLibre == false) {
                packsClienteCajaTres--;
                packsVendidos++;

                if (packsClienteCajaTres == 0) {
                    cajaTresLibre = true;
                    clientesAtendidos++;
                }
            }

            if (cajaCuatroLibre == false) {
                packsClienteCajaCuatro--;
                packsVendidos++;

                if (packsClienteCajaCuatro == 0) {
                    cajaCuatroLibre = true;
                    clientesAtendidos++;
                }
            }

            probabilidadClienteNuevo = Math.random();

            if (probabilidadClienteNuevo < PROBABILIDAD_CLIENTE_NUEVO) {
                clientesLlegados++;
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

            if (cajaUnoLibre == true && clientesEnFila > 0) {
                cajaUnoLibre = false;
                clientesEnFila--;

                packsClienteCajaUno = (int) (Math.random()
                        * (CANTIDAD_MAXIMA_PACKS_CLIENTE
                        - CANTIDAD_MINIMA_PACKS_CLIENTE + 1))
                        + CANTIDAD_MINIMA_PACKS_CLIENTE;
            }

            if (cajaDosLibre == true && clientesEnFila > 0) {
                cajaDosLibre = false;
                clientesEnFila--;

                packsClienteCajaDos = (int) (Math.random()
                        * (CANTIDAD_MAXIMA_PACKS_CLIENTE
                        - CANTIDAD_MINIMA_PACKS_CLIENTE + 1))
                        + CANTIDAD_MINIMA_PACKS_CLIENTE;
            }

            if (cajaTresLibre == true && clientesEnFila > 0) {
                cajaTresLibre = false;
                clientesEnFila--;

                packsClienteCajaTres = (int) (Math.random()
                        * (CANTIDAD_MAXIMA_PACKS_CLIENTE
                        - CANTIDAD_MINIMA_PACKS_CLIENTE + 1))
                        + CANTIDAD_MINIMA_PACKS_CLIENTE;
            }

            if (cajaCuatroLibre == true && clientesEnFila > 0) {
                cajaCuatroLibre = false;
                clientesEnFila--;

                packsClienteCajaCuatro = (int) (Math.random()
                        * (CANTIDAD_MAXIMA_PACKS_CLIENTE
                        - CANTIDAD_MINIMA_PACKS_CLIENTE + 1))
                        + CANTIDAD_MINIMA_PACKS_CLIENTE;
            }

            System.out.println("En cola: " + clientesEnFila);

            if (cajaUnoLibre == true) {
                System.out.print("Caja1:[LIBRE] | ");
            } else {
                System.out.print("Caja1:[" + packsClienteCajaUno + "] | ");
            }

            if (cajaDosLibre == true) {
                System.out.print("Caja2:[LIBRE] | ");
            } else {
                System.out.print("Caja2:[" + packsClienteCajaDos + "] | ");
            }

            if (cajaTresLibre == true) {
                System.out.print("Caja3:[LIBRE] | ");
            } else {
                System.out.print("Caja3:[" + packsClienteCajaTres + "] | ");
            }

            if (cajaCuatroLibre == true) {
                System.out.println("Caja4:[LIBRE]");
            } else {
                System.out.println("Caja4:[" + packsClienteCajaCuatro + "]");
            }

            if (clientesEnFila == 0) {
                minutosSinFila++;
            }

            System.out.println("----------------------------------------");

        } while (minutoActual < MINUTOS_POR_DIA);

        int clientesEnCaja = 0;

        if (cajaUnoLibre == false) {
            clientesEnCaja++;
        }

        if (cajaDosLibre == false) {
            clientesEnCaja++;
        }

        if (cajaTresLibre == false) {
            clientesEnCaja++;
        }

        if (cajaCuatroLibre == false) {
            clientesEnCaja++;
        }

        System.out.println();
        System.out.println("RESUMEN DEL DIA");
        System.out.println("================================================");
        System.out.println("Minutos sin personas en cola: " + minutosSinFila);
        System.out.println("Personas en cola al cierre: " + clientesEnFila);
        System.out.println("Personas atendidas durante el dia: " + clientesAtendidos);
        System.out.println("Packs procesados durante el dia: " + packsVendidos);
        System.out.println("================================================");
        System.out.println("Clientes llegados: " + clientesLlegados);
        System.out.println("Clientes que siguen en caja: " + clientesEnCaja);
        System.out.println("Comprobacion de clientes: "
                + (clientesAtendidos + clientesEnFila + clientesEnCaja)
                + " de " + clientesLlegados);
    }
}
