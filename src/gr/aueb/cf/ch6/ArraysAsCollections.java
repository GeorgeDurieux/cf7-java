package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArraysAsCollections {

    public static void main(String[] args) {

    }

    public static int[] getEvens(int[] arr) {
        int count = 0;
        int pivot = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        int[] evens = new int[count];

        for (int el : arr) {
            if (el % 2 == 0) evens[pivot++] = el;
        }

        return evens;
    }

    public static int[] mapToDouble(int[] arr) {
        int[] doubleArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            doubleArr[i] = arr[i] * 2;
        }
        return doubleArr;
    }

    public static int sum(int[] arr) {
        int sum = 0;

        for (int el : arr) {
            sum += el;
        }
        return sum;
    }

    public static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static boolean anyEven(int[] arr) {
        return getEvens(arr).length > 0;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        return getEvens(arr).length > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] + 1 == arr[i+1] && arr[i + 1] + 1== arr[i+2]) return true;
        }
        return false;
    }

    public static boolean moreThanTwoWithSameEnding(int[] arr) {
        int[] lastDigits = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            lastDigits[i] = Math.abs(arr[i] % 10);
        }

        Arrays.sort(lastDigits);

        for (int i = 0; i < lastDigits.length - 2; i++) {
            if (lastDigits[i] == lastDigits[i + 1] && lastDigits[i + 1] == lastDigits[i + 2]) {
                return true;
            }
        }

        return false;
    }

    public static boolean AllAreEven(int[] arr) {
        return getEvens(arr).length == arr.length;
    }
}
