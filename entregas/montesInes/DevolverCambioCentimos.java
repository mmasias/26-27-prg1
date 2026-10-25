package entregas.montesInes;

import java.util.Scanner;

public class DevolverCambioCentimos {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos euros tienes que pagar?");
        double dineroPagar = scanner.nextDouble();
        System.out.println("¿Cúanto dinero tienes?");
        double dineroEntregado = scanner.nextDouble();
        
        int totalPagar = (int) Math.round(dineroPagar * 100);
        int totalEntregado = (int) Math.round(dineroEntregado * 100);
        int cambiocent = totalEntregado - totalPagar;
        System.out.println("Tu cambio es de " + (cambiocent / 100.0));

        final int BILLETES100 = 100;
        int numBilletes100 = cambiocent / BILLETES100;
        cambiocent = cambiocent % BILLETES100;
        System.out.println("necesitas " + numBilletes100 + " billetes de 100 euros");

        final int BILLETES50 = 50;
        int numBilletes50 = cambiocent / BILLETES50;
        cambiocent = cambiocent % BILLETES50;
        System.out.println("necesitas " + numBilletes50 + " billetes de 50 euros");

        final int BILLETES20 = 20;
        int numBilletes20 = cambiocent / BILLETES20;
        cambiocent = cambiocent % BILLETES20;
        System.out.println("necesitas " + numBilletes20 + " billetes de 20 euros");

        final int BILLETES10 = 10;
        int numBilletes10 = cambiocent / BILLETES10;
        cambiocent = cambiocent % BILLETES10;
        System.out.println("necesitas " + numBilletes10 + " billetes de 10 euros");

        final int BILLETES5 = 5;
        int numBilletes5 = cambiocent / BILLETES5;
        cambiocent = cambiocent % BILLETES5;
        System.out.println("necesitas " + numBilletes5 + " billetes de 5 euros");

        final int MONEDAS2 = 2;
        int numMonedas2 = cambiocent / MONEDAS2;
        cambiocent = cambiocent % MONEDAS2;
        System.out.println("necesitas " + numMonedas2 + " monedas de 2 euros");

        final int MONEDAS1 = 1;
        int numMonedas1 = cambiocent / MONEDAS1;
        cambiocent = cambiocent % MONEDAS1;
        System.out.println("necesitas " + numMonedas1 + " monedas de 1 euro");

        scanner.close();
    }
}
