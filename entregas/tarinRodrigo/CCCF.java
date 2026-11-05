class ClaseJava {
    public static void CCCF (String[] args) {
        final int HORAS_JORNADA = 12;
        final int MINUTOS_POR_HORA = 60;
        final double PROBABILIDAD_LLEGADA = 0.60;

        int cola = 0;
        int minutosJornada = HORAS_JORNADA * MINUTOS_POR_HORA;

        for (int minuto = 1; minuto <= minutosJornada; minuto++) {
            boolean llegaPersona = Math.random() < PROBABILIDAD_LLEGADA;

            if (llegaPersona) {
                cola++;
                System.out.println("MINUTO " + minuto + " - Llega 1 persona - En Cola: " + cola);
            } else {
                System.out.println("MINUTO " + minuto + " - No llega nadie  - En Cola: " + cola);
            }

            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }
}