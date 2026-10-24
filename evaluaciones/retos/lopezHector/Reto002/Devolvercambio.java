import java.util.Scanner;

public class Devolvercambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int BILLETE_DE_100 = 100;
        final int BILLETE_DE_50 = 50;
        final int BILLETE_DE_20 = 20;
        final int BILLETE_DE_10 = 10;
        final int BILLETE_DE_5 = 5;
        final int MONEDA_DE_1 = 1;
        final int MONEDA_DE_2 = 2;
        System.out.print("Cuantos euros debe pagar: ");
        int precioProducto = scanner.nextInt();
        System.out.print("Cuantos euros entrega el cliente: ");
        int pagoCliente = scanner.nextInt();
        int cambio = pagoCliente - precioProducto;

        int cantidad_billetes100 = cambio / BILLETE_DE_100;
        cambio %= BILLETE_DE_100;
        int cantidad_billetes50 = cambio / BILLETE_DE_50;
        cambio %= BILLETE_DE_50;
        int cantidad_billetes20 = cambio / BILLETE_DE_20;
        cambio %= BILLETE_DE_20;
        int cantidad_billetes10 = cambio / BILLETE_DE_10;
        cambio %= BILLETE_DE_10;
        int cantidad_billetes5 = cambio / BILLETE_DE_5;
        cambio %= BILLETE_DE_5;
        int cantidad_monedas2 = cambio / MONEDA_DE_2;
        cambio %= MONEDA_DE_2;
        int cantidad_monedas1 = cambio / MONEDA_DE_1;

        String desglose = cantidad_billetes100 + " billete(s) de 100 €\n"
                + cantidad_billetes50 + " billete(s) de 50 €\n"
                + cantidad_billetes20 + " billete(s) de 20 €\n"
                + cantidad_billetes10 + " billete(s) de 10 €\n"
                + cantidad_billetes5 + " billete(s) de 5 €\n"
                + cantidad_monedas2 + " moneda(s) de 2 €\n"
                + cantidad_monedas1 + " moneda(s) de 1 €";

        System.out.println(pagoCliente >= precioProducto ? desglose : "Error pago insuficiente");
    }

}
