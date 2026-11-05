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

        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;

        boolean estaAbierto = true;
        boolean clienteLLegado = false;

        int cantidadPaquetes = MIN_PAQUETES + (int)(Math.random() * (MAX_PAQUETES - MIN_PAQUETES + 1));

        do {
            
            
            tiempo ++;
            estaAbierto = tiempo < MINUTOS_ABIERTO;
            clienteLLegado = false;

            if( cola > 0 && caja1 <= 0){
               
                caja1 = cantidadPaquetes;
                cola --;

            } else if( cola > 0 && caja2 <= 0){
                
                caja2 = cantidadPaquetes;
                cola --;

            } else if( cola > 0 && caja3 <= 0){
                
                caja3 = cantidadPaquetes;
                cola --;

            } else if( cola > 0 && caja4 <= 0){
                
                caja4 = cantidadPaquetes;
                cola --;
            }



        }while (estaAbierto);



        sc.close();

    }
}
