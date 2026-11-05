import java.util.Random;

public class ElViajeDeMarco {
    public static void main(String[] args) {

        Random random = new Random();

        double distancia = 350;
        int dias = 0;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        while (distancia > 0) {

            dias++;

            System.out.println("DIA " + dias);

            // DATOS DE MARCO
            double velocidadMarco = 10 + random.nextDouble() * 5;
            double horasMarco = 8 + random.nextDouble() * 2;

            // CLIMA DE MARCO
            int climaMarco = random.nextInt(100);

            if (climaMarco < 10) {
                velocidadMarco *= 0.25;
                System.out.println("¡Ha llovido muchísimo!");
            } else if (climaMarco < 40) {
                velocidadMarco *= 0.75;
                System.out.println("Ha llovido un poco");
            } else {
                System.out.println("Ha hecho un buen día");
            }

            // AMEDIO
            int monoEscapa = random.nextInt(100);
            int monoCansado = random.nextInt(100);

            if (monoEscapa < 15) {
                horasMarco -= 2;
                System.out.println("¡He perdido tiempo buscando a Amedio!");
            }

            if (monoCansado < 25) {
                velocidadMarco *= 0.90;
                System.out.println("Amedio está cansado");
            }

            double avanceMarco = velocidadMarco * horasMarco;

            System.out.printf("Avance %.2f horas a %.2f Km/h recorriendo %.2f Km%n",
                    horasMarco, velocidadMarco, avanceMarco);

            // DATOS DE LA MADRE
            double velocidadMadre = 6 + random.nextDouble() * 3;
            double horasMadre = 6 + random.nextDouble() * 3;

            // CLIMA DE LA MADRE
            int climaMadre = random.nextInt(100);

            if (climaMadre < 10) {
                velocidadMadre *= 0.50;
                System.out.println("A mamá le ha llovido muchísimo");
            } else if (climaMadre < 40) {
                velocidadMadre *= 0.75;
                System.out.println("A mamá le ha llovido un poco");
            } else {
                System.out.println("A mamá le ha hecho un buen día");
            }

            double avanceMadre = velocidadMadre * horasMadre;

            System.out.printf("Mama pudo avanzar %.2f horas a %.2f Km/h recorriendo %.2f Km%n",
                    horasMadre, velocidadMadre, avanceMadre);

            // ACTUALIZAR DISTANCIA
            distancia = distancia + avanceMadre - avanceMarco;

            // EXTENSION 2
            if (distancia > 0 && distancia < 50) {

                int pista = random.nextInt(100);

                if (pista < 50) {
                    avanceMarco += 25;
                    distancia -= 25;

                    System.out.println("A Marco le dicen que han visto a su mamá, y rompe a correr!!!");
                }
            }

            if (distancia < 0) {
                distancia = 0;
            }

            System.out.printf("Al final del día %d la distancia entre Marco y su Madre es de %.2f Km%n",
                    dias, distancia);

            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }

        System.out.println("************************************************************");
        System.out.println("Al final del día " + dias + " Marco encuentra a su madre!!!");
        System.out.println("************************************************************");
    }
}
