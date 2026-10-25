package reto002.src;

import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Bienvenido al pago de tasas!");
        System.out.println("Ingrese la cantidad que debe...");
        double debe = scanner.nextDouble();

        System.out.println("Ingrese la cantidad que paga...");
        double paga = scanner.nextDouble();

        final int ENTERO = (int) (paga - debe);
        final int CENTAVO = (int) ((paga - debe - ENTERO) * 100);

        int resto_entero = ENTERO;
        int resto_centavo = CENTAVO;

        final int BILLETE100 = 100;
        int billete100 = resto_entero / BILLETE100;
        resto_entero = resto_entero % BILLETE100;

        final int BILLETE50 = 50;
        int billete50 = resto_entero / BILLETE50;
        resto_entero = resto_entero % BILLETE50;

        final int BILLETE20 = 20;
        int billete20 = resto_entero / BILLETE20;
        resto_entero = resto_entero % BILLETE20;

        final int BILLETE10 = 10;
        int billete10 = resto_entero / BILLETE10;
        resto_entero = resto_entero % BILLETE10;

        final int BILLETE5 = 5;
        int billete5 = resto_entero / BILLETE5;
        resto_entero = resto_entero % BILLETE5;

        final int MONEDA2 = 2;
        int moneda2 = resto_entero / MONEDA2;
        resto_entero = resto_entero % MONEDA2;

        final int MONEDA1 = 1;
        int moneda1 = resto_entero / MONEDA1;
        resto_entero = resto_entero % MONEDA1;

        final int MONEDA50 = 50;
        int moneda50 = resto_centavo / MONEDA50;
        resto_centavo = resto_centavo % MONEDA50;

        final int MONEDA20 = 20;
        int moneda20 = resto_centavo / MONEDA20;
        resto_centavo = resto_centavo % MONEDA20;

        final int MONEDA10 = 10;
        int moneda10 = resto_centavo / MONEDA10;
        resto_centavo = resto_centavo % MONEDA10;

        final int MONEDA5 = 5;
        int moneda5 = resto_centavo / MONEDA5;
        resto_centavo = resto_centavo % MONEDA5;

        final int MONEDA01 = 1;
        int moneda01 = resto_centavo / MONEDA01;
        resto_centavo = resto_centavo % MONEDA01;

        System.out.println("Billetes de 100: " + billete100);
        System.out.println("Billetes de 50: " + billete50);
        System.out.println("Billetes de 20: " + billete20);
        System.out.println("Billetes de 10: " + billete10);
        System.out.println("Billetes de 5: " + billete5);
        System.out.println("Monedas de 2: " + moneda2);
        System.out.println("Monedas de 1: " + moneda1);
        System.out.println("Monedas de 0.50:  " + moneda50);
        System.out.println("Monedas de 0.20:  " + moneda20);
        System.out.println("Monedas de 0.10:  " + moneda10);
        System.out.println("Monedas de 0.05:  " + moneda5);
        System.out.println("Monedas de 0.01:  " + moneda01);

        final String MENSAJE = (ENTERO >= 0) ? "El cambio es: " + ENTERO +"."+ CENTAVO +  " euros"
                : "Error: No hay cambio suficiente, faltan: " + (ENTERO * -1) + " euros"; //aqui queria poner tambien que pusiera los centavos pero no se me ocurria una forma, si me podria decir en un comment la manera lo apreciaria!

        System.out.println(MENSAJE);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        scanner.close();

    }
}
