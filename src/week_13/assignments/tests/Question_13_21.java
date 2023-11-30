package week_13.assignments.tests;

import week_13.assignments.classes.FixedRational;

import java.math.BigInteger;
import java.util.Scanner;

public class Question_13_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c : ");
        FixedRational a = new FixedRational(new BigInteger(String.valueOf(input.nextInt())), BigInteger.ONE);
        FixedRational b = new FixedRational(new BigInteger(String.valueOf(input.nextInt())), BigInteger.ONE);
        FixedRational c = new FixedRational(new BigInteger(String.valueOf(input.nextInt())), BigInteger.ONE);

        FixedRational negativeONE = new FixedRational(new BigInteger("-1"), BigInteger.ONE);
        FixedRational two = new FixedRational(new BigInteger("2"), BigInteger.ONE);
        FixedRational h = b.multiply(negativeONE).divide(a.multiply(two));
        FixedRational k = a.multiply(h.multiply(h)).add(b.multiply(h)).add(c);
        System.out.println("h is --> " + h + "  k is --> " + k);
    }
}
