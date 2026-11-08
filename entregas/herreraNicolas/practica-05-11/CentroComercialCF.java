public class CentroComercialCF {

    public static void main(String[] args) {
        final int MINUTOS_JORNADA = 720;
        final double PROBABILIDAD_CLIENTE = 0.60;

        int cola = 0;

        // La jornada empieza a las 9:00 y termina a las 21:00.
        for (int minuto = 1; minuto <= MINUTOS_JORNADA; minuto++) {
            // Comprobamos si llega un cliente nuevo durante este minuto.
            boolean llegaCliente = Math.random() < PROBABILIDAD_CLIENTE;
            if (llegaCliente) {
                cola++;
            }

            System.out.print("MINUTO " + minuto);
            if (llegaCliente) {
                System.out.print(" - Llega 1 persona");
            } else {
                System.out.print(" - No llega nadie");
            }
            System.out.println(" - En cola: " + cola);
            System.out.println("------------------------------------------------------------");
        }
    }
}
