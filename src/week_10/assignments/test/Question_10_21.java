package week_10.assignments.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Question_10_21 {
    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal(Long.MAX_VALUE);
        int count = 0;
        while (count < 10) {
            if (isDivisibleBy5(decimal) || isDivisibleBy6(decimal)) {
                System.out.println(decimal);
                count++;
            }
            decimal = decimal.add(BigDecimal.ONE);
        }
    }

    public static boolean isDivisibleBy5(BigDecimal decimal) {
        decimal = decimal.divide(BigDecimal.valueOf(5), 20, RoundingMode.UP);

        BigDecimal decimalPart = decimal.remainder(BigDecimal.ONE);

        return decimalPart.compareTo(BigDecimal.ZERO) == 0;
    }

    public static boolean isDivisibleBy6(BigDecimal decimal) {
        decimal = decimal.divide(BigDecimal.valueOf(6), 20, RoundingMode.UP);

        BigDecimal decimalPart = decimal.remainder(BigDecimal.ONE);

        return decimalPart.compareTo(BigDecimal.ZERO) == 0;
    }
}
