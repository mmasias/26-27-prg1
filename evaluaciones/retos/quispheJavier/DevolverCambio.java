import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        int importe = teclado.nextInt();

        System.out.println("¿Con cuántos euros paga?");
        int entregado = teclado.nextInt();

        teclado.close();
    }
}