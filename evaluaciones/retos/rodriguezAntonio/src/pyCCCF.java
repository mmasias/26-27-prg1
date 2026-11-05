public class pyCCCF {
    public static void main(String[] args) {

        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int packs1 = 5 + (int) (Math.random() * (15 - 5 + 1)); 

        int clientes_en_cola = 0;
        int minuto = 1;

        do {

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

            if (caja1 == 0 && clientes_en_cola > 0) {
                caja1 = packs1;
                clientes_en_cola--;
            }
            if (caja2 == 0 && clientes_en_cola > 0) {
                caja2 = packs1;
                clientes_en_cola--;
            }
            if (caja3 == 0 && clientes_en_cola > 0) {
                caja3 = packs1;
                clientes_en_cola--;
            }
            if (caja4 == 0 && clientes_en_cola > 0) {
                caja4 = packs1;
                clientes_en_cola--;
            }

            String mensajeLlegada;
            if (Math.random() < 0.60) {
                mensajeLlegada = "Llega 1 persona";
                int packs = 5 + (int) (Math.random() * (15 - 5 + 1));
                if (caja1 == 0) {
                    caja1 = packs;
                } else if (caja2 == 0) {
                    caja2 = packs;
                } else if (caja3 == 0) {
                    caja3 = packs;
                } else if (caja4 == 0) {
                    caja4 = packs;
                } else {
                    clientes_en_cola++;
                }
            } else {
                mensajeLlegada = "No llega nadie";
            }

            System.out.println("MINUTO " + minuto + " - " + mensajeLlegada + " - En Cola: " + clientes_en_cola);
            System.out.println(
                    "Caja1:[" + caja1 + "] | Caja2:[" + caja2 + "] | Caja3:[" + caja3 + "] | Caja4:[" + caja4 + "]");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

            minuto++;

        } while (minuto <= 720);
    }
}