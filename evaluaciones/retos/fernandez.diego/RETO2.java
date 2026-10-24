import java.util.Scanner;
class RETO2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuánto debes pagar: ");
        final int deuda = (int)(scanner.nextDouble() * 100);
        System.out.print("¿Con cuanto vas a pagar?");
        final int pago = (int)(scanner.nextDouble() * 100);
        int cambio;
        cambio = pago - deuda;
        System.out.println("El cambio es de: "+(cambio / 100.0)+"€");
        int billetes1 = cambio / 10000;
        cambio = cambio % 10000;
        int billetes2 = cambio / 5000;
        cambio = cambio % 5000;
        int billetes3 = cambio / 2000;
        cambio = cambio % 2000;
        int billetes4 = cambio / 1000;
        cambio = cambio % 1000;
        int billetes5 = cambio / 500;
        cambio = cambio % 500;
        int monedas1 = cambio / 200;
        cambio = cambio % 200;
        int monedas2 = cambio / 100;
        cambio = cambio % 100;
        int centimos50 = cambio / 50;
        cambio = cambio % 50;
        int centimos20 = cambio / 20;
        cambio = cambio % 20;
        int centimos10 = cambio / 10;
        cambio = cambio % 10;
        int centimos5 = cambio / 5;
        cambio = cambio % 5;
        int centimos2 = cambio / 2;
        cambio = cambio % 2;
        int centimos1 = cambio;
        System.out.println(""+billetes1+" billete(s) de 100€");
        System.out.println(""+billetes2+" billete(s) de 50€");
        System.out.println(""+billetes3+" billete(s) de 20€");
        System.out.println(""+billetes4+" billete(s) de 10€");
        System.out.println(""+billetes5+" billete(s) de 5€");
        System.out.println(""+monedas1+" moneda(s) de 2€");
        System.out.println(""+monedas2+" moneda(s) de 1€");
        System.out.println(""+centimos50+" moneda(s) de 50 céntimos");
        System.out.println(""+centimos20+" moneda(s) de 20 céntimos");
        System.out.println(""+centimos10+" moneda(s) de 10 céntimos");
        System.out.println(""+centimos5+" moneda(s) de 5 céntimos");
        System.out.println(""+centimos2+" moneda(s) de 2 céntimos");
        System.out.println(""+centimos1+" moneda(s) de 1 céntimo");
        
    }
}
    

