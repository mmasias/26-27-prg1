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

        while (enCamino == true) {

            contadorDias++;
            System.out.println("JORNADA " + contadorDias);

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

            double azarAcompanante = Math.random();
            final double CHANCE_CANSANCIO = 0.25;
            final double FACTOR_CANSANCIO = 0.9;
            final double CHANCE_EXTRAVIO = 0.15;
            final int RESTA_TIEMPO_EXTRAVIO = -2;

            if (azarAcompanante <= CHANCE_CANSANCIO) {
                System.out.println("¡El acompañante muestra cansancio extremo!");
                velocidadActual = velocidadActual * FACTOR_CANSANCIO;
            }

            if (azarAcompanante <= CHANCE_EXTRAVIO) {
                System.out.println("¡El acompañante se ha extraviado temporalmente!");
                tiempoHoras = tiempoHoras + RESTA_TIEMPO_EXTRAVIO;
            }

            double avanceJornada = velocidadActual * tiempoHoras;
            distanciaPendiente = distanciaPendiente - avanceJornada + AVANCE_DIARIO_MADRE;

            distanciaPendiente = Math.round(distanciaPendiente * 100.0) / 100.0;
            avanceJornada = Math.round(avanceJornada * 100.0) / 100.0;
            tiempoHoras = Math.round(tiempoHoras * 100.0) / 100.0;
            velocidadActual = Math.round(velocidadActual * 100.0) / 100.0;

            System.out.println("Marcha de " + tiempoHoras + " hrs a " + velocidadActual + " Km/h. Recorridos " + avanceJornada + " Km.");

            if (distanciaPendiente <= 0) {
                enCamino = false;
                System.out.println("¡Al finalizar la jornada " + contadorDias + " la expedición logra su ansiado reencuentro!");
            } else {
                System.out.println("Brecha restante al cierre de la jornada " + contadorDias + ": " + distanciaPendiente + " Km.");
            }

        }
    }
}