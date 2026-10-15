import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos euros debe pagar?: ");
        double dineroAPagar = scanner.nextDouble();

        System.out.print("¿Con cuánto dinero paga?: ");
        double dineroPagado = scanner.nextDouble();

        if (dineroPagado < dineroAPagar) {
            System.out.println("El dinero pagado es insuficiente.");
            scanner.close();
            return;
        }

        int cambio = (int) Math.round(
            (dineroPagado - dineroAPagar) * 100
        );

        int billetesDeCien = cambio / 10000;
        cambio %= 10000;

        int billetesDeCincuenta = cambio / 5000;
        cambio %= 5000;

        int billetesDeVeinte = cambio / 2000;
        cambio %= 2000;

        int billetesDeDiez = cambio / 1000;
        cambio %= 1000;

        int billetesDeCinco = cambio / 500;
        cambio %= 500;

        int monedasDeDos = cambio / 200;
        cambio %= 200;

        int monedasDeUno = cambio / 100;
        cambio %= 100;

        int monedasDeCincuentaCentimos = cambio / 50;
        cambio %= 50;

        int monedasDeVeinteCentimos = cambio / 20;
        cambio %= 20;

        int monedasDeDiezCentimos = cambio / 10;
        cambio %= 10;

        int monedasDeCincoCentimos = cambio / 5;
        cambio %= 5;

        int monedasDeDosCentimos = cambio / 2;
        cambio %= 2;

        int monedasDeUnCentimo = cambio;

        System.out.println("El cambio es: " + (dineroPagado - dineroAPagar) + " euros");
        
        
        System.out.println("Billetes de 100 euros: " + billetesDeCien);
        System.out.println("Billetes de 50 euros: " + billetesDeCincuenta);
        System.out.println("Billetes de 20 euros: " + billetesDeVeinte);
        System.out.println("Billetes de 10 euros: " + billetesDeDiez);
        System.out.println("Billetes de 5 euros: " + billetesDeCinco);
        System.out.println("Monedas de 2 euros: " + monedasDeDos);
        System.out.println("Monedas de 1 euro: " + monedasDeUno);
        System.out.println("Monedas de 50 céntimos: " + monedasDeCincuentaCentimos);
        System.out.println("Monedas de 20 céntimos: " + monedasDeVeinteCentimos);
        System.out.println("Monedas de 10 céntimos: " + monedasDeDiezCentimos);
        System.out.println("Monedas de 5 céntimos: " + monedasDeCincoCentimos);
        System.out.println("Monedas de 2 céntimos: " + monedasDeDosCentimos);
        System.out.println("Monedas de 1 céntimo: " + monedasDeUnCentimo);

        scanner.close();
    }
}