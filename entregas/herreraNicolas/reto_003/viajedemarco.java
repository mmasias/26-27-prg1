
public class viajedemarco {

    public static void main(String[] args) {


        
        double velocidad = 14;
        double clima = 0.95;

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

        

    }

}