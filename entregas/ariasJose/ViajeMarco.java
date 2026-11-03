class ViajeMarco {
    public static void main(String[] args) {
        
        final int DISTANCIA_MADRE_MARCO = 350;
        final int RECORRIDO_DIARIO_MADRE_MARCO = 80;
        final int VELOCIDAD_MINIMA_MARCO = 10;
        final int VELOCIDAD_MAXIMA_MARCO = 15; 
        final int TIEMPO_MINIMO_MARCO = 8;
        final int TIEMPO_MAXIMO_MARCO = 10;

        double velocidadMarco = (Math.random() * (VELOCIDAD_MAXIMA_MARCO - VELOCIDAD_MINIMA_MARCO)) + VELOCIDAD_MINIMA_MARCO;
        double tiempoRecorridoMarco = (Math.random() * (TIEMPO_MAXIMO_MARCO - TIEMPO_MINIMO_MARCO)) + TIEMPO_MINIMO_MARCO;
        
        System.out.println();
        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");
        
        double probabilidadLluvia = Math.random();

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double REDUCCION_VELOCIDAD_LLUVIA_FUERTE = 0.25;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.3;
        final double REDUCCION_VELOCIDAD_LLUVIA_NORMAL = 0.75;

        if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE) {
            System.out.println("¡Ha llovido muchísimo!");
            velocidadMarco = velocidadMarco * REDUCCION_VELOCIDAD_LLUVIA_FUERTE;
        } else if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_NORMAL) {
            System.out.println("¡Ha llovido un poco!");
            velocidadMarco = velocidadMarco * REDUCCION_VELOCIDAD_LLUVIA_NORMAL;
        } else {
            System.out.println("¡Ha hecho un día soleado!");
        }

        double probabilidadAmedio = Math.random();
        final double PROBABILIDAD_AMEDIO_SE_CANSA = 0.25;
        final double REDUCCION_VELOCIDAD_AMEDIO_CANSADO = 0.9;
        final double PROBABILIDAD_AMEDIO_SE_ESCAPA = 0.15;
        final int REDUCCION_TIEMPO_AMEDIO_SE_ESCAPA = -2;

        if (probabilidadAmedio <= PROBABILIDAD_AMEDIO_SE_CANSA) {
            System.out.println("¡Amedio se ha cansado!");
            velocidadMarco = velocidadMarco * REDUCCION_VELOCIDAD_AMEDIO_CANSADO;
        } 

        if (probabilidadAmedio <= PROBABILIDAD_AMEDIO_SE_ESCAPA) {
            System.out.println("¡Amedio se ha escapado!");
            tiempoRecorridoMarco = tiempoRecorridoMarco + REDUCCION_TIEMPO_AMEDIO_SE_ESCAPA;
        }

    }
}
