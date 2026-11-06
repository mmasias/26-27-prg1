public class ViajeMarco {
    public static void main(String[] args) {
        final double AVANCE_DIARIO_MADRE = 80;
        final int VELOCIDAD_BASE_MINIMA = 10;
        final int VELOCIDAD_BASE_MAXIMA = 15;
        final int TIEMPO_BASE_MINIMO = 8;
        final int TIEMPO_BASE_MAXIMO = 10;
        
        double distanciaPendiente = 350;

        System.out.println();
        System.out.println("--- BITACORA DE LA EXPEDICION ---");
        System.out.println("=================================");

        boolean enCamino = true;
        int contadorDias = 0;

        double velocidadActual = (Math.random() * (VELOCIDAD_BASE_MAXIMA - VELOCIDAD_BASE_MINIMA)) + VELOCIDAD_BASE_MINIMA;
        double tiempoHoras = (Math.random() * (TIEMPO_BASE_MAXIMO - TIEMPO_BASE_MINIMO)) + TIEMPO_BASE_MINIMO;

        double azarClima = Math.random();

        final double CHANCE_TORMENTA = 0.1;
        final double FACTOR_TORMENTA = 0.25;
        final double CHANCE_CHUBASCO = 0.3;
        final double FACTOR_CHUBASCO = 0.75;

        if (azarClima <= CHANCE_TORMENTA) {
            System.out.println("¡Tormenta severa! El avance se dificulta gravemente.");
            velocidadActual = velocidadActual * FACTOR_TORMENTA;
        } else if (azarClima <= CHANCE_CHUBASCO) {
            System.out.println("¡Lluvia moderada durante la marcha!");
            velocidadActual = velocidadActual * FACTOR_CHUBASCO;
        } else {
            System.out.println("¡Jornada despejada y favorable!");
        }
    }
}