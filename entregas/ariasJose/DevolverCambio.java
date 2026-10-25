import java.util.Scanner;

class DevolverCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        double eurosPorPagar = scanner.nextDouble();

        System.out.println("¿Con cuántos euros paga?");
        double eurosPago = scanner.nextDouble();

        double diferenciaPagoSinRedondear = (eurosPago-eurosPorPagar) * 100;


        double diferenciaPago = Math.round(diferenciaPagoSinRedondear);
        diferenciaPago = diferenciaPago / 100; 

        final int VALOR_BILLETE_CIEN = 100;
        final int VALOR_BILLETE_CINCUENTA = 50; 
        final int VALOR_BILLETE_VEINTE = 20;
        final int VALOR_BILLETE_DIEZ = 10;
        final int VALOR_BILLETE_CINCO = 5;
        final int VALOR_MONEDA_DOS = 2;
        final int VALOR_MONEDA_UNO = 1;
        final double VALOR_MONEDA_CINCUENTA_CENTIMOS = 50;
        final double VALOR_MONEDA_VEINTE_CENTIMOS = 20;
        final double VALOR_MONEDA_DIEZ_CENTIMOS = 10;
        final double VALOR_MONEDA_CINCO_CENTIMOS = 5;
        final double VALOR_MONEDA_DOS_CENTIMOS = 2;
        final double VALOR_MONEDA_UN_CENTIMO = 1;
        final String MENSAJE_BILLETES = " billete(s) de ";
        final String MENSAJE_MONEDAS = " moneda(s) de ";
        final String EUROS = " €";

        int cambioBilleteCien = (int) (diferenciaPago / VALOR_BILLETE_CIEN);
        diferenciaPago = diferenciaPago - (cambioBilleteCien * VALOR_BILLETE_CIEN);
        System.out.println(cambioBilleteCien + MENSAJE_BILLETES + VALOR_BILLETE_CIEN + EUROS);

        int cambioBilleteCincuenta = (int)(diferenciaPago / VALOR_BILLETE_CINCUENTA);
        diferenciaPago = diferenciaPago - (cambioBilleteCincuenta * VALOR_BILLETE_CINCUENTA);
        System.out.println(cambioBilleteCincuenta + MENSAJE_BILLETES + VALOR_BILLETE_CINCUENTA + EUROS);

        int cambioBilleteVeinte = (int) (diferenciaPago / VALOR_BILLETE_VEINTE);
        diferenciaPago = diferenciaPago - (cambioBilleteVeinte * VALOR_BILLETE_VEINTE);
        System.out.println(cambioBilleteVeinte + MENSAJE_BILLETES + VALOR_BILLETE_VEINTE + EUROS);

        int cambioBilleteDiez = (int) (diferenciaPago / VALOR_BILLETE_DIEZ);
        diferenciaPago = diferenciaPago - (cambioBilleteDiez * VALOR_BILLETE_DIEZ);
        System.out.println(cambioBilleteDiez + MENSAJE_BILLETES + VALOR_BILLETE_DIEZ + EUROS);

        int cambioBilleteCinco = (int) (diferenciaPago / VALOR_BILLETE_CINCO);
        diferenciaPago = diferenciaPago - (cambioBilleteCinco * VALOR_BILLETE_CINCO);
        System.out.println(cambioBilleteCinco + MENSAJE_BILLETES + VALOR_BILLETE_CINCO + EUROS);

        int cambioMonedaDosEuros = (int) (diferenciaPago / VALOR_MONEDA_DOS);
        diferenciaPago = diferenciaPago - (cambioMonedaDosEuros * VALOR_MONEDA_DOS);
        System.out.println(cambioMonedaDosEuros + MENSAJE_MONEDAS + VALOR_MONEDA_DOS + EUROS);

        int cambioMonedaUnEuro = (int) (diferenciaPago / VALOR_MONEDA_UNO);
        diferenciaPago = diferenciaPago - (cambioMonedaUnEuro * VALOR_MONEDA_UNO);
        System.out.println(cambioMonedaUnEuro + MENSAJE_MONEDAS + VALOR_MONEDA_UNO + EUROS);
        diferenciaPago = diferenciaPago * 100;

        int cambioMonedaCincuentaCentimos = (int) (diferenciaPago / VALOR_MONEDA_CINCUENTA_CENTIMOS);
        diferenciaPago = diferenciaPago - (cambioMonedaCincuentaCentimos / VALOR_MONEDA_CINCUENTA_CENTIMOS);
        System.out.println(cambioMonedaCincuentaCentimos + MENSAJE_MONEDAS + VALOR_MONEDA_CINCUENTA_CENTIMOS + EUROS);

        double cambioMonedaVeinteCentimos = (int)(diferenciaPago / VALOR_MONEDA_VEINTE_CENTIMOS);
        diferenciaPago = diferenciaPago - (cambioMonedaVeinteCentimos * VALOR_MONEDA_VEINTE_CENTIMOS);
        System.out.println(cambioMonedaVeinteCentimos + MENSAJE_MONEDAS + VALOR_MONEDA_VEINTE_CENTIMOS + EUROS);

        double cambioMonedaDiezCentimos = (int)(diferenciaPago / VALOR_MONEDA_DIEZ_CENTIMOS);
        diferenciaPago = diferenciaPago - (cambioMonedaDiezCentimos * VALOR_MONEDA_DIEZ_CENTIMOS);
        System.out.println(cambioMonedaDiezCentimos + MENSAJE_MONEDAS + VALOR_MONEDA_DIEZ_CENTIMOS + EUROS);

        double cambioMonedaCincoCentimos = (int)(diferenciaPago / VALOR_MONEDA_CINCO_CENTIMOS);
        diferenciaPago = diferenciaPago - (cambioMonedaCincoCentimos * VALOR_MONEDA_CINCO_CENTIMOS);
        System.out.println(cambioMonedaCincoCentimos + MENSAJE_MONEDAS + VALOR_MONEDA_CINCO_CENTIMOS + EUROS);

        double cambioMonedaDosCentimos = (int)(diferenciaPago / VALOR_MONEDA_DOS_CENTIMOS);
        diferenciaPago = diferenciaPago - (cambioMonedaDosCentimos * VALOR_MONEDA_DOS_CENTIMOS);
        System.out.println(cambioMonedaDosCentimos + MENSAJE_MONEDAS + VALOR_MONEDA_DOS_CENTIMOS + EUROS);

        double cambioMonedaUnCentimo = (int) (diferenciaPago / VALOR_MONEDA_UN_CENTIMO);
        System.out.println(cambioMonedaUnCentimo + MENSAJE_MONEDAS + VALOR_MONEDA_UN_CENTIMO + EUROS);

        scanner.close();
    }
}
