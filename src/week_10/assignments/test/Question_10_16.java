package week_10.assignments.test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Question_10_16 {
    public static void main(String[] args) {
        String smallest50DigitNumber = "10000000000000000000000000000000000000000000000000";
        BigInteger integer = new BigInteger(smallest50DigitNumber);

        int count = 0;


        while (count < 10){

            if(isDivisibleBy2(smallest50DigitNumber) || isDivisibleBy3(smallest50DigitNumber)){
                System.out.println(smallest50DigitNumber);
                count++;
            }
            smallest50DigitNumber = integer.add(BigInteger.ONE).toString();
            integer = new BigInteger(smallest50DigitNumber);
        }
    }
    public static boolean isDivisibleBy2(String strOfInteger){
        BigInteger integer = new BigInteger(strOfInteger);
        return integer.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO);
    }
    public static boolean isDivisibleBy3(String strOfInteger){
        BigInteger integer = new BigInteger(strOfInteger);
        return integer.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO);

    }
}
