package gr.aueb.cf.ch7;

public class SplitStr {

    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";

        String[] tokens = s.split("\\s+");

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
