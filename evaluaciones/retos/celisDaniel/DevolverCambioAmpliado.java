import java.util.Scanner;
import java.util.Locale;

public class DevolverCambioAmpliado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Fuerza el uso del punto decimal y evita errores de entrada
        teclado.useLocale(Locale.US);

        System.out.println("¿Cuántos euros debe pagar? (Use punto '.' para los decimales)");
        double importe = teclado.nextDouble();

        System.out.println("\n¿Con cuántos euros paga? (Use punto '.' para los decimales)");
        double pagado = teclado.nextDouble();

        // Convierte el cambio total a céntimos enteros con redondeo de seguridad
        int centimos = (int) Math.round((pagado - importe) * 100);

        System.out.println(); 

        // Billetes (100€ = 10000 céntimos)
        int b100 = centimos / 10000; centimos = centimos % 10000;
        int b50  = centimos / 5000;  centimos = centimos % 5000;
        int b20  = centimos / 2000;  centimos = centimos % 2000;
        int b10  = centimos / 1000;  centimos = centimos % 1000;
        int b5   = centimos / 500;   centimos = centimos % 500;

        // Monedas de euro
        int m2 = centimos / 200; centimos = centimos % 200;
        int m1 = centimos / 100; centimos = centimos % 100;

        // Monedas de céntimo
        int c50 = centimos / 50; centimos = centimos % 50;
        int c20 = centimos / 20; centimos = centimos % 20;
        int c10 = centimos / 10; centimos = centimos % 10;
        int c5  = centimos / 5;  centimos = centimos % 5;
        int c2  = centimos / 2;  centimos = centimos % 2;
        int c1  = centimos;

        System.out.println(b100 + " billete(s) de 100 €");
        System.out.println(b50 + " billete(s) de 50 €");
        System.out.println(b20 + " billete(s) de 20 €");
        System.out.println(b10 + " billete(s) de 10 €");
        System.out.println(b5 + " billete(s) de 5 €");
        System.out.println(m2 + " moneda(s) de 2 €");
        System.out.println(m1 + " moneda(s) de 1 €");
        System.out.println(c50 + " moneda(s) de 50 céntimos");
        System.out.println(c20 + " moneda(s) de 20 céntimos");
        System.out.println(c10 + " moneda(s) de 10 céntimos");
        System.out.println(c5 + " moneda(s) de 5 céntimos");
        System.out.println(c2 + " moneda(s) de 2 céntimos");
        System.out.println(c1 + " moneda(s) de 1 céntimo");

        teclado.close();
    }
}