package evaluaciones.retos.lopezHector;

import java.util.Scanner;

public class Cajaregistradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MINUTOS_JORNADA = 12 * 60;
        final double PROBABILIDAD_DE_CLIENTE_NUEVO_COLA = 0.60;
        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int caja5 = 0;
        int caja6 = 0;
        final int NUMERO_MINIMO_PACKS = 5;
        final int NUMERO_MAXIMO_PACKS = 15;
        int cola = 0;
        int atendidos = 0;
        int minutos_sin_cola = 0;
        int items_vendidos = 0;

        boolean caja1_encendida = true;
        boolean caja2_encendida = true;
        boolean caja3_encendida = true;
        boolean caja4_encendida = true;
        boolean caja5_encendida = false;
        boolean caja6_encendida = false;

        final int LIMITE_COLA_REFUERZO = 15;
        final int MINIMO_ATENDIDOS_REFUERZO = 5;
        boolean refuerzo_activo = false;
        int caja_refuerzo = 0;
        int atendidos_refuerzo = 0;

        final int CLAVE_SUPERADMIN = 1234;
        boolean es_superadmin = false;
        System.out.print("¿Entrar como superadministrador? (1 = sí, 0 = no): ");
        int respuesta = scanner.nextInt();
        if (respuesta == 1) {
            System.out.print("Introduce la clave: ");
            int clave = scanner.nextInt();
            if (clave == CLAVE_SUPERADMIN) {
                es_superadmin = true;
            } else {
                System.out.println("Clave incorrecta. Se usa la configuración por defecto.");
            }
        }

        for (int minuto = 0; minuto < MINUTOS_JORNADA; minuto++) {

            if (Math.random() <= PROBABILIDAD_DE_CLIENTE_NUEVO_COLA) {
                System.out.print("MINUTO " + (minuto + 1) + " - Llega 1 persona");
                cola = cola + 1;
            } else {
                System.out.print("MINUTO " + (minuto + 1) + " - No llega nadie");
            }

            if (!refuerzo_activo && cola > LIMITE_COLA_REFUERZO) {
                refuerzo_activo = true;
                atendidos_refuerzo = 0;
            }

            if (caja1_encendida && caja1 == 0 && cola > 0) {
                caja1 = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1))
                        + NUMERO_MINIMO_PACKS;
                cola = cola - 1;
            }
            if (caja2_encendida && caja2 == 0 && cola > 0) {
                caja2 = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1))
                        + NUMERO_MINIMO_PACKS;
                cola = cola - 1;
            }
            if (caja3_encendida && caja3 == 0 && cola > 0) {
                caja3 = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1))
                        + NUMERO_MINIMO_PACKS;
                cola = cola - 1;
            }
            if (caja4_encendida && caja4 == 0 && cola > 0) {
                caja4 = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1))
                        + NUMERO_MINIMO_PACKS;
                cola = cola - 1;
            }
            if (caja5_encendida && caja5 == 0 && cola > 0) {
                caja5 = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1))
                        + NUMERO_MINIMO_PACKS;
                cola = cola - 1;
            }
            if (caja6_encendida && caja6 == 0 && cola > 0) {
                caja6 = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1))
                        + NUMERO_MINIMO_PACKS;
                cola = cola - 1;
            }
            if (refuerzo_activo && caja_refuerzo == 0 && cola > 0) {
                caja_refuerzo = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1))
                        + NUMERO_MINIMO_PACKS;
                cola = cola - 1;
            }
            if (cola == 0) {
                minutos_sin_cola = minutos_sin_cola + 1;
            }

            System.out.println(" - En Cola: " + cola);
            System.out.println("Caja1:[" + caja1 + "] | Caja2:[" + caja2 + "] | Caja3:[" + caja3 + "] | Caja4:["
                    + caja4 + "] | Caja5:[" + caja5 + "] | Caja6:[" + caja6 + "]");
            if (refuerzo_activo) {
                System.out.println("Refuerzo:[" + caja_refuerzo + "] (atendidos: " + atendidos_refuerzo + ")");
            }
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

            if (es_superadmin) {
                System.out.print("Caja a encender/apagar (1-6, 0 = ninguna): ");
                int caja_elegida = scanner.nextInt();
                if (caja_elegida == 1) {
                    caja1_encendida = !caja1_encendida;
                    System.out.println("Caja 1 encendida: " + caja1_encendida);
                }
                if (caja_elegida == 2) {
                    caja2_encendida = !caja2_encendida;
                    System.out.println("Caja 2 encendida: " + caja2_encendida);
                }
                if (caja_elegida == 3) {
                    caja3_encendida = !caja3_encendida;
                    System.out.println("Caja 3 encendida: " + caja3_encendida);
                }
                if (caja_elegida == 4) {
                    caja4_encendida = !caja4_encendida;
                    System.out.println("Caja 4 encendida: " + caja4_encendida);
                }
                if (caja_elegida == 5) {
                    caja5_encendida = !caja5_encendida;
                    System.out.println("Caja 5 encendida: " + caja5_encendida);
                }
                if (caja_elegida == 6) {
                    caja6_encendida = !caja6_encendida;
                    System.out.println("Caja 6 encendida: " + caja6_encendida);
                }
            }

            if (caja1 > 0) {
                caja1 = caja1 - 1;
                items_vendidos = items_vendidos + 1;
                if (caja1 == 0) {
                    atendidos = atendidos + 1;
                }
            }
            if (caja2 > 0) {
                caja2 = caja2 - 1;
                items_vendidos = items_vendidos + 1;
                if (caja2 == 0) {
                    atendidos = atendidos + 1;
                }
            }
            if (caja3 > 0) {
                caja3 = caja3 - 1;
                items_vendidos = items_vendidos + 1;
                if (caja3 == 0) {
                    atendidos = atendidos + 1;
                }
            }
            if (caja4 > 0) {
                caja4 = caja4 - 1;
                items_vendidos = items_vendidos + 1;
                if (caja4 == 0) {
                    atendidos = atendidos + 1;
                }
            }
            if (caja5 > 0) {
                caja5 = caja5 - 1;
                items_vendidos = items_vendidos + 1;
                if (caja5 == 0) {
                    atendidos = atendidos + 1;
                }
            }
            if (caja6 > 0) {
                caja6 = caja6 - 1;
                items_vendidos = items_vendidos + 1;
                if (caja6 == 0) {
                    atendidos = atendidos + 1;
                }
            }
            if (caja_refuerzo > 0) {
                caja_refuerzo = caja_refuerzo - 1;
                items_vendidos = items_vendidos + 1;
                if (caja_refuerzo == 0) {
                    atendidos = atendidos + 1;
                    atendidos_refuerzo = atendidos_refuerzo + 1;
                }
            }

            if (refuerzo_activo && caja_refuerzo == 0 && atendidos_refuerzo >= MINIMO_ATENDIDOS_REFUERZO
                    && cola <= LIMITE_COLA_REFUERZO) {
                refuerzo_activo = false;
            }
        }

        System.out.println("Clientes atendidos: " + atendidos);
        System.out.println("Minutos sin nadie en cola: " + minutos_sin_cola);
        System.out.println("Clientes en cola al finalizar el día: " + cola);
        System.out.println("Items vendidos: " + items_vendidos);

        scanner.close();
    }
}