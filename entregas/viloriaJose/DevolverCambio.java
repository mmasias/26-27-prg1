import java.util.Scanner;

class DeveloperCambio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int billete100;
        int billete50;
        int billete20;
        int billete10;
        int billete5;
        int moneda2;
        int moneda1;
        int restante;
        
        int centimo50;
        int centimo20;
        int centimo10;
        int centimo5;
        int centimo2;
        int centimo1;

        final double PRECIO_UNO;
        PRECIO_UNO = 232.00;

        final int PRECIO_UNO_CENTIMOS;
        PRECIO_UNO_CENTIMOS = (int) Math.round(PRECIO_UNO * 100);

        double dineroIngresado;

        System.out.println("Debes pagar " + PRECIO_UNO + "€, ingrese el dinero:");

        dineroIngresado = scanner.nextDouble();

        int dineroIngresadoCentimos;
        dineroIngresadoCentimos = (int) Math.round(dineroIngresado * 100);

        boolean puedePagar;
        int cambioCentimos;

        puedePagar = (dineroIngresadoCentimos >= PRECIO_UNO_CENTIMOS);
        cambioCentimos = dineroIngresadoCentimos - PRECIO_UNO_CENTIMOS;

        System.out.println(puedePagar ? "Tu cambio es " + (cambioCentimos / 100.0) + "€" : "No tienes suficiente dinero");

        cambioCentimos = puedePagar ? cambioCentimos : 0;

        billete100 = cambioCentimos / 10000;
        restante = cambioCentimos % 10000;
        billete50 = restante / 5000;
        restante = restante % 5000;
        billete20 = restante / 2000;
        restante = restante % 2000;
        billete10 = restante / 1000;
        restante = restante % 1000;
        billete5 = restante / 500;
        restante = restante % 500;
        moneda2 = restante / 200;
        restante = restante % 200;
        moneda1 = restante / 100;
        restante = restante % 100;
        centimo50 = restante / 50;
        restante = restante % 50;
        centimo20 = restante / 20;
        restante = restante % 20;
        centimo10 = restante / 10;
        restante = restante % 10;
        centimo5 = restante / 5;
        restante = restante % 5;
        centimo2 = restante / 2;
        centimo1 = restante % 2;

        System.out.println(billete100 + " billete(s) de 100 € ");
        System.out.println(billete50 + " billete(s) de 50 € ");
        System.out.println(billete20 + " billete(s) de 20 € ");
        System.out.println(billete10 + " billete(s) de 10 € ");
        System.out.println(billete5 + " billete(s) de 5 € ");
        System.out.println(moneda2 + " moneda(s) de 2 € ");
        System.out.println(moneda1 + " moneda(s) de 1 €");
        System.out.println(centimo50 + " moneda(s) de 50 centimos ");
        System.out.println(centimo20 + " moneda(s) de 20 centimos ");
        System.out.println(centimo10 + " moneda(s) de 10 centimos ");
        System.out.println(centimo5 + " moneda(s) de 5 centimos ");
        System.out.println(centimo2 + " moneda(s) de 2 centimos ");
        System.out.println(centimo1 + " moneda(s) de 1 centimos");

        final double PRECIO_DOS;
        PRECIO_DOS = 1.00;

        final int PRECIO_DOS_CENTIMOS;
        PRECIO_DOS_CENTIMOS = (int) Math.round(PRECIO_DOS * 100);

        System.out.println("Debes pagar " + PRECIO_DOS + "€, ingrese el dinero:");

        dineroIngresado = scanner.nextDouble();

        dineroIngresadoCentimos = (int) Math.round(dineroIngresado * 100);
        puedePagar = (dineroIngresadoCentimos >= PRECIO_DOS_CENTIMOS);
        cambioCentimos = dineroIngresadoCentimos - PRECIO_DOS_CENTIMOS;

        System.out.println(puedePagar ? "Tu cambio es " + (cambioCentimos / 100.0) + "€" : "No tienes suficiente dinero");

        cambioCentimos = puedePagar ? cambioCentimos : 0;

        billete100 = cambioCentimos / 10000;
        restante = cambioCentimos % 10000;
        billete50 = restante / 5000;
        restante = restante % 5000;
        billete20 = restante / 2000;
        restante = restante % 2000;
        billete10 = restante / 1000;
        restante = restante % 1000;
        billete5 = restante / 500;
        restante = restante % 500;
        moneda2 = restante / 200;
        restante = restante % 200;
        moneda1 = restante / 100;
        restante = restante % 100;
        centimo50 = restante / 50;
        restante = restante % 50;
        centimo20 = restante / 20;
        restante = restante % 20;
        centimo10 = restante / 10;
        restante = restante % 10;
        centimo5 = restante / 5;
        restante = restante % 5;
        centimo2 = restante / 2;
        centimo1 = restante % 2;

        System.out.println(billete100 + " billete(s) de 100 € ");
        System.out.println(billete50 + " billete(s) de 50 € ");
        System.out.println(billete20 + " billete(s) de 20 € ");
        System.out.println(billete10 + " billete(s) de 10 € ");
        System.out.println(billete5 + " billete(s) de 5 € ");
        System.out.println(moneda2 + " moneda(s) de 2 € ");
        System.out.println(moneda1 + " moneda(s) de 1 €");
        System.out.println(centimo50 + " moneda(s) de 50 centimos ");
        System.out.println(centimo20 + " moneda(s) de 20 centimos ");
        System.out.println(centimo10 + " moneda(s) de 10 centimos ");
        System.out.println(centimo5 + " moneda(s) de 5 centimos ");
        System.out.println(centimo2 + " moneda(s) de 2 centimos ");
        System.out.println(centimo1 + " moneda(s) de 1 centimos");

        final double PRECIO_TRES;
        PRECIO_TRES = 37.00;

        final int PRECIO_TRES_CENTIMOS;
        PRECIO_TRES_CENTIMOS = (int) Math.round(PRECIO_TRES * 100);

        System.out.println("Debes pagar " + PRECIO_TRES + "€, ingrese el dinero:");

        dineroIngresado = scanner.nextDouble();

        dineroIngresadoCentimos = (int) Math.round(dineroIngresado * 100);
        puedePagar = (dineroIngresadoCentimos >= PRECIO_TRES_CENTIMOS);
        cambioCentimos = dineroIngresadoCentimos - PRECIO_TRES_CENTIMOS;

        System.out.println(puedePagar ? "Tu cambio es " + (cambioCentimos / 100.0) + "€" : "No tienes suficiente dinero");

        cambioCentimos = puedePagar ? cambioCentimos : 0;

        billete100 = cambioCentimos / 10000;
        restante = cambioCentimos % 10000;
        billete50 = restante / 5000;
        restante = restante % 5000;
        billete20 = restante / 2000;
        restante = restante % 2000;
        billete10 = restante / 1000;
        restante = restante % 1000;
        billete5 = restante / 500;
        restante = restante % 500;
        moneda2 = restante / 200;
        restante = restante % 200;
        moneda1 = restante / 100;
        restante = restante % 100;
        centimo50 = restante / 50;
        restante = restante % 50;
        centimo20 = restante / 20;
        restante = restante % 20;
        centimo10 = restante / 10;
        restante = restante % 10;
        centimo5 = restante / 5;
        restante = restante % 5;
        centimo2 = restante / 2;
        centimo1 = restante % 2;

        System.out.println(billete100 + " billete(s) de 100 € ");
        System.out.println(billete50 + " billete(s) de 50 € ");
        System.out.println(billete20 + " billete(s) de 20 € ");
        System.out.println(billete10 + " billete(s) de 10 € ");
        System.out.println(billete5 + " billete(s) de 5 € ");
        System.out.println(moneda2 + " moneda(s) de 2 € ");
        System.out.println(moneda1 + " moneda(s) de 1 €");
        System.out.println(centimo50 + " moneda(s) de 50 centimos ");
        System.out.println(centimo20 + " moneda(s) de 20 centimos ");
        System.out.println(centimo10 + " moneda(s) de 10 centimos ");
        System.out.println(centimo5 + " moneda(s) de 5 centimos ");
        System.out.println(centimo2 + " moneda(s) de 2 centimos ");
        System.out.println(centimo1 + " moneda(s) de 1 centimos");

        final double PRECIO_CUATRO;
        PRECIO_CUATRO = 5;

        final int PRECIO_CUATRO_CENTIMOS;
        PRECIO_CUATRO_CENTIMOS = (int) Math.round(PRECIO_CUATRO * 100);

        System.out.println("Debes pagar " + PRECIO_CUATRO + "€, ingrese el dinero:");

        dineroIngresado = scanner.nextDouble();

        dineroIngresadoCentimos = (int) Math.round(dineroIngresado * 100);
        puedePagar = (dineroIngresadoCentimos >= PRECIO_CUATRO_CENTIMOS);
        cambioCentimos = dineroIngresadoCentimos - PRECIO_CUATRO_CENTIMOS;

        System.out.println(puedePagar ? "Tu cambio es " + (cambioCentimos / 100.0) + "€" : "No tienes suficiente dinero");

        cambioCentimos = puedePagar ? cambioCentimos : 0;

        billete100 = cambioCentimos / 10000;
        restante = cambioCentimos % 10000;
        billete50 = restante / 5000;
        restante = restante % 5000;
        billete20 = restante / 2000;
        restante = restante % 2000;
        billete10 = restante / 1000;
        restante = restante % 1000;
        billete5 = restante / 500;
        restante = restante % 500;
        moneda2 = restante / 200;
        restante = restante % 200;
        moneda1 = restante / 100;
        restante = restante % 100;
        centimo50 = restante / 50;
        restante = restante % 50;
        centimo20 = restante / 20;
        restante = restante % 20;
        centimo10 = restante / 10;
        restante = restante % 10;
        centimo5 = restante / 5;
        restante = restante % 5;
        centimo2 = restante / 2;
        centimo1 = restante % 2;

        System.out.println(billete100 + " billete(s) de 100 € ");
        System.out.println(billete50 + " billete(s) de 50 € ");
        System.out.println(billete20 + " billete(s) de 20 € ");
        System.out.println(billete10 + " billete(s) de 10 € ");
        System.out.println(billete5 + " billete(s) de 5 € ");
        System.out.println(moneda2 + " moneda(s) de 2 € ");
        System.out.println(moneda1 + " moneda(s) de 1 €");
        System.out.println(centimo50 + " moneda(s) de 50 centimos ");
        System.out.println(centimo20 + " moneda(s) de 20 centimos ");
        System.out.println(centimo10 + " moneda(s) de 10 centimos ");
        System.out.println(centimo5 + " moneda(s) de 5 centimos ");
        System.out.println(centimo2 + " moneda(s) de 2 centimos ");
        System.out.println(centimo1 + " moneda(s) de 1 centimos");

        System.out.println();

    }
}
