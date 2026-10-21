import java.util.Scanner;

class CarreraDeCamellos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int LONGITUD_DE_PISTA = 60;
        boolean llegoAMeta;
        llegoAMeta = false;
        final double PROBABILIDAD_AGUJERO_1 = 0.6;
        final int AVANCE_AGUJERO_1 = 1;
        final double PROBABILIDAD_AGUJERO_2 = 0.4;
        final int AVANCE_AGUJERO_2 = 2;
        final double PROBABILIDAD_AGUJERO_3 = 0.3;
        final int AVANCE_AGUJERO_3 = 3;
        final double PROBABILIDAD_AGUJERO_4 = 0.1;
        final int AVANCE_AGUJERO_4 = 4;
        final String CAMELLO = ";--;'";
        final String LINEA = "---+-----------+---------+---------+---------+---------+-----------+";
        int turnos = 0;
        int posicionDelJugador = 0;
        int numeroDeFallos = 0;

        do {
            System.out.println("Elije un agujero (1-4)");
            int eleccionUsuario = scanner.nextInt();

            if (eleccionUsuario == 1 && Math.random() < PROBABILIDAD_AGUJERO_1) {
                posicionDelJugador = posicionDelJugador + AVANCE_AGUJERO_1;
                numeroDeFallos = 0;
            } else if (eleccionUsuario == 2 && Math.random() < PROBABILIDAD_AGUJERO_2) {
                posicionDelJugador = posicionDelJugador + AVANCE_AGUJERO_2;
                numeroDeFallos = 0;
            } else if (eleccionUsuario == 3 && Math.random() < PROBABILIDAD_AGUJERO_3) {
                posicionDelJugador = posicionDelJugador + AVANCE_AGUJERO_3;
                numeroDeFallos = 0;
            } else if (eleccionUsuario == 4 && Math.random() < PROBABILIDAD_AGUJERO_4) {
                posicionDelJugador = posicionDelJugador + AVANCE_AGUJERO_4;
                numeroDeFallos = 0;
            } else {
                numeroDeFallos++;
            }

            if (numeroDeFallos == 3) {
                posicionDelJugador = 0;
            }

            System.out.println("El jugador va en la posición " + posicionDelJugador);
            llegoAMeta = posicionDelJugador > LONGITUD_DE_PISTA;
            turnos = turnos + 1;
            System.out.println(LINEA);
            System.out.println("_".repeat(posicionDelJugador) + CAMELLO);
            System.out.println(LINEA);
        } while (!llegoAMeta);
        System.out.println("Has ganado en [" + turnos + "] turnos");
        scanner.close();   
    }
}
