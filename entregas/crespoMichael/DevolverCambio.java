
import java.util.Scanner;

class reto_002 {
    public static void main(String[] args) {

        int debepagar;
        int paga;
        int cambio = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor que debe pagar: ");
        debepagar = scanner.nextInt();

        System.out.println("Ingrese el valor que paga: ");
        paga = scanner.nextInt();

        scanner.close();

        String errorMessage = "El valor que paga es menor al valor que debe pagar";

        cambio = (paga >= debepagar) ? paga - debepagar : Integer.parseInt(errorMessage);

        int billete100 = cambio / 100;
        int billete50 = (cambio - billete100 * 100) / 50;
        int billete20 = (cambio - billete100 * 100 - billete50 * 50) / 20;
        int billete10 = (cambio - billete100 * 100 - billete50 * 50 - billete20 * 20) / 10;
        int billete5 = (cambio - billete100 * 100 - billete50 * 50 - billete20 * 20 - billete10 * 10) / 5;
        int billete2 = (cambio - billete100 * 100 - billete50 * 50 - billete20 * 20 - billete10 * 10 - billete5 * 5) / 2;
        int billete1 = (cambio - billete100 * 100 - billete50 * 50 - billete20 * 20 - billete10 * 10 - billete5 * 5 - billete2 * 2) / 1;

        String mensaje = "billete(s) de : ";
        String mensaje2 = "moneda(s) de : ";

        System.out.println(cambio + " euros de cambio");
        System.out.println(mensaje + billete100 + " de 100 euros");
        System.out.println(mensaje + billete50 + " de 50 euros");
        System.out.println(mensaje + billete20 + " de 20 euros");
        System.out.println(mensaje + billete10 + " de 10 euros");
        System.out.println(mensaje + billete5 + " de 5 euros");
        System.out.println(mensaje2 + billete2 + " de 2 euros");
        System.out.println(mensaje2 + billete1 + " de 1 euro");

    }
}
