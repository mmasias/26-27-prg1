import java.util.Scanner;

class ViajeDeMarco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int VELOCIDAD_MAXIMA_MARCO = 15;
        final int VELOCIDAD_MINIMA_MARCO = 10;
        final int HORAS_DE_TRAYECTO_MAXIMO = 10;
        final int HORAS_DE_TRAYECTO_MINIMO = 8;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.3;
        final double AMEDIO_CANSADO = 0.25;
        final double AMEDIO_ESCAPA = 0.15;
        boolean estaEnViaje = true;
        
        while (estaEnViaje){

            double velocidadDia = ((Math.random() * (VELOCIDAD_MAXIMA_MARCO - VELOCIDAD_MINIMA_MARCO) ) + VELOCIDAD_MINIMA_MARCO);
            double horasDeTrayecto = ((Math.random() * (HORAS_DE_TRAYECTO_MAXIMO - HORAS_DE_TRAYECTO_MINIMO) ) + HORAS_DE_TRAYECTO_MINIMO);
            
            double clima = Math.random();

            boolean lluviaFuerte = (clima < PROBABILIDAD_LLUVIA_FUERTE);
            velocidadDia = lluviaFuerte ? (velocidadDia / 4) : velocidadDia;
            
            boolean lluviaNormal = (clima < PROBABILIDAD_LLUVIA_NORMAL);
            velocidadDia = lluviaNormal ? (velocidadDia / 4) * 3 : velocidadDia;
        }

    }
}