class ViajeDeMarco {
    public static void main(String[] args) {

        final double DISTANCIA_INICIAL = 350;
        final double KM_MADRE_POR_DIA = 80;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.3;
        final double PROBABILIDAD_ESCAPE = 0.15;
        final double PROBABILIDAD_CANSANCIO = 0.25;

        boolean encontrada;
        encontrada = false;
        int dias = 0;
        double distancia = DISTANCIA_INICIAL;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        do {
            dias = dias + 1;
            System.out.println("DIA " + dias);

            // Velocidad entre 10 y 15 Km/h y horas entre 8 y 10
            double velocidad = 10 + Math.random() * 5;
            double horas = 8 + Math.random() * 2;

            // Clima
            double clima = Math.random();
            if (clima < PROBABILIDAD_LLUVIA_FUERTE) {
                velocidad = velocidad * 0.25;
                System.out.println("Lluvia fuerte");
            } else if (clima < PROBABILIDAD_LLUVIA_FUERTE + PROBABILIDAD_LLUVIA_NORMAL) {
                velocidad = velocidad * 0.75;
                System.out.println("Lluvia normal");
            } else {
                System.out.println("Buen clima");
            }

            // Amedio
            if (Math.random() < PROBABILIDAD_CANSANCIO) {
                velocidad = velocidad * 0.9;
                System.out.println("Amedio se cansa");
            }
            if (Math.random() < PROBABILIDAD_ESCAPE) {
                horas = horas - 2;
                System.out.println("Amedio se escapa");
            }

            double kmMarco = velocidad * horas;
            System.out.println("Marco recorre " + (int) kmMarco + " Km");
            System.out.println("Mamá recorre " + (int) KM_MADRE_POR_DIA + " Km");

            distancia = distancia + KM_MADRE_POR_DIA - kmMarco;

            if (distancia <= 0) {
                encontrada = true;
                System.out.println("¡Marco encuentra a su madre!");
            } else {
                System.out.println("Distancia entre los dos: " + (int) distancia + " Km");
                System.out.println("---------------------------------");
            }
        } while (!encontrada);

        System.out.println("Marco ha tardado " + dias + " días en encontrar a su madre.");
    }
}