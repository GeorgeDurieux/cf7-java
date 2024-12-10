package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DigitsSum {

    public static void main(String[] args) {

        int num = 0;
        int firstDigit = 0;
        int secondDigit = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Εισάγετε έναν διψήφιο ακέραιο");
        num = in.nextInt();

        firstDigit = num / 10;
        secondDigit = num % 10;
        sum = firstDigit + secondDigit;

        System.out.printf("Το άθροισμα των ψηφίων είναι: %d", sum);
    }
}
