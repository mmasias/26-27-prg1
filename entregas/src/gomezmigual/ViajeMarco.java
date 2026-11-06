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

        double velocidadActual = (Math.random() * (VELOCIDAD_BASE_MAXIMA - VELOCIDAD_BASE_MINIMA)) + VELOCIDAD_BASE_MINIMA;
        double tiempoHoras = (Math.random() * (TIEMPO_BASE_MAXIMO - TIEMPO_BASE_MINIMO)) + TIEMPO_BASE_MINIMO;
    }
}