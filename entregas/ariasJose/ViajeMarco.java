class ViajeMarco {
    public static void main(String[] args) {
        
        final int DISTANCIA_MADRE_MARCO = 350;
        final int RECORRIDO_DIARIO_MADRE_MARCO = 80;
        final int VELOCIDAD_MINIMA_MARCO = 10;
        final int VELOCIDAD_MAXIMA_MARCO = 15; 
        final int TIEMPO_MINIMO_MARCO = 8;
        final int TIEMPO_MAXIMO_MARCO = 10;

        double velocidadMarco = (Math.random() * (VELOCIDAD_MAXIMA_MARCO - VELOCIDAD_MINIMA_MARCO)) + VELOCIDAD_MINIMA_MARCO;
        System.out.println(velocidadMarco);
        double tiempoRecorridoMarco = (Math.random() * (TIEMPO_MINIMO_MARCO - TIEMPO_MAXIMO_MARCO)) + TIEMPO_MINIMO_MARCO;
        System.out.println(tiempoRecorridoMarco);

    }
}
