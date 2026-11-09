
public class RetoCCCF {
    public static void main(String[] args) {

        final int DURACION_JORNADA = 720;
        final double PROBABILIDAD_LLEGADA = 0.60;
        final int MIN_PACKS = 5;
        final int MAX_PACKS = 15;

        int minuto = 0;

        int personasLlegadas = 0;
        int personasEnCola = 0;
        int personasAtendidas = 0;

        int packsVendidos = 0;
        int minutosColaVacia = 0;

        int tiempoCaja1 = 0;
        int tiempoCaja2 = 0;
        int tiempoCaja3 = 0;
        int tiempoCaja4 = 0;

        System.out.println("CENTRO COMERCIAL CF");
        System.out.println("Apertura: 09:00");
        System.out.println("Cierre: 21:00");
        System.out.println("----------------------------------------");

        do {

            minuto++;

            System.out.print("MINUTO: " + minuto + " - ");

            double numeroAleatorio = Math.random();

            if (numeroAleatorio < PROBABILIDAD_LLEGADA) {
                personasLlegadas++;
                personasEnCola++;
                System.out.println("Llega una persona.");
            } else {
                System.out.println("No llega nadie.");
            }

            if (tiempoCaja1 > 0) {
                tiempoCaja1--;
                packsVendidos++;

                if (tiempoCaja1 == 0) {
                    personasAtendidas++;
                }
            }

            if (tiempoCaja2 > 0) {
                tiempoCaja2--;
                packsVendidos++;

                if (tiempoCaja2 == 0) {
                    personasAtendidas++;
                }
            }

            if (tiempoCaja3 > 0) {
                tiempoCaja3--;
                packsVendidos++;

                if (tiempoCaja3 == 0) {
                    personasAtendidas++;
                }
            }

            if (tiempoCaja4 > 0) {
                tiempoCaja4--;
                packsVendidos++;

                if (tiempoCaja4 == 0) {
                    personasAtendidas++;
                }
            }

            if (tiempoCaja1 == 0 && personasEnCola > 0) {
                tiempoCaja1 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1))
                        + MIN_PACKS;
                personasEnCola--;
            }

            if (tiempoCaja2 == 0 && personasEnCola > 0) {
                tiempoCaja2 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1))
                        + MIN_PACKS;
                personasEnCola--;
            }

            if (tiempoCaja3 == 0 && personasEnCola > 0) {
                tiempoCaja3 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1))
                        + MIN_PACKS;
                personasEnCola--;
            }

            if (tiempoCaja4 == 0 && personasEnCola > 0) {
                tiempoCaja4 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS + 1))
                        + MIN_PACKS;
                personasEnCola--;
            }

            System.out.println("Personas en cola: " + personasEnCola);

            System.out.println("Caja 1: " + tiempoCaja1 + " packs pendientes");
            System.out.println("Caja 2: " + tiempoCaja2 + " packs pendientes");
            System.out.println("Caja 3: " + tiempoCaja3 + " packs pendientes");
            System.out.println("Caja 4: " + tiempoCaja4 + " packs pendientes");

            if (personasEnCola == 0) {
                minutosColaVacia++;
            }

            System.out.println("----------------------------------------");

        } while (minuto < DURACION_JORNADA);

        int personasEnCajas = 0;

        if (tiempoCaja1 > 0) {
            personasEnCajas++;
        }

        if (tiempoCaja2 > 0) {
            personasEnCajas++;
        }

        if (tiempoCaja3 > 0) {
            personasEnCajas++;
        }

        if (tiempoCaja4 > 0) {
            personasEnCajas++;
        }

        System.out.println();
        System.out.println("RESUMEN FINAL DE LA JORNADA");
        System.out.println("----------------------------------------");

        System.out.println("Minutos sin personas en cola: "
                + minutosColaVacia);

        System.out.println("Personas en cola al finalizar: "
                + personasEnCola);

        System.out.println("Personas atendidas: "
                + personasAtendidas);

        System.out.println("Packs vendidos: "
                + packsVendidos);

        System.out.println("Personas que siguen en cajas: "
                + personasEnCajas);

        System.out.println("Personas que han llegado: "
                + personasLlegadas);

        System.out.println("----------------------------------------");
    }
}






