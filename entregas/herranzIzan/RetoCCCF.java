public class RetoCCCF {
    public static void main(String[] args) {

        final int MINUTOS_POR_DIA = 720;
        final double PROBABILIDAD_CLIENTE_NUEVO = 0.6;
        final int CANTIDAD_MINIMA_PACKS_CLIENTE = 5;
        final int CANTIDAD_MAXIMA_PACKS_CLIENTE = 15;

        int minutoActual = 0;
        int clientesLlegados = 0;
        int clientesEnFila = 0;

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
        
        do {
            minutoActual++;

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

            System.out.println("Caja1: [" + packsClienteCajaUno + "]");
            System.out.println("Caja2: [" + packsClienteCajaDos + "]");
            System.out.println("Caja3: [" + packsClienteCajaTres + "]");
            System.out.println("Caja4: [" + packsClienteCajaCuatro + "]");

            System.out.println("----------------------------------------");

        } while (minutoActual < MINUTOS_POR_DIA);
    }
}
