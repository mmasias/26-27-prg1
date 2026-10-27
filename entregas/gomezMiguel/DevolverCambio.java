import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        int dineroPagar = scanner.nextInt();

        System.out.println("¿Con cuántos euros paga?");
        int dineroEntregado = scanner.nextInt();

        int cambio = dineroEntregado - dineroPagar;

        final int BILLETES100 = 100;
        int numBilletes100 = cambio / BILLETES100;
        cambio = cambio % BILLETES100;
        System.out.println(numBilletes100 + " billete(s) de 100 €");

        final int BILLETES50 = 50;
        int numBilletes50 = cambio / BILLETES50;
        cambio = cambio % BILLETES50;
        System.out.println(numBilletes50 + " billete(s) de 50 €");

        final int BILLETES20 = 20;
        int numBilletes20 = cambio / BILLETES20;
        cambio = cambio % BILLETES20;
        System.out.println(numBilletes20 + " billete(s) de 20 €");

        final int BILLETES10 = 10;
        int numBilletes10 = cambio / BILLETES10;
        cambio = cambio % BILLETES10;
        System.out.println(numBilletes10 + " billete(s) de 10 €");

        final int BILLETES5 = 5;
        int numBilletes5 = cambio / BILLETES5;
        cambio = cambio % BILLETES5;
        System.out.println(numBilletes5 + " billete(s) de 5 €");

        final int MONEDAS2 = 2;
        int numMonedas2 = cambio / MONEDAS2;
        cambio = cambio % MONEDAS2;
        System.out.println(numMonedas2 + " moneda(s) de 2 €");

        final int MONEDAS1 = 1;
        int numMonedas1 = cambio / MONEDAS1;
        cambio = cambio % MONEDAS1;
        System.out.println(numMonedas1 + " moneda(s) de 1 €");

        scanner.close();
    }
}