package gr.aueb.cf.ch1;

/**
 * Adds two ints and
 * shows the result
 * on stdout
 */
public class AddApp {

    public static void main(String[] args) {
        //Declaration
        int num1 = 10;
        int num2 = 7;
        int result = 0;


        result = num1 + num2;

        //Prints Results
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.printf("Το αποτέλεσμα των %d, %d είναι %d", num1, num2, result);
    }
}
