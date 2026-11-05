public class pyCCCF {
    public static void main(String[] args) {


        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int packs = 5 + (int) (Math.random() * 11);

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
                caja1 = packs;
                clientes_en_cola--;
            }
            if (caja2 == 0 && clientes_en_cola > 0) {
                caja2 = packs;
                clientes_en_cola--;
            }
            if (caja3 == 0 && clientes_en_cola > 0) {
                caja3 = packs;
                clientes_en_cola--;
            }
            if (caja4 == 0 && clientes_en_cola > 0) {
                caja4 = packs;
                clientes_en_cola--;
            }
