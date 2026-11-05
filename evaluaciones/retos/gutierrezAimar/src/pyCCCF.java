import java.util.Scanner;

public class pyCCCF {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        final double HORA_APERTURA = 9.0;
        final double HORA_CIERRE = 21.0;
        final double MINUTO = 1.0 / 60.0;
        double horaActual = HORA_APERTURA;
        boolean estaAbierto = true; 

        int cola = 0;
        final double PROBABILIDAD_LLEGADA = 0.6;

        int caja1 = 0, caja2 = 0, caja3 = 0, caja4 = 0;
        final int ITEMS_MINIMO = 5;
        final int ITEMS_MAXIMO = 15;
        boolean haLlegado;

        final int MINUTOS_POR_HORA = 60;
        final int PRIMER_NUMERO_DOS_CIFRAS = 10;
        int minutosSinCola = 0;
        int personasAtendidas = 0;
        int itemsVendidios = 0;

        do {
            horaActual = horaActual + MINUTO;
            estaAbierto = horaActual < HORA_CIERRE;
            haLlegado = false;
            if (Math.random() < PROBABILIDAD_LLEGADA) {
                cola++;
                haLlegado = true;
            }
            
            if (cola > 0 && caja1 <= 0) {
                cola--;
                caja1 = crearItems(ITEMS_MAXIMO, ITEMS_MINIMO);
            }
            if (cola > 0 && caja2 <= 0) {
                cola--;
                caja2 = crearItems(ITEMS_MAXIMO, ITEMS_MINIMO);
            }
            if (cola > 0 && caja3 <= 0) {
                cola--;
                caja3 = crearItems(ITEMS_MAXIMO, ITEMS_MINIMO);
            }
            if (cola > 0 && caja4 <= 0) {
                cola--;
                caja4 = crearItems(ITEMS_MAXIMO, ITEMS_MINIMO);
            }
            if (caja1 > 0) {
                caja1--;
                itemsVendidios++;
                if (caja1 == 0) {
                    personasAtendidas++;
                }
            }
            if (caja2 > 0) {
                caja2--;
                itemsVendidios++;
                if (caja2 == 0) {
                    personasAtendidas++;
                }
            }
            if (caja3 > 0) {
                caja3--;
                itemsVendidios++;
                if (caja3 == 0) {
                    personasAtendidas++;
                }
            }
            if (caja4 > 0) {
                caja4--;
                itemsVendidios++;
                if (caja4 == 0) {
                    personasAtendidas++;
                }
            }
            if  (cola == 0) {
                minutosSinCola++;
            }
             int minutosTotales = (int) Math.round(horaActual * MINUTOS_POR_HORA);
             int hora = minutosTotales / MINUTOS_POR_HORA;
             int minuto = minutosTotales % MINUTOS_POR_HORA;
             String textoMinuto = minuto < PRIMER_NUMERO_DOS_CIFRAS ? "0" + minuto : "" + minuto;
             String textoLlegada = haLlegado ? "Llega 1 persona" : "No llega nadie ";

             System.out.println(hora + ":" + textoMinuto + " | " + textoLlegada + " | Cola: " + cola + " | Caja1: " + caja1 + " | Caja2: " + caja2 + " | Caja3: " + caja3 + " | Caja4: " + caja4);
             scanner.nextLine();

        } while (estaAbierto);
         
        System.out.println();
        System.out.println ("==== RESUMEN DE LA JORNADA ====");
        System.out.println ("Minutos sin nadie en cola: " + minutosSinCola);
        System.out.println ("Personas en cola al cerrar: " + cola);
        System.out.println ("Personas atendidas: " + personasAtendidas);
        System.out.println ("Items vendidos: " + itemsVendidios);
        scanner.close();

    }
    static int crearItems(int maximo, int minimo) {
        return (int) (Math.random() * (maximo - minimo + 1)) + minimo;
    }
}