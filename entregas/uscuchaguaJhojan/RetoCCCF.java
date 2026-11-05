class RetoCCCF {
    public static void main(String[] args) {
        final int HORAS_TRABAJO = 12;
        final int MINUTOS_HORA = 60;
        final int TIEMPO_TOTAL = HORAS_TRABAJO * MINUTOS_HORA;
        final double PROBABILIDAD_LLEGADA_CLIENTE = 0.6;

        final int MIN_PACKS = 5;
        final int MAX_PACKS = 15;

        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;

        int itemsEnProcesoDeVenta1 = 0;
        int itemsEnProcesoDeVenta2 = 0;
        int itemsEnProcesoDeVenta3 = 0;
        int itemsEnProcesoDeVenta4 = 0;

        boolean cajaOcupada1 = false;
        boolean cajaOcupada2 = false;
        boolean cajaOcupada3 = false;
        boolean cajaOcupada4 = false;


        int cola = 0;
        int packs;
        int minutosSinCola = 0;
        int personasAtendidas = 0;
        int itemsVendidos = 0;

        for (int minuto = 1; minuto <= TIEMPO_TOTAL; minuto++) {
            String llegadaCliente;
            //Probabilidad de llegada de un cliente por minutos
            if (Math.random() < PROBABILIDAD_LLEGADA_CLIENTE) {
                cola++;
                llegadaCliente = "Llega 1 persona";
            } else {
                llegadaCliente = "No llega nadie";
            }
            
            //Crompobando cajas disponibles: iniciando proceso de atención al cliente por caja, ocupando las cajas, disminuyendo la cola
            boolean caja1Libre = caja1 == 0 && cola > 0;
            if (caja1Libre) {
                packs = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                caja1 = packs;
                itemsEnProcesoDeVenta1 = caja1;
                cajaOcupada1 = true;
                cola--;
            }

            boolean caja2Libre = caja2 == 0 && cola > 0;
            if (caja2Libre) {
                packs = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                caja2 = packs;
                itemsEnProcesoDeVenta2 = caja2;
                cajaOcupada2 = true;
                cola--;
            }

            boolean caja3Libre = caja3 == 0 && cola > 0;
            if (caja3Libre) {
                packs = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                caja3 = packs;
                itemsEnProcesoDeVenta3 = caja3;
                cajaOcupada3 = true;
                cola--;
            }

            boolean caja4Libre = caja4 == 0 && cola > 0;
            if (caja4Libre) {
                packs = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1)) + MIN_PACKS;
                caja4 = packs;
                itemsEnProcesoDeVenta4 = caja4;
                cajaOcupada4 = true;
                cola--;
            }

            //Comprobación de personas en cola en este instante, contando minutos cola
            if (minutosSinCola == 0) {
                minutosSinCola++;
            }

            //Atendiendo 1 pack por minuto en cada caja;
            if (caja1 > 0) {
                caja1--;
            }
            if (caja2 > 0) {
                caja2--;
            }
            if (caja3 > 0) {
                caja3--;
            }
            if (caja4 > 0) {
                caja4--;
            }

            //Comprobando la finalizacion de atención al cliente: contando personas atendidas, items vendidos y desocupando cajas
            boolean atencionCompletadaCaja1 = (caja1== 0 && cajaOcupada1);
            if (atencionCompletadaCaja1) {
                personasAtendidas++;
                itemsVendidos = itemsEnProcesoDeVenta1 + itemsVendidos;
                cajaOcupada1 = false;
            }

            boolean atencionCompletadaCaja2 = (caja2== 0 && cajaOcupada2);
            if (atencionCompletadaCaja2) {
                personasAtendidas++;
                itemsVendidos = itemsEnProcesoDeVenta2 + itemsVendidos;
                cajaOcupada2 = false;
            }

            boolean atencionCompletadaCaja3 = (caja3== 0 && cajaOcupada3);
            if (atencionCompletadaCaja3) {
                personasAtendidas++;
                itemsVendidos = itemsEnProcesoDeVenta3 + itemsVendidos;
                cajaOcupada3 = false;
            }

            boolean atencionCompletadaCaja4 = (caja4== 0 && cajaOcupada4);
            if (atencionCompletadaCaja4) {
                personasAtendidas++;
                itemsVendidos = itemsEnProcesoDeVenta4 + itemsVendidos;
                cajaOcupada4 = false;
            }

            //Mostrando minutos desde al apertura, si llego un cliente nuevo, personas en cola, y estado de las cajas(por cantidad de pack de items)
            System.out.println("Minuto " + minuto + " - " + llegadaCliente + " - En Cola: " + cola);
            System.out.println("Caja1:["+caja1+"]" + " | Caja2:["+caja2+"]" + " | Caja3:["+caja3+"]" + " | Caja4:["+caja4+"]");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        }

        System.out.println("RESUMEN");
        System.out.println("============================================================");
        System.out.println("Minutos con cola en cero  	  : " + minutosSinCola);
        System.out.println("Personas en la cola al cierre : " + cola);
        System.out.println("Personas atendidas en el dia  : " + personasAtendidas);
        System.out.println("Articulos vendidos en el dia  : " + itemsVendidos);
        System.out.println("============================================================");
    }
}