class ViajeDeMarco {
    public static void main(String[] args) {

        final int VELOCIDAD_MAXIMA_MARCO = 15;
        final int VELOCIDAD_MINIMA_MARCO = 10;
        final int HORAS_DE_TRAYECTO_MAXIMO = 10;
        final int HORAS_DE_TRAYECTO_MINIMO = 8;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.3;
        final double LLUVIA_FUERTE = 0.75;
        final double LLUVIA_NORMAL = 0.25;
        final double PROBABILIDAD_TOTAL_LLUVIA = (PROBABILIDAD_LLUVIA_NORMAL + PROBABILIDAD_LLUVIA_FUERTE);
        final double PROBABILIDAD_AMEDIO_CANSADO = 0.25;
        final double PROBABILIDAD_AMEDIO_ESCAPA = 0.15;
        final double AMEDIO_CANSADO = 0.1;
        final double AMEDIO_ESCAPA = 2.0;
        double distanciaMadre = 350.0;
        final int VELOCIDAD_MAXIMA_MADRE = 9;
        final int VELOCIDAD_MINIMA_MADRE = 6;
        final int HORAS_TRAYECTO_MADRE_MAXIMO = 9;
        final int HORAS_TRAYECTO_MADRE_MINIMO = 6;
        final double LLUVIA_NORMAL_MADRE = 0.25;
        final double LLUVIA_FUERTE_MADRE = 0.5;

        int diasDeViaje = 0;
        boolean estaEnViaje = true;
        System.out.println("═════════════════════════════════════════════════════════════════════");
        System.out.println("                      DIARIO DEL VIAJE DE MARCO");                        
        System.out.println("═════════════════════════════════════════════════════════════════════");

        while (estaEnViaje) {
            diasDeViaje = diasDeViaje + 1;
            System.out.println("Día " + diasDeViaje);
            
            double velocidadDiaMarco = ((Math.random() * (VELOCIDAD_MAXIMA_MARCO - VELOCIDAD_MINIMA_MARCO)) + VELOCIDAD_MINIMA_MARCO);
            double horasDeTrayectoMarco = ((Math.random() * (HORAS_DE_TRAYECTO_MAXIMO - HORAS_DE_TRAYECTO_MINIMO)) + HORAS_DE_TRAYECTO_MINIMO);
            
            double velocidadDiaMadre = ((Math.random() * (VELOCIDAD_MAXIMA_MADRE - VELOCIDAD_MINIMA_MADRE)) + VELOCIDAD_MINIMA_MADRE);
            double horasDeTrayectoMadre = ((Math.random() * (HORAS_TRAYECTO_MADRE_MAXIMO - HORAS_TRAYECTO_MADRE_MINIMO)) + HORAS_TRAYECTO_MADRE_MINIMO);

            double climaHoyMarco = Math.random();
            double climaHoyMadre = Math.random();
            double climaMarco = 0;
            double climaMadre = 0;

            if (climaHoyMarco <= PROBABILIDAD_TOTAL_LLUVIA) {

                if (climaHoyMarco > PROBABILIDAD_LLUVIA_FUERTE) {
                    climaMarco = velocidadDiaMarco * LLUVIA_NORMAL;
                    System.out.println("Hoy llovió un poco para Marco");
                } else if (climaHoyMarco <= LLUVIA_FUERTE) {
                    climaMarco = velocidadDiaMarco * LLUVIA_FUERTE;
                    System.out.println("Hoy llovió muy fuerte para Marco!");
                }
            }

            if (climaHoyMarco > PROBABILIDAD_TOTAL_LLUVIA) {
                System.out.println("Hoy fue un lindo día para Marco");
            }

            if (climaHoyMadre <= PROBABILIDAD_TOTAL_LLUVIA) {

                if (climaHoyMadre > PROBABILIDAD_LLUVIA_FUERTE) {
                    climaMadre = velocidadDiaMadre * LLUVIA_NORMAL_MADRE;
                    System.out.println("Hoy llovió un poco para la madre de Marco");
                } else if (climaHoyMadre <= PROBABILIDAD_LLUVIA_FUERTE) {
                    climaMadre = velocidadDiaMadre * LLUVIA_FUERTE_MADRE;
                    System.out.println("Hoy llovió muy fuerte para la madre de Marco!");
                }
            }

            if (climaHoyMadre > PROBABILIDAD_TOTAL_LLUVIA) {
                System.out.println("Hoy fue un lindo día para la madre de Marco");
            }

            double monoCansado = 0;
            if (Math.random() <= PROBABILIDAD_AMEDIO_CANSADO) {
                monoCansado = velocidadDiaMarco * AMEDIO_CANSADO;
                System.out.println("Hoy Amedio se cansó");
            }

            if (Math.random() <= PROBABILIDAD_AMEDIO_ESCAPA) {
                horasDeTrayectoMarco = horasDeTrayectoMarco - AMEDIO_ESCAPA;
                System.out.println("Hoy Amedio se escapó!!");
            }

            velocidadDiaMarco = velocidadDiaMarco - (climaMarco + monoCansado);
            double recorridoHoyMarco = velocidadDiaMarco * horasDeTrayectoMarco;

            velocidadDiaMadre = velocidadDiaMadre - climaMadre;
            double recorridoHoyMadre = velocidadDiaMadre * horasDeTrayectoMadre;

            System.out.println("Hoy avancé " + (Math.round(horasDeTrayectoMarco * 100.0)/100.0) + " horas a " + (Math.round(velocidadDiaMarco * 100.0)/100.0) + " Km/h, recorriento en total " + (Math.round(recorridoHoyMarco * 100.0)/100.0) + " Km");

            distanciaMadre = (distanciaMadre + recorridoHoyMadre) - recorridoHoyMarco;
            System.out.println("Hoy mamá avanzó " + (Math.round(horasDeTrayectoMadre * 100.0)/100.0) + " horas a " + (Math.round(velocidadDiaMadre * 100.0)/100.0) + " Km/h, recorriendo " + (Math.round(recorridoHoyMadre * 100.0)/100.0) + " Km");
            
            final double PROBABILIDAD_HABLAR_SOBRE_MADRE = 0.5;
            if (distanciaMadre < 50 && Math.random() < PROBABILIDAD_HABLAR_SOBRE_MADRE) {  
                System.out.println("A Marco le dicen que han visto a su mamá, y rompe a correr!!!");
                distanciaMadre = distanciaMadre - 25.0;
            }

            if (distanciaMadre > 0) {
                System.out.println("Al final del día " + diasDeViaje + " la distancia entre Marco y su madre es " + (Math.round(distanciaMadre * 100.0)/100.0) + " Km");
            }
            
            if (distanciaMadre <= 0) {
                System.out.println("─────────────────────────────────────────────────────────────────────");
                System.out.println("Al final del día " + diasDeViaje + " Marco encontró a su madre!!");
                estaEnViaje = false;
            }
            
            System.out.println("─────────────────────────────────────────────────────────────────────");
        }
    }
}