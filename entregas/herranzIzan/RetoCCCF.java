public class RetoCCCF {
    public static void main(String[] args) {

        final int MINUTOS_POR_DIA = 720;
        final double PROBABILIDAD_CLIENTE_NUEVO = 0.6;
        final int CANTIDAD_MINIMA_PACKS_CLIENTE = 5;
        final int CANTIDAD_MAXIMA_PACKS_CLIENTE = 15;

        int minutoActual = 0;

        System.out.println("SIMULADOR CENTRO COMERCIAL CF");
        System.out.println("Horario: 09:00 - 21:00");
        
        do {
            minutoActual++;

            System.out.println("MINUTO " + minutoActual);

        } while (minutoActual < MINUTOS_POR_DIA);
    }
}
