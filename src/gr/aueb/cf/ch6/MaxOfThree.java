package gr.aueb.cf.ch6;

import java.util.Scanner;

public class MaxOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Enter 3 integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        System.out.println("The max is: " + findMax(num1, num2, num3));
    }

    public static int findMax(int x, int y, int z) {
        return Math.max(Math.max(x, y), z);
    }
}
