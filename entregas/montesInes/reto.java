import java.util.Scanner;

public class reto {
    public static void main(String[] args) {

        
        final int MINUTOS_ABIERTO = 12 * 60; 
        final double PROBABILIDAD_LLEGADA = 0.6;
        final int MIN_PAQUETES = 5;
        final int MAX_PAQUETES = 15;

        double tiempo = 0;
        int cola = 0;
        int atendido = 0;

        boolean estaAbierto = true;
        boolean clienteLLegado = false;

        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;



        do {
            
            tiempo ++;
            estaAbierto = tiempo < MINUTOS_ABIERTO;
            clienteLLegado = Math.random() <= PROBABILIDAD_LLEGADA;
            if (clienteLLegado) {
                cola = cola + 1;
            }

            if( cola > 0 && caja1 == 0){
               
                caja1 =  MIN_PAQUETES + (int)(Math.random() * (MAX_PAQUETES - MIN_PAQUETES + 1));
                cola = cola - 1;

            }  if( cola > 0 && caja2 == 0){
                
                caja2 =  MIN_PAQUETES + (int)(Math.random() * (MAX_PAQUETES - MIN_PAQUETES + 1));
                cola = cola - 1;

            }  if( cola > 0 && caja3 == 0){
                
                caja3 =  MIN_PAQUETES + (int)(Math.random() * (MAX_PAQUETES - MIN_PAQUETES + 1));
                cola = cola - 1;

            }  if( cola > 0 && caja4 == 0){
                
                caja4 =  MIN_PAQUETES + (int)(Math.random() * (MAX_PAQUETES - MIN_PAQUETES + 1));
                cola = cola - 1;
            }

            System.out.println("En la cola hay: " + cola + " clientes");
            System.out.println("Caja 1: ["+ caja1 +"] | Caja 2: ["+ caja2 +"] | Caja 3: ["+ caja3 +"] | Caja 4: ["+ caja4 +"]");
            System.out.println("--------------------------------------------");

            int personasEnCaja = (caja1 > 0 ? 1 : 0) + (caja2 > 0 ? 1 : 0) + (caja3 > 0 ? 1 : 0) + (caja4 > 0 ? 1 : 0);

            if (caja1 > 0) {
                caja1= caja1 - 1;
                if (caja1 == 0) {
                    atendido = atendido + 1;
                }
            }
            if (caja2 > 0) {
                caja2= caja2 - 1;
                if (caja2 == 0) {
                    atendido = atendido + 1;
                }
            }
            if (caja3 > 0) {
                caja3= caja3 - 1;
                if (caja3 == 0) {
                    atendido = atendido + 1;
                }
            }
            if (caja4 > 0) {
                caja4= caja4 - 1;
                if (caja4 == 0) {
                    atendido = atendido + 1;
                }
            }

            System.out.println("Se han atendido: " + atendido + " clientes");
            System.out.println("Llegada de cliente: " + (clienteLLegado ? "SÍ" : "NO"));
            System.out.println("Personas en la cola: " + cola);
        }while (estaAbierto);



    }
}
