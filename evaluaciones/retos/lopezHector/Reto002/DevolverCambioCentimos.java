
import java.util.Scanner;

public class DevolverCambioCentimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double BILLETE_DE_100 = 100;
        final double BILLETE_DE_50 = 50;
        final double BILLETE_DE_20 = 20;
        final double BILLETE_DE_10 = 10;
        final double BILLETE_DE_5 = 5;
        final double MONEDA_DE_1 = 1;
        final double MONEDA_DE_2 = 2;
        final double MONEDA_DE_50_CENTIMOS = 0.50;
        final double MONEDA_DE_20_CENTIMOS = 0.20;
        final double MONEDA_DE_10_CENTIMOS = 0.10;
        final double MONEDA_DE_5_CENTIMOS = 0.05;
        final double MONEDA_DE_2_CENTIMOS = 0.02;
        final double MONEDA_DE_1_CENTIMOS = 0.01;
        System.out.print("Cuantos euros debe pagar: ");
        double precioProducto = scanner.nextDouble();
        System.out.print("Cuantos euros entrega el cliente: ");
        double pagoCliente = scanner.nextDouble();
        double cambio = pagoCliente - precioProducto;

        int cantidad_billetes100 = (int) (cambio / BILLETE_DE_100);
        cambio %= BILLETE_DE_100;
        int cantidad_billetes50 = (int) (cambio / BILLETE_DE_50);
        cambio %= BILLETE_DE_50;
        int cantidad_billetes20 = (int) (cambio / BILLETE_DE_20);
        cambio %= BILLETE_DE_20;
        int cantidad_billetes10 = (int) (cambio / BILLETE_DE_10);
        cambio %= BILLETE_DE_10;
        int cantidad_billetes5 = (int) (cambio / BILLETE_DE_5);
        cambio %= BILLETE_DE_5;
        int cantidad_monedas2 = (int) (cambio / MONEDA_DE_2);
        cambio %= MONEDA_DE_2;
        int cantidad_monedas1 = (int) (cambio / MONEDA_DE_1);
        cambio %= MONEDA_DE_1;
        int cantidad_monedas50Centimos = (int) (cambio / MONEDA_DE_50_CENTIMOS);
        cambio %= MONEDA_DE_50_CENTIMOS;
        int cantidad_monedas20Centimos = (int) (cambio / MONEDA_DE_20_CENTIMOS);
        cambio %= MONEDA_DE_20_CENTIMOS;
        int cantidad_monedas10Centimos = (int) (cambio / MONEDA_DE_10_CENTIMOS);
        cambio %= MONEDA_DE_10_CENTIMOS;
        int cantidad_monedas5Centimos = (int) (cambio / MONEDA_DE_5_CENTIMOS);
        cambio %= MONEDA_DE_5_CENTIMOS;
        int cantidad_monedas2Centimos = (int) (cambio / MONEDA_DE_2_CENTIMOS);
        cambio %= MONEDA_DE_2_CENTIMOS;
        int cantidad_monedas1Centimo = (int) (cambio / MONEDA_DE_1_CENTIMOS);
        cambio %= MONEDA_DE_1_CENTIMOS;

        String desglose = cantidad_billetes100 + " billete(s) de 100 €\n"
                + cantidad_billetes50 + " billete(s) de 50 €\n"
                + cantidad_billetes20 + " billete(s) de 20 €\n"
                + cantidad_billetes10 + " billete(s) de 10 €\n"
                + cantidad_billetes5 + " billete(s) de 5 €\n"
                + cantidad_monedas2 + " moneda(s) de 2 €\n"
                + cantidad_monedas1 + " moneda(s) de 1 €\n"
                + cantidad_monedas50Centimos + " moneda(s) de 50 centimos\n"
                + cantidad_monedas20Centimos + " moneda(s) de 20 centimos\n"
                + cantidad_monedas10Centimos + " moneda(s) de 10 centimos\n"
                + cantidad_monedas5Centimos + " moneda(s) de 5 centimos\n"
                + cantidad_monedas2Centimos + " moneda(s) de 2 centimos\n"
                + cantidad_monedas1Centimo + " moneda(s) de 1 centimo";

        System.out.println(pagoCliente >= precioProducto ? desglose : "Error pago insuficiente");

    }

}
