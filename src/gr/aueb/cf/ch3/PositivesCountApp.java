package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * μετράει το πλήθος των θετικών
 * αριθμών που δίνει ο χρήστης.
 */
public class PositivesCountApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positiveCount = 0;

        System.out.println("Please give a num (int)");
        num = in.nextInt();

        while (num >= 0) {
            positiveCount++;
            System.out.println("Please give a num (int)");
            num = in.nextInt();
        }
        System.out.println("Positive-count: " + positiveCount);

    }
}
