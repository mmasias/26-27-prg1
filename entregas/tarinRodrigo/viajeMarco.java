package entregas.tarinRodrigo;

public class viajeMarco {
    public static void main(String[] args) {
    
    final double DISTANCIA_INICIAL = 350.0;
    final double LLUVIA_FUERTE = 0.10;
    final double LLUVIA_NORMAL = 0.30;
    final double ESCAPE = 0.15;
    final double CANSANCIO = 0.25;
    final double HORAS_PERDIDAS = 2.0;

    final double CASTIGO_LLUVIA_FUERTE = 0.25;
    final double CASTIGO_LLUVIA_NORMAL = 0.75;
    final double CASTIGO_CANSANCIO = 0.90;
    final double VELOCIDAD_MIN = 10.0;
    final double VELOCIDAD_MAX = 15.0;
    final double HORAS_MIN = 8.0;
    final double HORAS_MAX = 10.0;
    final double VELOCIDAD_MADRE_MIN = 8.0;
    final double VELOCIDAD_MADRE_MAX = 12.0;
    final double HORAS_MADRE_MIN = 6.0;
    final double HORAS_MADRE_MAX = 10.0;

    double distancia = DISTANCIA_INICIAL;
    int dia = 0;
    boolean encontrada = false;

    System.out.println("DIARIO DEL VIAJE DE MARCO");
    System.out.println("=========================");
    
    while(!encontrada){
        dia++;
        System.out.println("DIA " + dia);

        double velocidad = Math.random() * (VELOCIDAD_MAX - VELOCIDAD_MIN) + VELOCIDAD_MIN;
        double horas = Math.random() * (HORAS_MAX - HORAS_MIN) + HORAS_MIN;
        double clima = Math.random();

        if (clima < LLUVIA_FUERTE) {
            System.out.println("¡Ha llovido muchísimo!");
            velocidad = velocidad * CASTIGO_LLUVIA_FUERTE;
        } else if (clima < LLUVIA_FUERTE + LLUVIA_NORMAL) {
            System.out.println("Ha llovido un poco");
            velocidad = velocidad * CASTIGO_LLUVIA_NORMAL;
        } else {
            System.out.println("Ha hecho un buen dia");
        }

        if (Math.random() < ESCAPE) {
            System.out.println("¡He perdido tiempo buscando a Amedio!");
            horas = horas - HORAS_PERDIDAS;
        }

        if (Math.random() < CANSANCIO) {
            System.out.println("Amedio se ha cansado y lo llevo en brazos");
            velocidad = velocidad * CASTIGO_CANSANCIO;
        }

        double recorridoMarco = horas * velocidad;
        System.out.println("Avance " + Math.round(horas * 100) / 100.0 + " horas a " 
        + Math.round(velocidad * 100) / 100.0 + " Km/h recorriendo " 
        + Math.round(recorridoMarco * 100) / 100.0 + " Km");
        
        double velocidadMadre = Math.random() * (VELOCIDAD_MADRE_MAX - VELOCIDAD_MADRE_MIN) + VELOCIDAD_MADRE_MIN;
        double horasMadre = Math.random() * (HORAS_MADRE_MAX - HORAS_MADRE_MIN) + HORAS_MADRE_MIN;
        double climaMadre = Math.random();

        if (climaMadre < LLUVIA_FUERTE) {
        System.out.println("A mamá le ha llovido muchísimo");
        velocidadMadre = velocidadMadre * CASTIGO_LLUVIA_FUERTE;
        } else if (climaMadre < LLUVIA_FUERTE + LLUVIA_NORMAL) {
        System.out.println("A mamá le ha llovido un poco");
        velocidadMadre = velocidadMadre * CASTIGO_LLUVIA_NORMAL;
        } else {
        System.out.println("A mamá le ha hecho un buen día");
        }

        double recorridoMadre = horasMadre * velocidadMadre;
        System.out.println("Mama pudo avanzar " + Math.round(horasMadre * 100) / 100.0 + " horas a "
        + Math.round(velocidadMadre * 100) / 100.0 + " Km/h recorriendo "
        + Math.round(recorridoMadre * 100) / 100.0 + " Km");
        
        double distanciaTotal = distancia + recorridoMadre;

        if (recorridoMarco >= distanciaTotal) {
        encontrada = true;
        System.out.println("A Marco le dicen que han visto a su mamá, y rompe a correr!!!");
        System.out.println("************************************************************");
        System.out.println("Al final del día " + dia + " Marco encuentra a su madre!!!");
        System.out.println("************************************************************");
        } else {
        distancia = distanciaTotal - recorridoMarco;
        System.out.println("Al final del día " + dia + " la distancia entre Marco y su Madre es de "
        + Math.round(distancia * 100) / 100.0 + " Km");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }
    }
}
