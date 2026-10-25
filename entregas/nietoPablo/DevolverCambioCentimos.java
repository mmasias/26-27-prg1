import java.util.Scanner;

class DevolverCambioCentimos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("[,\\s]+");

        System.out.println("¿Cuántos euros debe pagar? (ejemplo: 23,45)");
        int eurosImporte = entrada.nextInt();
        int centimosImporte = entrada.nextInt();

        System.out.println("¿Con cuántos euros paga? (ejemplo: 50,00)");
        int eurosEntregados = entrada.nextInt();
        int centimosEntregados = entrada.nextInt();

        int cambio = (eurosEntregados * 100 + centimosEntregados)
                - (eurosImporte * 100 + centimosImporte);

        int billetes100 = cambio / 10000;
        int resto = cambio % 10000;

        int billetes50 = resto / 5000;
        resto = resto % 5000;
        int billetes20 = resto / 2000;
        resto = resto % 2000;
        int billetes10 = resto / 1000;
        resto = resto % 1000;
        int billetes5 = resto / 500;
        resto = resto % 500;

        int monedas2 = resto / 200;
        resto = resto % 200;
        int monedas1 = resto / 100;
        resto = resto % 100;
        int monedas50Centimos = resto / 50;
        resto = resto % 50;
        int monedas20Centimos = resto / 20;
        resto = resto % 20;
        int monedas10Centimos = resto / 10;
        resto = resto % 10;
        int monedas5Centimos = resto / 5;
        resto = resto % 5;
        int monedas2Centimos = resto / 2;
        resto = resto % 2;
        int monedas1Centimo = resto;

        System.out.println(billetes100 + " billete(s) de 100 €");

        System.out.println(billetes50 + " billete(s) de 50 €");

        System.out.println(billetes20 + " billete(s) de 20 €");

        System.out.println(billetes10 + " billete(s) de 10 €");

        System.out.println(billetes5 + " billete(s) de 5 €");

        System.out.println(monedas2 + " moneda(s) de 2 €");

        System.out.println(monedas1 + " moneda(s) de 1 €");
        
        
        System.out.println(monedas50Centimos + " moneda(s) de 50 céntimos");

        System.out.println(monedas20Centimos + " moneda(s) de 20 céntimos");

        System.out.println(monedas10Centimos + " moneda(s) de 10 céntimos");

        System.out.println(monedas5Centimos + " moneda(s) de 5 céntimos");

        System.out.println(monedas2Centimos + " moneda(s) de 2 céntimos");
        
        System.out.println(monedas1Centimo + " moneda(s) de 1 céntimo");

    }
}
