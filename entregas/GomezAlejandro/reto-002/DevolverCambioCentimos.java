
import java.util.Scanner;

public class DevolverCambioCentimos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        String textoImporte = teclado.nextLine().replace(',', '.');
        int importe = (int) Math.round(Double.parseDouble(textoImporte) * 100);

        System.out.println("¿Con cuántos euros paga?");
        String textoPaga = teclado.nextLine().replace(',', '.');
        int paga = (int) Math.round(Double.parseDouble(textoPaga) * 100);

        int cambio = paga - importe;

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

        int monedas50 = cambio / 50;
        cambio = cambio % 50;

        int monedas20 = cambio / 20;
        cambio = cambio % 20;

        int monedas10 = cambio / 10;
        cambio = cambio % 10;

        int monedas5 = cambio / 5;
        cambio = cambio % 5;

        int monedas2Centimos = cambio / 2;
        cambio = cambio % 2;

        int monedas1Centimo = cambio;

        System.out.println(billetes100 + " billete(s) de 100 euros");
        System.out.println(billetes50 + " billete(s) de 50 euros");
        System.out.println(billetes20 + " billete(s) de 20 euros");
        System.out.println(billetes10 + " billete(s) de 10 euros");
        System.out.println(billetes5 + " billete(s) de 5 euros");
        System.out.println(monedas2 + " moneda(s) de 2 euros");
        System.out.println(monedas1 + " moneda(s) de 1 euro");
        System.out.println(monedas50 + " moneda(s) de 50 céntimos");
        System.out.println(monedas20 + " moneda(s) de 20 céntimos");
        System.out.println(monedas10 + " moneda(s) de 10 céntimos");
        System.out.println(monedas5 + " moneda(s) de 5 céntimos");
        System.out.println(monedas2Centimos + " moneda(s) de 2 céntimos");
        System.out.println(monedas1Centimo + " moneda(s) de 1 céntimo");

        teclado.close();
    }
}
