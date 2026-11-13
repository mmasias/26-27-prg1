import java.util.Locale;
import java.util.Random;

/**
 * De los Apeninos a los Andes - Diario del viaje de Marco (problema base)
 */
public class ViajeDeMarcoBase {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // decimales con punto
        Random random = new Random();

        double distancia = 350;       // km iniciales entre Marco y su madre
        int dia = 0;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        while (distancia > 0) {
            dia++;
            System.out.println("DIA " + dia);

            // Velocidad (10-15 km/h) y horas de trayecto (8-10 h) de Marco
            double velocidad = 10 + 5 * random.nextDouble();
            double horas = 8 + 2 * random.nextDouble();

            // Clima: 10% lluvia fuerte, 30% lluvia normal, 60% buen clima
            double clima = random.nextDouble();
            if (clima < 0.10) {
                System.out.println("¡Ha llovido muchísimo!");
                velocidad = velocidad * 0.25;
            } else if (clima < 0.40) {
                System.out.println("Ha llovido un poco");
                velocidad = velocidad * 0.75;
            } else {
                System.out.println("Ha hecho un buen día");
            }

            // Amedio: se cansa (25%) y/o se escapa (15%)
            if (random.nextDouble() < 0.25) {
                System.out.println("Amedio se ha cansado y lo llevo en brazos");
                velocidad = velocidad * 0.90;
            }
            if (random.nextDouble() < 0.15) {
                System.out.println("¡He perdido tiempo buscando a Amedio!");
                horas = horas - 2;
                if (horas < 0) {
                    horas = 0;
                }
            }

            double kmMarco = horas * velocidad;
            System.out.printf("Avance %.2f horas a %.2f Km/h recorriendo %.2f Km%n",
                    horas, velocidad, kmMarco);

            // La madre avanza 80 km cada día, alejándose de Marco
            double kmMadre = 80;
            System.out.printf("Mama pudo avanzar %.2f Km%n", kmMadre);

            distancia = distancia - kmMarco + kmMadre;

            if (distancia > 0) {
                System.out.printf("Al final del día %d la distancia entre Marco y su Madre es de %.2f Km%n",
                        dia, distancia);
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            }
        }

        System.out.println("************************************************************");
        System.out.println("Al final del día " + dia + " Marco encuentra a su madre!!!");
        System.out.println("************************************************************");
        System.out.println("\nMarco ha tardado " + dia + " días en encontrar a su madre.");
    }
}
