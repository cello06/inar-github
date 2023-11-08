package week_10.assignments.test;

import java.math.BigDecimal;
import java.math.MathContext;

public class Question_10_19 {
    public static void main(String[] args) {
        int number = 2;
        System.out.println("p       2^p - 1");
        while (number < 100) {
            BigDecimal mersennePrime = BigDecimal.valueOf(Math.pow(2, number) - 1);
            if (isPrime(number) && isPrime(mersennePrime)) {
                System.out.println(number + "        " + mersennePrime);
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(BigDecimal number) {
        BigDecimal sqrtOfNumber = number.sqrt(MathContext.DECIMAL64);
        for (BigDecimal i = BigDecimal.valueOf(2); i.compareTo(sqrtOfNumber) == 0; i = i.add(BigDecimal.ONE)) {
            if (number.remainder(i).equals(BigDecimal.ZERO)) {
                return false;
            }
        }
        return true;
    }
}
