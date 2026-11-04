package entregas.herranzIzan;

public class viajeMarco {
    public static void main(String[] args) {
        double distancia = 350; // km entre Marco y su madre
        int dia = 0;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        while (distancia > 0) {
            dia++;
            System.out.println();
            System.out.println("DIA " + dia);
            System.out.println();

            double velocidadMarco = 10 + Math.random() * 5; // 10 a 15 km/h
            double horasMarco = 8 + Math.random() * 2;      // 8 a 10 horas
            double kmMarco = horasMarco * velocidadMarco;

            System.out.printf("Avance %.2f horas a %.2f Km/h recorriendo %.2f Km%n",
                    horasMarco, velocidadMarco, kmMarco);
            System.out.println();

            distancia = distancia - kmMarco;
            System.out.printf("Al final del día %d la distancia es de %.2f Km%n", dia, distancia);
        }
    }
    
}
