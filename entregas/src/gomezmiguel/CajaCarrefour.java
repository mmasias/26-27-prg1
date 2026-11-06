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

        } while (operativo);
    }
}