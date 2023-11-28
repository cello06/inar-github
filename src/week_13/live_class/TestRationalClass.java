package week_13.live_class;

import java.math.BigInteger;

public class TestRationalClass {
    public static void main(String[] args) {
        FixedRational r1 = new FixedRational(new BigInteger("1"),new BigInteger("3"));

        FixedRational r2 = new FixedRational(new BigInteger("1"),new BigInteger("3"));
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
