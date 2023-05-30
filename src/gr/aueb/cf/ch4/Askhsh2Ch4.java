package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * It prints n stars vertical
 */
public class Askhsh2Ch4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Please give the number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }

    }
}
