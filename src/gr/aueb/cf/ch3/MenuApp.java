package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter choice");
            choice = scanner.nextInt();

            if (choice > 5 || choice < 1) {
                System.out.println("Please enter a valid number");
                continue;
            }

            if (choice == 1) {
                System.out.println("Εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Διαγραφή");
            } else if (choice == 3) {
                System.out.println("Ενημέρωση");
            } else if (choice == 4) {
                System.out.println("Αναζήτηση");
            } else {
                System.out.println("Έξοδος");
                break;
            }
        } while (true);
    }
}
