import java.util.ArrayDeque;
import java.util.Random;

public class CCCF {
    public static void main(String[] args) {
        Random azar = new Random();
        ArrayDeque<Integer> cola = new ArrayDeque<>();
        int[] cajas = new int[4];
        int[] compras = new int[4];
        int minutosSinCola = 0;
        int personasAtendidas = 0;
        int itemsVendidos = 0;

        for (int minuto = 1; minuto <= 720; minuto++) {
            boolean[] libres = new boolean[cajas.length];
            for (int i = 0; i < cajas.length; i++) {
                libres[i] = cajas[i] == 0;
            }

            boolean llega = azar.nextDouble() < 0.60;
            if (llega) {
                cola.add(5 + azar.nextInt(11));
            }

            for (int i = 0; i < cajas.length; i++) {
                if (libres[i] && !cola.isEmpty()) {
                    compras[i] = cola.remove();
                    cajas[i] = compras[i];
                } else if (!libres[i]) {
                    cajas[i]--;
                    if (cajas[i] == 0) {
                        personasAtendidas++;
                        itemsVendidos += compras[i];
                        compras[i] = 0;
                    }
                }
            }

            if (cola.isEmpty()) {
                minutosSinCola++;
            }

            System.out.print("MINUTO " + minuto + " - ");
            System.out.print(llega ? "Llega 1 persona" : "No llega nadie");
            System.out.print(" - En cola: " + cola.size());
            for (int i = 0; i < cajas.length; i++) {
                System.out.print(" | Caja" + (i + 1) + ":[" + cajas[i] + "]");
            }
            System.out.println();
        }

        System.out.println("RESUMEN");
        System.out.println("Minutos sin personas en cola: " + minutosSinCola);
        System.out.println("Personas en cola al cierre: " + cola.size());
        System.out.println("Personas atendidas en el dia: " + personasAtendidas);
        System.out.println("Items vendidos en el dia: " + itemsVendidos);
    }
}

