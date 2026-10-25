import java.util.Scanner;

public class DevolverCambioCentimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto a pagar : ");
        double montoPagar = scanner.nextDouble();

        System.out.println("Ingrese el monto recibido");
        double montoRecibido = scanner.nextDouble();

        boolean comprobandoPago = montoRecibido >= montoPagar;

        System.out.println(comprobandoPago ? "Su vuelto es: "
        + (montoRecibido - montoPagar)
        : "El monto recibido es insuficiente, debe pagar :"
        + montoPagar);

        int comprobacion = comprobandoPago ? 1 : 0;

        int devolver = (int) Math.round((montoRecibido-montoPagar) * 100) * comprobacion;

        int billete100 = devolver / 10000;
        devolver = devolver % 10000;
        System.out.println("billete de 100 :" + billete100);

        int billete50 = devolver / 5000;
        devolver = devolver % 5000;
        System.out.println("billete de 50 :" + billete50);

        int billete20 = devolver / 2000;
        devolver = devolver % 2000;
        System.out.println("billete de 20 :" + billete20);

        int billete10 = devolver / 1000;
        devolver = devolver % 1000;
        System.out.println("billete de 10 :" + billete10);

        int billete5 = devolver / 500;
        devolver = devolver % 500;
        System.out.println("billete de 5 :" + billete5);

        int moneda2 = devolver / 200;
        devolver = devolver % 200;
        System.out.println("moneda de 2 :" + moneda2);

        int moneda1 = devolver / 100;
        devolver = devolver % 100;
        System.out.println("moneda de 1 :" + moneda1);

        int moneda05 = devolver / 50;
        devolver = devolver % 50;
        System.out.println("moneda de 0.5 :" + moneda05);

        int moneda02 = devolver / 20;
        devolver = devolver % 20;
        System.out.println("moneda de 0.2 :" + moneda02);

        int moneda01 = devolver / 10;
        devolver = devolver % 10;
        System.out.println("moneda de 0.1 :" + moneda01);

        int moneda005 = devolver / 5;
        devolver = devolver % 5;
        System.out.println("moneda de 00.5 :" + moneda005);

        int moneda002 = devolver / 2;
        devolver = devolver % 2;
        System.out.println("moneda de 00.2 :" + moneda002);

        int moneda001 = devolver / 1;
        devolver = devolver % 1;
        System.out.println("moneda de 00.1 :" + moneda001);

    }

}
