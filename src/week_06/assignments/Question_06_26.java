package week_06.assignments;

public class Question_06_26 {
    public static void main(String[] args) {
        printPalindromicPrimeNumber();
    }

    public static void printPalindromicPrimeNumber() {
        final int COUNT_OF_PALINDROMIC_PRIME_NUMBER = 100;
        final int PALINDROMIC_PRIME_NUMBER_PER_LINE = 10;

        int count = 0;
        int number = 2;

        while (count < COUNT_OF_PALINDROMIC_PRIME_NUMBER) {
            if (isPrime(number) && isPalindrome(number)) {
                if (count % PALINDROMIC_PRIME_NUMBER_PER_LINE == 0) {
                    System.out.printf("\n%-10d", number);
                } else {
                    System.out.printf("%-10d", number);
                }
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        String strOfNumber = Integer.toString(number);
        int firstIndexOfStrOfNumber = 0;
        int lastIndexOfStrOfNumber = strOfNumber.length() - 1;

        while (firstIndexOfStrOfNumber <= lastIndexOfStrOfNumber) {
            if (strOfNumber.charAt(firstIndexOfStrOfNumber) != strOfNumber.charAt(lastIndexOfStrOfNumber)) {
                return false;
            }
            firstIndexOfStrOfNumber++;
            lastIndexOfStrOfNumber--;
        }
        return true;
    }

}
