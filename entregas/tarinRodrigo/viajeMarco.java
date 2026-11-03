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

        encontrada = true;
    }
    }
}
