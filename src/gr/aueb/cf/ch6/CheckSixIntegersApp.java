package gr.aueb.cf.ch6;

import java.util.Scanner;

public class CheckSixIntegersApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("Enter 6 integers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        checkPredicates(arr);
    }

    public static void checkPredicates(int[] arr) {
        int evensCount = 0;
        int oddsCount = 0;
        int consecutiveCount = 1;
        boolean hasThreeConsecutive = false;
        int[] finalDigits = new int[arr.length];
        int[] decades = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) evensCount++;
            if (arr[i] % 2 != 0) oddsCount++;
            finalDigits[i] = arr[i] % 10;
            decades[i] = arr[i] / 10;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                consecutiveCount++;
                if (consecutiveCount >= 3) {
                    hasThreeConsecutive = true;
                    break;
                }
            } else {
                consecutiveCount = 1;
            }
        }

        if (evensCount <= 3) System.out.println("No more than 3 evens");
        if (oddsCount <= 3) System.out.println("No more than 3 odds");
        if (hasThreeConsecutive) System.out.println("No more than 3 consecutive numbers");
        if (hasLessThanThreeOccurrences(finalDigits)) System.out.println("No more than 3 numbers with the same final digit");
        if (hasLessThanThreeOccurrences(decades)) System.out.println("No more than 3 numbers in the same decade");
    }

    public static boolean hasLessThanThreeOccurrences(int[] arr) {
        int[] count = new int[10];

        for (int num : arr) {
            count[num]++;
            if (count[num] >= 3) {
                return false;
            }
        }

        return true;
    }

}
