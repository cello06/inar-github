package week_13.assignments.tests;

import week_13.assignments.classes.FixedRational;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Question_13_16 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Wrong input '\n" +
                    "Usage : java Question_13_14.java firstRational numerator secondRational");
            System.exit(1);
        }

        try {
            ArrayList<BigInteger> firstRational = rationalMaker(args[0]);

            ArrayList<BigInteger> secondRational = rationalMaker(args[2]);
            char numerator = args[1].charAt(0);
            BigDecimal result;
            switch (numerator) {
                case '+':
                    result = sum(firstRational, secondRational);
                case '-':
                    result = substract(firstRational, secondRational);
                case '*':
                    result = multiply(firstRational, secondRational);
                case '/':
                    result = divide(firstRational, secondRational);
                default:
                    throw new RuntimeException("Wrong numerator for calculation!");

            }
            System.out.println(args[0] + " " + numerator + " " + args[2] + " = " + result);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<BigInteger> rationalMaker(String rationalNumber) {
        try {
            ArrayList<BigInteger> result = new ArrayList<>();

            if (!rationalNumber.contains("/") && stringChecker(rationalNumber)) {
                result.add(new BigInteger(rationalNumber));
            }
            
        }
    }
}
