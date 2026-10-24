import java.util.Scanner;

class DevolverCambio {
    public static void main(String[] args) {

        int dineroPagar;
        int dineroEntregado;

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos euros tienes que pagar?");
        dineroPagar = scanner.nextInt();
        System.out.println("¿Cúanto dinero tienes?");
        dineroEntregado = scanner.nextInt();
        int cambio = dineroEntregado - dineroPagar;
        System.out.println("El cambio es de " + cambio + " euros");

        final int BILLETES100 = 100;
        int numBilletes100 = cambio / BILLETES100;
        cambio = cambio % BILLETES100;
        System.out.println( "necesitas " + numBilletes100 + " billetes de 100 euros");
        
        final int BILLETES50 = 50;
        int numBilletes50 = cambio / BILLETES50;
        cambio = cambio % BILLETES50;
        System.out.println( "necesitas " + numBilletes50 + " billetes de 50 euros");

        final int BILLETES20 = 20;
        int numBilletes20 = cambio / BILLETES20;
        cambio = cambio % BILLETES20;
        System.out.println( "necesitas " + numBilletes20 + " billetes de 20 euros");

        final int BILLETES10 = 10;
        int numBilletes10 = cambio / BILLETES10;
        cambio = cambio % BILLETES10;
        System.out.println( "necesitas " + numBilletes10 + " billetes de 10 euros");

        final int BILLETES5 = 5;
        int numBilletes5 = cambio / BILLETES5;
        cambio = cambio % BILLETES5;
        System.out.println( "necesitas " + numBilletes5 + " billetes de 5 euros");

        final int MONEDAS2 = 2;
        int numMonedas2 = cambio / MONEDAS2;
        cambio = cambio % MONEDAS2;
        System.out.println( "necesitas " + numMonedas2 + " monedas de 2 euros");

        final int MONEDAS1 = 1;
        int numMonedas1 = cambio / MONEDAS1;
        cambio = cambio % MONEDAS1;
        System.out.println( "necesitas " + numMonedas1 + " monedas de 1 euro");
        scanner.close();

    }
}