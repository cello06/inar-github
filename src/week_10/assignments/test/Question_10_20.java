package week_10.assignments.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Question_10_20 {
    public static void main(String[] args) {
        System.out.println("The e values for i = 100 to 1000 :");
        System.out.println("i                      e");
        System.out.println("------------------------------------");

        for (int i = 100; i <= 1000; i += 100) {
            BigDecimal e = formula(i);
            System.out.println(i + "    " + e);
        }
    }

    public static BigDecimal formula(int i) {
        BigDecimal result = new BigDecimal(1);

        for (int j = 1; j < i; j++) {
            result = result.add(BigDecimal.ONE.divide(factorial(j), 25, RoundingMode.UP));
        }
        return result;
    }

    public static BigDecimal factorial(int value) {
        BigDecimal result = new BigDecimal(1);
        for (int i = 0; i < value; i++) {
            result = result.multiply(BigDecimal.valueOf(i).add(BigDecimal.ONE));
        }
        return result;
    }
}
