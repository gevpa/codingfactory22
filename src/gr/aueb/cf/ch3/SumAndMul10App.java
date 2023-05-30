package gr.aueb.cf.ch3;

/**
 * Υπολογίζει τοάθροισμα και
 * το γινόμενο των 10 πρώτων
 * ακεραίων.
 */
public class SumAndMul10App {

    public static void main(String[] args) {
        int sum = 0; // εδώ το sum πρέπει να είναι 0 διότι πρέπει να γίνει σωστά η κατάταξη των αριθμών αφού ξεκινάμε να μετράμε απο το 0 το οποίο είναι το ουδέτερο σημείο της πρόσθεσης
        int mul = 1;
        int i = 1;

        while (i <= 10) {
            sum = sum + i; // ή sum += i;
            mul *= i;
            i++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);
    }
}
