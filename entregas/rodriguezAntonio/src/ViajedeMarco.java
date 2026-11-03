public class ViajedeMarco {
    public static void main(String[] args) {
        
        double distancia_con_madre = 350;
        double velocidad_promedio = 10 + (Math.random() * (15 - 10));
        int horas_de_viaje = 8 + (int) (Math.random() * (10 - 8));
        int dias_de_viaje = 0;
        boolean llega_donde_madre = false;
        double chance_lluvia = (Math.random());
        double chance_amedio = (Math.random());

        final double PROB_LLUVIA_FUERTE = 0.1;
        final double PROB_LLUVIA_MODERADA = 0.3;
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
            if (chance_amedio <= PROB_AMEDIO_ESCAPA) {
                horas_de_viaje = horas_de_viaje - 2;
                System.out.println("EL AMEDIO INTENTO ESCAPAR");
            }
            if (chance_amedio <= PROB_AMEDIO_CANSA) {
                velocidad_promedio = velocidad_promedio * 0.9;
                System.out.println("EL AMEDIO SE CANSO");
            }

            double kilometros_recorridos = velocidad_promedio * horas_de_viaje;
            distancia_con_madre = distancia_con_madre + AVANCE_DE_MADRE - kilometros_recorridos;
            dias_de_viaje++;
            System.out.println("MARCO RECORRIO " + (kilometros_recorridos *100) / 100+ "KM");
            System.out.println("MARCO LLEVA " + dias_de_viaje + " DIAS DE VIAJE");
            System.out.println("MARCO LE QUEDAN " + (distancia_con_madre *100) / 100+ "KM PARA LLEGAR A SU MADRE");

            if (distancia_con_madre <= 0) {
                llega_donde_madre = true;
                System.out.println("MARCO LLEGO A SU MADRE");
            }

        } while (llega_donde_madre);

    }
}
