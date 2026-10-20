class ClaseJava {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        sc.useLocale(java.util.Locale.GERMANY);

        System.out.println("¿Cuántos euros debe pagar? (ej: 23,45)");
        double pagar = sc.nextDouble();

        System.out.println("¿Con cuántos euros paga? (ej: 50,00)");
        double paga = sc.nextDouble();

        int pagarCent = (int) Math.round(pagar * 100);
        int pagaCent = (int) Math.round(paga * 100);

        int cambio = pagaCent - pagarCent;

        int b100 = cambio / 10000; cambio = cambio % 10000;
        int b50  = cambio / 5000;  cambio = cambio % 5000;
        int b20  = cambio / 2000;  cambio = cambio % 2000;
        int b10  = cambio / 1000;  cambio = cambio % 1000;
        int b5   = cambio / 500;   cambio = cambio % 500;

        int m2e = cambio / 200; cambio = cambio % 200;
        int m1e = cambio / 100; cambio = cambio % 100;

        int c50 = cambio / 50; cambio = cambio % 50;
        int c20 = cambio / 20; cambio = cambio % 20;
        int c10 = cambio / 10; cambio = cambio % 10;
        int c5  = cambio / 5;  cambio = cambio % 5;
        int c2  = cambio / 2;  cambio = cambio % 2;
        int c1  = cambio;      // último céntimo

        System.out.println(b100 + " billete(s) de 100 €");
        System.out.println(b50  + " billete(s) de 50 €");
        System.out.println(b20  + " billete(s) de 20 €");
        System.out.println(b10  + " billete(s) de 10 €");
        System.out.println(b5   + " billete(s) de 5 €");
        System.out.println(m2e  + " moneda(s) de 2 €");
        System.out.println(m1e  + " moneda(s) de 1 €");
        System.out.println(c50  + " moneda(s) de 50 céntimos");
        System.out.println(c20  + " moneda(s) de 20 céntimos");
        System.out.println(c10  + " moneda(s) de 10 céntimos");
        System.out.println(c5   + " moneda(s) de 5 céntimos");
        System.out.println(c2   + " moneda(s) de 2 céntimos");
        System.out.println(c1   + " moneda(s) de 1 céntimo");

        sc.close();
    }
}
