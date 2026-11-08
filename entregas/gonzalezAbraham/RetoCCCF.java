import java.util.Scanner;

class RetoCCCF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int MINUTOS_JORNADA = 12 * 60;
        final double PROBABILIDAD_LLEGADA = 0.60;
        final int MINIMO_PACKS = 5;
        final int MAXIMO_PACKS = 15;
        final int COLA_PARA_REFUERZO = 15;
        final int MINIMO_ATENDIDAS_REFUERZO = 5;
        final int MINUTOS_ENTRE_REVISIONES = 60;

        int cola = 0;
        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int caja5 = 0;
        int caja6 = 0;

        boolean encendida1 = true;
        boolean encendida2 = true;
        boolean encendida3 = true;
        boolean encendida4 = true;
        boolean encendida5 = false;
        boolean encendida6 = false;

        boolean refuerzoAbierto = false;
        int atendidasRefuerzo = 0;

        int minutosSinCola = 0;
        int personasAtendidas = 0;
        int articulosVendidos = 0;

        System.out.println("¿Entrar como superadministrador? (1 = sí, 0 = no)");
        boolean esSuperadministrador = entrada.nextInt() == 1;

        for (int minuto = 1; minuto <= MINUTOS_JORNADA; minuto++) {
            if (esSuperadministrador && minuto % MINUTOS_ENTRE_REVISIONES == 1) {
                int opcion = -1;
                while (opcion != 0) {
                    System.out.println("SUPERADMINISTRADOR - Minuto " + minuto);
                    System.out.println("Encendidas -> 1:" + encendida1 + " 2:" + encendida2 + " 3:" + encendida3
                            + " 4:" + encendida4 + " 5:" + (encendida5 || refuerzoAbierto) + " 6:" + encendida6);
                    System.out.println("¿Qué caja quiere encender o apagar? (1 a 6, 0 para continuar)");
                    opcion = entrada.nextInt();

                    if (opcion == 1) {
                        encendida1 = !encendida1;
                    } else if (opcion == 2) {
                        encendida2 = !encendida2;
                    } else if (opcion == 3) {
                        encendida3 = !encendida3;
                    } else if (opcion == 4) {
                        encendida4 = !encendida4;
                    } else if (opcion == 5) {
                        if (encendida5 || refuerzoAbierto) {
                            encendida5 = false;
                            refuerzoAbierto = false;
                        } else {
                            encendida5 = true;
                        }
                    } else if (opcion == 6) {
                        encendida6 = !encendida6;
                    } else if (opcion != 0) {
                        System.out.println("Opción no válida");
                    }
                }
            }

            boolean llegaPersona = Math.random() < PROBABILIDAD_LLEGADA;
            if (llegaPersona) {
                cola++;
            }

            if (encendida1 && caja1 == 0 && cola > 0) {
                caja1 = MINIMO_PACKS + (int) (Math.random() * (MAXIMO_PACKS - MINIMO_PACKS + 1));
                cola--;
            }
            if (encendida2 && caja2 == 0 && cola > 0) {
                caja2 = MINIMO_PACKS + (int) (Math.random() * (MAXIMO_PACKS - MINIMO_PACKS + 1));
                cola--;
            }
            if (encendida3 && caja3 == 0 && cola > 0) {
                caja3 = MINIMO_PACKS + (int) (Math.random() * (MAXIMO_PACKS - MINIMO_PACKS + 1));
                cola--;
            }
            if (encendida4 && caja4 == 0 && cola > 0) {
                caja4 = MINIMO_PACKS + (int) (Math.random() * (MAXIMO_PACKS - MINIMO_PACKS + 1));
                cola--;
            }

            if (!refuerzoAbierto && !encendida5 && cola > COLA_PARA_REFUERZO) {
                refuerzoAbierto = true;
                atendidasRefuerzo = 0;
                System.out.println("Se abre la caja 5 de refuerzo");
            }
            if ((refuerzoAbierto || encendida5) && caja5 == 0 && cola > 0) {
                caja5 = MINIMO_PACKS + (int) (Math.random() * (MAXIMO_PACKS - MINIMO_PACKS + 1));
                cola--;
            }
            if (encendida6 && caja6 == 0 && cola > 0) {
                caja6 = MINIMO_PACKS + (int) (Math.random() * (MAXIMO_PACKS - MINIMO_PACKS + 1));
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

            if (caja6 > 0) {
                caja6--;
                articulosVendidos++;
                if (caja6 == 0) {
                    personasAtendidas++;
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
            if (encendida1 || caja1 > 0) {
                System.out.print("Caja1:[" + caja1 + "]");
            } else {
                System.out.print("Caja1:[--]");
            }
            if (encendida2 || caja2 > 0) {
                System.out.print(" | Caja2:[" + caja2 + "]");
            } else {
                System.out.print(" | Caja2:[--]");
            }
            if (encendida3 || caja3 > 0) {
                System.out.print(" | Caja3:[" + caja3 + "]");
            } else {
                System.out.print(" | Caja3:[--]");
            }
            if (encendida4 || caja4 > 0) {
                System.out.print(" | Caja4:[" + caja4 + "]");
            } else {
                System.out.print(" | Caja4:[--]");
            }
            if (encendida5 || refuerzoAbierto || caja5 > 0) {
                System.out.print(" | Caja5:[" + caja5 + "]");
            } else {
                System.out.print(" | Caja5:[--]");
            }
            if (encendida6 || caja6 > 0) {
                System.out.print(" | Caja6:[" + caja6 + "]");
            } else {
                System.out.print(" | Caja6:[--]");
            }
            System.out.println();
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
