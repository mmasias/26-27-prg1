class viajeMarco {
    public static void main(String[] args) {

        final int VELOCIDAD_MAX = 15;
        final int VELOCIDAD_MIN = 10;

        final int HORAS_MAX = 10;
        final int HORAS_MIN = 8;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.10;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.30;

        final double REDUCCION_VELOCIDAD_LLUVIA_FUERTE = 0.75;
        final double REDUCCION_VELOCIDAD_LLUVIA_NORMAL = 0.25;

        final double PROBABILIDAD_MONO_CANSADO = 0.25;
        final double PROBABILIDAD_MONO_ESCAPA = 0.15;

        final double REDUCCION_VELOCIDAD_MONO_CANSADO = 0.10;
        final double REDUCCION_TIEMPO_MONO_ESCAPA = 2.0;

        final double DISTACIA_INICIO = 350;
        final int AVANCE_MADRE_DIA = 80;

        double distanciaFalta = DISTACIA_INICIO;
        int dia = 0;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=============================");

        while (distanciaFalta > 0) {

            System.out.println("Día " + dia);

            double velocidadDia = Math.random() * (VELOCIDAD_MAX - VELOCIDAD_MIN) + VELOCIDAD_MIN;
            double tiempoDia = Math.random() * (HORAS_MAX - HORAS_MIN) + HORAS_MIN;

            boolean monoEscapa;
            if (monoEscapa = Math.random() < PROBABILIDAD_MONO_ESCAPA) {

                tiempoDia = tiempoDia - REDUCCION_TIEMPO_MONO_ESCAPA;
                System.out.println("¡¡Amedio se ha escapado!!");
            }

            double reduccionCulpaMono = 0;
            boolean monoCansado;
            if (monoCansado = Math.random() < PROBABILIDAD_MONO_CANSADO) {
                reduccionCulpaMono = REDUCCION_VELOCIDAD_MONO_CANSADO;
                System.out.println("¡¡Amedio está cansado!!");
            }

            double reduccionCulpaLluvia = 0;
            double probabilidadLluvia = Math.random();

            if (probabilidadLluvia < PROBABILIDAD_LLUVIA_FUERTE) {

                reduccionCulpaLluvia = REDUCCION_VELOCIDAD_LLUVIA_FUERTE;
                System.out.println("¡¡Ha llovido fuerte!!");

            } else if (probabilidadLluvia < PROBABILIDAD_LLUVIA_NORMAL) {

                reduccionCulpaLluvia = REDUCCION_VELOCIDAD_LLUVIA_NORMAL;
                System.out.println("¡¡Ha llovido normal!!");
            }

            double velocidadEfectiva = velocidadDia - (reduccionCulpaMono + reduccionCulpaLluvia);
            double distanciaRecorrida = tiempoDia * velocidadEfectiva;

            distanciaFalta = distanciaFalta - distanciaRecorrida + AVANCE_MADRE_DIA;

            dia++;

            System.out.println("Tiempo caminando por hoy es de : " + tiempoDia + " horas.");
            System.out.println("La velocidad que ha llevado ha sido : " + velocidadDia + " km/h.");
            System.out.println("Al acabar el dia de hoy ha recorrido: " + distanciaRecorrida + " km.");
            System.out.println("Le faltan: " + distanciaFalta + " km para llegar a su madre.");
            System.out.println("--------------------------------------------------");
        }

        System.out.println("Marco encontró a su madre en " + dia + " días.");

    }
}