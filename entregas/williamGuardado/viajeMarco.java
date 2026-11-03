import java.util.Random;

class ViajeMarco {

    public static void main(String[] args) {
        Random r = new Random();

        double distancia = 350;
        int dia = 0;
        boolean encontrada = false;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        while (!encontrada) {
            dia++;
            System.out.println("DIA " + dia);

            double velocidad = 10 + r.nextDouble() * 5;
            double horas = 8 + r.nextDouble() * 2;

            double clima = r.nextDouble();
            if (clima < 0.10) {
                System.out.println("¡Ha llovido muchísimo!");
                velocidad = velocidad * 0.25;
            } else if (clima < 0.40) {
                System.out.println("Ha llovido un poco");
                velocidad = velocidad * 0.75;
            } else {
                System.out.println("Ha hecho un buen día");
            }

            if (r.nextDouble() < 0.25) {
                System.out.println("Amedio se ha cansado y lo he llevado en brazos");
                velocidad = velocidad * 0.90;
            }
            if (r.nextDouble() < 0.15) {
                System.out.println("¡He perdido tiempo buscando a Amedio!");
                horas = horas - 2;
            }

            double kmMarco = velocidad * horas;
            System.out.printf("Avance %.2f horas a %.2f Km/h recorriendo %.2f Km%n",
                    horas, velocidad, kmMarco);

            double kmMama = 80;
            System.out.printf("Mama avanzó %.2f Km%n", kmMama);

            if (kmMarco >= distancia + kmMama) {
                encontrada = true;
                System.out.println("************************************************************");
                System.out.println("Al final del día " + dia + " Marco encuentra a su madre!!!");
                System.out.println("************************************************************");
            } else {
                distancia = distancia - kmMarco + kmMama;
                System.out.printf("Al final del día %d la distancia entre Marco y su Madre es de %.2f Km%n",
                        dia, distancia);
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            }
        }
    }
}
