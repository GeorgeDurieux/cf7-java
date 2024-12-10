package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo.
 */
public class BigIntApp {

    public static void main(String[] args) {
        //Declarations and initializations
        BigInteger bigNum1 = new BigInteger("123456789987654321159357");
        BigInteger bigNum2 = new BigInteger("456123789321654987951753");
        BigInteger result;

        //Commands
        result = bigNum1.add(bigNum2);

        //Result printing
        System.out.printf("%,d", result);
    }
}
