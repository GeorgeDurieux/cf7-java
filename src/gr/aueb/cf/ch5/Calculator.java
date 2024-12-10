package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int result;

        while(true) {
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Error!Choice must be between 1 and 6.");
                continue;
            }

            if (choice == 6) {
                System.out.println("Έξοδος...");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Result: " + result);
        }
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε:");
        System.out.println("Πρόσθεση");
        System.out.println("Αφαίρεση");
        System.out.println("Πολλαπλασιασμός");
        System.out.println("Διαίρεση");
        System.out.println("Υπόλοιπο διάιρεσης");
        System.out.println("Έξοδος");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6;
    }

    public static int getResultOnChoice(int choice) {
        int num1;
        int num2;
        int result = 0;

        System.out.println("Παρακαλώ εισάγετε 2 ακεραίους");
        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            default:
                System.out.println("Error in choice.");
                break;
        }

        return result;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) return 0;
        return a / b;
    }

    public static int mod(int a, int b) {
        if (b == 0) return 0;
        return a % b;
    }
}
