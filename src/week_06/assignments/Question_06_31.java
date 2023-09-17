package week_06.assignments;

import java.util.Scanner;

public class Question_06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer : ");
        long creditNumber = input.nextLong();
        boolean validityOfCreditNumber = isValid(creditNumber);

        if (validityOfCreditNumber) {
            System.out.print(creditNumber + " is valid.");
        } else {
            System.out.println(creditNumber + " is invalid.");
        }
    }

    public static boolean isValid(long creditNumber) {
        boolean isSizeAvailable = false;

        boolean isFirstDigitAvailable = prefixMatched(creditNumber, 4)
                || prefixMatched(creditNumber, 5)
                || prefixMatched(creditNumber, 37)
                || prefixMatched(creditNumber, 6);

        boolean isSumOfDoubleEvenAndOddAvailable;

        int sizeOfCreditNumber = getSize(creditNumber);
        if (sizeOfCreditNumber >= 13 && sizeOfCreditNumber <= 16) {
            isSizeAvailable = true;
        }

        int sumOfDoubleEvenPlaceNumbers = sumOfDoubleEvenPlace(creditNumber);
        int sumOfOddPlaceNumbers = sumOfOddPlace(creditNumber);

        if ((sumOfDoubleEvenPlaceNumbers + sumOfOddPlaceNumbers) % 10 == 0) {
            isSumOfDoubleEvenAndOddAvailable = true;
        } else {
            isSumOfDoubleEvenAndOddAvailable = false;
        }

        return isSizeAvailable && isFirstDigitAvailable && isSumOfDoubleEvenAndOddAvailable;
    }

    public static boolean prefixMatched(long creditNumber, int trueStartingDigit) {
        String stringOfCreditNumber = String.valueOf(creditNumber);

        if (stringOfCreditNumber.startsWith("" + trueStartingDigit)) {// instead of using getPrefix() I used startsWith() method.
            return true;
        } else {
            return false;
        }
    }

    public static int getSize(long creditNumber) {
        String stringOfCreditNumber = String.valueOf(creditNumber);

        int sizeOfCreditNumber = stringOfCreditNumber.length();
        return sizeOfCreditNumber;
    }

    public static int sumOfDoubleEvenPlace(long creditNumber) {
        String stringOfCreditNumber = String.valueOf(creditNumber);

        int firstEvenDigitToCalculate = getSize(creditNumber) - 2;

        int lastDigitToCalculate = 0;
        int sum = 0;

        if (getSize(creditNumber) % 2 != 0) {
            lastDigitToCalculate = 1;
        }

        while (firstEvenDigitToCalculate >= lastDigitToCalculate) {

            sum += getDigit((stringOfCreditNumber.charAt(firstEvenDigitToCalculate) - '0') * 2);
            firstEvenDigitToCalculate -= 2;
        }
        return sum;
    }

    public static int sumOfOddPlace(long creditNumber) {
        String stringOfCreditNumber = String.valueOf(creditNumber);

        int firstOddDigitToCalculate = getSize(creditNumber) - 1;
        int lastDigitToCalculate = 1;
        int sum = 0;

        if (getSize(creditNumber) % 2 != 0) {
            lastDigitToCalculate = 0;
        }
        while (firstOddDigitToCalculate >= lastDigitToCalculate) {
            sum += stringOfCreditNumber.charAt(firstOddDigitToCalculate) - '0';
            firstOddDigitToCalculate -= 2;
        }
        return sum;

    }

    public static int getDigit(int number) {
        int wantedNumber = 0;

        while (number > 0) {
            wantedNumber += number % 10;
            number /= 10;
        }
        return wantedNumber;
    }
}
