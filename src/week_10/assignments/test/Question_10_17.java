package week_10.assignments.test;

import java.math.BigDecimal;
import java.math.MathContext;

public class Question_10_17 {
    public static void main(String[] args) {
        String longMax = "" + Long.MAX_VALUE;
        BigDecimal bigDecimal = new BigDecimal(longMax);


        while (true) {
            if (isSquare(longMax)) {
                System.out.println(longMax);
                break;
            }
            longMax = bigDecimal.add(BigDecimal.ONE).toString();
            bigDecimal = new BigDecimal(longMax);
        }
        //first square number is longMax
        String sqrtOfLongMax = sqrt(longMax);
        printNumbers(sqrtOfLongMax);
    }

    public static boolean isSquare(String strOfNumber) {
        BigDecimal number = new BigDecimal(strOfNumber);
        MathContext mc = new MathContext(10); // Hassasiyet için 10 ondalık basamak kullanılacak

        // Karekök hesaplama
        BigDecimal sqrtOfNumber = number.sqrt(mc);

        // Karekökün ondalık kısmını kontrol et
        BigDecimal decimalPart = sqrtOfNumber.remainder(BigDecimal.ONE);

        return decimalPart.compareTo(BigDecimal.ZERO) == 0;

    }

    public static String sqrt(String strOfNumber) {
        BigDecimal number = new BigDecimal(strOfNumber);
        MathContext mc = new MathContext(10); // Hassasiyet için 10 ondalık basamak kullanılacak
        BigDecimal sqrtOfNumber = number.sqrt(mc);
        return sqrtOfNumber.toString();
    }

    public static void printNumbers(String firstNumber) {

        BigDecimal number = new BigDecimal(firstNumber);

        for (int i = 0; i < 10; i++) {
            System.out.println(number.multiply(number));
            firstNumber = number.add(BigDecimal.ONE).toString();
            number = new BigDecimal(firstNumber);
        }
    }
}
