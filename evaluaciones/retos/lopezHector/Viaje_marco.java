
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
        final int MINIMA_VELOCIDAD_MADRE = 6;
        final int MAXIMA_VELOCIDAD_MADRE = 9;
        final int MINIMAS_HORAS_MADRE = 6;
        final int MAXIMAS_HORAS_MADRE = 9;

        final double PROBABILIDAD_LLUVIA_MUY_FUERTE_MADRE = 0.10;
        final double PROBABILIDAD_LLUVIA_MADRE = 0.30;
        final double FACTOR_LLUVIA_MUY_FUERTE_MADRE = 0.50;
        final double FACTOR_LLUVIA_MADRE = 0.75;

        final double DISTANCIA_PARA_AVISO = 50;
        final double PROBABILIDAD_AVISO = 0.50;
        final double KM_EXTRA_CORRIENDO = 25;
        double distancia = DISTANCIA_INICIAL_MADRE;
        int dia = 0;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        do {
            dia++;
            System.out.println("DIA " + dia);

            double velocidadMarco = Math.random() * (MAXIMA_VELOCIDAD_MARCO - MINIMA_VELOCIDAD_MARCO)
                    + MINIMA_VELOCIDAD_MARCO;
            int horas_de_avance_Marco = (int) (Math.random() * (TIEMPO_MAX - TIEMPO_MIN + 1)) + TIEMPO_MIN;
            String mensajeDia;

            double clima = Math.random();
            if (clima <= PROBABILIDAD_LLUVIA_FUERTE) {
                velocidadMarco = velocidadMarco * FACTOR_LLUVIA_FUERTE;
                mensajeDia = "¡Ha llovido muchísimo!";
            } else if (clima < PROBABILIDAD_LLUVIA_FUERTE + PROBABILIDAD_LLUVIA_NORMAL) {
                velocidadMarco = velocidadMarco * FACTOR_LLUVIA_NORMAL;
                mensajeDia = "Ha llovido un poco";
            } else {
                mensajeDia = "Ha hecho un buen día";
            }
            if (Math.random() < PROBABILIDAD_MONO_CANSADO) {
                velocidadMarco = velocidadMarco * FACTOR_MONO_CANSADO;
                mensajeDia = mensajeDia + "\n¡Amedio se ha cansado y he tenido que llevarlo en brazos!";
            }

            if (Math.random() < PROBABILIDAD_MONO_ESCAPA) {
                horas_de_avance_Marco = horas_de_avance_Marco - HORAS_PERDIDAS_MONO_ESCAPA;
                mensajeDia = mensajeDia + "\n¡He perdido tiempo buscando a Amedio!";
            }

            System.out.println(mensajeDia);

            double avanceMarco = velocidadMarco * horas_de_avance_Marco;
            System.out.println("Avance " + horas_de_avance_Marco + " horas a "
                    + String.format("%.2f", velocidadMarco) + " Km/h recorriendo "
                    + String.format("%.2f", avanceMarco) + " Km");

            double velocidad_de_Madre = Math.random() * (MAXIMA_VELOCIDAD_MADRE - MINIMA_VELOCIDAD_MADRE)
                    + MINIMA_VELOCIDAD_MADRE;
            int horasMadre = (int) (Math.random() * (MAXIMAS_HORAS_MADRE - MINIMAS_HORAS_MADRE + 1))
                    + MINIMAS_HORAS_MADRE;
            String mensajeMadre;

            double climaMadre = Math.random();
            if (climaMadre < PROBABILIDAD_LLUVIA_MUY_FUERTE_MADRE) {
                velocidad_de_Madre = velocidad_de_Madre * FACTOR_LLUVIA_MUY_FUERTE_MADRE;
                mensajeMadre = "A mamá le ha llovido muchísimo";
            } else if (climaMadre < PROBABILIDAD_LLUVIA_MUY_FUERTE_MADRE + PROBABILIDAD_LLUVIA_MADRE) {
                velocidad_de_Madre = velocidad_de_Madre * FACTOR_LLUVIA_MADRE;
                mensajeMadre = "A mamá le ha llovido un poco";
            } else {
                mensajeMadre = "A mamá le ha hecho un buen día";
            }

            System.out.println(mensajeMadre);
            double avanceMadre = velocidad_de_Madre * horasMadre;
            System.out.println("Mama pudo avanzar " + horasMadre + " horas a "
                    + String.format("%.2f", velocidad_de_Madre) + " Km/h recorriendo "
                    + String.format("%.2f", avanceMadre) + " Km");

            distancia = distancia - avanceMarco + avanceMadre;

            if (distancia < DISTANCIA_PARA_AVISO && Math.random() < PROBABILIDAD_AVISO) {
                System.out.println("A Marco le dicen que han visto a su mamá, y rompe a correr!!!");
                distancia = distancia - KM_EXTRA_CORRIENDO;
            }

            if (distancia > 0) {
                System.out.println("Al final del día " + dia + " la distancia entre Marco y su Madre es de "
                        + String.format("%.2f", distancia) + " Km");
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            }

        } while (distancia > 0);

        System.out.println("Al final del día " + dia + " Marco encuentra a su madre!!!");
        System.out.println("************************************************************");
    }

}