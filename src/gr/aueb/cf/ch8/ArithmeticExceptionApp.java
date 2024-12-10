package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator;
        int denominator;
        int result;

        while (true) {
            try {
                System.out.println("Insert a numerator and a denominator");
                numerator = in.nextInt();
                if (numerator == 0) break;

                denominator = in.nextInt();
                result = numerator / denominator;

                System.out.printf("%d / %d = %d\n", numerator, denominator, result);
            } catch (ArithmeticException e) {
                System.out.println("Error, Denominator must not be 0");
            }
        }
        System.out.println("Thanks for using the app");
    }
}
