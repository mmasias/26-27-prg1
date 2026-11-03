class ElViajeDeMarco{
    public static void main(String[] args) {

        double VELOCIDADMINIMA= 10;
        double VELOCIDADMAXIMA=15;

        double horasMaximas=10;
        double horasMinimas=8;

        

        final double LLUVIA_FUERTE = 0.10;
        final double VELOCIDAD_MARCO_LLUVIA_FUERTE= 0.25;

        final double LLUVIA = 0.30;
        final double VELOCIDAD_MARCO_LLUVIA=0.75;

        final double PROB_MONO_CANSE=0.25;
        
        

        final double PROB_MONO_ESCAPE=0.15;
        final double PERDIDA_HORAS_BUSCANDO_MONO=2;

        final double DISTANCIA_INCIAL_MADRE =350;
        final double RECORRE_MADRE_DIA=80;
        
        double distanciaMadre= DISTANCIA_INCIAL_MADRE;
        int dia =0;

        

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        

        do{
            dia++;
            System.out.println("DIA"+dia);


            double velocidad = Math.random()*
            (VELOCIDADMAXIMA-VELOCIDADMINIMA+1)+VELOCIDADMINIMA;

            double  horasRecorre = Math.random()*(horasMaximas
            -horasMinimas+1)+horasMinimas;

            double probabilidadclima= Math.random();
            if (LLUVIA_FUERTE>=probabilidadclima){
                velocidad=velocidad* VELOCIDAD_MARCO_LLUVIA_FUERTE;
                System.out.println("Ha llovido muchisimo");

            } else if((LLUVIA+LLUVIA_FUERTE)>= probabilidadclima) {
                velocidad=velocidad*VELOCIDAD_MARCO_LLUVIA;
                System.out.println("Ha llovido poco");

            } else{
                System.out.println("Ha hecho un buen dia");
            }

            double canseMono = Math.random();
            double escapeMono = Math.random();
            double reduccionVelocidad=0.90;

            if (PROB_MONO_ESCAPE>= escapeMono){
                horasRecorre = horasRecorre - PERDIDA_HORAS_BUSCANDO_MONO;
            }
            
            if (PROB_MONO_CANSE>= canseMono){
                velocidad =velocidad *reduccionVelocidad;
            }

            double horasEfectivasMarco = (horasRecorre > 0) ? horasRecorre : 0;
            double avanceMarcoHoy = velocidad * horasEfectivasMarco;
            
            double horasImprimir = (int)(horasEfectivasMarco * 100.0) / 100.0;
            double velImprimir = (int)(velocidad * 100.0) / 100.0;
            double avanceImprimir = (int)(avanceMarcoHoy * 100.0) / 100.0;


            System.out.println("Avance " + horasImprimir + " horas a " + velImprimir + " Km/h recorriendo " + avanceImprimir + " Km");

            System.out.println("A mama le ha hecho un buen dia");
            System.out.println("Mama pudo avanzar recorriendo " + RECORRE_MADRE_DIA + " Km");

            distanciaMadre = distanciaMadre + RECORRE_MADRE_DIA - avanceMarcoHoy;
            double distanciaImprimir = (int)(distanciaMadre * 100.0) / 100.0;


            if (distanciaMadre <= 0) {
                System.out.println("A Marco le dicen que han visto a su mamá, y rompe a correr!!!");
                System.out.println("************************************************************");
                System.out.println("Al final del día " + dia + " Marco encuentra a su madre!!!");
                System.out.println("************************************************************");
            } else {
                System.out.println("Al final del día " + dia + " la distancia entre Marco y su Madre es de " + distanciaImprimir + " Km");
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            }
        } while (distanciaMadre>0);

    
                  
    }
}

