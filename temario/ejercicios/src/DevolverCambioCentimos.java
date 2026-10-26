import java.util.Scanner;

public class DevolverCambioCentimos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        double importeEuros = teclado.nextDouble();

        System.out.println("¿Con cuántos euros paga?");
        double entregadoEuros = teclado.nextDouble();

        int importe = (int) Math.round(importeEuros * 100);
        int entregado = (int) Math.round(entregadoEuros * 100);

        int cambio = entregado - importe;

        int billetes100 = cambio / 10000;
        cambio = cambio % 10000;

        int billetes50 = cambio / 5000;
        cambio = cambio % 5000;

        int billetes20 = cambio / 2000;
        cambio = cambio % 2000;

        int billetes10 = cambio / 1000;
        cambio = cambio % 1000;

        int billetes5 = cambio / 500;
        cambio = cambio % 500;

        int monedas2 = cambio / 200;
        cambio = cambio % 200;

        int monedas1 = cambio / 100;
        cambio = cambio % 100;

        int monedas50c = cambio / 50;
        cambio = cambio % 50;

        int monedas20c = cambio / 20;
        cambio = cambio % 20;

        int monedas10c = cambio / 10;
        cambio = cambio % 10;

        int monedas5c = cambio / 5;
        cambio = cambio % 5;

        int monedas2c = cambio / 2;
        cambio = cambio % 2;

        int monedas1c = cambio;

        System.out.println(billetes100 + " billete(s) de 100 €");
        System.out.println(billetes50 + " billete(s) de 50 €");
        System.out.println(billetes20 + " billete(s) de 20 €");
        System.out.println(billetes10 + " billete(s) de 10 €");
        System.out.println(billetes5 + " billete(s) de 5 €");
        System.out.println(monedas2 + " moneda(s) de 2 €");
        System.out.println(monedas1 + " moneda(s) de 1 €");
        System.out.println(monedas50c + " moneda(s) de 50 céntimos");
        System.out.println(monedas20c + " moneda(s) de 20 céntimos");
        System.out.println(monedas10c + " moneda(s) de 10 céntimos");
        System.out.println(monedas5c + " moneda(s) de 5 céntimos");
        System.out.println(monedas2c + " moneda(s) de 2 céntimos");
        System.out.println(monedas1c + " moneda(s) de 1 céntimo");

        teclado.close();
    }
}
