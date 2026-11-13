
import java.math.BigDecimal;
import java.util.Scanner;

public class DevolverCambioCentimos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        String textoImporte = teclado.next().replace(',', '.');
        int importe = new BigDecimal(textoImporte)
                .movePointRight(2).intValueExact();

        System.out.println("¿Con cuántos euros paga?");
        String textoEntregado = teclado.next().replace(',', '.');
        int entregado = new BigDecimal(textoEntregado)
                .movePointRight(2).intValueExact();

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

        int centimos50 = cambio / 50;
        cambio = cambio % 50;

        int centimos20 = cambio / 20;
        cambio = cambio % 20;

        int centimos10 = cambio / 10;
        cambio = cambio % 10;

        int centimos5 = cambio / 5;
        cambio = cambio % 5;

        int centimos2 = cambio / 2;
        cambio = cambio % 2;

        int centimos1 = cambio;

        System.out.println(billetes100 + " billete(s) de 100 €");
        System.out.println(billetes50 + " billete(s) de 50 €");
        System.out.println(billetes20 + " billete(s) de 20 €");
        System.out.println(billetes10 + " billete(s) de 10 €");
        System.out.println(billetes5 + " billete(s) de 5 €");
        System.out.println(monedas2 + " moneda(s) de 2 €");
        System.out.println(monedas1 + " moneda(s) de 1 €");
        System.out.println(centimos50 + " moneda(s) de 50 céntimos");
        System.out.println(centimos20 + " moneda(s) de 20 céntimos");
        System.out.println(centimos10 + " moneda(s) de 10 céntimos");
        System.out.println(centimos5 + " moneda(s) de 5 céntimos");
        System.out.println(centimos2 + " moneda(s) de 2 céntimos");
        System.out.println(centimos1 + " moneda(s) de 1 céntimo");

        teclado.close();
    }
}
