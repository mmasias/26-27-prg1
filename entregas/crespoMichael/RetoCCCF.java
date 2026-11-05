package entregas.crespoMichael;
import java.util.Random;


public class RetoCCCF {

    public static void main(String[] args) {
        Random random = new Random();

        int apertura = 9 * 60;      
        int cierre = 21 * 60;       
        double probLlegada = 0.60;  
        int minPacks = 5;
        int maxPacks = 15;

        int llegados = 0;           
        int siguiente = 1;          
        int atendidos = 0;          


        int cliente1 = 0, restante1 = 0;
        int cliente2 = 0, restante2 = 0;
        int cliente3 = 0, restante3 = 0;
        int cliente4 = 0, restante4 = 0;

        int minuto = apertura;

        while (minuto < cierre || llegados >= siguiente
                || restante1 > 0 || restante2 > 0 || restante3 > 0 || restante4 > 0) {

            System.out.println("==== " + hora(minuto) + " ====");

            if (minuto < cierre && random.nextDouble() < probLlegada) {
                llegados++;
                System.out.println("Llega el cliente #" + llegados);
            } else {
                System.out.println("No llega nadie nuevo");
            }

            if (restante1 == 0 && siguiente <= llegados) {
                cliente1 = siguiente;
                restante1 = minPacks + random.nextInt(maxPacks - minPacks + 1);
                siguiente++;
                System.out.println("El cliente #" + cliente1 + " pasa a la caja 1 con " + restante1 + " packs");
            }
            if (restante2 == 0 && siguiente <= llegados) {
                cliente2 = siguiente;
                restante2 = minPacks + random.nextInt(maxPacks - minPacks + 1);
                siguiente++;
                System.out.println("El cliente #" + cliente2 + " pasa a la caja 2 con " + restante2 + " packs");
            }
            if (restante3 == 0 && siguiente <= llegados) {
                cliente3 = siguiente;
                restante3 = minPacks + random.nextInt(maxPacks - minPacks + 1);
                siguiente++;
                System.out.println("El cliente #" + cliente3 + " pasa a la caja 3 con " + restante3 + " packs");
            }
            if (restante4 == 0 && siguiente <= llegados) {
                cliente4 = siguiente;
                restante4 = minPacks + random.nextInt(maxPacks - minPacks + 1);
                siguiente++;
                System.out.println("El cliente #" + cliente4 + " pasa a la caja 4 con " + restante4 + " packs");
            }

            int enCola = llegados - (siguiente - 1);
            System.out.println("Personas en cola: " + enCola);
            mostrarCaja(1, cliente1, restante1);
            mostrarCaja(2, cliente2, restante2);
            mostrarCaja(3, cliente3, restante3);
            mostrarCaja(4, cliente4, restante4);

            
            if (restante1 > 0) {
                restante1--;
                if (restante1 == 0) {
                    System.out.println("  La caja 1 termina con el cliente #" + cliente1);
                    atendidos++;
                }
            }
            if (restante2 > 0) {
                restante2--;
                if (restante2 == 0) {
                    System.out.println("  La caja 2 termina con el cliente #" + cliente2);
                    atendidos++;
                }
            }
            if (restante3 > 0) {
                restante3--;
                if (restante3 == 0) {
                    System.out.println("  La caja 3 termina con el cliente #" + cliente3);
                    atendidos++;
                }
            }
            if (restante4 > 0) {
                restante4--;
                if (restante4 == 0) {
                    System.out.println("  La caja 4 termina con el cliente #" + cliente4);
                    atendidos++;
                }
            }

            minuto++;
            System.out.println();
        }

        System.out.println("===== RESUMEN =====");
        System.out.println("Clientes llegados:  " + llegados);
        System.out.println("Clientes atendidos: " + atendidos);
        System.out.println("Fin de la simulación a las " + hora(minuto));
    }

    static String hora(int minutos) {
        int h = minutos / 60;
        int m = minutos % 60;
        return String.format("%02d:%02d", h, m);
    }

    
    static void mostrarCaja(int numero, int cliente, int restante) {
        if (restante == 0) {
            System.out.println("  Caja " + numero + ": LIBRE");
        } else {
            System.out.println("  Caja " + numero + ": atendiendo al cliente #" + cliente
                    + " (le quedan " + restante + " min)");
        }
    }
}