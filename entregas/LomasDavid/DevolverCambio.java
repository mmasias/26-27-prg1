import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        int importe = sc.nextInt();

        System.out.println("¿Con cuántos euros paga?");
        int entregado = sc.nextInt();

        // Cambio total; en cada paso se calcula cuántas piezas caben
        // (división entera) y qué queda por devolver (resto).
        int resto = entregado - importe;

        int b100 = resto / 100;
        resto = resto % 100;
        int b50 = resto / 50;
        resto = resto % 50;
        int b20 = resto / 20;
        resto = resto % 20;
        int b10 = resto / 10;
        resto = resto % 10;
        int b5 = resto / 5;
        resto = resto % 5;
        int m2 = resto / 2;
        resto = resto % 2;
        int m1 = resto;

        System.out.println();
        System.out.println(b100 + " billete(s) de 100 €");
        System.out.println(b50 + " billete(s) de 50 €");
        System.out.println(b20 + " billete(s) de 20 €");
        System.out.println(b10 + " billete(s) de 10 €");
        System.out.println(b5 + " billete(s) de 5 €");
        System.out.println(m2 + " moneda(s) de 2 €");
        System.out.println(m1 + " moneda(s) de 1 €");
    }
}
