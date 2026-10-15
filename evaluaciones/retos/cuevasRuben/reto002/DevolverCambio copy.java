

class DevolverCambio {
    public static void main(String[] args) {
        int importe = 223;
        int entregado = 200;

        int cambio = entregado - importe;
        
        System.out.println("java Devolver Cambio");

        System.out.println("Cuantos Euros debe pagar? " + importe);
        System.out.println("Cuanto dinero entrega? " + entregado);

        System.out.println("El cambio es = " + cambio + "\n");

        int billetes100 = cambio / 100;
        cambio = cambio - 100 * billetes100;
        int billetes50 = cambio / 50;
        cambio = cambio - 50 * billetes50;
        int billetes20 = cambio / 20;
        cambio = cambio - 20 * billetes20;
        int billetes10 = cambio / 10;
        cambio = cambio - 10 * billetes10;
        int billetes5 = cambio / 5;
        cambio = cambio - 5 * billetes5;
        int monedas2 = cambio / 2;
        cambio = cambio - 2 * monedas2;

        System.out.println(billetes100 + " billete(s) de 100E");
        System.out.println(billetes50 + " billete(s) de 50E");
        System.out.println(billetes20 + " billete(s) de 20E");
        System.out.println(billetes10 + " billete(s) de 10E");
        System.out.println(billetes5 + " billete(s) de 5E");
        System.out.println(monedas2 + " moneda(s) de 2E");
        System.out.println(cambio + " moneda(s) de 1E");
    }
}