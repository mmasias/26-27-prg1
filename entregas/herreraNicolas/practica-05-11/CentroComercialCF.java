public class CentroComercialCF {

    public static void main(String[] args) {
        final int MINUTOS_JORNADA = 720;
        final double PROBABILIDAD_CLIENTE = 0.60;
        final int PACKS_MINIMOS = 5;
        final int PACKS_MAXIMOS = 15;

        int cola = 0;
        int packsCaja1 = 0;
        int packsCaja2 = 0;
        int packsCaja3 = 0;
        int packsCaja4 = 0;

        // La jornada empieza a las 9:00 y termina a las 21:00.
        for (int minuto = 1; minuto <= MINUTOS_JORNADA; minuto++) {
            // Cada cliente que ya estaba en caja procesa un pack por minuto.
            if (packsCaja1 > 0) {
                packsCaja1--;
            }
            if (packsCaja2 > 0) {
                packsCaja2--;
            }
            if (packsCaja3 > 0) {
                packsCaja3--;
            }
            if (packsCaja4 > 0) {
                packsCaja4--;
            }

            // Comprobamos si llega un cliente nuevo durante este minuto.
            boolean llegaCliente = Math.random() < PROBABILIDAD_CLIENTE;
            if (llegaCliente) {
                cola++;
            }

            // Las cajas libres reciben clientes por orden de numero de caja.
            if (packsCaja1 == 0 && cola > 0) {
                packsCaja1 = PACKS_MINIMOS + (int) (Math.random() * (PACKS_MAXIMOS - PACKS_MINIMOS + 1));
                cola--;
            }
            if (packsCaja2 == 0 && cola > 0) {
                packsCaja2 = PACKS_MINIMOS + (int) (Math.random() * (PACKS_MAXIMOS - PACKS_MINIMOS + 1));
                cola--;
            }
            if (packsCaja3 == 0 && cola > 0) {
                packsCaja3 = PACKS_MINIMOS + (int) (Math.random() * (PACKS_MAXIMOS - PACKS_MINIMOS + 1));
                cola--;
            }
            if (packsCaja4 == 0 && cola > 0) {
                packsCaja4 = PACKS_MINIMOS + (int) (Math.random() * (PACKS_MAXIMOS - PACKS_MINIMOS + 1));
                cola--;
            }

            System.out.print("MINUTO " + minuto);
            if (llegaCliente) {
                System.out.print(" - Llega 1 persona");
            } else {
                System.out.print(" - No llega nadie");
            }
            System.out.println(" - En cola: " + cola);
            System.out.print("Caja1:[" + packsCaja1 + "]");
            System.out.print(" | Caja2:[" + packsCaja2 + "]");
            System.out.print(" | Caja3:[" + packsCaja3 + "]");
            System.out.print(" | Caja4:[" + packsCaja4 + "]");
            System.out.println();
            System.out.println("------------------------------------------------------------");
        }
    }
}
