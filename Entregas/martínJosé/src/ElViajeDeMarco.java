public class ElViajeDeMarco {
    public static void main(String[] args) {
        System.out.println("DIARIO DE MARCO Y AMEDIO");
        System.out.println("========================");
        double marcorrecorrido = 0;
        double mamarrecorrido = 350;
        int dia = 0;

        while (marcorrecorrido <= mamarrecorrido) {
            dia++;
            mamarrecorrido += 80;

            double vel = (Math.random() * 5) + 10;
            double horashoy = (Math.random() * 2) + 8;
            int pclima = (int) (Math.random() * 100);
            String clima = "soleado";
            if (pclima < 10) {
                clima = "lluvia fuerte";
                vel = vel * 0.75;
            } else if (pclima < 40) {
                clima = "lluvia normal";
                vel = vel * 0.75; 
            }

            int pmono = (int) (Math.random() * 100);
            if (pmono < 15) {
                horashoy -= 2;
            }else if (pmono < 40) {
                    vel = vel * 0.9;
            }
            double marcorrecorridohoy = horashoy * vel;
            marcorrecorrido += marcorrecorridohoy;
        }
    }
}