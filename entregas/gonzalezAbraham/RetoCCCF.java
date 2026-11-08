class RetoCCCF {
    public static void main(String[] args) {
        final int MINUTOS_JORNADA = 12 * 60;
        final double PROBABILIDAD_LLEGADA = 0.60;

        int cola = 0;

        for (int minuto = 1; minuto <= MINUTOS_JORNADA; minuto++) {
            boolean llegaPersona = Math.random() < PROBABILIDAD_LLEGADA;
            if (llegaPersona) {
                cola++;
            }

            if (llegaPersona) {
                System.out.print("MINUTO " + minuto + " - Llega 1 persona");
            } else {
                System.out.print("MINUTO " + minuto + " - No llega nadie ");
            }
            System.out.println(" - En Cola: " + cola);
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }
}
