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

        final double PROBABILIDAD_AMEDIO_SE_CANSA = 0.25;
        final double PROBABILIDAD_AMEDIO_SE_ESCAPA = 0.15;
        final double FACTOR_AMEDIO_EN_BRAZOS = 0.90;
        final double HORAS_PERDIDAS_BUSCANDO_AMEDIO = 2;

        final double VELOCIDAD_MINIMA_MADRE = 6;
        final double VELOCIDAD_MAXIMA_MADRE = 9;
        final double HORAS_MINIMAS_MADRE = 6;
        final double HORAS_MAXIMAS_MADRE = 9;

        final double PROBABILIDAD_LLUVIA_FUERTE_MADRE = 0.10;
        final double PROBABILIDAD_LLUVIA_MADRE = 0.30;
        final double FACTOR_LLUVIA_FUERTE_MADRE = 0.50;
        final double FACTOR_LLUVIA_MADRE = 0.75;

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

            boolean amedioSeCansa = Math.random() < PROBABILIDAD_AMEDIO_SE_CANSA;
            boolean amedioSeEscapa = Math.random() < PROBABILIDAD_AMEDIO_SE_ESCAPA;

            if (amedioSeCansa) {
                velocidadMarco = velocidadMarco * FACTOR_AMEDIO_EN_BRAZOS;
                System.out.println("Amedio se ha cansado y lo llevo en brazos");
            }
            if (amedioSeEscapa) {
                horasMarco = horasMarco - HORAS_PERDIDAS_BUSCANDO_AMEDIO;
                System.out.println("¡He perdido tiempo buscando a Amedio!");
            }

            double avanceMarco = velocidadMarco * horasMarco;
            System.out.printf("Avance %.2f horas a %.2f Km/h recorriendo %.2f Km%n",
                    horasMarco, velocidadMarco, avanceMarco);

            double velocidadMadre = VELOCIDAD_MINIMA_MADRE
                    + Math.random() * (VELOCIDAD_MAXIMA_MADRE - VELOCIDAD_MINIMA_MADRE);
            double horasMadre = HORAS_MINIMAS_MADRE
                    + Math.random() * (HORAS_MAXIMAS_MADRE - HORAS_MINIMAS_MADRE);

            double climaMadre = Math.random();
            if (climaMadre < PROBABILIDAD_LLUVIA_FUERTE_MADRE) {
                velocidadMadre = velocidadMadre * FACTOR_LLUVIA_FUERTE_MADRE;
                System.out.println("A mamá le ha llovido muchísimo");
            } else if (climaMadre < PROBABILIDAD_LLUVIA_FUERTE_MADRE + PROBABILIDAD_LLUVIA_MADRE) {
                velocidadMadre = velocidadMadre * FACTOR_LLUVIA_MADRE;
                System.out.println("A mamá le ha llovido un poco");
            } else {
                System.out.println("A mamá le ha hecho un buen día");
            }

            double avanceMadre = velocidadMadre * horasMadre;
            System.out.printf("Mama pudo avanzar %.2f horas a %.2f Km/h recorriendo %.2f Km%n",
                    horasMadre, velocidadMadre, avanceMadre);

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
