package entregas.garciaDiego;

class viajeMarco {

    public static void main(String[] args) {

        final double DISTANCIA_INICIAL = 350;
        final double VELOCIDAD_MIN = 10;
        final double VELOCIDAD_MAX = 15;
        final double HORAS_MIN = 8;
        final double HORAS_MAX = 10;
        final double KM_MADRE_POR_DIA = 80;
        double distancia = DISTANCIA_INICIAL;
        int dia = 0;

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

        double avanceMarco = velocidad * horas;

        dia++;
        distancia = distancia - avanceMarco;

        System.out.println("DIA " + dia);
        System.out.println(mensajeClima);
        System.out.println("Avance " + horas + " horas a " + velocidad + " Km/h recorriendo " + avanceMarco + " Km");
        final String SEPARADOR = "─".repeat(43) + " ◆ " + "─".repeat(43);
        System.out.println(SEPARADOR);
    }

}
