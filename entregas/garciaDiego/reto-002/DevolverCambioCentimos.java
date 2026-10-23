import java.util.Scanner;

class DevolverCambioCentimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Concrete el precio total de los artículos:");
        final double PRECIO_TOTAL = scanner.nextDouble();
        System.out.println("La compra supone un total de " + PRECIO_TOTAL + "€");
        System.out.println("El cliente ha de abonar una cantidad igual o superior. Introduzca la cantidad abonada:");
        final double CANTIDAD_ABONADA = scanner.nextDouble();
        int cantidadADevolverEnteros = (int) (CANTIDAD_ABONADA - PRECIO_TOTAL);
        int cantidadADevolverCentimos = (int)((CANTIDAD_ABONADA - PRECIO_TOTAL- cantidadADevolverEnteros) * 100 + 0.5); //Aquí he puesto el apaño
        final int VALOR_BILLETE_100 = 100;
        final int VALOR_BILLETE_50 = 50;
        final int VALOR_BILLETE_20 = 20;
        final int VALOR_BILLETE_10 = 10;
        final int VALOR_BILLETE_5 = 5;
        final int VALOR_MONEDA_2 = 2;
        final int VALOR_MONEDA_1 = 1;
        final int VALOR_CENTIMO_50 = 50;
        final int VALOR_CENTIMO_20 = 20;
        final int VALOR_CENTIMO_10 = 10;
        final int VALOR_CENTIMO_5 = 5;
        final int VALOR_CENTIMO_2 = 2;
        final int VALOR_CENTIMO_1 = 1;
        int numeroDeBilletesDe100 = cantidadADevolverEnteros / VALOR_BILLETE_100;
        cantidadADevolverEnteros = cantidadADevolverEnteros % VALOR_BILLETE_100;
        int numeroDeBilletesDe50 = cantidadADevolverEnteros / VALOR_BILLETE_50;
        cantidadADevolverEnteros = cantidadADevolverEnteros % VALOR_BILLETE_50;
        int numeroDeBilletesDe20 = cantidadADevolverEnteros / VALOR_BILLETE_20;
        cantidadADevolverEnteros = cantidadADevolverEnteros % VALOR_BILLETE_20;
        int numeroDeBilletesDe10 = cantidadADevolverEnteros / VALOR_BILLETE_10;
        cantidadADevolverEnteros = cantidadADevolverEnteros % VALOR_BILLETE_10;
        int numeroDeBilletesDe5 = cantidadADevolverEnteros / VALOR_BILLETE_5;
        cantidadADevolverEnteros = cantidadADevolverEnteros % VALOR_BILLETE_5;
        int numeroDeMonedasDe2 = cantidadADevolverEnteros / VALOR_MONEDA_2;
        cantidadADevolverEnteros = cantidadADevolverEnteros % VALOR_MONEDA_2;
        int numeroDeMonedasDe1 = cantidadADevolverEnteros / VALOR_MONEDA_1;
        cantidadADevolverEnteros = cantidadADevolverEnteros % VALOR_MONEDA_1;
        int numeroDeCentimosDe50 = cantidadADevolverCentimos / VALOR_CENTIMO_50;
        cantidadADevolverCentimos = cantidadADevolverCentimos % VALOR_CENTIMO_50;
        int numeroDeCentimosDe20 = cantidadADevolverCentimos / VALOR_CENTIMO_20;
        cantidadADevolverCentimos = cantidadADevolverCentimos % VALOR_CENTIMO_20;
        int numeroDeCentimosDe10 = cantidadADevolverCentimos / VALOR_CENTIMO_10;
        cantidadADevolverCentimos = cantidadADevolverCentimos % VALOR_CENTIMO_10;
        int numeroDeCentimosDe5 = cantidadADevolverCentimos / VALOR_CENTIMO_5;
        cantidadADevolverCentimos = cantidadADevolverCentimos % VALOR_CENTIMO_5;
        int numeroDeCentimosDe2 = cantidadADevolverCentimos / VALOR_CENTIMO_2;
        cantidadADevolverCentimos = cantidadADevolverCentimos % VALOR_CENTIMO_2;
        int numeroDeCentimosDe1 = cantidadADevolverCentimos / VALOR_CENTIMO_1;
       cantidadADevolverCentimos = cantidadADevolverCentimos % VALOR_CENTIMO_1;
        System.out.println("Cantidad de billetes y monedas a devolver:");
        System.out.println(numeroDeBilletesDe100 + " de 100€");
        System.out.println(numeroDeBilletesDe50 + " de  50€");
        System.out.println(numeroDeBilletesDe20 + " de  20€");
        System.out.println(numeroDeBilletesDe10 + " de  10€");
        System.out.println(numeroDeBilletesDe5 + " de   5€");
        System.out.println(numeroDeMonedasDe2 + " de   2€");
        System.out.println(numeroDeMonedasDe1 + " de   1€");
        System.out.println(numeroDeCentimosDe50 + " de  50¢");
        System.out.println(numeroDeCentimosDe20 + " de  20¢");
        System.out.println(numeroDeCentimosDe10 + " de  10¢");
        System.out.println(numeroDeCentimosDe5 + " de   5¢");
        System.out.println(numeroDeCentimosDe2 + " de   2¢");
        System.out.println(numeroDeCentimosDe1 + " de   1¢");
        scanner.close();
    }

}