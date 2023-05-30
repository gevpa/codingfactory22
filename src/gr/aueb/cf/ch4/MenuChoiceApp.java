package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού και ο χρήστης
 * δίνει μια επιλογή και λαμβάνει ένα
 * αντίστοιχο feedback/confirmation.
 */
public class MenuChoiceApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("Please select one of the following:");
            System.out.println("1. Introduction");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Search");
            System.out.println("5. Exit");

            choice = in.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Not proper choice");
                continue;
            }

            if (choice == 5) {
                System.out.println("Selecte exit");
            }

            if (choice == 1) {
                System.out.println("Selecte introduction");
            } else if (choice == 2) {
                System.out.println("Selecte update");
            } else if (choice == 3) {
                System.out.println("Select delete");
            } else if (choice == 4 ) {
                System.out.println("Select search");
            }

        } while (choice != 5);
    }
}
