package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LeapYearsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        boolean isLeap;

        System.out.println("Enter a year");
        year = scanner.nextInt();

        isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

        System.out.println("This is a leap year: " + isLeap);
    }
}
