public class ViajeMarco {

    public static void main(String[] args) {

        // ---- DATOS INICIALES ----
        double distancia = 350;   // km que separan a Marco de su madre
        int dia = 0;              // contador de días
        boolean encontrada = false;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        while (!encontrada) {
            dia = dia + 1;
            System.out.println("DIA " + dia);

            // ================= MARCO =================
            double velocidadMarco = aleatorio(10, 15); // km/h
            double horasMarco = aleatorio(8, 10);      // horas

            // --- El clima de Marco ---
            double dado = Math.random();               // número entre 0 y 1
            if (dado < 0.10) {                         // 10% lluvia fuerte
                System.out.println("¡Ha llovido muchísimo!");
                velocidadMarco = velocidadMarco * 0.25;   // se queda en el 25%
            } else if (dado < 0.40) {                  // 30% lluvia normal
                System.out.println("Ha llovido un poco");
                velocidadMarco = velocidadMarco * 0.75;   // pierde un 25%
            } else {                                   // 60% buen tiempo
                System.out.println("Ha hecho un buen día");
            }

            // --- El mono Amedio ---
            if (Math.random() < 0.25) {                // 25% se cansa
                System.out.println("¡Amedio se ha cansado y lo llevo en brazos!");
                velocidadMarco = velocidadMarco * 0.90;   // pierde un 10%
            }
            if (Math.random() < 0.15) {                // 15% se escapa
                System.out.println("¡He perdido tiempo buscando a Amedio!");
                horasMarco = horasMarco - aleatorio(1, 3); // pierde de 1 a 3 horas
            }

            double kmMarco = velocidadMarco * horasMarco;
            System.out.printf("Avance %.2f horas a %.2f Km/h recorriendo %.2f Km%n",
                    horasMarco, velocidadMarco, kmMarco);

            // ================= MADRE (Extensión 1) =================
            double velocidadMadre = aleatorio(6, 9);
            double horasMadre = aleatorio(6, 9);

            double dadoMadre = Math.random();
            if (dadoMadre < 0.10) {                    // 10% lluvia muy fuerte
                System.out.println("¡A mamá le ha llovido muchísimo!");
                velocidadMadre = velocidadMadre * 0.50;   // pierde un 50%
            } else if (dadoMadre < 0.40) {             // 30% lluvia
                System.out.println("A mamá le ha llovido un poco");
                velocidadMadre = velocidadMadre * 0.75;   // pierde un 25%
            } else {                                   // 60% buen tiempo
                System.out.println("A mamá le ha hecho un buen día");
            }

            double kmMadre = velocidadMadre * horasMadre;
            System.out.printf("Mamá pudo avanzar %.2f horas a %.2f Km/h recorriendo %.2f Km%n",
                    horasMadre, velocidadMadre, kmMadre);

            // ================= DISTANCIA =================
            // La madre se aleja y Marco se acerca
            distancia = distancia + kmMadre - kmMarco;

            // ================= Extensión 2 =================
            if (distancia > 0 && distancia < 50 && Math.random() < 0.50) {
                System.out.println("A Marco le dicen que han visto a su mamá, y rompe a correr!!!");
                distancia = distancia - 25;
            }

            // ================= ¿LA HA ENCONTRADO? =================
            if (distancia <= 0) {
                encontrada = true;
                System.out.println("**********************************************");
                System.out.println("Al final del día " + dia + " Marco encuentra a su madre!!!");
                System.out.println("**********************************************");
            } else {
                System.out.printf("Al final del día %d la distancia entre Marco y su Madre es de %.2f Km%n",
                        dia, distancia);
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
            }
        }
    }

    // Devuelve un número decimal al azar entre minimo y maximo
    static double aleatorio(double minimo, double maximo) {
        return minimo + Math.random() * (maximo - minimo);
    }
}