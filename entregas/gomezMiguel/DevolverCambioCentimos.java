import java.util.Scanner;

public class DevolverCambioCentimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        double dineroPagar = scanner.nextDouble();

        System.out.println("¿Con cuántos euros paga?");
        double dineroEntregado = scanner.nextDouble();

        int totalPagar = (int) Math.round(dineroPagar * 100);
        int totalEntregado = (int) Math.round(dineroEntregado * 100);
        int cambiocent = totalEntregado - totalPagar;

        final int BILLETES100 = 10000;
        int numBilletes100 = cambiocent / BILLETES100;
        cambiocent = cambiocent % BILLETES100;
        System.out.println(numBilletes100 + " billete(s) de 100 €");

        final int BILLETES50 = 5000;
        int numBilletes50 = cambiocent / BILLETES50;
        cambiocent = cambiocent % BILLETES50;
        System.out.println(numBilletes50 + " billete(s) de 50 €");

        final int BILLETES20 = 2000;
        int numBilletes20 = cambiocent / BILLETES20;
        cambiocent = cambiocent % BILLETES20;
        System.out.println(numBilletes20 + " billete(s) de 20 €");

        final int BILLETES10 = 1000;
        int numBilletes10 = cambiocent / BILLETES10;
        cambiocent = cambiocent % BILLETES10;
        System.out.println(numBilletes10 + " billete(s) de 10 €");

        final int BILLETES5 = 500;
        int numBilletes5 = cambiocent / BILLETES5;
        cambiocent = cambiocent % BILLETES5;
        System.out.println(numBilletes5 + " billete(s) de 5 €");

        final int MONEDAS2 = 200;
        int numMonedas2 = cambiocent / MONEDAS2;
        cambiocent = cambiocent % MONEDAS2;
        System.out.println(numMonedas2 + " moneda(s) de 2 €");

        final int MONEDAS1 = 100;
        int numMonedas1 = cambiocent / MONEDAS1;
        cambiocent = cambiocent % MONEDAS1;
        System.out.println(numMonedas1 + " moneda(s) de 1 €");

        final int MONEDAS50c = 50;
        int numMonedas50c = cambiocent / MONEDAS50c;
        cambiocent = cambiocent % MONEDAS50c;
        System.out.println(numMonedas50c + " moneda(s) de 50 céntimos");

        final int MONEDAS20c = 20;
        int numMonedas20c = cambiocent / MONEDAS20c;
        cambiocent = cambiocent % MONEDAS20c;
        System.out.println(numMonedas20c + " moneda(s) de 20 céntimos");

        final int MONEDAS10c = 10;
        int numMonedas10c = cambiocent / MONEDAS10c;
        cambiocent = cambiocent % MONEDAS10c;
        System.out.println(numMonedas10c + " moneda(s) de 10 céntimos");

        final int MONEDAS5c = 5;
        int numMonedas5c = cambiocent / MONEDAS5c;
        cambiocent = cambiocent % MONEDAS5c;
        System.out.println(numMonedas5c + " moneda(s) de 5 céntimos");

        final int MONEDAS2c = 2;
        int numMonedas2c = cambiocent / MONEDAS2c;
        cambiocent = cambiocent % MONEDAS2c;
        System.out.println(numMonedas2c + " moneda(s) de 2 céntimos");

        final int MONEDAS1c = 1;
        int numMonedas1c = cambiocent / MONEDAS1c;
        cambiocent = cambiocent % MONEDAS1c;
        System.out.println(numMonedas1c + " moneda(s) de 1 céntimo");

        scanner.close();
    }
}