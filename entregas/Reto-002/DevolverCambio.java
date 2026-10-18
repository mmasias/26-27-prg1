import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuánto es el importe a pagar?");
        int importe = teclado.nextInt();

        System.out.println("¿Cuánto paga?");
        int paga = teclado.nextInt();

        int cambio = paga - importe;

        int billetes100 = cambio / 100;
        cambio = cambio % 100;

        int billetes50 = cambio / 50;
        cambio = cambio % 50;

        int billetes20 = cambio / 20;
        cambio = cambio % 20;

        int billetes10 = cambio / 10;
        cambio = cambio % 10;

        int billetes5 = cambio / 5;
        cambio = cambio % 5;

        int monedas2 = cambio / 2;
        cambio = cambio % 2;

        int monedas1 = cambio;

        System.out.println(billetes100 + " billete(s) de 100 euros");
        System.out.println(billetes50 + " billete(s) de 50 euros");
        System.out.println(billetes20 + " billete(s) de 20 euros");
        System.out.println(billetes10 + " billete(s) de 10 euros");
        System.out.println(billetes5 + " billete(s) de 5 euros");
        System.out.println(monedas2 + " moneda(s) de 2 euros");
        System.out.println(monedas1 + " moneda(s) de 1 euro");

        teclado.close();
    }
}
