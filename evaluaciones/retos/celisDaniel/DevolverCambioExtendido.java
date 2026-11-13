import java.util.Scanner;

public class DevolverCambioExtendido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        int importe = teclado.nextInt();

        System.out.println("\n¿Con cuántos euros paga?");
        int pagado = teclado.nextInt();

        // Verificamos si el dinero entregado es suficiente
        if (pagado < importe) {
            int faltante = importe - pagado;
            System.out.println("\nError: La cantidad entregada es insuficiente. Faltan " + faltante + " € por pagar.");
        } else {
            // Si el pago es correcto, procedemos con el cálculo del cambio
            int cambio = pagado - importe;
            System.out.println(); 
            
            int b100 = cambio / 100;
            cambio = cambio % 100;

            int b50 = cambio / 50;
            cambio = cambio % 50;

            int b20 = cambio / 20;
            cambio = cambio % 20;

            int b10 = cambio / 10;
            cambio = cambio % 10;

            int b5 = cambio / 5;
            cambio = cambio % 5;

            int m2 = cambio / 2;
            cambio = cambio % 2;

            int m1 = cambio;

            System.out.println(b100 + " billete(s) de 100 €");
            System.out.println(b50 + " billete(s) de 50 €");
            System.out.println(b20 + " billete(s) de 20 €");
            System.out.println(b10 + " billete(s) de 10 €");
            System.out.println(b5 + " billete(s) de 5 €");
            System.out.println(m2 + " moneda(s) de 2 €");
            System.out.println(m1 + " moneda(s) de 1 €");
        }

        teclado.close();
    }
}