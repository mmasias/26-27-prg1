import java.util.Scanner;

class DevolverCambio2Think {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuántas unidades debe pagar?");
        int importe = entrada.nextInt();
        System.out.println("¿Con cuántas unidades paga?");
        int pagado = entrada.nextInt();

        int cambio = pagado - importe;

        int monedas4 = cambio / 4;
        cambio = cambio % 4;
        int monedas3 = cambio / 3;
        cambio = cambio % 3;
        int monedas1 = cambio;

        System.out.println(monedas4 + " moneda(s) de 4");
        System.out.println(monedas3 + " moneda(s) de 3");
        System.out.println(monedas1 + " moneda(s) de 1");
    }
}
