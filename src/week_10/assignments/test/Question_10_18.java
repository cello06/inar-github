package week_10.assignments.test;

import java.math.BigDecimal;
import java.math.MathContext;

public class Question_10_18 {
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal(Long.MAX_VALUE);
        int count = 0;

        while (count < 5) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigDecimal.ONE);
        }
    }

    public static boolean isPrime(BigDecimal number) {

        MathContext mc = new MathContext(10);
        BigDecimal sqrtOfNumber = number.sqrt(mc);
        BigDecimal two = BigDecimal.valueOf(2);

        for (BigDecimal i = two; i.compareTo(sqrtOfNumber) == 0; i = i.add(BigDecimal.ONE)) {
            if (number.remainder(i).equals(BigDecimal.ZERO)) {
                return false;
            }
        }
        return true;
    }
}
