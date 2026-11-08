class RetoCCCF {
    public static void main(String[] args) {
        final int MINUTOS_JORNADA = 12 * 60;
        final double PROBABILIDAD_LLEGADA = 0.60;
        final int MINIMO_PACKS = 5;
        final int MAXIMO_PACKS = 15;
        final int COLA_PARA_REFUERZO = 15;
        final int MINIMO_ATENDIDAS_REFUERZO = 5;

        int cola = 0;
        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int caja5 = 0;

        boolean refuerzoAbierto = false;
        int atendidasRefuerzo = 0;

        int minutosSinCola = 0;
        int personasAtendidas = 0;
        int articulosVendidos = 0;

        for (int minuto = 1; minuto <= MINUTOS_JORNADA; minuto++) {
            boolean llegaPersona = Math.random() < PROBABILIDAD_LLEGADA;
            if (llegaPersona) {
                cola++;
            }

            if (caja1 == 0 && cola > 0) {
                caja1 = MINIMO_PACKS + (int) (Math.random() * (MAXIMO_PACKS - MINIMO_PACKS + 1));
                cola--;
            }
            if (caja2 == 0 && cola > 0) {
                caja2 = MINIMO_PACKS + (int) (Math.random() * (MAXIMO_PACKS - MINIMO_PACKS + 1));
                cola--;
            }
            if (caja3 == 0 && cola > 0) {
                caja3 = MINIMO_PACKS + (int) (Math.random() * (MAXIMO_PACKS - MINIMO_PACKS + 1));
                cola--;
            }
            if (caja4 == 0 && cola > 0) {
                caja4 = MINIMO_PACKS + (int) (Math.random() * (MAXIMO_PACKS - MINIMO_PACKS + 1));
                cola--;
            }

            if (!refuerzoAbierto && cola > COLA_PARA_REFUERZO) {
                refuerzoAbierto = true;
                atendidasRefuerzo = 0;
                System.out.println("Se abre la caja 5 de refuerzo");
            }
            if (refuerzoAbierto && caja5 == 0 && cola > 0) {
                caja5 = MINIMO_PACKS + (int) (Math.random() * (MAXIMO_PACKS - MINIMO_PACKS + 1));
                cola--;
            }

            if (caja1 > 0) {
                caja1--;
                articulosVendidos++;
                if (caja1 == 0) {
                    personasAtendidas++;
                }
            }
            if (caja2 > 0) {
                caja2--;
                articulosVendidos++;
                if (caja2 == 0) {
                    personasAtendidas++;
                }
            }
            if (caja3 > 0) {
                caja3--;
                articulosVendidos++;
                if (caja3 == 0) {
                    personasAtendidas++;
                }
            }
            if (caja4 > 0) {
                caja4--;
                articulosVendidos++;
                if (caja4 == 0) {
                    personasAtendidas++;
                }
            }

            if (caja5 > 0) {
                caja5--;
                articulosVendidos++;
                if (caja5 == 0) {
                    personasAtendidas++;
                    atendidasRefuerzo++;
                }
            }

            if (refuerzoAbierto && caja5 == 0 && atendidasRefuerzo >= MINIMO_ATENDIDAS_REFUERZO
                    && cola <= COLA_PARA_REFUERZO) {
                refuerzoAbierto = false;
                System.out.println("Se cierra la caja 5 de refuerzo");
            }

            if (cola == 0) {
                minutosSinCola++;
            }

            if (llegaPersona) {
                System.out.print("MINUTO " + minuto + " - Llega 1 persona");
            } else {
                System.out.print("MINUTO " + minuto + " - No llega nadie ");
            }
            System.out.println(" - En Cola: " + cola);
            System.out.print("Caja1:[" + caja1 + "] | Caja2:[" + caja2 + "] | Caja3:[" + caja3 + "] | Caja4:[" + caja4 + "]");
            if (refuerzoAbierto) {
                System.out.println(" | Caja5:[" + caja5 + "]");
            } else {
                System.out.println(" | Caja5:[--]");
            }
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }

        System.out.println("RESUMEN");
        System.out.println("============================================================");
        System.out.println("Minutos con cola en cero      : " + minutosSinCola);
        System.out.println("Personas en la cola al cierre : " + cola);
        System.out.println("Personas atendidas en el dia  : " + personasAtendidas);
        System.out.println("Articulos vendidos en el dia  : " + articulosVendidos);
        System.out.println("============================================================");
    }
}
