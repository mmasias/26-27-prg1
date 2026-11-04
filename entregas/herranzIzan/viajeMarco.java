public class viajeMarco {
    public static void main(String[] args) {
        double distancia = 350; 
        int dia = 0;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        while (distancia > 0) {
            dia++;
            System.out.println();
            System.out.println("DIA " + dia);
            System.out.println();

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

            if (Math.random() < 0.15) {
                System.out.println("¡He perdido tiempo buscando a Amedio!");
                horasMarco = horasMarco - 2;
            }
            if (Math.random() < 0.25) {
                System.out.println("Amedio está cansado y lo llevo en brazos");
                velocidadMarco = velocidadMarco * 0.90;
            }

            double kmMarco = horasMarco * velocidadMarco;

            System.out.println();
            System.out.printf("Avance %.2f horas a %.2f Km/h recorriendo %.2f Km%n",
                    horasMarco, velocidadMarco, kmMarco);
            System.out.println();

            double kmMadre = 80;
            System.out.printf("Mama avanza %.2f Km%n", kmMadre);
            System.out.println();

            distancia = distancia - kmMarco;
            
            if (distancia > 0) {
                System.out.printf("Al final del día %d la distancia entre Marco y su Madre es de %.2f Km%n",
                        dia, distancia);
                System.out.println();
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            } else {
                System.out.println("************************************************************");
                System.out.println();
                System.out.println("Al final del día " + dia + " Marco encuentra a su madre!!!");
            }
        }
    }   
}
