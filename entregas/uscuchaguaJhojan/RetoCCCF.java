public class RetoCCCF {
    public static void main(String[] args) {
        final int HORAS_TRABAJO = 12;
        final int MINUTOS_HORA = 60;
        final int TIEMPO_TOTAL = HORAS_TRABAJO * MINUTOS_HORA;
        final double PROBABILIDAD_LLEGADA_CLIENTE = 0.6;

        final int MIN_PACKS = 5;
        final int MAX_PACKS = 15;

        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;

        int cola = 0;
        int packs;

        for (int minuto = 1; minuto <= TIEMPO_TOTAL; minuto++) {
            String llegadaCliente;

            if (Math.random() < PROBABILIDAD_LLEGADA_CLIENTE) {
                cola++;
                llegadaCliente = "Llega 1 persona";
            } else {
                llegadaCliente = "No llega nadie";
            }
            


            boolean caja1Libre = caja1 == 0 && cola > 0;
            if (caja1Libre) {
                packs = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                caja1 = packs;
                cola--;
            }

            boolean caja2Libre = caja2 == 0 && cola > 0;
            if (caja2Libre) {
                packs = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                caja2 = packs;
                cola--;
            }

            boolean caja3Libre = caja3 == 0 && cola > 0;
            if (caja3Libre) {
                packs = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                caja3 = packs;
                cola--;
            }

            boolean caja4Libre = caja4 == 0 && cola > 0;
            if (caja4Libre) {
                packs = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                caja4 = packs;
                cola--;
            }

            if (caja1 > 0) {
                caja1--;
            }
            if (caja2 > 0) {
                caja2--;
            }
            if (caja3 > 0) {
                caja3--;
            }
            if (caja4 > 0) {
                caja4--;
            }

            System.out.println("Minuto " + minuto + " - " + llegadaCliente + " - En Cola: " + cola);
            System.out.println("Caja1:["+caja1+"]" + " | Caja2:["+caja2+"]" + " | Caja3:["+caja3+"]" + " | Caja4:["+caja4+"]");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        }
    }
}