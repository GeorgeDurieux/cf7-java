package gr.aueb.cf.ch1;

/**
 * Calculates the sum of 2 integers
 * and the result is printed ath the console
 * (standard output)
 */
public class AddApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελεσμάτων
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Το άθροισμα των " + num1 + " και " + num2 + " είναι ίσο με: " + result); //Multiple concatenation
        System.out.printf("Το άθροισμα των %d και %d είναι ίσο με: %d\n", num1, num2, result); //No concatenation
    }
}
