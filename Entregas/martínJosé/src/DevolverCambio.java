import java.util.Scanner;
class DevolverCambio{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad a pagar: ");
        final int CANTIDADAPAGAR =scanner.nextInt();
        System.out.print("Introduce la cantidad recibida: ");
        final int CANTIDADRECIBIDA =scanner.nextInt();

        int cantidadadevolver = CANTIDADRECIBIDA - CANTIDADAPAGAR;
        final int VALOREUROS100 = 100;
        final int VALOREUROS50 = 50;
        final int VALOREUROS20 = 20;
        final int VALOREUROS10 = 10;
        final int VALOREUROS5 = 5;
        final int VALOREUROS2 = 2;
        final int VALOREUROS1 = 1;

        int billetesde100 =cantidadadevolver /VALOREUROS100;
        cantidadadevolver = cantidadadevolver % VALOREUROS100;
        int billetesde50 = cantidadadevolver / VALOREUROS50;
        cantidadadevolver = cantidadadevolver % VALOREUROS50;
        int billetesde20 = cantidadadevolver / VALOREUROS20;
        cantidadadevolver = cantidadadevolver % VALOREUROS20;
        int billetesde10 = cantidadadevolver / VALOREUROS10;
        cantidadadevolver = cantidadadevolver % VALOREUROS10;
        int billetesde5 = cantidadadevolver / VALOREUROS5;
        cantidadadevolver = cantidadadevolver % VALOREUROS5; 
        int monedasde2 = cantidadadevolver / VALOREUROS2;
        cantidadadevolver = cantidadadevolver % VALOREUROS2;
        int monedasde1 = cantidadadevolver;

        final String MENSAJE = " billetes/monedas de ";
        System.out.println(billetesde100 + MENSAJE + VALOREUROS100);
        System.out.println(billetesde50 + MENSAJE + VALOREUROS50);
        System.out.println(billetesde20 + MENSAJE + VALOREUROS20);
        System.out.println(billetesde10 + MENSAJE + VALOREUROS10);
        System.out.println(billetesde5 + MENSAJE + VALOREUROS5);
        System.out.println(monedasde2 + MENSAJE + VALOREUROS2);
        System.out.println(monedasde1 + MENSAJE + VALOREUROS1);
    }
}