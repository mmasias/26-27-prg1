import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        final int BILLETE_100 = 100;
        final int BILLETE_50 = 50;
        final int BILLETE_20 = 20;
        final int BILLETE_10 = 10;
        final int BILLETE_5 = 5;
        final int MONEDA_2 = 2;
        final int MONEDA_1 = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        int importe = teclado.nextInt();

        System.out.println("¿Con cuántos euros paga?");
        int entregado = teclado.nextInt();

        int cambio = entregado - importe;

        teclado.close();
    }
}