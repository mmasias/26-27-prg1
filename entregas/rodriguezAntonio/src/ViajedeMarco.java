public class ViajedeMarco {
    public static void main(String[] args) {

        double distancia_con_madre = 350;
        int dias_de_viaje = 0;
        boolean llega_donde_madre = false;
        final double PROB_LLUVIA_FUERTE = 0.1;
        final double PROB_LLUVIA_MODERADA = 0.3;
        final double PROB_AMEDIO_ESCAPA = 0.15;
        final double PROB_AMEDIO_CANSA = 0.25;
        final int AVANCE_DE_MADRE = 80;
        final int VELOCIDAD_MIN_MARCO = 10;
        final int VELOCIDAD_MAX_MARCO = 15;
        final int HORAS_MIN_MARCO = 8;
        final int HORAS_MAX_MARCO = 10;
        final double REDUCCION_VELOCIDAD_LLUVIA_FUERTE = 0.25;
        final double REDUCCION_VELOCIDAD_LLUVIA_MODERADA = 0.75;
        final double REDUCCION_VELOCIDAD_AMEDIO_CANSA = 0.9;
        final int REDUCCION_HORAS_AMEDIO_ESCAPA = 2;

        do {
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println();
            double velocidad_promedio = VELOCIDAD_MIN_MARCO + (Math.random() * (VELOCIDAD_MAX_MARCO - VELOCIDAD_MIN_MARCO));
            int horas_de_viaje = HORAS_MIN_MARCO + (int) (Math.random() * (HORAS_MAX_MARCO - HORAS_MIN_MARCO));
            double chance_lluvia = (Math.random());
            double chance_amedio = (Math.random());

            if (chance_lluvia <= PROB_LLUVIA_FUERTE) {
                velocidad_promedio = (int) velocidad_promedio * REDUCCION_VELOCIDAD_LLUVIA_FUERTE;
                System.out.println("MARCO TUVO LLUVIA MUY FUERTE");
            }

            else if (chance_lluvia <= PROB_LLUVIA_MODERADA) {
                velocidad_promedio = velocidad_promedio * REDUCCION_VELOCIDAD_LLUVIA_MODERADA;
                System.out.println("MARCO TUVO LLUVIA MODERADA");

            } else {
                System.out.println("HUBO BUEN CLIMA GRACIAS A DIOS");

            }
            if (chance_amedio <= PROB_AMEDIO_ESCAPA) {
                horas_de_viaje = horas_de_viaje - REDUCCION_HORAS_AMEDIO_ESCAPA;
                System.out.println("EL AMEDIO INTENTO ESCAPAR");
            }
            if (chance_amedio <= PROB_AMEDIO_CANSA) {
                velocidad_promedio = velocidad_promedio * REDUCCION_VELOCIDAD_AMEDIO_CANSA;
                System.out.println("EL AMEDIO SE CANSO");
            }

            int kilometros_recorridos = (int) (velocidad_promedio * horas_de_viaje);
            distancia_con_madre = Math.max(0,distancia_con_madre + ((AVANCE_DE_MADRE * 100) / 100) - kilometros_recorridos);
            dias_de_viaje++;
            System.out.println("MARCO RECORRIO " + kilometros_recorridos  + "KM");
            System.out.println("MARCO LLEVA " + dias_de_viaje + " DIAS DE VIAJE");
            System.out.println("MARCO LE QUEDAN " + distancia_con_madre + "KM PARA LLEGAR A SU MADRE");
            
            System.out.println();
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println();
            

            if (distancia_con_madre <= 0) {
                llega_donde_madre = true;
                System.out.println("//////////------MARCO LLEGO A SU MADRE");
                System.out.println();
                System.out.println("//////////------FIN DE LA HISTORIA");
                System.out.println();
            }

        } while (!llega_donde_madre);

    }
}
