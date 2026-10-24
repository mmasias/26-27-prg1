import java.util.Scanner;
class retoPagos{
    public static void main(String[] args){
        System.out.print("¿Cuánto debes pagar?");
        Scanner scanner = new Scanner(System.in);
        final int deuda = scanner.nextInt();
        System.out.print("¿Con cuánto vas a pagar?");
        final int pago = scanner.nextInt();
        final int cambio = pago - deuda;
        System.out.println("Tu cambio es: " + cambio);
        int billetes1 = cambio / 100;
        int billetes2 = (cambio % 100) / 50;
        int billetes3 = (cambio % 50) / 20;
        int billetes4 = (cambio % 20) / 10;
        int billetes5 = (cambio % 10) / 5;
        int monedas1 = cambio % 5;

        System.out.println("Billetes de 100: " + billetes1);
        System.out.println("Billetes de 50: " + billetes2);
        System.out.println("Billetes de 20: " + billetes3);
        System.out.println("Billetes de 10: " + billetes4);
        System.out.println("Billetes de 5: " + billetes5);
        System.out.println("Monedas de 1: " + monedas1);

    }
}