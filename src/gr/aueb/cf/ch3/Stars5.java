package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Stars5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int j = 1;
        int n;

        System.out.println("How many stars?");
        n = scanner.nextInt();

        while (i <= n) {

            while (j <= n - i + 1) {
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
            j = 1;
        }
    }
}
