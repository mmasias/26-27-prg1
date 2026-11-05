package evaluaciones.retos.cuevasRuben.reto003;

public class Cccf {
    public static void main(String[] args) {
        int minutosCola0 = 0;
        int clientesAtendidos = 0;
        int articulosVendidos = 0;

        int enCola = 0;
        boolean entraCliente = false;

        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;

        int caja5 = 0;
        int caja6 = 0;

        boolean caja5Activa = false;
        boolean caja6Activa = false;

        for(int i=1; i<=720;i++) {

            // Entrada nuevo cliente
            if(Math.random() <= 0.6){
                enCola++;
                entraCliente = true;
            }
            if(Math.random() <= 0.6){
            enCola++;
            entraCliente = true;
            }

             // Superadministrador

            if(enCola > 15){
                 caja5Activa = true;
            }

            if(enCola > 20){
              caja6Activa = true;
            }

            if(enCola < 5){
                 caja5Activa = false;
                caja6Activa = false;
            }

            // Procesar packs de items
            if(caja1>0){
                caja1--;
            }
            if(caja2>0){
                caja2--;
            }
            if(caja3>0){
                caja3--;
            }
            if(caja4>0){
                caja4--;
            }
            if(caja5 > 0){
                caja5--;
            }

             if(caja6 > 0){
                caja6--;
            }

            // Atender cliente en cajas
            if (enCola > 0) {
                if (caja1 == 0){
                // if(cajas[0]==0)
                    enCola--;
                    clientesAtendidos++;
                    caja1 = (int) (Math.random() *10) + 5;
                    articulosVendidos += caja1;
                } else if (caja2 ==0) {
                    enCola--;
                    clientesAtendidos++;
                    caja2 = (int) (Math.random() *10) + 5;
                    articulosVendidos += caja2;
                } else if (caja3 ==0){
                    enCola--;
                    clientesAtendidos++;
                    caja3 = (int) (Math.random() *10) + 5;
                    articulosVendidos += caja3;
                } else if (caja4 == 0){
                    enCola--;
                    clientesAtendidos++;
                    caja4 = (int) (Math.random() *10) + 5;
                    articulosVendidos += caja4;
                }
                else if (caja5Activa && caja5 == 0){
                    enCola--;
                    clientesAtendidos++;
                    caja5 = (int)(Math.random() *10) + 5;
                    articulosVendidos += caja5;
                }
                else if (caja6Activa && caja6 == 0){
                    enCola--;
                    clientesAtendidos++;
                    caja6 = (int)(Math.random() *10) + 5;
                    articulosVendidos += caja6;
                }
            } else {
                minutosCola0++;
            }

            if (entraCliente){
                System.out.println("MINUTO " + i + " - Llega 1 persona - En Cola: " +enCola );
            } else {
                System.out.println("MINUTO " + i + " - No llega nadie - En Cola: " +enCola );
            }
            System.out.print("Caja1:[" + caja1 + "] ");
            System.out.print("| Caja2:[" + caja2 + "] ");
            System.out.print("| Caja3:[" + caja3 + "] ");
            System.out.print("| Caja4:[" + caja4 + "] ");

            if(caja5Activa){
            System.out.print("| Caja5:[" + caja5 + "] ");
            }else{
            System.out.print("| Caja5:[OFF] ");
            }

            if(caja6Activa){
            System.out.print("| Caja6:[" + caja6 + "] ");
            }else{
            System.out.print("| Caja6:[OFF] ");
            }
            System.out.println(); // Salto de línea

            System.out.println("---------------------------------------------------------");
            System.out.println();
        }

        System.out.println("RESUMEN");
        System.out.println("=======================================================");
        System.out.println("Minutos con cola cero         : "+minutosCola0);
        System.out.println("Personas en la cola al cierre : "+enCola);
        System.out.println("Personas atendidas en el dia  : "+clientesAtendidos);
        System.out.println("Articulos vendidos en el dia  : "+articulosVendidos);
        System.out.println("=======================================================");
    }
}
