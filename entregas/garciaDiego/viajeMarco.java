package entregas.garciaDiego;

class ViajeMarco {

    public static void main(String[] args) {

        final double DISTANCIA_INICIAL = 350;
        final double VELOCIDAD_MIN = 10;
        final double VELOCIDAD_MAX = 15;
        final double HORAS_MIN = 8;
        final double HORAS_MAX = 10;
        final double VELOCIDAD_MADRE_MIN = 6;
        final double VELOCIDAD_MADRE_MAX = 9;
        final double HORAS_MADRE_MIN = 6;
        final double HORAS_MADRE_MAX = 9;
        final double DISTANCIA_NOTICIA = 50;
        final double KM_EXTRA_NOTICIA = 25;

        double distancia = DISTANCIA_INICIAL;
        int dia = 0;

        System.out.println("=".repeat(25));
        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=".repeat(25));

        while (distancia > 0) {

            double velocidad = VELOCIDAD_MIN + Math.random() * (VELOCIDAD_MAX - VELOCIDAD_MIN);
            double horas = HORAS_MIN + Math.random() * (HORAS_MAX - HORAS_MIN);

            double clima = Math.random();
            String mensajeClima;

            if (clima < 0.10) {
                velocidad = velocidad * 0.25;
                mensajeClima = "¡Ha llovido muchísimo!";
            } else if (clima < 0.40) {
                velocidad = velocidad * 0.75;
                mensajeClima = "Ha llovido un poco";
            } else {
                mensajeClima = "Ha hecho un buen día";
            }

            boolean amedioCansado = Math.random() < 0.25;
            boolean amedioEscapado = Math.random() < 0.15;

            if (amedioCansado) {
                velocidad = velocidad * 0.90;
            }
            if (amedioEscapado) {
                horas = horas - 2;
            }

            double avanceMarco = velocidad * horas;

            double velocidadMadre = VELOCIDAD_MADRE_MIN + Math.random() * (VELOCIDAD_MADRE_MAX - VELOCIDAD_MADRE_MIN);
            double horasMadre = HORAS_MADRE_MIN + Math.random() * (HORAS_MADRE_MAX - HORAS_MADRE_MIN);

            double climaMadre = Math.random();
            String mensajeClimaMadre;

            if (climaMadre < 0.10) {
                velocidadMadre = velocidadMadre * 0.50;
                mensajeClimaMadre = "A mamá le ha llovido muchísimo";
            } else if (climaMadre < 0.40) {
                velocidadMadre = velocidadMadre * 0.75;
                mensajeClimaMadre = "A mamá le ha llovido un poco";
            } else {
                mensajeClimaMadre = "A mamá le ha hecho un buen día";
            }

            double avanceMadre = velocidadMadre * horasMadre;

            dia++;
            distancia = distancia - avanceMarco + avanceMadre;

            boolean noticiaMadre = distancia < DISTANCIA_NOTICIA && Math.random() < 0.5;
            if (noticiaMadre) {
                distancia = distancia - KM_EXTRA_NOTICIA;
            }

            System.out.println("DIA " + dia);
            System.out.println(mensajeClima);
            if (amedioCansado) {
                System.out.println("Amedio se ha cansado: toca llevarlo en brazos");
            }
            if (amedioEscapado) {
                System.out.println("¡He perdido tiempo buscando a Amedio!");
            }
            System.out
                    .println("Avance " + horas + " horas a " + velocidad + " Km/h recorriendo " + avanceMarco + " Km");
            System.out.println(mensajeClimaMadre);
            System.out.println("Mamá pudo avanzar " + horasMadre + " horas a " + velocidadMadre + " Km/h recorriendo "
                    + avanceMadre + " Km");
            if (noticiaMadre) {
                System.out.println("A Marco le dicen que han visto a su mamá, y rompe a correr!!!");
            }
            if (distancia > 0) {
                System.out.println(
                        "Al final del día " + dia + " la distancia entre Marco y su madre es de " + distancia + " Km");
            }
            final String SEPARADOR = "─".repeat(46) + " ◆ " + "─".repeat(46);
            System.out.println(SEPARADOR);
        }

        System.out.println();
        System.out.println("¡Al final del día " + dia + " Marco encuentra a su madre!");
        System.out.println();
    }

}