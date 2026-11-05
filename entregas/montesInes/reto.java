import java.util.Scanner;

public class reto {
    public static void main(String[] args) {

        final int MINUTOS_ABIERTO = 12 * 60;
        final double PROBABILIDAD_LLEGADA = 0.6;
        final int MIN_PAQUETES = 5;
        final int MAX_PAQUETES = 15;
        final int ATENDIDOS_MINIMO_EXTRA = 5;

        double tiempo = 0;
        int cola = 0;
        int atendido = 0;

        int minutosSinCola = 0;
        int articulosVendidos = 0;

        boolean estaAbierto = true;
        boolean clienteLLegado = false;
        

        final int LIMITE_COLA = 15;

        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;

        int cajaExtra = 0;
        boolean extraAbierta = false;
        int atendidosCajaExtra = 0;

        do {

            tiempo++;
            estaAbierto = tiempo < MINUTOS_ABIERTO;
            clienteLLegado = Math.random() <= PROBABILIDAD_LLEGADA;
            if (clienteLLegado) {
                cola = cola + 1;
            }
            if (cola > LIMITE_COLA && extraAbierta == false) {

                extraAbierta = true;
                atendidosCajaExtra = 0;
                System.out.println("Se abre la caja extra porque hay más gente en la cola de la que debería, (cola > "
                        + LIMITE_COLA + ")");
            }
            if (cola > 0 && caja1 == 0) {

                caja1 = MIN_PAQUETES + (int) (Math.random() * (MAX_PAQUETES - MIN_PAQUETES + 1));
                cola = cola - 1;

            }
            if (cola > 0 && caja2 == 0) {

                caja2 = MIN_PAQUETES + (int) (Math.random() * (MAX_PAQUETES - MIN_PAQUETES + 1));
                cola = cola - 1;

            }
            if (cola > 0 && caja3 == 0) {

                caja3 = MIN_PAQUETES + (int) (Math.random() * (MAX_PAQUETES - MIN_PAQUETES + 1));
                cola = cola - 1;

            }
            if (cola > 0 && caja4 == 0) {

                caja4 = MIN_PAQUETES + (int) (Math.random() * (MAX_PAQUETES - MIN_PAQUETES + 1));
                cola = cola - 1;
            }
            if (cola > 0 && extraAbierta && cajaExtra == 0) {
                cajaExtra = MIN_PAQUETES + (int) (Math.random() * (MAX_PAQUETES - MIN_PAQUETES + 1));
                cola = cola - 1;
            }
            if (cola == 0) {
                minutosSinCola = minutosSinCola + 1;
            }

            System.out.println("En la cola hay: " + cola + " clientes");
            System.out.println("Caja 1: [" + caja1 + "] | Caja 2: [" + caja2 + "] | Caja 3: [" + caja3 + "] | Caja 4: ["
                    + caja4 + "] | Caja Extra: [" + cajaExtra + "]");
            System.out.println("--------------------------------------------");

            int personasEnCaja = (caja1 > 0 ? 1 : 0) + (caja2 > 0 ? 1 : 0) + (caja3 > 0 ? 1 : 0) + (caja4 > 0 ? 1 : 0)
                    + (cajaExtra > 0 ? 1 : 0);

            if (caja1 > 0) {
                caja1 = caja1 - 1;
                articulosVendidos = articulosVendidos + 1;
                if (caja1 == 0) {
                    atendido = atendido + 1;
                }
            }
            if (caja2 > 0) {
                caja2 = caja2 - 1;
                articulosVendidos = articulosVendidos + 1;
                if (caja2 == 0) {
                    atendido = atendido + 1;
                }
            }
            if (caja3 > 0) {
                articulosVendidos = articulosVendidos + 1;
                caja3 = caja3 - 1;
                if (caja3 == 0) {
                    atendido = atendido + 1;
                }
            }
            if (caja4 > 0) {
                articulosVendidos = articulosVendidos + 1;
                caja4 = caja4 - 1;
                if (caja4 == 0) {
                    atendido = atendido + 1;
                }
            }
            if (cajaExtra > 0) {
                cajaExtra = cajaExtra - 1;
                articulosVendidos = articulosVendidos + 1;
                if (cajaExtra == 0) {
                    atendido = atendido + 1;
                    atendidosCajaExtra = atendidosCajaExtra + 1;
                }
            }
            if (extraAbierta && cajaExtra == 0 && atendidosCajaExtra >= ATENDIDOS_MINIMO_EXTRA && cola <= LIMITE_COLA) {
                extraAbierta = false;
                System.out.println("Se cierra caja extra, ya no hace falta");
            }

            System.out.println("Hoy se han atendido a : " + atendido + " clientes");
            System.out.println("Ha llegado algun cliente: " + (clienteLLegado ? "SÍ" : "NO"));
            System.out.println("Personas que hay en la cola: " + cola);
            System.out.println("Minutos en los que no hubo cola: " + minutosSinCola);
            System.out.println("Artículos que se han vendido hoy: " + articulosVendidos);
            System.out.println("Personas atendidas en la caja extra: " + atendidosCajaExtra);

        } while (estaAbierto);

        System.out.println("======== RESUMEN DE LA JORNADA =====");
        System.out.println("Minutos sin ninguna persona en  la cola: " + minutosSinCola);
        System.out.println("Numero de personas en cola al finalizar el día: " + cola);
        System.out.println("Cantidad de personas atendidas durante el día: " + atendido);
        System.out.println("Numero de artículos vendidos hoy: " + articulosVendidos);

    }
}
