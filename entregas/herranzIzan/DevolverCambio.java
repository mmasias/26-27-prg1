import java.util.Scanner;

public class DevolverCambio {

    public static void main(String[] args) {
        int BILLETE_100 = 100;
        int BILLETE_50 = 50;
        int BILLETE_20 = 20;
        int BILLETE_10 = 10;
        int BILLETE_5 = 5;
        int MONEDA_2 = 2;
        int MONEDA_1 = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        int debePagar = teclado.nextInt();

        System.out.println("¿Con cuántos euros paga?");
        int pagaCon = teclado.nextInt();

                int cambio = pagaCon - debePagar;

        int numBilletes100 = cambio / BILLETE_100;
        int resto100 = cambio % BILLETE_100;

        int numBilletes50 = resto100 / BILLETE_50;
        int resto50 = resto100 % BILLETE_50;

        int numBilletes20 = resto50 / BILLETE_20;
        int resto20 = resto50 % BILLETE_20;

        int numBilletes10 = resto20 / BILLETE_10;
        int resto10 = resto20 % BILLETE_10;

        int numBilletes5 = resto10 / BILLETE_5;
        int resto5 = resto10 % BILLETE_5;

        int numMonedas2 = resto5 / MONEDA_2;
        int numMonedas1 = resto5 % MONEDA_2;

        System.out.println();
        System.out.println(numBilletes100 + " billete(s) de 100 €");
        System.out.println(numBilletes50 + " billete(s) de 50 €");
        System.out.println(numBilletes20 + " billete(s) de 20 €");
        System.out.println(numBilletes10 + " billete(s) de 10 €");
        System.out.println(numBilletes5 + " billete(s) de 5 €");
        System.out.println(numMonedas2 + " moneda(s) de 2 €");
        System.out.println(numMonedas1 + " moneda(s) de 1 €");

        teclado.close();
    }
}