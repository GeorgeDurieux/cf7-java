package gr.aueb.cf.ch6;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int square;

        System.out.println("Enter a number");
        num = scanner.nextInt();

        square = square(num);
        System.out.println("Its square is: " + square);
    }

    public static int square(int num) {
        return num * num;
    }
}
