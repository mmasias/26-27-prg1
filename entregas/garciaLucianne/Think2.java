import java.util.Scanner;
public class Think2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto a pagar : ");
        int montoPagar = scanner.nextInt();

        System.out.println("Ingrese el monto recibido");
        int montoRecibido = scanner.nextInt();
        int devolver = montoRecibido - montoPagar;
        boolean comprobandoPago = montoRecibido >= montoPagar;

        System.out.println(comprobandoPago ? "Su vuelto es: "
        + (montoRecibido - montoPagar)
        : "El monto recibido es insuficiente, debe pagar :"
        + montoPagar);

        int moneda4 = devolver / 4;
        devolver = devolver % 4;
        System.out.println("moneda de  4 :" + moneda4);

        int moneda3 = devolver / 3;
        devolver = devolver % 3;
        System.out.println("moneda de 3 :" + moneda3);

        int moneda1 = devolver / 1;
        devolver = devolver % 1;
        System.out.println("moneda  de 1 :" + moneda1);
    }
}