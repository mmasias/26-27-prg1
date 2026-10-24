
import java.util.Scanner;

class DevolverCambio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas monedas debe pagar?");
        int costoDeCompra = scanner.nextInt();

        System.out.println("¿Con cuántas monedas paga?");
        int pagoDeCompra = scanner.nextInt();

        final int MONEDA_DE_4u = 4;
        final int MONEDA_DE_3u = 3;

        int cambioDeCompra = pagoDeCompra - costoDeCompra;
        int cambioRestante = cambioDeCompra;

        //Cantidad de Monedas de cambio
        int cantidadDeCambio4 = (int) (cambioRestante / MONEDA_DE_4u);
        cambioRestante = cambioRestante % MONEDA_DE_4u;

        int cantidadDeCambio3 = (int) (cambioRestante / MONEDA_DE_3u);
        cambioRestante = cambioRestante % MONEDA_DE_3u;

        int cantidadDeCambio1 = (int) cambioRestante;
        
        System.out.println(cantidadDeCambio4 + " moneda(s) de 4 €");
        System.out.println(cantidadDeCambio3 + " moneda(s) de 3 €");
        System.out.println(cantidadDeCambio1 + " moneda(s) de 1 €");
    }
}
