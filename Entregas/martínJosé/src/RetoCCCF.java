import java.util.Scanner;
class RetoCCCF{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        final int minpacks = 5;
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
        int packscaja5 = 0;
        boolean caja1 = true;
        boolean caja2 = true;
        boolean caja3 = true;
        boolean caja4 = true;
        boolean caja5 = false;
        boolean caja5auto = false;
        boolean caja6 = false;
        int packscaja6 = 0;

        System.out.println("Quieres ser administrador de las cajas? (true/false)");
        boolean admin = scanner.nextBoolean();
        int minadmin = 0;
        if (admin) {
            System.out.print("Introduzca desde que minuto quiere administrar las cajas (0-720): ");
            minadmin = scanner.nextInt();
        }
        while (mins < minstotal){
            if (admin && mins >= minadmin){
                System.out.println("Caja 1: " + caja1 + " | Caja 2: " + caja2 + " | Caja 3: " + caja3 + " | Caja 4: " + caja4 + " | Caja 5: " + caja5 + " | Caja 6: " + caja6);
                System.out.print("Quieres abrir o cerrar alguna caja? (true/false): ");
                boolean abrircerrar = scanner.nextBoolean();
                if (abrircerrar){
                    System.out.print("Que caja quieres abrir/cerrar? (1-6): ");
                    int cajaseleccionada = scanner.nextInt();
                    switch (cajaseleccionada){
                        case 1:
                            caja1 = !caja1;
                            break;
                        case 2:
                            caja2 = !caja2;
                            break;
                        case 3:
                            caja3 = !caja3;
                            break;
                        case 4:
                            caja4 = !caja4;
                            break;
                        case 5:
                            caja5 = !caja5;
                            caja5auto = false;
                            break;
                        case 6:
                            caja6 = !caja6;
                            break;
                    }
                }
            }
            int pcliente = (int) (Math.random() * 100);
            boolean llegada = false;
            if (pcliente < phaycliente){
                clientessinatender++;
                clientesfinal++;
                llegada = true;
            }

           
            if (clientessinatender > 15 && !caja5){ 
                caja5 = true;
                caja5auto = true;
                clientescaja5 = 0;
            }
            if (clientessinatender > 0 && packscaja5 == 0 && caja5){
                packscaja5 = (int) (Math.random() * (maxpacks - minpacks + 1) + minpacks);
                clientessinatender--;
                clientescaja5++;
                packsfinal += packscaja5;
            }else if (packscaja5 > 0){
                packscaja5--;
            }
            if (caja5auto && packscaja5 == 0 && clientescaja5 >= 5 && clientessinatender <= 15){
                caja5 = false;
                caja5auto = false;
            }

            if (clientessinatender > 0 && packscaja1 == 0 && caja1){
                packscaja1 = (int) (Math.random() * (maxpacks - minpacks + 1) + minpacks);
                clientessinatender--;
                packsfinal += packscaja1;
            }else if (packscaja1 > 0){
                packscaja1--;
            }
            if (clientessinatender > 0 && packscaja2 == 0 && caja2){
                packscaja2 = (int) (Math.random() * (maxpacks - minpacks + 1) + minpacks);
                clientessinatender--;
                packsfinal += packscaja2;
            }else if (packscaja2 > 0){
                packscaja2--;
            }
            if (clientessinatender > 0 && packscaja3 == 0 && caja3){
                packscaja3 = (int) (Math.random() * (maxpacks - minpacks + 1) + minpacks);
                clientessinatender--;
                packsfinal += packscaja3;
            }else if (packscaja3 > 0){
                packscaja3--;
            }
            if (clientessinatender > 0 && packscaja4 == 0 && caja4){
                packscaja4 = (int) (Math.random() * (maxpacks - minpacks + 1) + minpacks);
                clientessinatender--;
                packsfinal += packscaja4;
            }else if (packscaja4 > 0){
                packscaja4--;
            }
            if (clientessinatender > 0 && packscaja6 == 0 && caja6){
                packscaja6 = (int) (Math.random() * (maxpacks - minpacks + 1) + minpacks);
                clientessinatender--;
                packsfinal += packscaja6;
            }else if (packscaja6 > 0){
                packscaja6--;
            }
            if (clientessinatender == 0){
                minsnocola++;
            }
            mins++;
            String Mensajellegada;
            if (llegada){
                Mensajellegada = " | llega 1 persona | ";
            }else{
                Mensajellegada = " | No llega nadie | ";
            }
            System.out.println("Minuto: " + mins + " " + Mensajellegada + " En cola " + clientessinatender);
            System.out.println("Packs: Caja 1: " + packscaja1 + " | Caja 2: " + packscaja2 + " | Caja 3: " + packscaja3 + " | Caja 4: " + packscaja4 + " | Caja 5: " + packscaja5 + " | Caja 6: " + packscaja6);
        }
        System.out.println("============ Resumen ============");
        System.out.println("Minutos sin cola: " + minsnocola);
        System.out.println("Clientes en la cola en el cierre: " + clientessinatender);
        System.out.println("Clientes atendidos hoy: " + (clientesfinal - clientessinatender));
        System.out.println("Articulos vendidos hoy: " + packsfinal);
    }
}