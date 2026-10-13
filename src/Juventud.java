import java.util.Scanner;

public class Juventud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int debe;
        System.out.print("Ingrese la cantidad que debe: ");
        debe = scanner.nextInt();

        int pago;
        System.out.print("Ingrese la cantidad que paga: ");
        pago = scanner.nextInt();

        final int CAMBIO;
        CAMBIO = pago - debe; 
        int resto = CAMBIO;

        final int BILLETE_100 = 100;
        int b100 = resto / BILLETE_100;
        resto = resto % BILLETE_100;

        final int BILLETE_50 = 50;
        int b50 = resto / BILLETE_50;
        resto = resto % BILLETE_50;

        final int BILLETE_20 = 20;
        int b20 = resto / BILLETE_20;
        resto = resto % BILLETE_20;

        final int BILLETE_10 = 10;
        int b10 = resto / BILLETE_10;
        resto = resto % BILLETE_10;

        final int BILLETE_5 = 5;
        int b5 = resto / BILLETE_5;
        resto = resto % BILLETE_5;

        final int MONEDA_2 = 2;
        int m2 = resto / MONEDA_2;
        resto = resto % MONEDA_2;

        final int MONEDA_1 = 1;
        int m1 = resto / MONEDA_1;
        resto = resto % MONEDA_1;

        System.out.println(b100 + " billetes de 100");
        System.out.println(b50 + " billetes de 50");
        System.out.println(b20 + " billetes de 20");
        System.out.println(b10 + " billetes de 10");
        System.out.println(b5 + " billetes de 5");
        System.out.println(m2 + " monedas de 2");
        System.out.println(m1 + " monedas de 1");

        String mensaje = (CAMBIO >= 0) ? "El cambio es: " + CAMBIO : "Error: Pon mas dinero bro....";
        System.out.println(mensaje);
        scanner.close();

    }

}
