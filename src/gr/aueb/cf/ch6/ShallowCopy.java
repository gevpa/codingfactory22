package gr.aueb.cf.ch6;

/**
 * Antigrafei mia array
 */
public class ShallowCopy {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[arr1.length]; //0 0 0 0

        //Shallow copy
//        arr2 = arr2;
//
//        arr2[0] = 222;

        for (int item : arr2) {
            System.out.print(item + " ");
        }


        //Deep copy
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] =arr1[i];
        }
    }
}
