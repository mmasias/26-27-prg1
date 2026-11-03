import java.util.Locale;
import java.util.Random;

public class ViajeMarco {
    public static void main(String[] args) {
        Random azar = new Random();
        double distancia = 350.0;
        int dia = 0;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        while (distancia > 0.0) {
            dia++;
            double velocidad = 10.0 + azar.nextDouble() * 5.0;
            double horas = 8.0 + azar.nextDouble() * 2.0;
            double clima = azar.nextDouble();

            System.out.println("DIA " + dia);
            if (clima < 0.10) {
                System.out.println("Ha llovido mucho");
                velocidad *= 0.25;
            } else if (clima < 0.40) {
                System.out.println("Ha llovido un poco");
                velocidad *= 0.75;
            } else {
                System.out.println("Ha hecho buen tiempo");
            }

            double avanceMarco = velocidad * horas;
            distancia = distancia - avanceMarco + 80.0;

            System.out.printf(Locale.US,
                    "Marco avanzo %.2f horas a %.2f km/h y recorrio %.2f km%n",
                    horas, velocidad, avanceMarco);
            System.out.println("Mama recorrio 80.00 km");

            if (distancia <= 0.0) {
                System.out.println("Al final del dia " + dia + " Marco encuentra a su madre.");
            } else {
                System.out.printf(Locale.US,
                        "Al final del dia %d la distancia entre ambos es de %.2f km%n",
                        dia, distancia);
                System.out.println("------------------------------------------------------------");
            }
        }
    }
}
