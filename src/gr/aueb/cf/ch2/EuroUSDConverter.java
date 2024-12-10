package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUSDConverter {

    public static void main(String[] args) {

        int euro = 0;
        int usdCents = 0;
        int dollars = 0;
        int cents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε ακέραιο ποσό σε Ευρώ");
        euro = in.nextInt();

        usdCents = euro * PARITY;
        dollars = usdCents / 100;
        cents = usdCents % 100;

        System.out.printf("Η ισοτιμία είναι %d δολλάρια και %d σεντς", dollars, cents);
    }
}
