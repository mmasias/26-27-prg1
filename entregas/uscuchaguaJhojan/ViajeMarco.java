class ViajeMarco {
    public static void main(String[] args) {
        //final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        //final double PROBABILIDAD_LLUVIA_SUAVE = 0.3;
        //final double PROBABILIDAD_AMEDIO_ESCAPE = 0.15;
        //final double PROBABILIDAD_AMEDIO_CANSADO = 0.25;

        final int MADRE_AVANCE_DIARIO = 80;
        final int POSICION_INICIAL_MADRE = 350;

        double recorridoRestante = POSICION_INICIAL_MADRE;
        boolean caminata = recorridoRestante > 0 ;
        int diasCaminando = 0;

        while (caminata) { 
            //Contando los dias
            diasCaminando = diasCaminando + 1;

            //velocidad del dia (rango entre 15 y 10 km/h)
            double velocidadMarco = Math.random()*5 + 10;
            double velocidadEfectiva = velocidadMarco;

            //tiempo del dia (rango entre 10 y 8 horas)
            int tiempoMarco = (int) (Math.random()*3) + 8;
            int tiempoEfectivo = tiempoMarco;

            double distanciaRecorrida = velocidadEfectiva*tiempoEfectivo;

            recorridoRestante = recorridoRestante - distanciaRecorrida + MADRE_AVANCE_DIARIO;
            caminata = recorridoRestante > 0;

            //Resumiendo el día
            System.out.println("Día: " + diasCaminando);
            System.out.println("El clima esta despejado");
            System.out.println("Avance " + tiempoEfectivo + " horas a " + velocidadEfectiva + " Km/h recorriendo " + distanciaRecorrida  + " Km");
            if (caminata) {
                System.out.println("Al final del día " + diasCaminando + " la distancia entre Marco y su Madre es de " + recorridoRestante +" Km");
            } else {
                System.out.println("...");
            }
            System.out.println("----------------------------------------");
        }
        System.out.println("¡Ambos se reencontraron!");
    }
}