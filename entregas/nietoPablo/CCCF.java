import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class CCCF {
    private static final int MINUTOS_JORNADA = 720;

    private static class Caja {
        int restantes;
        int itemsCompra;
        int atendidosRefuerzo;
        boolean encendida;
        boolean automatica;
        boolean apagarAlTerminar;

        Caja(boolean encendida, boolean automatica) {
            this.encendida = encendida;
            this.automatica = automatica;
        }
    }

    private static class Simulacion {
        final Random azar;
        final ArrayDeque<Integer> cola = new ArrayDeque<>();
        final Caja[] cajas = new Caja[6];
        int minuto;
        int minutosSinCola;
        int personasAtendidas;
        int itemsVendidos;

        Simulacion(Random azar) {
            this.azar = azar;
            for (int i = 0; i < cajas.length; i++) {
                cajas[i] = new Caja(i < 4, i == 4);
            }
        }

        void encender(int numero) {
            Caja caja = cajas[numero - 1];
            caja.automatica = false;
            caja.apagarAlTerminar = false;
            caja.encendida = true;
        }

        void apagar(int numero) {
            Caja caja = cajas[numero - 1];
            caja.automatica = false;
            if (caja.restantes == 0) {
                caja.encendida = false;
            } else {
                caja.apagarAlTerminar = true;
            }
        }

        boolean avanzar() {
            if (minuto == MINUTOS_JORNADA) {
                return false;
            }

            minuto++;
            boolean llega = azar.nextDouble() < 0.60;
            if (llega) {
                cola.add(5 + azar.nextInt(11));
            }

            Caja refuerzo = cajas[4];
            if (refuerzo.automatica) {
                if (!refuerzo.encendida && cola.size() > 15) {
                    refuerzo.encendida = true;
                    refuerzo.atendidosRefuerzo = 0;
                } else if (refuerzo.encendida && refuerzo.restantes == 0
                        && refuerzo.atendidosRefuerzo >= 5 && cola.size() <= 15) {
                    refuerzo.encendida = false;
                }
            }

            for (Caja caja : cajas) {
                if (caja.restantes > 0) {
                    caja.restantes--;
                    if (caja.restantes == 0) {
                        personasAtendidas++;
                        itemsVendidos += caja.itemsCompra;
                        caja.itemsCompra = 0;
                        if (caja == refuerzo && caja.automatica) {
                            caja.atendidosRefuerzo++;
                        }
                        if (caja.apagarAlTerminar) {
                            caja.encendida = false;
                            caja.apagarAlTerminar = false;
                        }
                    }
                } else if (caja.encendida && !caja.apagarAlTerminar && !cola.isEmpty()) {
                    caja.itemsCompra = cola.remove();
                    caja.restantes = caja.itemsCompra;
                }
            }

            if (cola.isEmpty()) {
                minutosSinCola++;
            }

            System.out.print("MINUTO " + minuto + " - ");
            System.out.print(llega ? "Llega 1 persona" : "No llega nadie");
            System.out.print(" - En cola: " + cola.size());
            imprimirCajas();
            return true;
        }

        void imprimirCajas() {
            for (int i = 0; i < cajas.length; i++) {
                Caja caja = cajas[i];
                System.out.print(" | Caja" + (i + 1) + ":[");
                if (!caja.encendida) {
                    System.out.print("apagada");
                } else {
                    System.out.print(caja.restantes);
                    if (caja.apagarAlTerminar) {
                        System.out.print(", cierre pendiente");
                    }
                }
                System.out.print("]");
            }
            System.out.println();
        }

        void resumen() {
            System.out.println("RESUMEN");
            System.out.println("Minutos sin personas en cola: " + minutosSinCola);
            System.out.println("Personas en cola al cierre: " + cola.size());
            System.out.println("Personas atendidas en el dia: " + personasAtendidas);
            System.out.println("Items vendidos en el dia: " + itemsVendidos);
        }
    }

    public static void main(String[] args) {
        boolean admin = false;
        Long semilla = null;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("--admin")) {
                admin = true;
            } else if (args[i].equals("--semilla") && i + 1 < args.length) {
                semilla = Long.parseLong(args[++i]);
            } else {
                System.out.println("Uso: java CCCF [--admin] [--semilla numero]");
                return;
            }
        }

        Simulacion simulacion = new Simulacion(
                semilla == null ? new Random() : new Random(semilla));
        if (admin) {
            administrar(simulacion);
        } else {
            while (simulacion.avanzar()) {
            }
            simulacion.resumen();
        }
    }

    private static void administrar(Simulacion simulacion) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Comandos: avanzar N, encender N, apagar N, estado, salir");
        while (simulacion.minuto < MINUTOS_JORNADA && entrada.hasNextLine()) {
            String linea = entrada.nextLine().trim().toLowerCase(Locale.ROOT);
            String[] partes = linea.split("\\s+");
            try {
                if (partes[0].equals("avanzar") && partes.length <= 2) {
                    int cantidad = partes.length == 2 ? Integer.parseInt(partes[1]) : 1;
                    if (cantidad < 1) {
                        throw new IllegalArgumentException();
                    }
                    for (int i = 0; i < cantidad && simulacion.avanzar(); i++) {
                    }
                } else if ((partes[0].equals("encender") || partes[0].equals("apagar"))
                        && partes.length == 2) {
                    int numero = Integer.parseInt(partes[1]);
                    if (numero < 1 || numero > 6) {
                        throw new IllegalArgumentException();
                    }
                    if (partes[0].equals("encender")) {
                        simulacion.encender(numero);
                    } else {
                        simulacion.apagar(numero);
                    }
                    System.out.print("Minuto " + simulacion.minuto + " - En cola: "
                            + simulacion.cola.size());
                    simulacion.imprimirCajas();
                } else if (partes[0].equals("estado") && partes.length == 1) {
                    System.out.print("Minuto " + simulacion.minuto + " - En cola: "
                            + simulacion.cola.size());
                    simulacion.imprimirCajas();
                } else if (partes[0].equals("salir") && partes.length == 1) {
                    break;
                } else {
                    System.out.println("Comando no valido");
                }
            } catch (IllegalArgumentException error) {
                System.out.println("Comando no valido");
            }
        }
        if (simulacion.minuto == MINUTOS_JORNADA) {
            simulacion.resumen();
        }
    }
}

