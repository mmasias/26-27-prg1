import java.util.Scanner;

class DevolverCambio {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("¿Cuántos euros debe pagar?: ");
            final int EURAPAGAR = teclado.nextInt();

            System.out.print("¿Con cuántos euros paga?: ");
            final int EURPAGADOS = teclado.nextInt();

            int euradevolver = EURPAGADOS - EURAPAGAR;

            final int EUR100 = 100;
            final int EUR50 = 50;
            final int EUR20 = 20;
            final int EUR10 = 10;
            final int EUR5 = 5;
            final int EUR2 = 2;
            final int EUR1 = 1;

            int billetes100 = euradevolver / EUR100;
            euradevolver = euradevolver % EUR100;

            int billetes50 = euradevolver / EUR50;
            euradevolver = euradevolver % EUR50;

            int billetes20 = euradevolver / EUR20;
            euradevolver = euradevolver % EUR20;

            int billetes10 = euradevolver / EUR10;
            euradevolver = euradevolver % EUR10;

            int billetes5 = euradevolver / EUR5;
            euradevolver = euradevolver % EUR5;

            int monedas2 = euradevolver / EUR2;
            euradevolver = euradevolver % EUR2;

            int monedas1 = euradevolver / EUR1;

            final String MENSAJE_CAMBIO = "El cambio es de: ";
            final String MENSAJE_BILLETE = " billete(s) de ";
            final String MENSAJE_MONEDA = " moneda(s) de ";

            System.out.println(MENSAJE_CAMBIO + (EURPAGADOS - EURAPAGAR) + " euros, devueltos en:");

            System.out.println(billetes100 + MENSAJE_BILLETE + EUR100 + " euros");
            System.out.println(billetes50 + MENSAJE_BILLETE + EUR50 + " euros");
            System.out.println(billetes20 + MENSAJE_BILLETE + EUR20 + " euros");
            System.out.println(billetes10 + MENSAJE_BILLETE + EUR10 + " euros");
            System.out.println(billetes5 + MENSAJE_BILLETE + EUR5 + " euros");
            System.out.println(monedas2 + MENSAJE_MONEDA + EUR2 + " euros");
            System.out.println(monedas1 + MENSAJE_MONEDA + EUR1 + " euro");
        }
    }
}