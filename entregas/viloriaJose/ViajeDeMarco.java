
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
        final int VELOCIDAD_MADRE = 80;
        int diasDeViaje = 0;
        boolean estaEnViaje = true;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("═════════════════════════");

        while (estaEnViaje) {
            diasDeViaje = diasDeViaje + 1;
            System.out.println("Día " + diasDeViaje);
            double velocidadDia = ((Math.random() * (VELOCIDAD_MAXIMA_MARCO - VELOCIDAD_MINIMA_MARCO))
                    + VELOCIDAD_MINIMA_MARCO);
            double horasDeTrayecto = ((Math.random() * (HORAS_DE_TRAYECTO_MAXIMO - HORAS_DE_TRAYECTO_MINIMO))
                    + HORAS_DE_TRAYECTO_MINIMO);

            double climaHoy = Math.random();
            double clima = 0;

            if (climaHoy <= PROBABILIDAD_TOTAL_LLUVIA) {

                if (climaHoy > PROBABILIDAD_LLUVIA_FUERTE) {
                    clima = velocidadDia * LLUVIA_NORMAL;
                    System.out.println("Hoy llovió un poco");
                } else if (climaHoy <= LLUVIA_FUERTE) {
                    clima = velocidadDia * LLUVIA_FUERTE;
                    System.out.println("Hoy llovió muy fuerte!");
                }
            }

            if (climaHoy > PROBABILIDAD_TOTAL_LLUVIA) {
                System.out.println("Hoy hizo un lindo día");
            }
            
            double monoCansado = 0;
            if (Math.random() <= PROBABILIDAD_AMEDIO_CANSADO) {
                monoCansado = velocidadDia * AMEDIO_CANSADO;
                System.out.println("Hoy Amedio se cansó");
            }

            if (Math.random() <= PROBABILIDAD_AMEDIO_ESCAPA) {
                horasDeTrayecto = horasDeTrayecto - AMEDIO_ESCAPA;
                System.out.println("Hoy Amedio se escapó!!");
            }

            velocidadDia = velocidadDia - (clima + monoCansado);
            double recorridoHoy = velocidadDia * horasDeTrayecto;

            System.out.println("Hoy avancé " + (Math.round(horasDeTrayecto * 100.0)/100.0) + " horas a " + (Math.round(velocidadDia * 100.0)/100.0) + " Km/h, recorriento en total " + (Math.round(recorridoHoy * 100.0)/100.0) + " Km");

            distanciaMadre = (distanciaMadre + VELOCIDAD_MADRE) - recorridoHoy;
            System.out.println("Mamá avanzó " + VELOCIDAD_MADRE + " Km");
            
            if (distanciaMadre > 0) {
                System.out.println("al final del día " + diasDeViaje + " la distancia entre Marco y su madre es " + (Math.round(distanciaMadre * 100.0)/100.0) + " Km");
            }

            if (distanciaMadre <= 0) {
                System.out.println("al final del día " + diasDeViaje + " Marco encontró a su madre!!");
                estaEnViaje = false;
            }
            System.out.println("─────────────────────────");
        }
    }
}