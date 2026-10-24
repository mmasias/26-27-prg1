
import java.util.Scanner;

class Reto002 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("¿Cuántos euros debe pagar?");
            int debe = scanner.nextInt();
            
            System.out.println("¿Con cuántos euros paga?");
            int paga = scanner.nextInt();
            
            int cambio1;
            cambio1 = paga - debe;

            int billetes100 = cambio1 / 100;
            cambio1 %= 100;
            int billetes50 = cambio1 / 50;
            cambio1 %= 50;
            int billetes20 = cambio1 / 20;
            cambio1 %= 20;
            int billetes5 = cambio1 / 5;
            cambio1 %= 5;
            int monedas2 = cambio1 / 2;
            cambio1 %= 2;
            int monedas1 = cambio1 / 1;


            System.out.println(billetes100 + " billetes de 100 €");
            System.out.println(billetes50 + " billetes de 50 €");
            System.out.println(billetes20 + " billetes de 20 €");
            System.out.println(billetes5 + " billetes de 5 €");
            System.out.println(monedas2 + " monedas de 2 €");
            System.out.println(monedas1 + " monedas de 1 €");

            
        }
















        
    }
}