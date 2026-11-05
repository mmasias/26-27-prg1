package entregas;

import java.util.Scanner;

public class CajaDeCarrefour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constantes del sistema
        final double OPENING_TIME = 9.0;
        final double CLOSING_TIME = 21.0;
        final double MINUTE = 1.0 / 60.0;
        final double PROBABILITY_ARRIVAL = 0.40; // 40% de probabilidad de llegada

        final int ITEM_MINIMUM = 5;
        final int ITEM_MAXIMUM = 15;

        // Variables de estado
        double currentTime = OPENING_TIME;
        boolean isOpen = true;
        int line = 0;

        int customerService1 = 0;
        int customerService2 = 0;
        int customerService3 = 0;
        int customerService4 = 0;

        boolean isArrived;

        // Bucle de simulación por cada minuto de la jornada
        do {
            currentTime = currentTime + MINUTE;
            isOpen = currentTime < CLOSING_TIME;
            isArrived = false;

            // Simulación de llegada de clientes (<= 40%)
            if (Math.random() <= PROBABILITY_ARRIVAL) {
                line++;
                isArrived = true;
            }

            // Asignación de clientes de la fila a las cajas libres
            if (line > 0 && customerService1 <= 0) {
                line--;
                customerService1 = createItems(ITEM_MAXIMUM, ITEM_MINIMUM);
            }
            if (line > 0 && customerService2 <= 0) {
                line--;
                customerService2 = createItems(ITEM_MAXIMUM, ITEM_MINIMUM);
            }
            if (line > 0 && customerService3 <= 0) {
                line--;
                customerService3 = createItems(ITEM_MAXIMUM, ITEM_MINIMUM);
            }
            if (line > 0 && customerService4 <= 0) {
                line--;
                customerService4 = createItems(ITEM_MAXIMUM, ITEM_MINIMUM);
            }

            // Reducción de items atendidos por minuto (1 pack por minuto)
            if (customerService1 > 0) customerService1--;
            if (customerService2 > 0) customerService2--;
            if (customerService3 > 0) customerService3--;
            if (customerService4 > 0) customerService4--;

            // Muestra por pantalla el estado del minuto
            showHeader(currentTime, line, isArrived);
            describeCustomerService(customerService1, 1);
            describeCustomerService(customerService2, 2);
            describeCustomerService(customerService3, 3);
            describeCustomerService(customerService4, 4);

            // Esperar Enter del usuario para pasar al siguiente minuto
            String userInput = scanner.nextLine();

        } while (isOpen);

        scanner.close();
    }

    private static int createItems(int maxItems, int minItems) {
        return (int) (Math.random() * (maxItems - minItems + 1)) + minItems;
    }

    private static void showHeader(double currentTime, int line, boolean isArrived) {
        final int DECIMAL_PLACES = 100;
        final String CLIENT = "_0_ ";
        
        System.out.println("=".repeat(40));
        System.out.println("[" + (double) Math.round(currentTime * DECIMAL_PLACES) / DECIMAL_PLACES + "]");
        
        if (isArrived) {
            System.out.println("¡Llega una persona!");
        } else {
            System.out.println("No ha llegado nadie");
        }
        
        System.out.println("FILA: " + CLIENT.repeat(line));
        System.out.println("=".repeat(35));
    }

    private static void describeCustomerService(int customerService, int customerServiceNumber) {
        final String ITEM = "[:]";
        System.out.println("Caja[" + customerServiceNumber + "] " + ITEM.repeat(customerService));
    }
}
