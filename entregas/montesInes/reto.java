import java.util.Scanner;

public class reto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        final int MINUTOS_ABIERTO = 12 * 60; 
        final double PROBABILIDAD_LLEGADA = 0.6;
        final int MIN_PAQUETES = 5;
        final int MAX_PAQUETES = 15;

        int tiempo;
        int cola;

        boolean estaAbierto = true;
        boolean clienteLLegado = false;

        int cantidadPaquetes1 =0;
        int cantidadPaquetes2 =0;
        int cantidadPaquetes3 =0;
        int cantidadPaquetes4 =0;

        do {
            
            tiempo ++;
            estaAbierto = tiempo < MINUTOS_ABIERTO;
            clienteLLegado = Math.random() < PROBABILIDAD_LLEGADA;

            if( cola > 0 && caja1 <= 0){
               
                cantidadPaquetes1 =  MIN_PAQUETES + (int)(Math.random() * (MAX_PAQUETES - MIN_PAQUETES + 1));
                cola --;

            } else if( cola > 0 && caja2 <= 0){
                
                cantidadPaquetes2 =  MIN_PAQUETES + (int)(Math.random() * (MAX_PAQUETES - MIN_PAQUETES + 1));
                caja2 = cantidadPaquetes2;
                cola --;

            } else if( cola > 0 && caja3 <= 0){
                
                cantidadPaquetes3 =  MIN_PAQUETES + (int)(Math.random() * (MAX_PAQUETES - MIN_PAQUETES + 1));
                caja3 = cantidadPaquetes3;
                cola --;

            } else if( cola > 0 && caja4 <= 0){
                
                cantidadPaquetes4 =  MIN_PAQUETES + (int)(Math.random() * (MAX_PAQUETES - MIN_PAQUETES + 1));
                caja4 = cantidadPaquetes4;
                cola --;
            }

             int personasEnCaja = (caja1 > 0 ? 1 : 0) + (caja2 > 0 ? 1 : 0) + (caja3 > 0 ? 1 : 0) + (caja4 > 0 ? 1 : 0);

        }while (estaAbierto);



        sc.close();

    }
}
