package gr.aueb.cf.ch8;

import java.util.Scanner;

public class StateTestingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator;
        int denominator;
        int result;

        System.out.println("Insert numerator.");
        while (!in.hasNextInt()) {
            System.out.println("Error. Input must be int. Insert numerator.");
            in.nextLine();
        }
        numerator = in.nextInt();

        System.out.println("Insert denominator.");
        while (!in.hasNextInt()) {
            System.out.println("Error. Input must be int. Insert denominator.");
            in.nextLine();
        }
        denominator = in.nextInt();

        if (denominator == 0) {
            System.out.println("Error. Denominator cannot be 0");
            System.exit(1);
        }

        result = numerator / denominator;
        System.out.printf("%d / %d = %d\n", numerator, denominator, result);
    }
}
