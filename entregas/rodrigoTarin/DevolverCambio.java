import java.util.Scanner;

class DevolverCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Cuantos euros debe pagar?");
        int importeAPagar = scanner.nextInt();

        System.out.println("¿Con cuantos euros paga?");
        int importePagado = scanner.nextInt();

        int cambio = importePagado - importeAPagar; 

        final int BILLETE100 = 100;
        final int BILLETE50 = 50;
        final int BILLETE20 = 20;
        final int BILLETE10 = 10;
        final int BILLETE5 = 5;
        final int MONEDA2 = 2;
        final int MONEDA1 = 1;

        int num100 = cambio / BILLETE100;
        int resto = cambio % BILLETE100;
        System.out.println(num100 + " billete(s) de " + BILLETE100 + " €");

        int num50 = resto / BILLETE50;
        resto = resto % BILLETE50;
        System.out.println(num50 + " billete(s) de " + BILLETE50 + " €");

        int num20 = resto / BILLETE20;
        resto = resto % BILLETE20;
        System.out.println(num20 + " billete(s) de " + BILLETE20 + " €");

        int num10 = resto / BILLETE10;
        resto = resto % BILLETE10;
        System.out.println(num10 + " billete(s) de " + BILLETE10 + " €");

        int num5 = resto / BILLETE5;
        resto = resto % BILLETE5;
        System.out.println(num5 + " billete(s) de " + BILLETE5 + " €");

        int num2 = resto / MONEDA2;
        resto = resto % MONEDA2;
        System.out.println(num2 + " moneda(s) de " + MONEDA2 + " €");

        int num1 = resto / MONEDA1;
        resto = resto % MONEDA1;
        System.out.println(num1 + " moneda(s) de " + MONEDA1 + " €");
        scanner.close();
    }
}