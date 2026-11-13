
import java.util.Scanner;

public class TerceraClase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MINIMO = 0;
        final int MAXIMO = 100;

        int numeroAleatorio = (int) (Math.random() * (MAXIMO - MINIMO) + MINIMO);

        System.out.println("Adivina el numero que estoy pensando: (" + numeroAleatorio + ")");
        int numeroDelUsuario;
        boolean haAdivinado = false;
        int contadorAdivinanza = 0;
        final int NUMERO_MAXIMO_INTENTOS = 3;
        boolean quedanIntentos = true;
        
        do {
            contadorAdivinanza = contadorAdivinanza + 1;
            numeroDelUsuario = scanner.nextInt();
            quedanIntentos = contadorAdivinanza <= NUMERO_MAXIMO_INTENTOS;

            if (numeroAleatorio == numeroDelUsuario) {
                
                System.out.println("Adivinaste.");
                haAdivinado = true;
            } else {
                System.out.println("No Adivinaste.");
            }

            System.out.println("Numero de veces intentado: " + contadorAdivinanza);
        } while (!haAdivinado && quedanIntentos);

        // String mensaje = (numeroDelUsuario == numeroAleatorio? "SI": "NO") + " ADIVINASTE";
        // System.out.println(mensaje);
        
    }
}
