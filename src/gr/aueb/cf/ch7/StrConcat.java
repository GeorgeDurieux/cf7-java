package gr.aueb.cf.ch7;

public class StrConcat {

    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Factory";
        String s3 = s1 + " " + s2; //+ is overloaded
        String s4 = s1.concat(" ").concat(s2);
    }
}