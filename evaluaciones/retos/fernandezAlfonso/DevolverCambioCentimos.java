import java.util.Scanner;

class DevolverCambioCentimos {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("¿Cuántos euros debe pagar?");
            double debe = scanner.nextDouble();
            
            System.out.println("¿Con cuántos euros paga?");
            double paga = scanner.nextDouble();
            
            double cambio1;
            cambio1 = paga - debe;
            double cambio2;
            cambio2 = paga - debe;

            int billetes100 = (int) (cambio1 / 100);
            cambio1 %= 100;
            int billetes50 = (int) (cambio1 / 50);
            cambio1 %= 50;
            int billetes20 = (int) (cambio1 / 20);
            cambio1 %= 20;
            int billetes5 = (int) (cambio1 / 5);
            cambio1 %= 5;
            int monedas2 = (int) (cambio1 / 2);
            cambio1 %= 2;
            int monedas1 = (int) (cambio1 / 1);

            int monedas50c = (int) ((cambio1 % 1) / 0.5);
            int monedas20c = (int) ((cambio1 % 0.5) / 0.2);
            int monedas10c = (int) ((cambio1 % 0.2) / 0.1);
            int monedas5c = (int) ((cambio1 % 0.1) / 0.05);
            int monedas2c = (int) ((cambio1 % 0.05) / 0.02);
            int monedas1c = (int) ((cambio1 % 0.02) / 0.01);


            
            String cambioDevuelto = (paga>=debe? "Te devuelven " + cambio2 + " €"  : "No has pagado suficiente. Aún debes " + -cambio2 + " € Te faltan:" );
            
            System.out.println(cambioDevuelto);

            System.out.println(Math.abs(billetes100) + " billetes de 100 €");
            System.out.println(Math.abs(billetes50) + " billetes de 50 €");
            System.out.println(Math.abs(billetes20) + " billetes de 20 €");
            System.out.println(Math.abs(billetes5) + " billetes de 5 €");
            System.out.println(Math.abs(monedas2) + " monedas de 2 €");
            System.out.println(Math.abs(monedas1) + " monedas de 1 €");
            System.out.println(Math.abs(monedas50c) + " monedas de 50 céntimos");
            System.out.println(Math.abs(monedas20c) + " monedas de 20 céntimos");
            System.out.println(Math.abs(monedas10c) + " monedas de 10 céntimos");
            System.out.println(Math.abs(monedas5c) + " monedas de 5 céntimos");
            System.out.println(Math.abs(monedas2c) + " monedas de 2 céntimos");
            System.out.println(Math.abs(monedas1c) + " monedas de 1 céntimo");
            
        }
        
    }
 }
