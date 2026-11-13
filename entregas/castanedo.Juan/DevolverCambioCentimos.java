import java.util.Scanner;

class DevolverCambioCentimos {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
           
            System.out.print("¿Cuántos euros debe pagar?: ");
            final double EURAPAGAR = teclado.nextDouble();

            System.out.print("¿Con cuántos euros paga?: ");
            final double EURPAGADOS = teclado.nextDouble();

            int euradevolver = (int) Math.round((EURPAGADOS - EURAPAGAR) * 100);

            final int EUR100 = 10000;
            final int EUR50 = 5000;
            final int EUR20 = 2000;
            final int EUR10 = 1000;
            final int EUR5 = 500;
            final int EUR2 = 200;
            final int EUR1 = 100;

            final int CENT50 = 50;
            final int CENT20 = 20;
            final int CENT10 = 10;
            final int CENT5 = 5;
            final int CENT2 = 2;
            final int CENT1 = 1;

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
            euradevolver = euradevolver % EUR1;

            int monedas50 = euradevolver / CENT50;
            euradevolver = euradevolver % CENT50;

            int monedas20 = euradevolver / CENT20;
            euradevolver = euradevolver % CENT20;

            int monedas10 = euradevolver / CENT10;
            euradevolver = euradevolver % CENT10;

            int monedas5 = euradevolver / CENT5;
            euradevolver = euradevolver % CENT5;

            int monedas2cent = euradevolver / CENT2;
            euradevolver = euradevolver % CENT2;

            int monedas1cent = euradevolver / CENT1;

            final String MENSAJE_CAMBIO = "El cambio es de: ";
            final String MENSAJE_BILLETE = " billete(s) de ";
            final String MENSAJE_MONEDA = " moneda(s) de ";

            System.out.println(MENSAJE_CAMBIO + (EURPAGADOS - EURAPAGAR) + " euros, devueltos en:");

            System.out.println(billetes100 + MENSAJE_BILLETE + "100 euros");
            System.out.println(billetes50 + MENSAJE_BILLETE + "50 euros");
            System.out.println(billetes20 + MENSAJE_BILLETE + "20 euros");
            System.out.println(billetes10 + MENSAJE_BILLETE + "10 euros");
            System.out.println(billetes5 + MENSAJE_BILLETE + "5 euros");
            System.out.println(monedas2 + MENSAJE_MONEDA + "2 euros");
            System.out.println(monedas1 + MENSAJE_MONEDA + "1 euro");
            System.out.println(monedas50 + MENSAJE_MONEDA + "50 céntimos");
            System.out.println(monedas20 + MENSAJE_MONEDA + "20 céntimos");
            System.out.println(monedas10 + MENSAJE_MONEDA + "10 céntimos");
            System.out.println(monedas5 + MENSAJE_MONEDA + "5 céntimos");
            System.out.println(monedas2cent + MENSAJE_MONEDA + "2 céntimos");
            System.out.println(monedas1cent + MENSAJE_MONEDA + "1 céntimo");
        }
    }
}
