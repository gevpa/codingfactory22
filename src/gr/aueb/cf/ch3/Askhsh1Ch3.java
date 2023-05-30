package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Askhsh1Ch3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert a year: ");
        int year = in.nextInt();
        boolean isLeapYear = false;

        if (year % 4 == 0) {
           if ( year % 100 == 0){
               if ( year % 400 == 0) {
                   isLeapYear = true;
               }
           } else {
               isLeapYear = true;
           }
        }
        if (isLeapYear) {
            System.out.println(year + "is a leap year");
        } else {
            System.out.println(year + "is not a leap year");
        }
    }
}
