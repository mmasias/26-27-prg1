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

        scanner.close();

    }
}