class RETO_03_11{
    public static void main(String[] args){
        final int MAXIMA_VELOCIDAD = 15;
        final int MINIMA_VELOCIDAD = 10;
        final int AVANCE_MAXIMO_HORAS = 10;
        final int AVANCE_MINIMO_HORAS = 8;
        final double LLUVIA_FUERTE = 0.10;
        final double LLUVIA_NORMAL = 0.30;
        final double BUEN_CLIMA = 0.60;
        final double FACTOR_LLUVIA_FUERTE = 0.25;
        final double FACTOR_LLUVIA_NORMAL = 0.75;
        final double AMEDIO_CANSADO = 0.25;
        final double AMEDIO_ESCAPA = 0.15;
        final double FACTOR_AMEDIO_CANSADO = 0.90;
        final int FACTOR_AMEDIO_ESCAPA_HORAS_PERDIDAS = 2;
        double distancia_madre_marco = 350;
        final int AVANCE_POR_DIA_MADRE = 80;
        int dias = 0;
        do {
            dias++;
            int velocidad = (int) (Math.random() * (MAXIMA_VELOCIDAD - MINIMA_VELOCIDAD +1)) + MINIMA_VELOCIDAD;
            int horas = (int) (Math.random() * (AVANCE_MAXIMO_HORAS - AVANCE_MINIMO_HORAS +1)) + AVANCE_MINIMO_HORAS;
            double azar_clima = Math.random();
            double factor_clima = 1.0;

            if (azar_clima < LLUVIA_FUERTE) {

                factor_clima = FACTOR_LLUVIA_FUERTE;}

            else if (azar_clima < LLUVIA_FUERTE + LLUVIA_NORMAL) {

                        factor_clima = FACTOR_LLUVIA_NORMAL;}

            double azar_cansancio = Math.random();
            double factor_amedio = 1.0;

            if (azar_cansancio < AMEDIO_CANSADO) {

                factor_amedio = FACTOR_AMEDIO_CANSADO;

            }
            double azar_escapa = Math.random();

            if (azar_escapa < AMEDIO_ESCAPA) {

            horas = horas - FACTOR_AMEDIO_ESCAPA_HORAS_PERDIDAS;

            }
            double avance_marco = velocidad * horas * factor_clima * factor_amedio;
            distancia_madre_marco = distancia_madre_marco - avance_marco - AVANCE_POR_DIA_MADRE;
            System.out.println("DIA " + dias);
            System.out.println("Velocidad de Marco: " + velocidad + " km/h");
            System.out.println("Horas de recorrido: " + horas);
            System.out.println("Kilometros recorridos por Marco: "+ avance_marco);
            System.out.println("Distancia restante: "+ Math.max(0, distancia_madre_marco) + " km");
            System.out.println("----------------------------");

        }while (distancia_madre_marco > 0);
        System.out.println("¡MARCO HA ENCONTRADO A SU MADRE!");
        System.out.println("Dias que ha tardado: " + dias);
    }
}






        




    
        
