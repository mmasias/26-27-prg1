import java.util.Scanner;

class Carreradecamellos{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("########-bienvenido a la carrera de camellos-######");
        System.out.println("este es el tablero");

        int casilla;
        int turno=0;
        int posicion = 0;
        final int META = 60;
        final int P1 = 60;
        final int P2 = 40;
        final int P4 = 30;
        final int P6 = 10;
        while (posicion < META) {
            for (casilla = 0; casilla < META; casilla++) {
                if (casilla!=posicion) {
                    System.out.print("#");
                }else{
                    System.out.print("C");
                    }
                }
            int restantes= META - posicion;
            System.out.println();
            for (int i=0 ; i<6; i++) {
               for (int j = 0 ; j < 10 ; j++) {
                    System.out.print(j);
                    }
                }
            System.out.println();
            turno++;
            System.out.println("turno "+ turno);
            System.out.println("quedan " + restantes + " casillas");
            System.out.println("Introduce cuantas casillas quieres avanzar, las probabilidades de avanzar son: ");
            System.out.println("1-60% 2-40% 4-30% 6-10%");
            int avanzar = scanner.nextInt();
            int probabilidad = (int) (Math.random() * 100);

            switch (avanzar) {
                case 1:
                    if (probabilidad < P1) {
                        posicion = posicion + 1;
                        System.out.println("has avanzado 1 casilla");
                    } else {
                        System.out.println("no has avanzado");
                    }
                    break;
                case 2:
                    if (probabilidad < P2) {
                        posicion = posicion + 2;
                        System.out.println("has avanzado 2 casillas");
                    } else {
                        System.out.println("no has avanzado");
                    }
                    break;
                case 4:
                    if (probabilidad < P4) {
                        posicion = posicion + 4;
                        System.out.println("has avanzado 4 casillas");
                    } else {
                        System.out.println("no has avanzado");
                    }
                    break;
                case 6:
                    if (probabilidad < P6) {
                        posicion = posicion + 6;
                        System.out.println("has avanzado 6 casillas");
                    } else {
                        System.out.println("no has avanzado");
                    }
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }
        System.out.println("Felicidades, ahs llegado a la meta en "+turno+" turnos");
}
}