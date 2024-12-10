package gr.aueb.cf.ch5;

public class PowerAppRecursive {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(power(2, i));
        }
    }

    public static long power(int a, int n) {
        return (n == 0) ? 1 : power(a, n-1) * a;
    }
}
