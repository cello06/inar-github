package week_13.assignments.tests;

import week_13.assignments.classes.FixedRational;
import week_13.assignments.classes.Rational;

import java.math.BigInteger;

public class Question_13_15 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("4");
        BigInteger b = new BigInteger("8");
        BigInteger c = new BigInteger("1");
        BigInteger d = new BigInteger("3");
        FixedRational r1 = new FixedRational(a, b);
        FixedRational r2 = new FixedRational(c, d);

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
