package week_06.assignments;

public class Question_06_10 {
    public static void main(String[] args) {
        int numberOfPrimeNumber = 0;

        for (int i = 2; i <= 10_000; i++) {
            if (isPrime(i)) {
                numberOfPrimeNumber++;
            }
        }
        System.out.println("The number of prime numbers less than 10_000 is : " + numberOfPrimeNumber);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
