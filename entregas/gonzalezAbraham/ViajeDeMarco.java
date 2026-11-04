class ViajeDeMarco {
    public static void main(String[] args) {
        final double DISTANCIA_INICIAL = 350;

        final double VELOCIDAD_MINIMA_MARCO = 10;
        final double VELOCIDAD_MAXIMA_MARCO = 15;
        final double HORAS_MINIMAS_MARCO = 8;
        final double HORAS_MAXIMAS_MARCO = 10;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.10;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.30;
        final double FACTOR_LLUVIA_FUERTE = 0.25;
        final double FACTOR_LLUVIA_NORMAL = 0.75;

        final double AVANCE_DIARIO_MADRE = 80;

        double distancia = DISTANCIA_INICIAL;
        int dia = 0;
        boolean encontrada = false;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        while (!encontrada) {
            dia++;
            System.out.println("DIA " + dia);

            double velocidadMarco = VELOCIDAD_MINIMA_MARCO
                    + Math.random() * (VELOCIDAD_MAXIMA_MARCO - VELOCIDAD_MINIMA_MARCO);
            double horasMarco = HORAS_MINIMAS_MARCO
                    + Math.random() * (HORAS_MAXIMAS_MARCO - HORAS_MINIMAS_MARCO);

            double climaMarco = Math.random();
            if (climaMarco < PROBABILIDAD_LLUVIA_FUERTE) {
                velocidadMarco = velocidadMarco * FACTOR_LLUVIA_FUERTE;
                System.out.println("¡Ha llovido muchísimo!");
            } else if (climaMarco < PROBABILIDAD_LLUVIA_FUERTE + PROBABILIDAD_LLUVIA_NORMAL) {
                velocidadMarco = velocidadMarco * FACTOR_LLUVIA_NORMAL;
                System.out.println("Ha llovido un poco");
            } else {
                System.out.println("Ha hecho un buen día");
            }

            double avanceMarco = velocidadMarco * horasMarco;
            System.out.printf("Avance %.2f horas a %.2f Km/h recorriendo %.2f Km%n",
                    horasMarco, velocidadMarco, avanceMarco);

            double avanceMadre = AVANCE_DIARIO_MADRE;
            System.out.printf("Mamá avanzó %.2f Km%n", avanceMadre);

            distancia = distancia + avanceMadre - avanceMarco;
            encontrada = distancia <= 0;

            if (encontrada) {
                System.out.println("************************************************************");
                System.out.println("Al final del día " + dia + " Marco encuentra a su madre!!!");
                System.out.println("************************************************************");
            } else {
                System.out.printf("Al final del día %d la distancia entre Marco y su Madre es de %.2f Km%n",
                        dia, distancia);
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            }
        }
    }
}
