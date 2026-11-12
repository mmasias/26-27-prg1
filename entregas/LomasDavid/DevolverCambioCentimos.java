import java.util.Scanner;

public class DevolverCambioCentimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        String textoImporte = sc.next();
        System.out.println("¿Con cuántos euros paga?");
        String textoEntregado = sc.next();

        // Aceptamos coma o punto decimal (23,45 o 23.45).
        double importeEuros = Double.parseDouble(textoImporte.replace(',', '.'));
        double entregadoEuros = Double.parseDouble(textoEntregado.replace(',', '.'));

        // CLAVE: trabajar en céntimos ENTEROS. Math.round evita el error de
        // los decimales binarios (p. ej. 0.29 * 100 = 28.999999999999996).
        long importe = Math.round(importeEuros * 100);
        long entregado = Math.round(entregadoEuros * 100);
        long resto = entregado - importe;

        long b100 = resto / 10000;
        resto = resto % 10000;
        long b50 = resto / 5000;
        resto = resto % 5000;
        long b20 = resto / 2000;
        resto = resto % 2000;
        long b10 = resto / 1000;
        resto = resto % 1000;
        long b5 = resto / 500;
        resto = resto % 500;
        long m2e = resto / 200;
        resto = resto % 200;
        long m1e = resto / 100;
        resto = resto % 100;
        long c50 = resto / 50;
        resto = resto % 50;
        long c20 = resto / 20;
        resto = resto % 20;
        long c10 = resto / 10;
        resto = resto % 10;
        long c5 = resto / 5;
        resto = resto % 5;
        long c2 = resto / 2;
        resto = resto % 2;
        long c1 = resto;

        System.out.println();
        System.out.println(b100 + " billete(s) de 100 €");
        System.out.println(b50 + " billete(s) de 50 €");
        System.out.println(b20 + " billete(s) de 20 €");
        System.out.println(b10 + " billete(s) de 10 €");
        System.out.println(b5 + " billete(s) de 5 €");
        System.out.println(m2e + " moneda(s) de 2 €");
        System.out.println(m1e + " moneda(s) de 1 €");
        System.out.println(c50 + " moneda(s) de 50 céntimos");
        System.out.println(c20 + " moneda(s) de 20 céntimos");
        System.out.println(c10 + " moneda(s) de 10 céntimos");
        System.out.println(c5 + " moneda(s) de 5 céntimos");
        System.out.println(c2 + " moneda(s) de 2 céntimos");
        System.out.println(c1 + " moneda(s) de 1 céntimo");
    }
}
