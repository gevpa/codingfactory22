package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * lambanei ena grade apo to xrhsth
 * kai dinei feedback (excellent, very good, good, fail)
 * an einai grade >=9, >=7, >=5, <5 antistoixa
 */
public class SwitchFallThrough {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade;

        System.out.println("Please provide the grade");
        grade = in.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Fail");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very Good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Error in grade");
                break;

        }
    }
}
