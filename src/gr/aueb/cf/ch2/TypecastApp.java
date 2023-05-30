package gr.aueb.cf.ch2;

/**
 *Μετατροπή ενός τύπου σε έναν άλλο
 */

public class TypecastApp {

    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20L;
        long result = 0L;

        num1 = (int) num2;

        result = num1 + num2;
    }
}
