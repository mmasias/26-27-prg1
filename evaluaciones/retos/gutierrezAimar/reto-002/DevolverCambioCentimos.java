
import java.util.Scanner;

class DevolverCambioCentimos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos euros debe pagar?");
        double importeEuros = scanner.nextDouble();

        System.out.println();
        System.out.println("¿Con cuántos euros paga?");
        double entregadoEuros = scanner.nextDouble();

        int importe = (int) Math.round(importeEuros * 100);
        int entregado = (int) Math.round(entregadoEuros * 100);

        int resto = entregado - importe;

        int billetes100 = resto / 10000;
        resto = resto % 10000;

        int billetes50 = resto / 5000;
        resto = resto % 5000;

        int billetes20 = resto / 2000;
        resto = resto % 2000;

        int billetes10 = resto / 1000;
        resto = resto % 1000;

        int billetes5 = resto / 500;
        resto = resto % 500;

        int monedas2e = resto / 200;
        resto = resto % 200;

        int monedas1e = resto / 100;
        resto = resto % 100;

        int monedas50c = resto / 50;
        resto = resto % 50;

        int monedas20c = resto / 20;
        resto = resto % 20;

        int monedas10c = resto / 10;
        resto = resto % 10;

        int monedas5c = resto / 5;
        resto = resto % 5;

        int monedas2c = resto / 2;
        resto = resto % 2;

        int monedas1c = resto;

        System.out.println();
        System.out.println(billetes100 + " billete(s) de 100 €");
        System.out.println(billetes50 + " billete(s) de 50 €");
        System.out.println(billetes20 + " billete(s) de 20 €");
        System.out.println(billetes10 + " billete(s) de 10 €");
        System.out.println(billetes5 + " billete(s) de 5 €");
        System.out.println(monedas2e + " moneda(s) de 2 €");
        System.out.println(monedas1e + " moneda(s) de 1 €");
        System.out.println(monedas50c + " moneda(s) de 50 céntimos");
        System.out.println(monedas20c + " moneda(s) de 20 céntimos");
        System.out.println(monedas10c + " moneda(s) de 10 céntimos");
        System.out.println(monedas5c + " moneda(s) de 5 céntimos");
        System.out.println(monedas2c + " moneda(s) de 2 céntimos");
        System.out.println(monedas1c + " moneda(s) de 1 céntimo");

        scanner.close();
    }
}
