import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        // Inicializamos el Scanner para leer datos por consola
        Scanner teclado = new Scanner(System.in);

        // Entrada de datos
        System.out.println("¿Cuántos euros debe pagar?");
        int importe = teclado.nextInt();

        System.out.println("\n¿Con cuántos euros paga?");
        int pagado = teclado.nextInt();

        // Calculamos el cambio total a devolver
        int cambio = pagado - importe;
        
        System.out.println(); // Salto de línea para igualar el formato de tu ejemplo

        // --- CÁLCULO DE BILLETES Y MONEDAS ---
        
        // Billetes de 100
        int b100 = cambio / 100;
        cambio = cambio % 100;

        // Billetes de 50
        int b50 = cambio / 50;
        cambio = cambio % 50;

        // Billetes de 20
        int b20 = cambio / 20;
        cambio = cambio % 20;

        // Billetes de 10
        int b10 = cambio / 10;
        cambio = cambio % 10;

        // Billetes de 5
        int b5 = cambio / 5;
        cambio = cambio % 5;

        // Monedas de 2
        int m2 = cambio / 2;
        cambio = cambio % 2;

        // Monedas de 1 (el resto final es directamente la cantidad de monedas de 1)
        int m1 = cambio;

        // --- SALIDA DE DATOS ---
        System.out.println(b100 + " billete(s) de 100 €");
        System.out.println(b50 + " billete(s) de 50 €");
        System.out.println(b20 + " billete(s) de 20 €");
        System.out.println(b10 + " billete(s) de 10 €");
        System.out.println(b5 + " billete(s) de 5 €");
        System.out.println(m2 + " moneda(s) de 2 €");
        System.out.println(m1 + " moneda(s) de 1 €");

        // Cerramos el recurso
        teclado.close();
    }
}