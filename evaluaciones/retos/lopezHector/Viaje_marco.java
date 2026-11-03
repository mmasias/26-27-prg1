package evaluaciones.retos.lopezHector;

import java.util.Scanner;

public class Viaje_marco {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MINIMA_VELOCIDAD_MARCO = 10;
        final int MAXIMA_VELOCIDAD_MARCO = 15;
        final int TIEMPO_MIN = 8;
        final int TIEMPO_MAX = 10;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.10;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.30;
        final double FACTOR_LLUVIA_FUERTE = 0.25;
        final double FACTOR_LLUVIA_NORMAL = 0.75;

        final double PROBABILIDAD_MONO_ESCAPA = 0.15;
        final double PROBABILIDAD_MONO_CANSADO = 0.25;
        final double FACTOR_MONO_CANSADO = 0.90;
        final int HORAS_PERDIDAS_MONO_ESCAPA = 2;

        final double DISTANCIA_INICIAL_MADRE = 350;
        final double AVANCE_DIARIO_MADRE = 80;

        double distancia = DISTANCIA_INICIAL_MADRE;
        int dia = 0;

        do {
            dia++;
            System.out.println("Día " + dia);

            double velocidadMarco = (int) (Math.random() * (MAXIMA_VELOCIDAD_MARCO - MINIMA_VELOCIDAD_MARCO + 1))+ MINIMA_VELOCIDAD_MARCO;
            int horasMarco = (int) (Math.random() * (TIEMPO_MAX - TIEMPO_MIN + 1)) + TIEMPO_MIN;
            String mensajeDia;

            double clima = Math.random();
            if (clima <= PROBABILIDAD_LLUVIA_FUERTE) {
                velocidadMarco = velocidadMarco * FACTOR_LLUVIA_FUERTE;
                mensajeDia = "¡LLUVIA FUERTE!";
            } else if (clima < PROBABILIDAD_LLUVIA_FUERTE + PROBABILIDAD_LLUVIA_NORMAL) {
                velocidadMarco = velocidadMarco * FACTOR_LLUVIA_NORMAL;
                mensajeDia = "¡LLUVIA SUAVE!";
            } else {
                mensajeDia = "BUEN DÍA";
            }

        } while (distancia > 0);

        System.out.println("Marco encuentra a su madre en " + dia + " días.");
    }

}
