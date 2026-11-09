
public class RetoCCCF {
    public static void main(String[] args) {

        final int DURACION_JORNADA = 720;
        final double PROBABILIDAD_LLEGADA = 0.60;
        final int MIN_PACKS = 5;
        final int MAX_PACKS = 15;

        int minuto = 0;

        int personasLlegadas = 0;
        int personasEnCola = 0;
        int personasAtendidas = 0;

        int packsVendidos = 0;
        int minutosColaVacia = 0;

        int tiempoCaja1 = 0;
        int tiempoCaja2 = 0;
        int tiempoCaja3 = 0;
        int tiempoCaja4 = 0;

        System.out.println("CENTRO COMERCIAL CF");
        System.out.println("Apertura: 09:00");
        System.out.println("Cierre: 21:00");
        System.out.println("----------------------------------------");


