package week_13.assignments.tests;

import java.math.BigInteger;

public class Question_13_16 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Wrong input '\n" +
                    "Usage : java Question_13_14.java firstRational numerator secondRational");
            System.exit(1);
        }

        try {
            BigInteger[] firstRational = rationalMaker(args[0]);

            BigInteger[] secondRational = rationalMaker(args[2]);

            char numerator = args[1].charAt(0);

            BigInteger[] result;
            switch (numerator) {
                case '+':
                    result = sum(firstRational, secondRational);
                    break;
                case '-':
                    result = subtract(firstRational, secondRational);
                    break;
                case '*':
                    result = multiply(firstRational, secondRational);
                    break;
                case '/':
                    result = divide(firstRational, secondRational);
                    break;
                default:
                    throw new RuntimeException("Wrong numerator for calculation!");
            }

            System.out.println(args[0] + " " + numerator + " " + args[2] + " = " + result[0] + ((!result[1].equals(BigInteger.ONE)) ? "/" + result[1] : ""));

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static BigInteger[] rationalMaker(String rationalNumber) {
        //This method takes String value and after checking it with some
        //if conditions , convert it to a BigInteger array which incorporates
        //numerator and denominator of rational number
        BigInteger[] result = new BigInteger[2];
        try {

            if (!rationalNumber.contains("/") && stringChecker(rationalNumber)) {
                //if it has no '/' and fully digit , then I took it with
                //denominator part is 1. For example if user enter 123 for calculation
                // I made it 123/1 for the calculation.
                result[0] = (new BigInteger(rationalNumber));
                result[1] = new BigInteger("1");
            }
            if (rationalNumber.contains("/")) {
                String[] parts = rationalNumber.split("/");
                if (parts.length != 2) {
                    throw new RuntimeException("Wrong shape for rational number\nIt must be like that --> 'number/number'");
                } else {
                    if (stringChecker(parts[0]) && stringChecker(parts[1])) {
                        result[0] = new BigInteger(parts[0]);
                        result[1] = new BigInteger(parts[1]);
                        simplify(result);

                    } else {
                        throw new RuntimeException("Some characters are not digit!");
                    }
                }
            }

        } catch (RuntimeException ex) {
            throw new RuntimeException(ex);
        }
        return result;
    }

    public static boolean stringChecker(String number) {//This method checks if the string made up from digits
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger[] sum
            (BigInteger[] firstRational, BigInteger[] secondRational) {
        BigInteger[] result = new BigInteger[2];
        result[0] = firstRational[0].multiply(secondRational[1]).add(firstRational[1].multiply(secondRational[0]));
        result[1] = firstRational[1].multiply(secondRational[1]);
        simplify(result);
        return result;
    }

    public static BigInteger[] subtract
            (BigInteger[] firstRational, BigInteger[] secondRational) {
        BigInteger[] result = new BigInteger[2];
        result[0] = firstRational[0].multiply(secondRational[1]).subtract(firstRational[1].multiply(secondRational[0]));
        result[1] = firstRational[1].multiply(secondRational[1]);
        simplify(result);
        return result;
    }

    public static BigInteger[] multiply
            (BigInteger[] firstRational, BigInteger[] secondRational) {
        BigInteger[] result = new BigInteger[2];
        result[0] = firstRational[0].multiply(secondRational[0]);
        result[1] = firstRational[1].multiply(secondRational[1]);
        simplify(result);
        return result;
    }

    public static BigInteger[] divide
            (BigInteger[] firstRational, BigInteger[] secondRational) {
        BigInteger[] result = new BigInteger[2];
        result[0] = firstRational[0].multiply(secondRational[1]);
        result[1] = firstRational[1].multiply(secondRational[0]);
        simplify(result);
        return result;
    }

    public static void simplify(BigInteger[] result) {//I used this method for simplification of rational numbers
        BigInteger gcd = result[0].gcd(result[1]);
        result[1] = result[1].divide(gcd).abs();
        result[0] = ((result[1].compareTo(new BigInteger("0")) == 1) ? new BigInteger("1") : new BigInteger("-1")).multiply((result[0].divide(gcd)));
    }
}
