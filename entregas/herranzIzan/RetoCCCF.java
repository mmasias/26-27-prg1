public class RetoCCCF {
    public static void main(String[] args) {

        final int MINUTOS_POR_DIA = 720;
        final double PROBABILIDAD_CLIENTE_NUEVO = 0.6;
        final int CANTIDAD_MINIMA_PACKS_CLIENTE = 5;
        final int CANTIDAD_MAXIMA_PACKS_CLIENTE = 15;

        int minutoActual = 0;
        int clientesLlegados = 0;
        int clientesEnFila = 0;

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

            System.out.println("En cola: " + clientesEnFila);
            System.out.println("----------------------------------------");

        } while (minutoActual < MINUTOS_POR_DIA);
    }
}
