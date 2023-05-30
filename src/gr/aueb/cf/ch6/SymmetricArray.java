package gr.aueb.cf.ch6;

public class SymmetricArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};

        System.out.println("Array is symmetric: " + isArraySymmetric(arr));
        System.out.println("Array is symmetric: " + isArrSymmetric(arr));

    }

    public static boolean isArraySymmetric(int[] arr) {
        boolean isSymmetric = true;

        for (int i = 0, j = arr.length -1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isSymmetric = false;
                break;
            }
        }

        return isSymmetric;
    }

    public static boolean isArrSymmetric(int[] arr) {
        boolean isSymmetric = true;
        int n = arr.length - 1;

        for (int i = 0; i < n /2; i++) {
            isSymmetric = false;
            break;
        }

        return isSymmetric;
    }
}
