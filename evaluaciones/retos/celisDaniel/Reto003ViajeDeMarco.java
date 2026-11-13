public class Reto003ViajeDeMarco {
    public static void main(String[] args) {
        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");
        
        double distancia = 350.0;
        int dia = 1;
        
        while (distancia > 0) {
            System.out.println("DIA " + dia);
            
            // --- MARCO ---
            double velM = 10 + (Math.random() * 5); // Entre 10 y 15
            double tiempoM = 8 + (Math.random() * 2); // Entre 8 y 10
            
            // Clima Marco
            double probClimaM = Math.random();
            if (probClimaM < 0.10) {
                System.out.println("¡Ha llovido muchísimo!");
                velM *= 0.25; // Se reduce AL 25%
            } else if (probClimaM < 0.40) {
                System.out.println("Ha llovido un poco");
                velM *= 0.75; // Se reduce EN un 25%
            } else {
                System.out.println("Ha hecho un buen día");
            }
                
            // Amedio
            if (Math.random() < 0.15) {
                System.out.println("¡He perdido tiempo buscando a Amedio!");
                tiempoM -= 2;
            }
                
            if (Math.random() < 0.25) {
                System.out.println("¡Amedio se ha cansado y he tenido que llevarlo en brazos!");
                velM *= 0.90; // Se reduce en un 10%
            }
                
            double avanceM = velM * tiempoM;
            System.out.printf("Avance %.2f horas a %.2f Km/h recorriendo %.2f Km\n", tiempoM, velM, avanceM);
            
            // --- MADRE (Extensión 1) ---
            double velMadre = 6 + (Math.random() * 3); // Entre 6 y 9
            double tiempoMadre = 6 + (Math.random() * 3); // Entre 6 y 9
            
            // Clima Madre
            double probClimaMadre = Math.random();
            if (probClimaMadre < 0.10) {
                System.out.println("A mamá le ha llovido muchísimo");
                velMadre *= 0.50; // Se reduce en un 50%
            } else if (probClimaMadre < 0.40) {
                System.out.println("A mamá le ha llovido un poco");
                velMadre *= 0.75; // Se reduce en un 25%
            } else {
                System.out.println("A mamá le ha hecho un buen día");
            }
                
            double avanceMadre = velMadre * tiempoMadre;
            System.out.printf("Mama pudo avanzar %.2f horas a %.2f Km/h recorriendo %.2f Km\n", tiempoMadre, velMadre, avanceMadre);
            
            // --- CÁLCULO DE DISTANCIA ---
            distancia = distancia + avanceMadre - avanceM;
            
            // --- ENCUENTRO / PISTA (Extensión 2) ---
            if (distancia > 0 && distancia < 50) {
                if (Math.random() < 0.50) {
                    System.out.println("A Marco le dicen que han visto a su mamá, y rompe a correr!!!");
                    distancia -= 25; // Corre 25 km adicionales
                }
            }
            
            // --- RESULTADO DEL DÍA ---
            if (distancia <= 0) {
                System.out.println("************************************************************");
                System.out.println("Al final del día " + dia + " Marco encuentra a su madre!!!");
                System.out.println("************************************************************");
                break;
            } else {
                System.out.printf("Al final del día %d la distancia entre Marco y su Madre es de %.2f Km\n", dia, distancia);
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            }
                
            dia++;
        }
    }
}