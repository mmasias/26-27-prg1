import java.util.Scanner;
public class DevolverCambio {
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

        int billete100 = devolver / 100;
        devolver = devolver % 100;
        System.out.println("billete de 100 :" + billete100);

        int billete50 = devolver / 50;
        devolver = devolver % 50;
        System.out.println("billete de 50 :" + billete50);

        int billete20 = devolver / 20;
        devolver = devolver % 20;
        System.out.println("billete de 20 :" + billete20);

        int billete10 = devolver / 10;
        devolver = devolver % 10;
        System.out.println("billete de 10 :" + billete10);

        int billete5 = devolver / 5;
        devolver = devolver % 5;
        System.out.println("billete de 5 :" + billete5);

        int moneda2 = devolver / 2;
        devolver = devolver % 2;
        System.out.println("moneda de 2 :" + moneda2);

        int moneda1 = devolver / 1;
        devolver = devolver % 1;
        System.out.println("moneda de 1 :" + moneda1);

    }

}
