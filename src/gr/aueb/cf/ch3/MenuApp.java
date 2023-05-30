package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * εμφανίζει επαναληπτικά ενα μενου
 * επιλογων μεχρι ο χρηστης να επιλεξει
 * εξοδο
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Choose one of thw below");
            System.out.println("1. Insert a product");
            System.out.println("2. Delete a product");
            System.out.println("3. Exit");
            choice = in.nextInt();
        } while (choice != 3);
    }
}
