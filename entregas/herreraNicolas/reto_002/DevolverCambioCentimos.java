// Agrupando la clase actual al paquete que estaremos trabajando, solo en dado caso que sea neceasrio
package entregas.herreraNicolas.reto_002;

// Importando la funcion de java Scanner
import java.util.Scanner;

public class DevolverCambioCentimos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variable a cobrar al usuario
        double CostoTotal;

        // Variable con la que paga el usuario
        double PagoTotal; 

        // Variable del cambio que se le devuelve al usuario
        double Cambio;

        // Preguntandole al usuario cual es el coste total a cobrar
        System.out.println("Introduce el costo total a cobrar:");
        CostoTotal = scanner.nextDouble();

        // Preguntandole al usuario cual cual es el pago total a pagar
        System.out.println("Introduce el total con el paga el usuario:");
        PagoTotal = scanner.nextDouble();

        // Creando la logica para la condicion de que el Pago Total tiene que ser mayor al Costo Total

        boolean PagoSuficiente = PagoTotal >= CostoTotal;

        String mensaje = PagoSuficiente 
            ? "Pago correcto!, calculando su cambio..."
            : "OJO! NO TE ALCANZA PARA PAGAR?, el pago tiene que ser mayor que el costo total.";
        System.out.println(mensaje);

        // Creando la logica para dar el cambio al usuario con el cambio disponbile que contiene la maquina
        Cambio = PagoTotal - CostoTotal;

        // Guardamos la variable del cambio con los decimales
        double CambioConDecimal = Cambio;

        System.out.println();
        System.out.println("Su cambio es: " + Cambio);
        System.out.println();
        System.out.println("Y en billetes seria:");
        System.out.println();

        int CambioBillete100 = (int) Cambio / 100;
        Cambio = Cambio - (CambioBillete100*100);
        System.out.println(CambioBillete100 + " billete(s) de 100 €");



        int CambioBillete50 = (int) Cambio / 50;
        Cambio = Cambio - (CambioBillete50*50);
        System.out.println(CambioBillete50 + " billete(s) de 50 €");


        int CambioBillete20 = (int) Cambio / 20;
        Cambio = Cambio - (CambioBillete20*20);
        System.out.println(CambioBillete20 + " billete(s) de 20 €");


        int CambioBillete10 = (int) Cambio / 10;
        Cambio = Cambio - (CambioBillete10*10);
        System.out.println(CambioBillete10 + " billete(s) de 10 €");


        int CambioBillete5 = (int) Cambio / 5;
        Cambio = Cambio - (CambioBillete5*5);
        System.out.println(CambioBillete5 + " billete(s) de 5 €");

        int CambioMoneda2 = (int) Cambio / 2;
        Cambio = Cambio - (CambioMoneda2*2);
        System.out.println(CambioMoneda2 + " moneda(s) de 2 €");


        int CambioMoneda1 = (int) Cambio / 1;
        Cambio = Cambio - (CambioMoneda1*1);
        System.out.println(CambioMoneda1 + " moneda(s) de 1 €");

        // Aplicando ahora la logica para devolver en cambio de centimos

        int CambioCentimos = (int) Math.round((CambioConDecimal - (int) CambioConDecimal) * 100);
        
        System.out.println();
        System.out.println("Y ahora el cambio restante de centimos: " + CambioCentimos);
        System.out.println();

        int CambioCentimos50 = (int) CambioCentimos / 50;
        CambioCentimos = CambioCentimos - (CambioCentimos50*50);
        System.out.println(CambioCentimos50 + " centimo(s) de 50");

        int CambioCentimos20 = (int) CambioCentimos / 20;
        CambioCentimos = CambioCentimos - (CambioCentimos20*20);
        System.out.println(CambioCentimos20 + " centimo(s) de 20");

        int CambioCentimos10 = (int) CambioCentimos / 10;
        CambioCentimos = CambioCentimos - (CambioCentimos10*10);
        System.out.println(CambioCentimos10 + " centimo(s) de 10");

        int CambioCentimos5 = (int) CambioCentimos / 5;
        CambioCentimos = CambioCentimos - (CambioCentimos5*5);
        System.out.println(CambioCentimos5 + " centimo(s) de 5");

        int CambioCentimos2 = (int) CambioCentimos / 2;
        CambioCentimos = CambioCentimos - (CambioCentimos2*2);
        System.out.println(CambioCentimos2 + " centimo(s) de 2");

        int CambioCentimos1 = (int) CambioCentimos / 1;
        CambioCentimos = CambioCentimos - (CambioCentimos1*1);
        System.out.println(CambioCentimos1 + " centimo(s) de 1");
    }
}
