package gr.aueb.cf.ch6;

import java.util.Scanner;

public class PrimeNumbersApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Enter a number");
        num = scanner.nextInt();

        System.out.println(isPrime(num) ? "Prime" : "Not prime");
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
