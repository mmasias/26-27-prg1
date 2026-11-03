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

        final int VELOCIDAD_MADRE_MAX = 9;
        final int VELOCIDAD_MADRE_MIN = 6;

        final int HORAS_MADRE_MAX = 9;
        final int HORAS_MADRE_MIN = 6;

        final double REDUCCION_VELOCIDAD_MADRE_LLUVIA_FUERTE = 0.50;
        final double REDUCCION_VELOCIDAD_MADRE_LLUVIA_NORMAL = 0.25;


        double distanciaFalta = DISTACIA_INICIO;
        int dia = 0;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("================================");

        while (distanciaFalta > 0) {

            dia++;

            System.out.println("Día " + dia);

            double velocidadDia = Math.random() * (VELOCIDAD_MAX - VELOCIDAD_MIN) + VELOCIDAD_MIN;
            double tiempoDia = Math.random() * (HORAS_MAX - HORAS_MIN) + HORAS_MIN;

            boolean monoEscapa;
            if (monoEscapa = Math.random() < PROBABILIDAD_MONO_ESCAPA) {

                tiempoDia = tiempoDia - REDUCCION_TIEMPO_MONO_ESCAPA;
                System.out.println("¡¡Amedio se ha escapado(Marco tiene que buscarlo)!!");
            }

            double reduccionCulpaMono = 0;
            boolean monoCansado;
            if (monoCansado = Math.random() < PROBABILIDAD_MONO_CANSADO) {
                reduccionCulpaMono = REDUCCION_VELOCIDAD_MONO_CANSADO;
                System.out.println("¡¡Amedio está cansado (Marco tiene que llevarlo)!!");
            }

            double reduccionCulpaLluvia = 0;
            double probabilidadLluvia = Math.random();

            if (probabilidadLluvia < PROBABILIDAD_LLUVIA_FUERTE) {

                reduccionCulpaLluvia = REDUCCION_VELOCIDAD_LLUVIA_FUERTE;
                System.out.println("¡¡Ha llovido fuerte en donde estaba Marco!!");

            } else if (probabilidadLluvia < PROBABILIDAD_LLUVIA_NORMAL) {

                reduccionCulpaLluvia = REDUCCION_VELOCIDAD_LLUVIA_NORMAL;
                System.out.println("¡¡Ha llovido normal en donde estaba Marco!!");
            }

            double velocidadEfectiva = velocidadDia - (reduccionCulpaMono + reduccionCulpaLluvia);
            double distanciaRecorrida = tiempoDia * velocidadEfectiva;


            System.out.println("Tiempo caminando por Marco hoy es de : " + tiempoDia + " horas.");
            System.out.println("La velocidad que ha llevado Marco durante el día ha sido : " + velocidadEfectiva + " km/h.");
            System.out.println("Al acabar el dia Marco y Amedio han recorrido: " + distanciaRecorrida + " km.");
            System.out.println("");


            double velocidadMadre = Math.random() * (VELOCIDAD_MADRE_MAX - VELOCIDAD_MADRE_MIN) + VELOCIDAD_MADRE_MIN;
            double tiempoMadre = Math.random() * (HORAS_MADRE_MAX - HORAS_MADRE_MIN) + HORAS_MADRE_MIN;
            double probabilidadLluviaMadre = Math.random();
            double reduccionLluviaMadre = 0;

            if (probabilidadLluviaMadre < PROBABILIDAD_LLUVIA_FUERTE ) {

                reduccionLluviaMadre = REDUCCION_VELOCIDAD_MADRE_LLUVIA_FUERTE;
                System.out.println("¡¡Ha llovido fuerte en donde estaba la madre de Marco!!");

            } else if (probabilidadLluviaMadre < PROBABILIDAD_LLUVIA_NORMAL + PROBABILIDAD_LLUVIA_FUERTE) {

                reduccionLluviaMadre = REDUCCION_VELOCIDAD_MADRE_LLUVIA_NORMAL;
                System.out.println("¡¡Ha llovido normal en donde estaba la madre de Marco!!");

            } else {
                System.out.println("¡¡No ha llovido en donde estaba la madre de Marco, ha tenido un buen día!!");
            }

            double velocidadMadreEfectiva = velocidadMadre * (1 - reduccionLluviaMadre);
            double distanciaMadre = tiempoMadre * velocidadMadreEfectiva;

            distanciaFalta = distanciaFalta - distanciaRecorrida + distanciaMadre;

            if (distanciaFalta < 0) {
             distanciaFalta = 0;
            }

           
            System.out.println("Tiempo caminando por la madre de Marco hoy es de : " + tiempoMadre + " horas.");
            System.out.println("La velocidad que ha llevado ha sido : " + velocidadMadreEfectiva + " km/h.");
            System.out.println("Al acabar el dia de hoy ha recorrido: " + distanciaMadre + " km.");
            System.out.println("Le faltan: " + distanciaFalta + " km para encontrarse con Marco.");
            System.out.println("--------------------------------------------------");
        }

        System.out.println("Marco encontró a su madre en " + dia + " días.");

    }
}