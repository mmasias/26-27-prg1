import java.util.Scanner;

public class viajeMarcos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double MOTHER_INITIAL_DISTANCE = 350;
        final double MOTHER_ADVANCE = 80;

        final double HARD_RAIN_PROBABILITY = 0.1;
        final double SOFT_RAIN_PROBABILITY = 0.4;
        final double MONKEY_ESCAPES_PROBABILITY = 0.15;
        final double MONKEY_GET_TIRED_PROBABILITY = 0.25;

        double remainingDistance = MOTHER_INITIAL_DISTANCE;
        int days = 0;

        boolean isTraveling = remainingDistance > 0;

        while (isTraveling) {

            days++;

            double marcoVelocity = Math.random() * 5 + 10;
            double marcoTime = Math.random() * 2 + 8;
            double rainProbability = Math.random();

            double velocityChange = 1;
            String history = "GOOD DAY";

            if (rainProbability <= HARD_RAIN_PROBABILITY) {

                velocityChange = 0.25;
                history = "HARD RAIN!";

            } else if (rainProbability <= SOFT_RAIN_PROBABILITY) {

                velocityChange = 0.75;
                history = "SOFT RAIN!";
            }

            if (Math.random() <= MONKEY_GET_TIRED_PROBABILITY) {

                velocityChange = velocityChange * 0.90;
                history = history + ". The monkey gets tired";
            }

            double timeChange = 0;

            if (Math.random() <= MONKEY_ESCAPES_PROBABILITY) {

                timeChange = -2;
                history = history + ". The monkey escapes.";
            }

            marcoTime = marcoTime + timeChange;
            marcoVelocity = marcoVelocity * velocityChange;

            double marcoDayAdvance = marcoVelocity * marcoTime;

            remainingDistance = remainingDistance - marcoDayAdvance + MOTHER_ADVANCE;

            System.out.println("Day " + days);
            System.out.println(history);
            System.out.println("Marco moved forward " + marcoDayAdvance);
            System.out.println("He is " + remainingDistance + " km. away from his mom.");
            System.out.println("-".repeat(10));

            isTraveling = remainingDistance > 0;
        }

        System.out.println("Marco meets up with his mom after " + days + " days!");

        input.close();
    }
}