package gr.aueb.cf.ch6;

public class SymmetricArray {

    public static boolean isSymmetric(int[] array) {

        if (array == null || array.length == 0) {
            return true;
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] testArray1 = {1, 2, 3, 2, 1};
        int[] testArray2 = {1, 2, 3, 4, 5};
        int[] testArray3 = {};

        System.out.println("Test Array 1 is symmetric: " + isSymmetric(testArray1));
        System.out.println("Test Array 2 is symmetric: " + isSymmetric(testArray2));
        System.out.println("Test Array 3 is symmetric: " + isSymmetric(testArray3));
    }
}
