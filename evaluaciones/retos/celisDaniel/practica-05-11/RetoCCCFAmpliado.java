public class RetoCCCFAmpliado {
    public static void main(String[] args) {
        
        int personasEnCola = 0;
        int[] cajas = new int[6];
        int cajasActivas = 4;
        int atendidosCajaExtra = 0;
        
        int minutosColaVacia = 0;
        int personasAtendidas = 0;
        int itemsVendidos = 0;

        for (int minuto = 1; minuto <= 720; minuto++) {
            System.out.println("MINUTO: " + minuto);

            
            if (Math.random() <= 0.40) {
                personasEnCola++;
                System.out.println("Llega una persona a la cola. Personas en cola: " + personasEnCola);
            } else {
                System.out.println("Nadie ha llegado a la cola.");
            }

            
            if (personasEnCola > 15 && cajasActivas == 4) {
                cajasActivas = 5;
                atendidosCajaExtra = 0;
                System.out.println(">>> SUPERADMIN: Cola alta (" + personasEnCola + "). Encendiendo Caja 5.");
            }

            
            for (int i = 0; i < cajasActivas; i++) {
                if (cajas[i] == 0 && personasEnCola > 0) {
                    personasEnCola--;
                    
                    int packs = (int) (Math.random() * 11) + 5;
                    cajas[i] = packs;
                    
                    personasAtendidas++;
                    itemsVendidos = itemsVendidos + packs;
                    
                    
                    if (i == 4) {
                        atendidosCajaExtra++;
                    }
                    
                    System.out.println("Caja " + (i + 1) + " atiende a una persona con " + packs + " items.");
                }

                if (cajas[i] > 0) {
                    cajas[i]--;
                    System.out.println("Caja " + (i + 1) + " atendiendo. Le quedan " + cajas[i] + " items.");
                } else {
                    System.out.println("Caja " + (i + 1) + " está libre.");
                }
            }

        
            if (cajasActivas == 5 && atendidosCajaExtra >= 5 && personasEnCola <= 15) {
                cajasActivas = 4;
                System.out.println(">>> SUPERADMIN: Cola normalizada. Apagando Caja 5.");
            }

            if (personasEnCola == 0) {
                minutosColaVacia++;
            }
            
            System.out.println("Fin de la cola este minuto: " + personasEnCola + "\n");
        }

        //- RESUMEN FINAL -       
        System.out.println("Minutos cola vacía: " + minutosColaVacia);
        System.out.println("Personas en cola al final: " + personasEnCola);
        System.out.println("Personas atendidas: " + personasAtendidas);
        System.out.println("Items vendidos: " +itemsVendidos);
    }
}