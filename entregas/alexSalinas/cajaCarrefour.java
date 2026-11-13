import java.util.Scanner;

public class cajaCarrefour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double OPENING_TIME = 9.0;
        final double CLOSING_TIME = 21.0;
        final double MINUTE = 1.0 / 60.0;
        double currentTime = OPENING_TIME;
        boolean isOpen = true;

        int line = 0;
        final double PROBABILITY_ARRIVAL = 0.6;

        int customerService1 = 0, customerService2 = 0, customerService3 = 0, customerService4 = 0;
        final int ITEM_MINIMUM = 5;
        final int ITEM_MAXIMUM = 15;

        boolean isArrived;

        do {

            currentTime = currentTime + MINUTE;
            isOpen = currentTime < CLOSING_TIME;
            isArrived = false;

            if (Math.random() < PROBABILITY_ARRIVAL) {
                line++;
                isArrived = true;
            }

            if (line > 0 && customerService1 <= 0) {
                line--;
                customerService1 = (int)(Math.random() * (ITEM_MAXIMUM - ITEM_MINIMUM)) + ITEM_MINIMUM;
            }

            if (line > 0 && customerService2 <= 0) {
                line--;
                customerService2 = (int)(Math.random() * (ITEM_MAXIMUM - ITEM_MINIMUM)) + ITEM_MINIMUM;
            }

            if (line > 0 && customerService3 <= 0) {
                line--;
                customerService3 = (int)(Math.random() * (ITEM_MAXIMUM - ITEM_MINIMUM)) + ITEM_MINIMUM;
            }

            if (line > 0 && customerService4 <= 0) {
                line--;
                customerService4 = (int)(Math.random() * (ITEM_MAXIMUM - ITEM_MINIMUM)) + ITEM_MINIMUM;
            }

            if (customerService1 > 0) {
                customerService1--;
            }

            if (customerService2 > 0) {
                customerService2--;
            }

            if (customerService3 > 0) {
                customerService3--;
            }

            if (customerService4 > 0) {
                customerService4--;
            }

            showHeader(currentTime, line, isArrived);

            describeCustomerService(customerService1, 1);
            describeCustomerService(customerService2, 2);
            describeCustomerService(customerService3, 3);
            describeCustomerService(customerService4, 4);

            String userInput = scanner.nextLine();

        } while (isOpen);
    }

    private static void describeCustomerService(int customerService, int customerServiceNumber) {
        final String ITEM = "[!]";
        System.out.println("Caja[" + customerServiceNumber + "] = " + ITEM.repeat(customerService));
    }

    private static void showHeader(double currentTime, int line, boolean isArrived) {
        final int DECIMAL_PLACES = 100;
        final String CLIENT = "O-";

        System.out.println("=".repeat(40));
        System.out.println("[" + (double) Math.round(currentTime * DECIMAL_PLACES) / DECIMAL_PLACES + "]");

        if (isArrived) {
            System.out.println("¡Llega una persona!");
        } else {
            System.out.println("No ha llegado nadie");
        }

        System.out.println("FILA: " + CLIENT.repeat(line) + " ");
        System.out.println("     " + "=".repeat(35));
    }
}