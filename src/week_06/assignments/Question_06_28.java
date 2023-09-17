package week_06.assignments;

public class Question_06_28 {
    public static void main(String[] args) {
        printMersenne();
    }

    public static void printMersenne() {
        final int COUNT_OF_MERSENNE_NUMBER = 31;
        int count = 0;
        int number = 2;
        System.out.printf("%-10s%s", "p", "2^p-1\n");
        System.out.print("----------------");

        while (count < COUNT_OF_MERSENNE_NUMBER) {
            if (isPrime(number)) {
                if (isMersennePrime(number)) {
                    System.out.printf("\n%-10d%5d", number, getMersenne(number));
                    count++;
                }
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

    public static boolean isMersennePrime(int number) {
        int calculatedPrime = getMersenne(number);
        if (isPrime(calculatedPrime)) {
            return true;
        } else {
            return false;
        }
    }

    public static int getMersenne(int number) {
        int calculatedNumber = (int) Math.pow(2, number) - 1;
        return calculatedNumber;
    }
}
