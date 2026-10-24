import java.util.Scanner;

class DevolverCambio {
    public static void main(String[] args) {

        int dineroPagar;
        int dineroEntregado;

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos euros tienes que pagar?");
        dineroPagar = scanner.nextInt();
        System.out.println("¿Cúanto dinero tienes?");
        dineroEntregado = scanner.nextInt();
        int cambio = dineroEntregado - dineroPagar;
        System.out.println("El cambio es de " + cambio + " euros");

        final int BILLETES100 = 100;
        int numBilletes100 = cambio / BILLETES100;
        cambio = cambio % BILLETES100;
        System.out.println( "necesitas " + numBilletes100 + " billetes de 100 euros");

        scanner.close();

    }
}