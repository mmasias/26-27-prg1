import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        final int BILLETE_100 = 100;
        final int BILLETE_50 = 50;
        final int BILLETE_20 = 20;
        final int BILLETE_10 = 10;
        final int BILLETE_5 = 5;
        final int MONEDA_2 = 2;
        final int MONEDA_1 = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        int importe = teclado.nextInt();

        System.out.println("¿Con cuántos euros paga?");
        int entregado = teclado.nextInt();

        int cambio = entregado - importe;

        int billetes100 = cambio / BILLETE_100;
        cambio = cambio % BILLETE_100;

        int billete50 = cambio / BILLETE_50;
        cambio = cambio % BILLETE_50;

        int billete20 = cambio / BILLETE_20;
        cambio = cambio % BILLETE_20;

        int billete10 = cambio / BILLETE_10;
        cambio = cambio % BILLETE_10;

        int billete5 = cambio / BILLETE_5;
        cambio = cambio % BILLETE_5;

        int monedas2 = cambio / MONEDA_2;
        cambio = cambio % MONEDA_2;

        int monedas1 = cambio / MONEDA_1;


        System.out.println("");
        System.out.println(billetes100 + " billete(s) de 100 €");
        System.out.println(billetes50 + " billete(s) de 50 €");
        System.out.println(billetes20 + " billete(s) de 20 €");
        System.out.println(billetes10 + " billete(s) de 10 €");
        System.out.println(billetes5 + " billete(s) de 5 €");
        System.out.println(monedas2 + " moneda(s) de 2 €");
        System.out.println(monedas1 + " moneda(s) de 1 €");

        teclado.close();
    }
}