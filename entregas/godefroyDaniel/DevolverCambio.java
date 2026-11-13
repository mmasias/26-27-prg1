import java.util.Scanner;
class DevolverCambio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el importe a pagar: ");
        int debePagar = teclado.nextInt();
        System.out.print("Introduce la cantidad entregada por el cliente: ");
        int pagaCon = teclado.nextInt();
        int cambio = pagaCon - debePagar;
        System.out.println("Debe pagar: " + debePagar);
        System.out.println("Paga con: " + pagaCon);
        System.out.println("Cambio: " + cambio);
        System.out.println("Billetes de 100 €: " + cambio / 100);
        cambio = cambio % 100;
        System.out.println("Billetes de 50 €: " + cambio / 50);
        cambio = cambio % 50;
        System.out.println("Billetes de 20 €: " + cambio / 20);
        cambio = cambio % 20;
        System.out.println("Billetes de 10 €: " + cambio / 10);
        cambio = cambio % 10;
        System.out.println("Billetes de 5 €: " + cambio / 5);
        cambio = cambio % 5;
        System.out.println("Monedas de 2 €: " + cambio / 2);
        cambio = cambio % 2;
        System.out.println("Monedas de 1 €: " + cambio);
    }
}
