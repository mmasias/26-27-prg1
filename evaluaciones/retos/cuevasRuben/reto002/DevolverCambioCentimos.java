

class DevolverCambioCentimos {
    public static void main(String[] args) {
        double importe = 223.23;
        double entregado = 400.0;
        
        double cambio = entregado - importe;
        
        System.out.println("java Devolver Cambio");

        System.out.println("Cuantos Euros debe pagar? " + importe);
        System.out.println("Cuanto dinero entrega? " + entregado);

        System.out.println("El cambio es = " + cambio + "\n");

        int billetes100 = (int) cambio / 100;
        cambio = cambio - 100 * billetes100;
        int billetes50 = (int)cambio / 50;
        cambio = cambio - 50 * billetes50;
        int billetes20 = (int)cambio / 20;
        cambio = cambio - 20 * billetes20;
        int billetes10 = (int)cambio / 10;
        cambio = cambio - 10 * billetes10;
        int billetes5 = (int)cambio / 5;
        cambio = cambio - 5 * billetes5;
        int monedas2 = (int)cambio / 2;
        cambio = cambio - 2 * monedas2;
        int monedas1 = (int)cambio;
        cambio = cambio - 1 * monedas1;
        int cambioCents =  (int)(cambio*100);
        int monedas05 = cambioCents / 50;
        cambioCents = cambioCents - monedas05 * 50;
        int monedas02 = cambioCents / 20;
        cambioCents = cambioCents-monedas02 * 20;
        int monedas01 = cambioCents / 10;
        cambioCents = cambioCents-monedas01 * 10;
        int monedas005 = cambioCents / 5;
        cambioCents = cambioCents-monedas005 * 5;
        int monedas002 = cambioCents / 2;
        cambioCents = cambioCents-monedas002 * 2;
        

        System.out.println(billetes100 + " billete(s) de 100E");
        System.out.println(billetes50 + " billete(s) de 50E");
        System.out.println(billetes20 + " billete(s) de 20E");
        System.out.println(billetes10 + " billete(s) de 10E");
        System.out.println(billetes5 + " billete(s) de 5E");
        System.out.println(monedas2 + " moneda(s) de 2E");
        System.out.println(monedas1 + " moneda(s) de 1E");
        System.out.println(monedas05 + " moneda(s) de 50 cent");
        System.out.println(monedas02 + " moneda(s) de 20 cent");
        System.out.println(monedas01 + " moneda(s) de 10 cent");
        System.out.println(monedas005 + " moneda(s) de 5 cent");
        System.out.println(monedas002 + " moneda(s) de 2cent");
        System.out.println(cambioCents + " moneda(s) de 1cent");


    } 
}