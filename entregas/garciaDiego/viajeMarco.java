package entregas.garciaDiego;

class ViajeMarco {

    public static void main(String[] args) {

        final double DISTANCIA_INICIAL = 350;
        final double VELOCIDAD_MIN = 10;
        final double VELOCIDAD_MAX = 15;
        final double HORAS_MIN = 8;
        final double HORAS_MAX = 10;
        final double KM_MADRE_POR_DIA = 80;

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

            dia++;
            distancia = distancia - avanceMarco + KM_MADRE_POR_DIA;

            System.out.println("DIA " + dia);
            System.out.println(mensajeClima);
            if (amedioCansado) {
                System.out.println("Amedio se ha cansado: toca llevarlo en brazos");
            }
            if (amedioEscapado) {
                System.out.println("¡He perdido tiempo buscando a Amedio!");
            }
            System.out.println("Avance " + horas + " horas a " + velocidad + " Km/h recorriendo " + avanceMarco + " Km");
            System.out.println("Mamá avanza " + KM_MADRE_POR_DIA + " Km");
            if (distancia > 0) {
                System.out.println("Al final del día " + dia + " la distancia entre Marco y su madre es de " + distancia + " Km");
            }
            final String SEPARADOR = "─".repeat(43) + " ◆ " + "─".repeat(43);
            System.out.println(SEPARADOR);
        }

        System.out.println("Al final del día " + dia + " Marco encuentra a su madre!!!");
    }

}