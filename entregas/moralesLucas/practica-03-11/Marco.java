
public class Marco {

    public static void main(String[] args) {

        double distancia = 350;
        int dia = 0;
        boolean encontrado = false;

        while (!encontrado) {

            dia++;

            System.out.println("DIARIO DEL VIAJE DE MARCO");
            System.out.println("=========================");
            System.out.println("DIA " + dia);

            double velocidadMarco = 10 + Math.random() * 5;
            double horasMarco = 8 + Math.random() * 2;

            double climaMarco = Math.random();

            if (climaMarco < 0.10) {
                System.out.println("¡Ha llovido muchísimo!");
                velocidadMarco = velocidadMarco * 0.25;
            } else if (climaMarco < 0.40) {
                System.out.println("Ha llovido un poco");
                velocidadMarco = velocidadMarco * 0.75;
            } else {
                System.out.println("Ha hecho un buen día");
            }

            boolean escapa = Math.random() < 0.15;

            if (escapa) {
                System.out.println("¡He perdido tiempo buscando a Amedio!");
                horasMarco = horasMarco - 2;
            }

            boolean cansado = Math.random() < 0.25;

            if (cansado) {
                System.out.println("Amedio está cansado y tengo que llevarlo");
                velocidadMarco = velocidadMarco * 0.90;
            }

            double recorridoMarco = velocidadMarco * horasMarco;

            System.out.printf("Avance %.2f horas a %.2f Km/h recorriendo %.2f Km%n",
                    horasMarco, velocidadMarco, recorridoMarco);

            double velocidadMadre = 6 + Math.random() * 3;
            double horasMadre = 6 + Math.random() * 3;

            double climaMadre = Math.random();

            if (climaMadre < 0.10) {
                System.out.println("A mamá le ha llovido muchísimo");
                velocidadMadre = velocidadMadre * 0.50;
            } else if (climaMadre < 0.40) {
                System.out.println("A mamá le ha llovido un poco");
                velocidadMadre = velocidadMadre * 0.75;
            } else {
                System.out.println("A mamá le ha hecho un buen día");
            }

            double recorridoMadre = velocidadMadre * horasMadre;

            System.out.printf("Mamá pudo avanzar %.2f horas a %.2f Km/h recorriendo %.2f Km%n",
                    horasMadre, velocidadMadre, recorridoMadre);

            distancia = distancia + recorridoMadre - recorridoMarco;

            if (distancia > 0 && distancia < 50) {

                if (Math.random() < 0.50) {

                    System.out.println("¡A Marco le dicen que han visto a su mamá!");
                    System.out.println("¡Marco rompe a correr y avanza 25 Km adicionales!");

                    distancia = distancia - 25;
                }
            }

            if (distancia <= 0) {

                encontrado = true;

                System.out.println("***************************************");
                System.out.println("Al final del dia " + dia + " Marco encuentra a su madre!!!");

            } else {

                System.out.printf("Al final del dia %d la distancia entre Marco y su Madre es de %.2f Km%n",
                        dia, distancia);

                System.out.println("---------------------------------------");
            }
        }
    }
}
