import java.util.Scanner;

public class CentroComercialCF {

    public static void main(String[] args) {
        final int MINUTOS_JORNADA = 720;
        final double PROBABILIDAD_CLIENTE = 0.60;
        final int PACKS_MINIMOS = 5;
        final int PACKS_MAXIMOS = 15;
        final int LIMITE_COLA = 15;
        final int CLIENTES_MINIMOS_REFUERZO = 5;

        int cola = 0;
        int packsCaja1 = 0;
        int packsCaja2 = 0;
        int packsCaja3 = 0;
        int packsCaja4 = 0;
        int packsCaja5 = 0;
        int packsCaja6 = 0;

        int clientesLlegados = 0;
        int clientesAtendidos = 0;
        int packsVendidos = 0;
        int minutosSinCola = 0;

        boolean refuerzoActivo = false;
        int clientesRefuerzo = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Modo superadministrador (s/n): ");
        boolean superadministrador = teclado.hasNextLine()
                && teclado.nextLine().trim().equalsIgnoreCase("s");
        boolean refuerzoAutomatico = true;
        boolean abiertaCaja1 = true;
        boolean abiertaCaja2 = true;
        boolean abiertaCaja3 = true;
        boolean abiertaCaja4 = true;
        boolean abiertaCaja5 = false;
        boolean abiertaCaja6 = false;

        // La jornada empieza a las 9:00 y termina a las 21:00.
        for (int minuto = 1; minuto <= MINUTOS_JORNADA; minuto++) {
            // Revisamos las cajas al comenzar y despues de cada hora.
            if (superadministrador && (minuto - 1) % 60 == 0) {
                String opcion = "";
                while (!opcion.equals("0")) {
                    System.out.println("ADMINISTRADOR - Minuto " + minuto);
                    System.out.println("Cajas abiertas: 1=" + abiertaCaja1 + " 2=" + abiertaCaja2
                            + " 3=" + abiertaCaja3 + " 4=" + abiertaCaja4
                            + " 5=" + (abiertaCaja5 || refuerzoActivo) + " 6=" + abiertaCaja6);
                    System.out.println("1-6: cambiar caja | 7: refuerzo automatico | 0: continuar");
                    opcion = teclado.hasNextLine() ? teclado.nextLine().trim() : "0";

                    if (opcion.equals("1")) {
                        abiertaCaja1 = !abiertaCaja1;
                    } else if (opcion.equals("2")) {
                        abiertaCaja2 = !abiertaCaja2;
                    } else if (opcion.equals("3")) {
                        abiertaCaja3 = !abiertaCaja3;
                    } else if (opcion.equals("4")) {
                        abiertaCaja4 = !abiertaCaja4;
                    } else if (opcion.equals("5")) {
                        abiertaCaja5 = !(abiertaCaja5 || refuerzoActivo);
                        refuerzoActivo = false;
                        refuerzoAutomatico = false;
                    } else if (opcion.equals("6")) {
                        abiertaCaja6 = !abiertaCaja6;
                    } else if (opcion.equals("7")) {
                        // Una caja manual termina su cliente antes de volver al modo automatico.
                        abiertaCaja5 = false;
                        refuerzoActivo = packsCaja5 > 0;
                        clientesRefuerzo = 0;
                        refuerzoAutomatico = true;
                    } else if (!opcion.equals("0")) {
                        System.out.println("Opcion no valida.");
                    }
                }
            }

            // Cada cliente que ya estaba en caja procesa un pack por minuto.
            if (packsCaja1 > 0) {
                packsCaja1--;
                packsVendidos++;
                if (packsCaja1 == 0) {
                    clientesAtendidos++;
                }
            }
            if (packsCaja2 > 0) {
                packsCaja2--;
                packsVendidos++;
                if (packsCaja2 == 0) {
                    clientesAtendidos++;
                }
            }
            if (packsCaja3 > 0) {
                packsCaja3--;
                packsVendidos++;
                if (packsCaja3 == 0) {
                    clientesAtendidos++;
                }
            }
            if (packsCaja4 > 0) {
                packsCaja4--;
                packsVendidos++;
                if (packsCaja4 == 0) {
                    clientesAtendidos++;
                }
            }
            if (packsCaja5 > 0) {
                packsCaja5--;
                packsVendidos++;
                if (packsCaja5 == 0) {
                    clientesAtendidos++;
                    if (refuerzoActivo) {
                        clientesRefuerzo++;
                    }
                }
            }
            if (packsCaja6 > 0) {
                packsCaja6--;
                packsVendidos++;
                if (packsCaja6 == 0) {
                    clientesAtendidos++;
                }
            }

            // Comprobamos si llega un cliente nuevo durante este minuto.
            boolean llegaCliente = Math.random() < PROBABILIDAD_CLIENTE;
            if (llegaCliente) {
                cola++;
                clientesLlegados++;
            }

            // La caja de refuerzo se revisa antes de repartir la cola.
            if (refuerzoAutomatico) {
                if (!refuerzoActivo && packsCaja5 == 0 && cola > LIMITE_COLA) {
                    refuerzoActivo = true;
                    clientesRefuerzo = 0;
                    System.out.println("REFUERZO ABRE - Minuto " + minuto + " - Cola: " + cola);
                } else if (refuerzoActivo && packsCaja5 == 0
                        && clientesRefuerzo >= CLIENTES_MINIMOS_REFUERZO && cola <= LIMITE_COLA) {
                    refuerzoActivo = false;
                    System.out.println("REFUERZO CIERRA - Minuto " + minuto
                            + " - Clientes: " + clientesRefuerzo + " - Cola: " + cola);
                }
            }

            // Las cajas libres reciben clientes por orden de numero de caja.
            if (abiertaCaja1 && packsCaja1 == 0 && cola > 0) {
                packsCaja1 = PACKS_MINIMOS + (int) (Math.random() * (PACKS_MAXIMOS - PACKS_MINIMOS + 1));
                cola--;
            }
            if (abiertaCaja2 && packsCaja2 == 0 && cola > 0) {
                packsCaja2 = PACKS_MINIMOS + (int) (Math.random() * (PACKS_MAXIMOS - PACKS_MINIMOS + 1));
                cola--;
            }
            if (abiertaCaja3 && packsCaja3 == 0 && cola > 0) {
                packsCaja3 = PACKS_MINIMOS + (int) (Math.random() * (PACKS_MAXIMOS - PACKS_MINIMOS + 1));
                cola--;
            }
            if (abiertaCaja4 && packsCaja4 == 0 && cola > 0) {
                packsCaja4 = PACKS_MINIMOS + (int) (Math.random() * (PACKS_MAXIMOS - PACKS_MINIMOS + 1));
                cola--;
            }
            if ((abiertaCaja5 || refuerzoActivo) && packsCaja5 == 0 && cola > 0) {
                packsCaja5 = PACKS_MINIMOS + (int) (Math.random() * (PACKS_MAXIMOS - PACKS_MINIMOS + 1));
                cola--;
            }
            if (abiertaCaja6 && packsCaja6 == 0 && cola > 0) {
                packsCaja6 = PACKS_MINIMOS + (int) (Math.random() * (PACKS_MAXIMOS - PACKS_MINIMOS + 1));
                cola--;
            }

            if (cola == 0) {
                minutosSinCola++;
            }

            System.out.print("MINUTO " + minuto);
            if (llegaCliente) {
                System.out.print(" - Llega 1 persona");
            } else {
                System.out.print(" - No llega nadie");
            }
            System.out.println(" - En cola: " + cola);
            System.out.print("Caja1:[" + (packsCaja1 > 0 || abiertaCaja1
                    ? Integer.toString(packsCaja1) : "cerrada") + "]");
            System.out.print(" | Caja2:[" + (packsCaja2 > 0 || abiertaCaja2
                    ? Integer.toString(packsCaja2) : "cerrada") + "]");
            System.out.print(" | Caja3:[" + (packsCaja3 > 0 || abiertaCaja3
                    ? Integer.toString(packsCaja3) : "cerrada") + "]");
            System.out.print(" | Caja4:[" + (packsCaja4 > 0 || abiertaCaja4
                    ? Integer.toString(packsCaja4) : "cerrada") + "]");
            System.out.print(" | Caja5:[" + (packsCaja5 > 0 || (abiertaCaja5 || refuerzoActivo)
                    ? Integer.toString(packsCaja5) : "cerrada") + "]");
            System.out.print(" | Caja6:[" + (packsCaja6 > 0 || abiertaCaja6
                    ? Integer.toString(packsCaja6) : "cerrada") + "]");
            System.out.println();
            System.out.println("------------------------------------------------------------");
        }

        int clientesEnCaja = 0;
        if (packsCaja1 > 0) {
            clientesEnCaja++;
        }
        if (packsCaja2 > 0) {
            clientesEnCaja++;
        }
        if (packsCaja3 > 0) {
            clientesEnCaja++;
        }
        if (packsCaja4 > 0) {
            clientesEnCaja++;
        }
        if (packsCaja5 > 0) {
            clientesEnCaja++;
        }
        if (packsCaja6 > 0) {
            clientesEnCaja++;
        }

        System.out.println("RESUMEN DE LA JORNADA");
        System.out.println("Minutos sin cola: " + minutosSinCola);
        System.out.println("Personas en cola al cierre: " + cola);
        System.out.println("Personas atendidas: " + clientesAtendidos);
        System.out.println("Packs de items vendidos: " + packsVendidos);
        System.out.println("Personas que llegaron: " + clientesLlegados);
        System.out.println("Personas en caja al cierre: " + clientesEnCaja);
        teclado.close();
    }
}
