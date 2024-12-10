package gr.aueb.cf.ch2;

import java.util.Scanner;

public class SecondsToDateTimeConverter {
    public static void main(String[] args) {
        int totalSeconds;
        int remainingSeconds;
        int days;
        int hours;
        int minutes;
        int seconds;
        final int SEC_PER_DAY = 86400;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MIN = 60;
        Scanner in = new Scanner(System.in);

        System.out.println("Εισάγετε συνολικό χρόνο σε δευτερόλεπτα");
        totalSeconds = in.nextInt();

        days = totalSeconds / SEC_PER_DAY;
        remainingSeconds = totalSeconds % SEC_PER_DAY;

        hours = remainingSeconds / SEC_PER_HOUR;
        remainingSeconds = totalSeconds % SEC_PER_HOUR;

        minutes = remainingSeconds / SEC_PER_MIN;
        remainingSeconds = totalSeconds % SEC_PER_MIN;

        seconds = remainingSeconds;

        System.out.printf("Τα %d δευτερόλεπτα ισούνται %d με μερες, %d ώρες, %d λεπτά και %d δευτερόλεπτα.", totalSeconds, days, hours, minutes, seconds);
    }
}
