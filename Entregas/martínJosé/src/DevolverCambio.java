import java.util.Scanner;
class DevolverCambio{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad a pagar: ");
        int cantidadAPagar =scanner.nextInt();
        
        System.out.print("Introduce la cantidad recibida: ");
        int cantidadRecibida =scanner.nextInt();

        int cantidadadevolver = cantidadRecibida - cantidadAPagar;

        int billetesde100 =cantidadadevolver /100;
        cantidadadevolver = cantidadadevolver % 100;
        
        int billetesde50 = cantidadadevolver / 50;
        cantidadadevolver = cantidadadevolver % 50;
        
        int billetesde20 = cantidadadevolver / 20;
        cantidadadevolver = cantidadadevolver % 20;
        
        int billetesde10 = cantidadadevolver / 10;
        cantidadadevolver = cantidadadevolver % 10;
        
        int billetesde5 = cantidadadevolver / 5;
        cantidadadevolver = cantidadadevolver % 5;
        
        int monedasde2 = cantidadadevolver / 2;
        cantidadadevolver = cantidadadevolver % 2;
        
        int monedasde1 = cantidadadevolver;

        String mensaje = " billetes/monedas de";
        
        System.out.println(billetesde100 + mensaje + " 100");
        System.out.println(billetesde50 + mensaje + " 50");
        System.out.println(billetesde20 + mensaje + " 20");
        System.out.println(billetesde10 + mensaje + " 10");
        System.out.println(billetesde5 + mensaje + " 5");
        System.out.println(monedasde2 + mensaje + " 2");
        System.out.println(monedasde1 + mensaje +" 1");
    }
}