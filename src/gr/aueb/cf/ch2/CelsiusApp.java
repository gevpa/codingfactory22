package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει ακέραιες θερμοκρασίες
 * Fahrenheit σε Celsius
 */
public class CelsiusApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        System.out.println("Please provide temperature in Fahrenheit");
        fahrenheit = in.nextInt();

        celsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("%d\u00B0F = %d\u00B0C", fahrenheit, celsius);


    }
}
