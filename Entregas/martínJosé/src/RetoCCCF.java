class RetoCCCF{
    public static void main (String[]args){
        final int minpacks = 10;
        final int maxpacks = 15;
        final int minstotal = 720;
        int mins = 0;
        int clientessinatender = 0;
        int packscaja1 = 0;
        int packscaja2 = 0;
        int packscaja3 = 0;
        int packscaja4 = 0;
        final int phaycliente = 60;
        int minsnocola = 0;
        int clientesfinal = 0;
        int packsfinal = 0;
        int clientescaja5 = 0;
        int packscaja5;
        while (mins < minstotal){
            int pcliente = (int) (Math.random() * 100);
            boolean llegada = false;
            if (pcliente < phaycliente){
                clientessinatender++;
                clientesfinal++;
                llegada = true;
            }else if (clientessinatender == 0){
                minsnocola++;
            }
            if (clientessinatender < 15 || (clientescaja5 < 15 && clientescaja5 != 0)){
                packscaja5 = (int) (Math.random() * (maxpacks - minpacks) + minpacks);
                clientessinatender--;
                clientescaja5++;
                packsfinal += packscaja5;
            }
            if (clientessinatender > 0 && packscaja1 == 0){
                packscaja1 = (int) (Math.random() * (maxpacks - minpacks) + minpacks);
                clientessinatender--;
                packsfinal += packscaja1;
            }else if (packscaja1 > 0){
                packscaja1--;
            }
            if (clientessinatender > 0 && packscaja2 == 0){
                packscaja2 = (int) (Math.random() * (maxpacks - minpacks) + minpacks);
                clientessinatender--;
                packsfinal += packscaja2;
            }else if (packscaja2 > 0){
                packscaja2--;
            }  
            if (clientessinatender > 0 && packscaja3 == 0){
                packscaja3 = (int) (Math.random() * (maxpacks - minpacks) + minpacks);
                clientessinatender--;
                packsfinal += packscaja3;
            }else if (packscaja3 > 0){
                packscaja3--;
            }
            if (clientessinatender > 0 && packscaja4 == 0){
                packscaja4 = (int) (Math.random() * (maxpacks - minpacks) + minpacks);
                clientessinatender--;
                packsfinal += packscaja4;
            }else if (packscaja4 > 0){
                packscaja4--;
            }
            mins++;
            String Mensajellegada;
            if (llegada){
                Mensajellegada = " | llega 1 persona | ";
            }else{
                Mensajellegada = " | No llega nadie | ";
            }
            System.out.println("Minuto: " + mins + " " + Mensajellegada + " En cola " + clientessinatender);
            System.out.println("Packs: Caja 1: " + packscaja1 + " | Caja 2: " + packscaja2 + " | Caja 3: " + packscaja3 + " | Caja 4: " + packscaja4);
        }
        System.out.println("============ Resumen ============");
        System.out.println("Minutos sin cola: " + minsnocola);
        System.out.println("Clientes en la cola en el cierre: " + clientessinatender);
        System.out.println("Clientes atendidos hoy: " + (clientesfinal - clientessinatender));
        System.out.println("Articulos vendidos hoy: " + packsfinal);
    }
}