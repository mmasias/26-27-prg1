
public class ViajeMarcoExtensionDos {

    public static void main(String[] args) {

        double distanciaMadre = 350;
        int dia = 1;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("==========================");

        while (distanciaMadre > 0) {

            System.out.println("Dia " + dia);

            // Nuevos valores para cada dia de Marco
            double velocidad = 10 + Math.random() * 5;
            double horas = 8 + Math.random() * 2;
            double clima = Math.random();

            // Clima de Marco
            if (clima < 0.60) {
                System.out.println("Buen tiempo para Marco");

            } else if (clima < 0.90) {
                velocidad = velocidad * 0.75;
                System.out.println("Lluvia normal para Marco");

            } else {
                velocidad = velocidad * 0.25;
                System.out.println("Lluvia fuerte para Marco");
            }

            // Comportamiento de Amedio
            double probCansancio = Math.random();
            double probEscape = Math.random();

            if (probCansancio < 0.25) {
                velocidad = velocidad * 0.90;
                System.out.println("Amedio se ha cansado");
            }

            if (probEscape < 0.15) {
                horas = horas - 2;
                System.out.println("Amedio se ha escapado");
            }

            // Calcular avance de Marco
            double avanceMarco = velocidad * horas;

            // EXTENSION 1 - Viaje de la madre
            double velocidadMadre = 6 + Math.random() * 3;
            double horasMadre = 6 + Math.random() * 3;
            double climaMadre = Math.random();

            // Clima de la madre
            if (climaMadre < 0.60) {
                System.out.println("Buen tiempo para mama");

            } else if (climaMadre < 0.90) {
                velocidadMadre = velocidadMadre * 0.75;
                System.out.println("Lluvia normal para mama");

            } else {
                velocidadMadre = velocidadMadre * 0.50;
                System.out.println("Lluvia fuerte para mama");
            }

            // Calcular avance de la madre
            double avanceMadre = velocidadMadre * horasMadre;

            // Actualizar distancia entre Marco y su madre
            distanciaMadre = distanciaMadre - avanceMarco + avanceMadre;

            // EXTENSION 2 - Marco recibe noticias de su madre
            if (distanciaMadre > 0 && distanciaMadre < 50) {

                double probNoticias = Math.random();

                if (probNoticias < 0.50) {

                    System.out.println(
                        "Marco recibe noticias de su madre y corre 25 km mas"
                    );

                    avanceMarco = avanceMarco + 25;
                    distanciaMadre = distanciaMadre - 25;
                }
            }

            // Evitar distancia negativa
            if (distanciaMadre < 0) {
                distanciaMadre = 0;
            }

            // Mostrar resultados del dia
            System.out.printf("Marco avanzo: %.2f km%n", avanceMarco);
            System.out.printf("Mama avanzo: %.2f km%n", avanceMadre);
            System.out.printf("Distancia restante: %.2f km%n", distanciaMadre);

            System.out.println("----------------------------");

            dia++;
        }

        System.out.println("********************************");
        System.out.println("Marco encontro a su madre en " + (dia - 1) + " dias");
        System.out.println("********************************");
    }
}
