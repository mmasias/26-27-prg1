

public class RetoCCCF {
    public static void main(String[] args) {
        int personasEnCola = 0;
        int [] cajas = new int[4];

        for (int minuto = 1; minuto <= 720; minuto++) {
            System.out.println("MINUTO: " + minuto);

            if (Math.random() <= 0.40) {
                personasEnCola++;
                System.out.println("Llega una persona a la cola. Personas en cola: " + personasEnCola);
            } else  {
                System.out.println("Nadie ha llegado a la cola.");
            } 
        }
    }
}
