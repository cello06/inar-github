package week_13.assignments.tests;

import week_13.assignments.classes.FixedRational;

import java.math.BigInteger;
import java.util.Scanner;

public class Question_13_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FixedRational result;
        boolean condition = true;
        while (condition) {
            try {
                System.out.print("Enter a decimal number : ");

                String decimalNumber = input.next();
                if (!decimalNumber.contains(".")) {
                    if (stringCheck(decimalNumber)) {
                        result = new FixedRational(new BigInteger(decimalNumber), BigInteger.ONE);
                    } else {
                        throw new RuntimeException("Wrong input! you need to enter digit!\n" +
                                "Or you need to use '.' for separation");
                    }
                } else {
                    String[] parts = decimalNumber.split("\\.");
                    if (parts.length != 2) {
                        throw new RuntimeException("Your decimal number can contain only one point!");
                    } else {
                        String numerator;
                        String denominator;
                        if (!parts[0].equals("0")) {
                            numerator = parts[0] + parts[1];
                        } else {
                            numerator = parts[1];
                        }
                        denominator = findDenominator(parts[1]);
                        result = new FixedRational(new BigInteger(numerator), new BigInteger(denominator));
                    }
                }
                System.out.println("The rational number is " + result);
                condition = false;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                input.nextLine();
            }
        }
    }

    public static boolean stringCheck(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String findDenominator(String fractionalPart) {
        StringBuilder result = new StringBuilder("1");
        for (int i = 0; i < fractionalPart.length(); i++) {
            result.append("0");
        }
        return result.toString();
    }
}
