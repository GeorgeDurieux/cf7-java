package gr.aueb.cf.ch5;

import java.util.Scanner;

public class StarsApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;

        do {
            printMenu();
            choice = scanner.nextInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Λάθος επιλογή");
                continue;
            }

            if (choice == 6) {
                System.out.println("Έξοδος...");
                break;
            }

            doOnChoice(choice);

        } while (choice != 6);
    }

    public static void printMenu() {
        System.out.println("Παρακαλώ επιλέξτε:");
        System.out.println("1) Ν αστεράκια οριζόνιτα");
        System.out.println("2) Ν αστεράκια κάθετα");
        System.out.println("3) Ν γραμμές με n αστεράκια");
        System.out.println("4) N γραμμές με αστεράκια από 1 έως n");
        System.out.println("5) N γραμμές με αστεράκια από n έως 1");
        System.out.println("6) Έξοδος");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6;
    }

    public static void doOnChoice(int choice) {
        int n;

        System.out.println("Παρακαλώ εισάγετε αριθμό αστεριών (n)");
        n = scanner.nextInt();

        switch (choice) {
            case 1:
                printLine(n);
                break;
            case 2:
                printColumn(n);
                break;
            case 3:
                printBox(n);
                break;
            case 4:
                printIncreasing(n);
                break;
            case 5:
                printDecreasing(n);
                break;
            default:
                System.out.println("Λάθος επιλογή");
                break;
        }
    }

    public static void printLine(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void printColumn(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void printBox(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(n);
            System.out.println(n);
        }
    }

    public static void printIncreasing(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(i);
            System.out.println();
        }
    }

    public static void printDecreasing(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(n + 1 - i);
            System.out.println();
        }
    }
}
