package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * ylopoiei enan aplo calculator
 * pou parexei tiw yphresies add, sub, mul, dic, mod.
 * Emfanizei ena menu prow ton xrhsth me epiloges
 * lambanei thn timh thw epiloghw
 * kai sth synexeia dyo akoma times ton num1, num2.
 * kai telika emfanizei to apotelesma.
 */
public class CalculatorApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int result = 0;
        do {
            printMenu();
            choice = getNextInt("Please insert your choice");

            if (isChoiceInvalid(choice)) {
                System.out.println("Choice is invalid");
                continue;
            }
            if (isChoiceQuit(choice)) {
                break;
            }
            result = onChoiceGetResult(choice);
            System.out.println("Result = " + result);
        } while (true);
    }

    public static void printMenu() {
        System.out.println("Choose one of the below");
        System.out.println("1. Prosthesh");
        System.out.println("2. Afairesh");
        System.out.println("3. Pollaplasiasmos");
        System.out.println("4. Diairesh");
        System.out.println("5. Ypoloipo");
        System.out.println("6. Exodos");

    }

    public static int getNextInt(String message) {
        System.out.println(message);
        return in.nextInt();
    }

    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;
    }

    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 % num2;
    }

    public static int onChoiceGetResult(int choice) {
        int num1 = getNextInt("Please insert first number (int)");
        int num2 = getNextInt("Please insert second number (int)");
        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
            default:
                break;
        }
        return result;
    }
}
