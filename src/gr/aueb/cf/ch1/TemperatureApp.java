package gr.aueb.cf.ch1;

import java.util.Scanner;

public class TemperatureApp {
    public static void main(String[] args) {

        float fahrenheit;
        float celsius;
        Scanner in = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε θερμοκρασία σε Φάρεναϊτ");
        fahrenheit = in.nextInt();

        celsius = 5f/9f * (fahrenheit - 32);

        System.out.printf("Οι %.1f βαθμοί Φάρεναϊτ είναι ίσοι με %.1f βαθμούς Κεσίου.", fahrenheit, celsius);
    }
}
