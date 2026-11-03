
public class viajedemarco {

    public static void main(String[] args) {

        double velocidad = 12;
        double clima = 0.95;
        double horas = 9;

        if (clima < 0.60) {
            System.out.println("Buen tiempo");

        } else if (clima < 0.90) {
            velocidad = velocidad * 0.75;
            System.out.println("Lluvia normal");

        } else {
            velocidad = velocidad * 0.25;
            System.out.println("Lluvia fuerte");
        }

        System.out.println("Velocidad: " + velocidad);

        // Generamos dos probabilidades independientes
        double probCansancio = 0.20;
        double probEscape = 0.10;

        // Amedio se cansa
        if (probCansancio < 0.25) {
            velocidad = velocidad * 0.90;
            System.out.println("Amedio se ha cansado");
        }

        // Amedio se escapa
        if (probEscape < 0.15) {
            horas = horas - 2;
            System.out.println("Amedio se ha escapado");
        }

        double distancia = velocidad * horas;

        System.out.println("Distancia: " + distancia);


        int dia = 1;

        while (dia <= 5) {
            System.out.println("Día " + dia);
            dia++;
        }
        
    }

}