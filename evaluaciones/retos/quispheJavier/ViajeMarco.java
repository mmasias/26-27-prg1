

public class ViajeMarco {
    public static void main(String[] args) {
        final int VELOCIDAD_MINIMA_MARCO = 10;
        final int VELOCIDAD_MAXIMA_MARCO = 15;
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
        final int VELOCIDAD_MINIMA_MADRE = 6;
        final int VELOCIDAD_MAXIMA_MADRE = 9;
        final int HORAS_MINIMAS_MADRE = 6;
        final int HORAS_MAXIMAS_MADRE = 9;

        final double PROBABILIDAD_LLUVIA_FUERTE_MADRE = 0.10;
        final double PROBABILIDAD_LLUVIA_MADRE = 0.30;
        final double FACTOR_LLUVIA_FUERTE_MADRE = 0.50;
        final double FACTOR_LLUVIA_MADRE = 0.75;

        final int DISTANCIA_AVISO = 50;
        final double PROBABILIDAD_AVISO = 0.50;
        final int KM_EXTRA_CORRIENDO = 25;

        double distancia = DISTANCIA_INICIAL_MADRE;
        int dia = 0;

        System.out.println("EL VIAJE DE MARCO");
        System.out.println("=================");

        do {
            dia++;
            System.out.println("DIA" + dia);

            double velocidadMarco = Math.random() + (VELOCIDAD_MAXIMA_MARCO - VELOCIDAD_MINIMA_MARCO) + VELOCIDAD_MINIMA_MARCO;
            int horas_avance_Marco = (int) (Math.random() * (TIEMPO_MAX - TIEMPO_MIN + 1)) + TIEMPO_MIN;

            String mensajeDia;

            double clima = Math.random();
            if (clima <= PROBABILIDAD_LLUVIA_FUERTE) {
                velocidadMarco = velocidadMarco * FACTOR_LLUVIA_FUERTE;
                mensajeDia = "¡Ha llovido muchisimo!";
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
                horas_avance_Marco = horas_avance_Marco - HORAS_PERDIDAS_MONO_ESCAPA;
                mensajeDia = mensajeDia + "\n¡He perdido tiempo buscando a Amedio!";
            }

            System.out.println(mensajeDia);

            double avanceMarco = velocidadMarco * horas_avance_Marco;
            System.out.println("Avance " + horas_avance_Marco + " horas a" + String.format("%.2f", velocidadMarco) +  " Km/h recorriendo " + String.format("%.2f", avanceMarco) + " Km");

            distancia = distancia - avanceMarco;

            if (distancia > 0) {
                System.out.println("Al final del día" + dia + "la distancia entre Marco y su madre es de " + String.format("%.2f", distancia) + " Km");
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
            }
        } while (distancia > 0);
    }
}