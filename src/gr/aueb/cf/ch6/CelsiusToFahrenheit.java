package gr.aueb.cf.ch6;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsiusTemp;
        double fahrenheitTemp;

        System.out.println("Enter a temperature in celsius");
        celsiusTemp = scanner.nextDouble();

        fahrenheitTemp = convert(celsiusTemp);
        System.out.printf("Temperature in Fahrenheit: %.02f", fahrenheitTemp);
    }

    public static double convert(double celsiusTemp) {
        return celsiusTemp * 9/5 + 32;
    }
}
