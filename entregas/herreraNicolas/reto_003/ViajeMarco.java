
public class ViajeMarco {

    public static void main(String[] args) {

        double velocidad;
        double clima;
        double horas;

        // Generamos dos probabilidades independientes
        double probCansancio;
        double probEscape;

        double distanciaMadre = 350;
        int dia = 1;

        while (distanciaMadre > 0) {

            System.out.println("Dia " + dia);

            // Nuevos valores para cada dia
            velocidad = 10 + Math.random() * 5;
            horas = 8 + Math.random() * 2;
            clima = Math.random();

            // Clima
            if (clima < 0.60) {
                System.out.println("Buen tiempo");
            } else if (clima < 0.90) {
                velocidad = velocidad * 0.75;
                System.out.println("Lluvia normal");
            } else {
                velocidad = velocidad * 0.25;
                System.out.println("Lluvia fuerte");
            }

            // Amedio
            probCansancio = Math.random();
            probEscape = Math.random();

            if (probCansancio < 0.25) {
                velocidad = velocidad * 0.90;
                System.out.println("Amedio se ha cansado");
            }

            if (probEscape < 0.15) {
                horas = horas - 2;
                System.out.println("Amedio se ha escapado");
            }

            // Calcular distancias
            double avanceMarco = velocidad * horas;
            double avanceMadre = 80;

            distanciaMadre = distanciaMadre - avanceMarco + avanceMadre;

            // Evitar distancia negativa
            if (distanciaMadre < 0) {
                distanciaMadre = 0;
            }

            // Mostrar resultados con dos decimales
            System.out.printf("Marco avanzo: %.2f km%n", avanceMarco);
            System.out.printf("Mama avanzo: %.2f km%n", avanceMadre);
            System.out.printf("Distancia restante: %.2f km%n", distanciaMadre);

            System.out.println("----------------------------");

            dia++;
        }

        System.out.println("Marco encontro a su madre en " + (dia - 1) + " dias");
    }
}
