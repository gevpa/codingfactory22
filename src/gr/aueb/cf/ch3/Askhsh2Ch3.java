package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Askhsh2Ch3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Choose one of the following or 5 for exit");
            System.out.println("1. Introduction");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            choice = in.nextInt();

            if (choice == 1) {
                System.out.println("Successful Introduction");
            } else if (choice == 2) {
                System.out.println("Successful Delete");
            } else if (choice == 3) {
                System.out.println("Successful Update");
            } else if (choice == 4) {
                System.out.println("Successful Search");
            } else if (choice == 5) {
                System.out.println("Successfull Exit");
            } else {
                System.out.println("Wrong choice");
            }
        } while (choice != 5 || choice <= 0);

        System.out.println("Goodbye");
    }
}
