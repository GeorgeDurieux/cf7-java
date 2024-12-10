package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose one:");
            System.out.println("One-player game");
            System.out.println("Two-player game");
            System.out.println("Team game");
            System.out.println("Quit");

            choice = scanner.nextInt();
//            if (choice < 1 || choice > 4) {
//                System.out.println("Choice must be between 1 and 4");
//                System.out.println("Try again");
//                continue;
//            }
//
//            if (choice == 1) {
//                System.out.println("One-player game started");
//            } else if (choice == 2) {
//                System.out.println("Two-player game started");
//            } else if (choice == 3) {
//                System.out.println("Three-player game started");
//            } else {
//                System.out.println("Quitting");
//            }

            switch (choice) {
                case 1:
                    System.out.println("One-player game started");
                    break;
                case 2:
                    System.out.println("Two-player game started");
                    break;
                case 3:
                    System.out.println("Three-player game started");
                    break;
                case 4:
                    System.out.println("Quitting");
                    break;
                default:
                    break;
            }

        } while (choice != 4);
    }
}
