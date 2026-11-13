class JuegoHerradura{
    public static void main(String[] args){
        boolean fin = false;
        int turno = 0;
        String ptramo = "[Tramo 1]";
        String stramo = "[Tramo 2]";
        String ttramo = "[Tramo 3]";
        int npuntos = 0;
        int apuntos = 0; 
        while (fin == false){
            turno++;
            System.out.print("\nLanzamiento N." + turno);
            int pnaneh = (int) (Math.random() * 100);
            if (pnaneh < 10){
                System.out.print(ttramo);
                npuntos = npuntos + 1;
            } else if (10 > pnaneh && pnaneh > 22) {
                System.out.print(stramo);
                npuntos = npuntos + 3;
            }else if (pnaneh > 22) {
                System.out.print(ptramo);
                npuntos = npuntos + 5;
            }

            System.out.print("Armand:");
            int parmand = (int) (Math.random() * 10);
            if (parmand < 10){
                System.out.print(ttramo);
                apuntos = apuntos + 1;
            } else if (10 > parmand && parmand > 22) {
                System.out.print(stramo);
                apuntos = apuntos + 3;
            }else if (parmand > 22) {
                System.out.print(ptramo);
                apuntos = apuntos + 5;
            }
            if (npuntos > 50){
                fin = true;
                System.out.println("\nEl juego ha finalizado, Naneh ha ganado.");
            }else if (apuntos > 60){
                fin = true;
                System.out.println("El juego ha finalizado, ha gandado Armand.");
            }

        }
    System.out.println("la puntuacion final ha sido: Naneh: " + npuntos + " Armand: " + apuntos);        
    }
}