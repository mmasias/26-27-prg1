
package evaluaciones.retos.lopezHector;

import java.util.Scanner; // 1. Importar la clase Scanner

public class Cajaregistradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MINUTOS_JORNADA = 12 * 60;
        final double PROBABILIDAD_DE_CLIENTE_NUEVO_COLA = 0.60;
        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        final int NUMERO_MINIMO_PACKS = 5;
        final int NUMERO_MAXIMO_PACKS = 15;
        int cola = 0;
        int atendidos = 0;
        int minutos_sin_cola = 0;
        int items_vendidos = 0;

        for (int minuto = 0; minuto < MINUTOS_JORNADA; minuto++) {
            if (Math.random() <= PROBABILIDAD_DE_CLIENTE_NUEVO_COLA) {
                cola = cola + 1;
            }
            if (caja1 == 0 && cola > 0) {
                caja1 = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1))
                        + NUMERO_MINIMO_PACKS;
                cola = cola - 1;
            }
            if (caja2 == 0 && cola > 0) {
                caja2 = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1))
                        + NUMERO_MINIMO_PACKS;
                cola = cola - 1;
            }
            if (caja3 == 0 && cola > 0) {
                caja3 = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1))
                        + NUMERO_MINIMO_PACKS;
                cola = cola - 1;
            }
            if (caja4 == 0 && cola > 0) {
                caja4 = (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1))
                        + NUMERO_MINIMO_PACKS;
                cola = cola - 1;
            }
            if (cola == 0) {
                minutos_sin_cola = minutos_sin_cola + 1;
            }

            System.out.println(" - En Cola: " + cola);
            System.out.println(
                    "Caja1:[" + caja1 + "] | Caja2:[" + caja2 + "] | Caja3:[" + caja3 + "] | Caja4:[" + caja4 + "]");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

            if (caja1 > 0) {
                caja1 = caja1 - 1;
                if (caja1 == 0) {
                    atendidos = atendidos + 1;
                    items_vendidos = items_vendidos
                            + (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1))
                            + NUMERO_MINIMO_PACKS;
                }
            }

            if (caja2 > 0) {
                caja2 = caja2 - 1;
                if (caja2 == 0) {
                    atendidos = atendidos + 1;
                    items_vendidos = items_vendidos
                            + (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1))
                            + NUMERO_MINIMO_PACKS;
                }
            }
            if (caja3 > 0) {
                caja3 = caja3 - 1;
                if (caja3 == 0) {
                    atendidos = atendidos + 1;
                    items_vendidos = items_vendidos
                            + (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1))
                            + NUMERO_MINIMO_PACKS;
                }
            }
            if (caja4 > 0) {
                caja4 = caja4 - 1;
                if (caja4 == 0) {
                    atendidos = atendidos + 1;
                    items_vendidos = items_vendidos
                            + (int) (Math.random() * (NUMERO_MAXIMO_PACKS - NUMERO_MINIMO_PACKS + 1))
                            + NUMERO_MINIMO_PACKS;
                }
            }
        }

        System.out.println("Clientes atendidos: " + atendidos);
        System.out.println("Minutos sin nadie en cola: " + minutos_sin_cola);
        System.out.println("Clientes en cola al finalizar el día: " + cola);
        System.out.println("Items vendidos: " + items_vendidos);

    }
}
