package gr.aueb.cf.ch5;

public class FactorialRecursive {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(facto(i));
        }
    }

    public static long facto(int n) {
        return (n <= 1) ? 1L : n * facto(n-1);
    }
}
