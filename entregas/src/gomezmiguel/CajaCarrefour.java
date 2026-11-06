public class CajaCarrefour {
    public static void main(String[] args) {
        final int TIEMPO_TOTAL_SERVICIO = 12 * 60;
        final double PROBABILIDAD_NUEVO_CLIENTE = 0.6;
        final int PACKS_MINIMOS = 5;
        final int PACKS_MAXIMOS = 15;

        double minutoActual = 0;
        int filaEsperando = 0;
        int clientesProcesados = 0;

        int lapsosSinEspera = 0;
        int totalProductosVendidos = 0;

        boolean operativo = true;
        boolean arriboCliente = false;

        int cajaCobro1 = 0;
        int cajaCobro2 = 0;
        int cajaCobro3 = 0;
        int cajaCobro4 = 0;

        do {
            minutoActual++;
            operativo = minutoActual < TIEMPO_TOTAL_SERVICIO;
            arriboCliente = Math.random() <= PROBABILIDAD_NUEVO_CLIENTE;
            
            if (arriboCliente) {
                filaEsperando = filaEsperando + 1;
            }

            if (filaEsperando > 0 && cajaCobro1 == 0) {
                cajaCobro1 = PACKS_MINIMOS + (int) (Math.random() * (PACKS_MAXIMOS - PACKS_MINIMOS + 1));
                filaEsperando = filaEsperando - 1;
            }
            if (filaEsperando > 0 && cajaCobro2 == 0) {
                cajaCobro2 = PACKS_MINIMOS + (int) (Math.random() * (PACKS_MAXIMOS - PACKS_MINIMOS + 1));
                filaEsperando = filaEsperando - 1;
            }
            if (filaEsperando > 0 && cajaCobro3 == 0) {
                cajaCobro3 = PACKS_MINIMOS + (int) (Math.random() * (PACKS_MAXIMOS - PACKS_MINIMOS + 1));
                filaEsperando = filaEsperando - 1;
            }
            if (filaEsperando > 0 && cajaCobro4 == 0) {
                cajaCobro4 = PACKS_MINIMOS + (int) (Math.random() * (PACKS_MAXIMOS - PACKS_MINIMOS + 1));
                filaEsperando = filaEsperando - 1;
            }
            if (filaEsperando == 0) {
                lapsosSinEspera = lapsosSinEspera + 1;
            }

            System.out.println("En la cola hay: " + filaEsperando + " clientes");
            System.out.println("Caja 1: [" + cajaCobro1 + "] | Caja 2: [" + cajaCobro2 + "] | Caja 3: [" + cajaCobro3 + "] | Caja 4: ["
                    + cajaCobro4 + "]");
            System.out.println("--------------------------------------------");

            if (cajaCobro1 > 0) {
                cajaCobro1 = cajaCobro1 - 1;
                totalProductosVendidos = totalProductosVendidos + 1;
                if (cajaCobro1 == 0) {
                    clientesProcesados = clientesProcesados + 1;
                }
            }
            if (cajaCobro2 > 0) {
                cajaCobro2 = cajaCobro2 - 1;
                totalProductosVendidos = totalProductosVendidos + 1;
                if (cajaCobro2 == 0) {
                    clientesProcesados = clientesProcesados + 1;
                }
            }
            if (cajaCobro3 > 0) {
                totalProductosVendidos = totalProductosVendidos + 1;
                cajaCobro3 = cajaCobro3 - 1;
                if (cajaCobro3 == 0) {
                    clientesProcesados = clientesProcesados + 1;
                }
            }
            if (cajaCobro4 > 0) {
                totalProductosVendidos = totalProductosVendidos + 1;
                cajaCobro4 = cajaCobro4 - 1;
                if (cajaCobro4 == 0) {
                    clientesProcesados = clientesProcesados + 1;
                }
            }

            System.out.println("Hoy se han atendido a : " + clientesProcesados + " clientes");
            System.out.println("Ha llegado algun cliente: " + (arriboCliente ? "SÍ" : "NO"));
            System.out.println("Personas que hay en la cola: " + filaEsperando);
            System.out.println("Minutos en los que no hubo cola: " + lapsosSinEspera);
            System.out.println("Artículos que se han vendido hoy: " + totalProductosVendidos);

        } while (operativo);

        System.out.println("======== RESUMEN DE LA JORNADA =====");
        System.out.println("Minutos sin ninguna persona en  la cola: " + lapsosSinEspera);
        System.out.println("Numero de personas en cola al finalizar el día: " + filaEsperando);
        System.out.println("Cantidad de personas atendidas durante el día: " + clientesProcesados);
        System.out.println("Numero de artículos vendidos hoy: " + totalProductosVendidos);
    }
}