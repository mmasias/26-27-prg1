import java.util.Scanner;

public class DevolverCambio{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantos euros debe pagar?");
        int importe = scanner.nextInt();
        
        System.out.println("¿Con cuantos euros paga?");
        int pago = scanner.nextInt();

        int resto = pago - importe;

        int billetes100 = resto / 100;
        resto = resto % 100;

        int billetes50 = resto / 50;
        resto = resto % 50;

        int billetes20 = resto / 20;
        resto = resto % 20;

        int billetes10 = resto / 10;
        resto = resto % 10;

        int billetes5 = resto / 5;
        resto = resto % 5;

        int monedas2 = resto / 2;
        resto = resto % 2;

        int monedas1 = resto / 1;

        System.out.println(billetes100 + " billete(s) de 100 euros");
        System.out.println(billetes50 + " billete(s) de 50 euros");
        System.out.println(billetes20 + " billete(s) de 20 euros");
        System.out.println(billetes10 + " billete(s) de 10 euros");
        System.out.println(billetes5 + " billete(s) de 5 euros");
        System.out.println(monedas2 + " moneda(s) de 2 euros");
        System.out.println(monedas1 + " moneda(s) de 1 euros");

        scanner.close();
    }
}

