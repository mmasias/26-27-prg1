import java.util.Scanner;
class DevolverCambioCentimos{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad a pagar: ");
        final double CANTIDADAPAGAR =scanner.nextDouble();
        
        System.out.print("Introduce la cantidad recibida: ");
        final double CANTIDADRECIVIDA =scanner.nextDouble();

        double cantidadadevolver = CANTIDADRECIVIDA - CANTIDADAPAGAR;
        final int VALOREUROS100 = 100;
        final int VALOREUROSOCENTIMOS50 = 50;
        final int VALOREUROSOCENTIMOS20 = 20;
        final int VALOREUROSOCENTIMOS10 = 10;
        final int VALOREUROSOCENTIMOS5 = 5;
        final int VALOREUROSOCENTIMOS2 = 2;
        final int VALOREUROSOCENTIMOS1 = 1;

        int billetesde100 = (int)(cantidadadevolver / VALOREUROS100);
        cantidadadevolver = cantidadadevolver % VALOREUROS100;
        int billetesde50 = (int) cantidadadevolver / VALOREUROSOCENTIMOS50;
        cantidadadevolver = cantidadadevolver % VALOREUROSOCENTIMOS50;
        int billetesde20 = (int)cantidadadevolver / VALOREUROSOCENTIMOS20;
        cantidadadevolver = cantidadadevolver % VALOREUROSOCENTIMOS20;
        int billetesde10 = (int)cantidadadevolver / VALOREUROSOCENTIMOS10;
        cantidadadevolver = cantidadadevolver % VALOREUROSOCENTIMOS10;
        int billetesde5 = (int)cantidadadevolver / VALOREUROSOCENTIMOS5;
        cantidadadevolver = cantidadadevolver % VALOREUROSOCENTIMOS5;
        int monedasde2 = (int)cantidadadevolver / VALOREUROSOCENTIMOS2;
        cantidadadevolver = cantidadadevolver % VALOREUROSOCENTIMOS2;
        int monedasde1 = (int)cantidadadevolver;
        cantidadadevolver = cantidadadevolver - monedasde1;

        final double DECIMALAENTERO = 100;
        int centimosadevolver = (int)(cantidadadevolver * DECIMALAENTERO);
        int cents50 = (int)(centimosadevolver / VALOREUROSOCENTIMOS50);
        centimosadevolver = centimosadevolver % VALOREUROSOCENTIMOS50;
        int cents20 = (int)(centimosadevolver / VALOREUROSOCENTIMOS20);
        centimosadevolver = centimosadevolver % VALOREUROSOCENTIMOS20;
        int cents10 = (int)(centimosadevolver / VALOREUROSOCENTIMOS10);
        centimosadevolver = centimosadevolver % VALOREUROSOCENTIMOS10;
        int cents5 = (int)(centimosadevolver / VALOREUROSOCENTIMOS5);
        centimosadevolver = centimosadevolver % VALOREUROSOCENTIMOS5;
        int cents2 = (int)(centimosadevolver / VALOREUROSOCENTIMOS2);
        centimosadevolver = centimosadevolver % VALOREUROSOCENTIMOS2;
        int cents1 = (int)(centimosadevolver);


        final String MENSAJE1 = " billetes de ";
        final String MENSAJE2 = " monedas de ";
        System.out.println(billetesde100 + MENSAJE1 + VALOREUROS100);
        System.out.println(billetesde50 + MENSAJE1 + VALOREUROSOCENTIMOS50);
        System.out.println(billetesde20 + MENSAJE1 + VALOREUROSOCENTIMOS20);
        System.out.println(billetesde10 + MENSAJE1 + VALOREUROSOCENTIMOS10);
        System.out.println(billetesde5 + MENSAJE1 + VALOREUROSOCENTIMOS5);
        System.out.println(monedasde2 + MENSAJE2 + VALOREUROSOCENTIMOS2);
        System.out.println(monedasde1 + MENSAJE2 + VALOREUROSOCENTIMOS1);


        System.out.println(cents50 + MENSAJE2 + VALOREUROSOCENTIMOS50/DECIMALAENTERO);
        System.out.println(cents20 + MENSAJE2 + VALOREUROSOCENTIMOS20/DECIMALAENTERO);
        System.out.println(cents10 + MENSAJE2 + VALOREUROSOCENTIMOS10/DECIMALAENTERO);
        System.out.println(cents5 + MENSAJE2 + VALOREUROSOCENTIMOS5/DECIMALAENTERO);
        System.out.println(cents2 + MENSAJE2 + VALOREUROSOCENTIMOS2/DECIMALAENTERO);
        System.out.println(cents1 + MENSAJE2 + VALOREUROSOCENTIMOS1/DECIMALAENTERO);

    }
}