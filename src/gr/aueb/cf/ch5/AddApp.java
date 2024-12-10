package gr.aueb.cf.ch5;

import java.util.Scanner;

public class AddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int sum;
        int sub;

        System.out.println("Provide 2 integers");
        a = scanner.nextInt();
        b = scanner.nextInt();

        sum = add(a, b);
        sub = sub(a, b);

        System.out.println(sum);
        System.out.println(sub);
    }

    /**
     * Adds 2 integers
     *
     * @param a the first
     * @param b the second
     * @return the result
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts 2 integers
     *
     * @param a the one to subtract from
     * @param b the one to be subtracted
     * @return the result
     */
    public static int sub(int a, int b) {
        return a - b;
    }
}
