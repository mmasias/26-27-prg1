
class viajeMarco {
    public static void main (string [] args){

        FINAL VELOCIDAD_MAX = 15;
        FINAL VELOCIDAD_MIN = 10;
        double velocidadDia = math.random () * (VELOCIDADMAX-VELOCIDADMIN) + VELOCIDADMIN;

        int horasMinViaje = 8;
        int horasMaxViaje = 10;

        //cambia cada dia: reduccion velocidad,reduccion de tiempo , tiempo trayecto por dia (8 a 10), velocidad promedio por dia (10 a 15), tiempo recorrido efectivo =(trayrcto dia - reducciontiempo)
        // velocidad efecttiva =velocidad por dia - (reduccion de velociada lluvia + reduccion velocidad mono cansado)

        final double PROBABILIDAD_LLUVIA_FUERTE = 0,10; //Reduce velocidad al 25%
        final double PROBABILIDAD_LLUVIA_NORMAL = 0,30;// Reduce velocidad en un 25%
        final double PROBABILIDAD_BUEN_TIEMPO= 0,60; // el no lo pone
        
        final double MONO_CANSADO= 0.25; // reduce velocidad en un 10%
        final double MONO_ESCAPA = 0.10; //reducción de tiempo 2h

        final int DISTACIA_INICIO= 350;
        final int AVANCE_MADRE_DIA = 80;

        // random menor 0,1 => (tiempo -2)

        





        int velocidadMedia = (int) (Math.random ()*(VELOCIDADMAX-VELOCIDADMIN)+VELOCIDADMIN;) 

        System.out.println (velocidadMedia);


        
        
    }
}