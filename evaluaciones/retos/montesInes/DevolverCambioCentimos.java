import java.util.Scanner;

public class DevolverCambioCentimos {
    public static void main(String[] args) {

        double dineroPagar;
        double dineroEntregado;

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos euros tienes que pagar?");
        dineroPagar = scanner.nextDouble();
        System.out.println("¿Cúanto dinero tienes?");
        dineroEntregado = scanner.nextDouble();

        int totalPagar = (int) Math.round(dineroPagar * 100);
        int totalEntregado = (int) Math.round(dineroEntregado * 100);
        int cambiocent = totalEntregado - totalPagar;
        System.out.println("Tu cambio es de " + (cambiocent / 100.0));

        final int BILLETES100 = 10000;
        int numBilletes100 = cambiocent / BILLETES100;
        cambiocent = cambiocent % BILLETES100;
        System.out.println("necesitas " + numBilletes100 + " billetes de 100 euros");
        final int BILLETES50 = 5000;
        int numBilletes50 = cambiocent / BILLETES50;
        cambiocent = cambiocent % BILLETES50;
        System.out.println("necesitas " + numBilletes50 + " billetes de 50 euros");
        final int BILLETES20 = 2000;
        int numBilletes20 = cambiocent / BILLETES20;
        cambiocent = cambiocent % BILLETES20;
        System.out.println("necesitas " + numBilletes20 + " billetes de 20 euros");
        final int BILLETES10 = 1000;
        int numBilletes10 = cambiocent / BILLETES10;
        cambiocent = cambiocent % BILLETES10;
        System.out.println("necesitas " + numBilletes10 + " billetes de 10 euros");
        final int BILLETES5 = 500;
        int numBilletes5 = cambiocent / BILLETES5;
        cambiocent = cambiocent % BILLETES5;
        System.out.println("necesitas " + numBilletes5 + " billetes de 5 euros");
        final int MONEDAS2 = 200;
        int numMonedas2 = cambiocent / MONEDAS2;
        cambiocent = cambiocent % MONEDAS2;
        System.out.println("necesitas " + numMonedas2 + " monedas de 2 euros");
        final int MONEDAS1 = 100;
        int numMonedas1 = cambiocent / MONEDAS1;
        cambiocent = cambiocent % MONEDAS1;
        System.out.println("necesitas " + numMonedas1 + " monedas de 1 euro");

        final int MONEDAS50C = 50;
        int numMonedas50C = (int) (cambiocent / MONEDAS50C);
        cambiocent = cambiocent % (int) MONEDAS50C;
        System.out.println("necesitas " + numMonedas50C + " monedas de 50 centimos");
        final int MONEDAS20C = 20;
        int numMonedas20C = (int) (cambiocent / MONEDAS20C);
        cambiocent = cambiocent % (int) MONEDAS20C;
        System.out.println("necesitas " + numMonedas20C + " monedas de 20 centimos");
        final int MONEDAS10C = 10;
        int numMonedas10C = (int) (cambiocent / MONEDAS10C);
        cambiocent = cambiocent % (int) MONEDAS10C;
        System.out.println("necesitas " + numMonedas10C + " monedas de 10 centimos");
        final int MONEDAS5C = 5;
        int numMonedas5C = (int) (cambiocent / MONEDAS5C);
        cambiocent = cambiocent % (int) MONEDAS5C;
        System.out.println("necesitas " + numMonedas5C + " monedas de 5 centimos");
        final int MONEDAS2C = 2;
        int numMonedas2C = (int) (cambiocent / MONEDAS2C);
        cambiocent = cambiocent % (int) MONEDAS2C;
        System.out.println("necesitas " + numMonedas2C + " monedas de 2 centimos");
        final int MONEDAS1C = 1;
        int numMonedas1C = (int) (cambiocent / MONEDAS1C);
        cambiocent = cambiocent % (int) MONEDAS1C;
        System.out.println("necesitas " + numMonedas1C + " monedas de 1 centimo");

        scanner.close();

    }

}
