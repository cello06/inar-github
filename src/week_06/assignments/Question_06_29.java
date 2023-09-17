package week_06.assignments;

public class Question_06_29 {
    public static void main(String[] args) {
        printTwinPrime();
    }

    public static void printTwinPrime() {
        final int COUNT_OF_TWIN_PRIME = 1000;

        int number = 2;

        while (number <= COUNT_OF_TWIN_PRIME) {
            if (isPrime(number) && isPrime(number + 2)) {
                System.out.printf("(%d,%d)\n", number, number + 2);
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
}
