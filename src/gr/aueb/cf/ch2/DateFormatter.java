package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateFormatter {

    public static void main(String[] args) {
        int day;
        int month;
        int year;
        Scanner in = new Scanner(System.in);

        System.out.println("Εισάγετε μέρα, μήνα και έτος");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        System.out.printf("Η ημερομηνία είναι: %d/%d/%d", day, month, year);
    }
}
