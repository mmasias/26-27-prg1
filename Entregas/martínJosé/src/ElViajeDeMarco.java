public class ElViajeDeMarco {
    public static void main(String[] args) {
        System.out.println("DIARIO DE MARCO Y AMEDIO");
        System.out.println("========================");
        double marcorrecorrido = 0;
        double mamarrecorrido = 350;
        int dia = 0;

        while (marcorrecorrido <= mamarrecorrido) {
            dia++;
            double velmama = (Math.random() * 3) + 6;
            double velmarco = (Math.random() * 5) + 10;
            double horashoymarco = (Math.random() * 2) + 8;
            double horashoymama = (Math.random() * 3) + 6;
            int pclimamarco = (int) (Math.random() * 100);
            int pclimamama = (int) (Math.random() * 100);
            String climamarco = "soleado";
            String climamama = "soleado";

            if (pclimamarco < 10) {
                climamarco = "lluvia fuerte";
                velmarco = velmarco * 0.75;
            } else if (pclimamarco < 40) {
                climamarco = "lluvia normal";
                velmarco = velmarco * 0.75; 
            }

            if (pclimamama < 30) {
                velmama = velmama * 0.75;
                climamama = "lluvia";
            } else if (pclimamama < 40) {
                velmama = velmama * 0.5; 
                climamama = "lluvia fuerte";
            }
            int pmono = (int) (Math.random() * 100);
            if (pmono < 15) {
                horashoymarco -= 2;
            }else if (pmono < 40) {
                    velmarco = velmarco * 0.9;
            }
            double marcorrecorridohoy = horashoymarco * velmarco;
            marcorrecorrido += marcorrecorridohoy;
            mamarrecorrido += horashoymama * velmama;
            double distancia = mamarrecorrido - marcorrecorrido;

            System.out.println("--- Día " + dia + " ---");
            System.out.println("Clima: " + climamarco);
            if (distancia < 50){
                int pinfo = (int) (Math.random() * 100);
                if (pinfo < 50){
                    System.out.println("Marco ha encontrado a alguien que ha visto a su madre y ha empezado a correr");
                    marcorrecorridohoy += 25;
                    distancia = mamarrecorrido - marcorrecorrido;
                }
            }
            System.out.println("Marco recorrió hoy: " +  marcorrecorridohoy + " km");
            System.out.println("Distancia total acumulada de Marco: " +  marcorrecorrido + " km");
            System.out.println("Mama ha tenido un clima " + climamama);
            System.out.println("Mama recorrio hoy: " + mamarrecorrido + " km");
            System.out.println("Distancia total acumulada de Mama: " +  mamarrecorrido + " km");
            System.out.println("Distancia hasta mama: " + distancia + " km");
            System.out.println("----------------------------------------");
        }
        System.out.println("FIN DEL VIAJE! Marco ha encontrado a su madre en el día " + dia);
    }
}