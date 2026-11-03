public class ViajedeMarco {
    public static void main(String[] args) {
        // define variables
        int distancia_con_madre = 350;
        double velocidad_promedio = 10 + (Math.random() * (15 - 10));
        int horas_de_viaje = 8 + (int) (Math.random() * (10 - 8));
        int dias_de_viaje = 0;
        boolean llega_donde_madre = false;
        int chance_lluvia = (int) (Math.random());

        final double PROB_LLUVIA_FUERTE = 0.1;
        final double PROB_LLUVIA_MODERADA = 0.3;
        final double BUEN_CLIMA = 0.6;
        final double PROB_AMEDIO_ESCAPA = 0.15;
        final double PROB_AMEDIO_CANSA = 0.25;
        final int AVANCE_DE_MADRE = 80;
        

        do {
            if (chance_lluvia <= PROB_LLUVIA_FUERTE) {
                velocidad_promedio = (int) velocidad_promedio * 0.25;
                System.out.println("MARCO TUVO LLUVIA MUY FUERTE");
            }

            else if (chance_lluvia <= PROB_LLUVIA_MODERADA) {
                velocidad_promedio = velocidad_promedio * 0.75;
                System.out.println("MARCO TUVO LLUVIA MODERADA");

                }
            else {
                System.out.println("HUBO BUEN CLIMA GRACIAS A DIOS");

            }


            // Bloque de código que se ejecuta
        } while (llega_donde_madre);

    }
}
