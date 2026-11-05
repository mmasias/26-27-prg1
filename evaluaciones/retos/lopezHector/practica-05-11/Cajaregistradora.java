import java.util.Scanner; // 1. Importar la clase Scanner

public class Cajaregistradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MINUTOS_JORNADA = 12 * 60;
        final int PROBABILIDAD_LLEGADA_CLIENTE = 0.60;
        final int CAJA1_CLIENTES = 0;   
        final int CAJA2_CLIENTES = 0;
        final int CAJA3_CLIENTES = 0;
        final int CAJA4_CLIENTES = 0;
        final int NUMERO_MINIMO_PACKS = 5;
        final int NUMERO_MAXIMO_PACKS = 15;
        int cola = 0;
        int atendidos = 0;
        
       for (minuto=0; <=MINUTOS_JORNADA;minuto++) {

            if (Math.random() <= PROBABILIDAD_LLEGADA_CLIENTE){
                System.out.print("MINUTO " + (minuto + 1) + " - Llega 1 persona");
                cola = cola+1;
            } else {
                System.out.print("MINUTO " + (minuto + 1) + " - No llega nadie");
            }
                
            }
            if (CAJA1_CLIENTES = 0 && cola >0){
                CAJA1_CLIENTES = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1)) + NUMERO_MINIMO_PACKS;
                cola=cola-1;
            }
             if (CAJA2_CLIENTES = 0 && cola >0){
                CAJA2_CLIENTES = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1)) + NUMERO_MINIMO_PACKS;
                cola=cola-1;
            }
             if (CAJA3_CLIENTES = 0 && cola >0){
                CAJA3_CLIENTES = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1)) + NUMERO_MINIMO_PACKS;
                cola=cola-1;
            }
            if (CAJA4_CLIENTES = 0 && cola >0){
                CAJA4_CLIENTES = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1)) + NUMERO_MINIMO_PACKS;
                cola=cola-1;
            }

             // 3. Completar la línea y mostrar las cajas
            System.out.println(" - En Cola: " + cola);
            System.out.println("Caja1:[" + caja1 + "] | Caja2:[" + caja2 + "] | Caja3:[" + caja3 + "] | Caja4:[" + caja4 + "]");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

           if (CAJA1_CLIENTES > 0) {
                CAJA1_CLIENTES--;
                if (CAJA1_CLIENTES == 0) {
                    atendidos++;
                }
            }
            if (CAJA2_CLIENTES > 0) {
                CAJA2_CLIENTES--;
                if (CAJA2_CLIENTES == 0) {
                    atendidos++;
                }
            }
            if (CAJA3_CLIENTES > 0) {
                CAJA3_CLIENTES--;
                if (CAJA3_CLIENTES == 0) {
                    atendidos++;
                }
            }
            if (CAJA4_CLIENTES > 0) {
                Caja4--;
                if (CAJA4_CLIENTES == 0) {
                    atendidos++;
                }
            }
        }

            System.out.println("clientes atendidos" + atendidos);
            System.out.println("clientes en cloa" + cola);
    }
}