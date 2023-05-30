package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβάνει 3 τιμές double απο τον χρήστη, τις
 * a, b, c όπου α είναι η υποτείνουσα και
 * b, c οι 2 πλευρες.
 *
 * Ελέγχει αν το τρίγωνο είναι ορθογώνιο, δηλ.\
 * α^2 == b^2 + c^2
 *
 * Έστω EPSILON = 0.000005 (έξι σημαντικά ψηφία)
 */
public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please provide the a, b, c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a*a - b*b - c*c) <= EPSILON) {
            System.out.println("Right");
        } else {
            System.out.println("Not Right");
        }
    }
}
