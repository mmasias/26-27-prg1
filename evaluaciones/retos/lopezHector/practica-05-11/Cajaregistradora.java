import java.util.Scanner; // 1. Importar la clase Scanner

public class Cajaregistradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MINUTOS_JORNADA = 12 * 60;
        final double PROBABILIDAD_LLEGADA_CLIENTE = 0.60;
        int caja1clientes = 0;   
        int caja2_clientes = 0;
        int caja3_clientes = 0;
        int caja4_clientes = 0;
        final int NUMERO_MINIMO_PACKS = 5;
        final int NUMERO_MAXIMO_PACKS = 15;
        int cola = 0;
        int atendidos = 0;
        
        for (int minuto=0; minuto < MINUTOS_JORNADA ;minuto++) {

            if (Math.random() <= PROBABILIDAD_LLEGADA_CLIENTE){
                System.out.print("MINUTO " + (minuto + 1) + " - Llega 1 persona");
                cola = cola+1;
            } else {
                System.out.print("MINUTO " + (minuto + 1) + " - No llega nadie");
            }
                
            if (caja1clientes == 0 && cola > 0){
                caja1clientes = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1)) + NUMERO_MINIMO_PACKS;
                cola=cola-1;
            }
             if (caja2_clientes == 0 && cola >0){
                caja2_clientes = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1)) + NUMERO_MINIMO_PACKS;
                cola=cola-1;
            }
             if (caja3_clientes == 0 && cola >0){
                caja3_clientes = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1)) + NUMERO_MINIMO_PACKS;
                cola=cola-1;
            }
            if (caja4_clientes == 0 && cola >0){
                caja4_clientes = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1)) + NUMERO_MINIMO_PACKS;
                cola=cola-1;
            }

             // 3. Completar la línea y mostrar las cajas
            System.out.println(" - En Cola: " + cola);
            System.out.println("Caja1:[" + caja1clientes + "] | Caja2:[" + caja2_clientes + "] | Caja3:[" + caja3_clientes + "] | Caja4:[" + caja4_clientes + "]");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

           if (caja1clientes > 0) {
                caja1clientes--;
                if (caja1clientes == 0) {
                    atendidos++;
                }
            }
            if (caja2_clientes > 0) {
                caja2_clientes--;
                if (caja2_clientes == 0) {
                    atendidos++;
                }
            }
            if (caja3_clientes > 0) {
                caja3_clientes--;
                if (caja3_clientes == 0) {
                    atendidos++;
                }
            }
            if (caja4_clientes > 0) {
                caja4_clientes--;
                if (caja4_clientes == 0) {
                    atendidos++;
                }
            }
        }
        
        System.out.println(" clientes atendidos " + atendidos);
        System.out.println(" clientes en cloa " + cola);
    }
}