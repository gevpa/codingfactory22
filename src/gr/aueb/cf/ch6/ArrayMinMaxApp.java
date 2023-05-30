package gr.aueb.cf.ch6;

/**
 * Anazhta ta min kai max stoixeia
 * enos pinaka.
 */
public class ArrayMinMaxApp {

    public static void main(String[] args) {
        int[] arr = {30, 12, 80, 7, 15};
        int[] arr2 = {30, 12, 80, 7, 15};


        int minPosition = 0;
        int minValue = arr[minPosition];

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        //Min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        //Max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr2[i];
            }
        }

        System.out.printf("Min value: %d, Min Position: %d\n", minValue, minPosition + 1);
        System.out.printf("Max value: %d, Max Position: %d", maxValue, maxPosition + 1);
    }
}
