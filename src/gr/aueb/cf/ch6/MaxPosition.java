package gr.aueb.cf.ch6;

import java.util.Arrays;

public class MaxPosition {

    public static void main(String[] args) {

    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = low;
        int max = arr[low];
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }

    public static int getSecondToLowest(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
    }

    public static int getIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) return i;
        }
        return -1;
    }

    public static void getEvens(int[] arr) {
        for (int el : arr) {
            if (el % 2 == 0) System.out.println(el);
        }
    }

    public static int[] mapDouble(int[] arr) {
        int[] doubledArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            doubledArr[i] = 2 * arr[i];
        }
        return doubledArr;
    }

    public static boolean hasPositive(int[] arr) {
        for (int el : arr) {
            if (el >= 0) return true;
        }
        return false;
    }

    public static boolean allPositive(int[] arr) {
        for (int el : arr) {
            if (el < 0) return false;
        }
        return true;
    }
}
