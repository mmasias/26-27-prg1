import java.util.Scanner;
class DevolverCambioCentimos{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad a pagar: ");
        double cantidadAPagar =scanner.nextDouble();
        
        System.out.print("Introduce la cantidad recibida: ");
        double cantidadRecibida =scanner.nextDouble();

        double cantidadadevolver = cantidadRecibida - cantidadAPagar;

        int billetesde100 = (int)(cantidadadevolver / 100);
        cantidadadevolver = cantidadadevolver % 100;
        
        int billetesde50 = (int) cantidadadevolver / 50;
        cantidadadevolver = cantidadadevolver % 50;
        
        int billetesde20 = (int)cantidadadevolver / 20;
        cantidadadevolver = cantidadadevolver % 20;
        
        int billetesde10 = (int)cantidadadevolver / 10;
        cantidadadevolver = cantidadadevolver % 10;
        
        int billetesde5 = (int)cantidadadevolver / 5;
        cantidadadevolver = cantidadadevolver % 5;
        
        int monedasde2 = (int)cantidadadevolver / 2;
        cantidadadevolver = cantidadadevolver % 2;
    
        int monedasde1 = (int)cantidadadevolver;
        cantidadadevolver = cantidadadevolver - monedasde1;

        int centimosadevolver = (int)(cantidadadevolver * 100);

        int cents50 = (int)(centimosadevolver / 50);
        centimosadevolver = centimosadevolver % 50;
        
        int cents20 = (int)(centimosadevolver / 20);
        centimosadevolver = centimosadevolver % 20;
        
        int cents10 = (int)(centimosadevolver / 10);
        centimosadevolver = centimosadevolver % 10;
        
        int cents5 = (int)(centimosadevolver / 5);
        centimosadevolver = centimosadevolver % 5;
        
        int cents2 = (int)(centimosadevolver / 2);
        centimosadevolver = centimosadevolver % 2;
        
        int cents1 = (int)(centimosadevolver);

        String mensaje1 = " billetes de";
        String mensaje2 = " monedas de";
        
        System.out.println(billetesde100 + mensaje1 + " 100");
        System.out.println(billetesde50 + mensaje1 + " 50");
        System.out.println(billetesde20 + mensaje1 + " 20");
        System.out.println(billetesde10 + mensaje1 + " 10");
        System.out.println(billetesde5 + mensaje1 + " 5");
        System.out.println(monedasde2 + mensaje2 + " 2");
        System.out.println(monedasde1 + mensaje2 +" 1");


        System.out.println(cents50 + mensaje2 + " 0.50");
        System.out.println(cents20 + mensaje2 + " 0.20");
        System.out.println(cents10 + mensaje2 + " 0.10");
        System.out.println(cents5 + mensaje2 + " 0.05");
        System.out.println(cents2 + mensaje2 + " 0.02");
        System.out.println(cents1 + mensaje2 + " 0.01");

    }
}