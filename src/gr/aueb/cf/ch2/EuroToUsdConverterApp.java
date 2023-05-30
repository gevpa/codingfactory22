package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει ευρώ σε δολάρια ΗΠΑ
 * λαμβάνει απο τον χρήστη (stdin) έναν ακέραιο
 * που συμβολίζει το ποσό σε ευρώ και μετατρέπει
 * σε δολάρια και εμφανίζει το τελικό αποτέλεσμα.
 */
public class EuroToUsdConverterApp {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        //Εντολές
        System.out.println("Please insert an amount (in Euros)");
        inputEuros = scanner.nextInt();

        totalUsaCents = PARITY * inputEuros;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("%d Euros = %d USA dollars, %d USA Cents", inputEuros, usaDollars, usaCents);

    }
}
