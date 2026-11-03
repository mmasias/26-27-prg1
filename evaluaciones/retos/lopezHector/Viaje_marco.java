package evaluaciones.retos.lopezHector;

import java.util.Scanner;

public class Viaje_marco {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MINIMA_VELOCIDAD_MARCO = 10;
        final int MAXIMA_VELOCIDAD_MARCO = 15;
        final int AVANCE_MAXIMO_MARCO = 8;
        final int AVANCE_MINIMO_MARCO = 10;
        final double PROBABILIDAD_LLUVIA_FUERTE= 0.10;
        final double PROBABILIDAD_LLUVIA_NORMAL= 0.30;
        final double PROBABILIDAD_BUEN_CLIMA= 0.60;
      
            int velocidad_de_marco = (int) (Math.random() * ( AVANCE_MAXIMO_MARCO - AVANCE_MINIMO_MARCO + 1)) + AVANCE_MINIMO_MARCO;
            int avance_de_marco = (int) (Math.random() * ( MAXIMA_VELOCIDAD_MARCO- MINIMA_VELOCIDAD_MARCO + 1)) + MINIMA_VELOCIDAD_MARCO;
            if ( Math.random() < PROBABILIDAD_LLUVIA_FUERTE ) {
            

            }

        
        



    }
}