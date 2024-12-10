package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateTimeToSecondsConverter {

    public static void main(String[] args) {

        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int totalSeconds = 9;
        final int SEC_PER_DAY = 86400;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MINUTE = 60;
        Scanner in = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε ημέρες");
        days = in.nextInt();
        System.out.println("Παρακαλώ εισάγετε ώρες");
        hours = in.nextInt();
        System.out.println("Παρακαλώ εισάγετε λεπτά");
        minutes = in.nextInt();
        System.out.println("Παρακαλώ εισάγετε δευτερόλεπτα");
        seconds = in.nextInt();

        totalSeconds = days * SEC_PER_DAY + hours * SEC_PER_HOUR + minutes * SEC_PER_MINUTE + seconds;

        System.out.printf("Το σύνολο του χρόνου σε δευτερόλεπτα είναι %,d", totalSeconds);
    }
}
