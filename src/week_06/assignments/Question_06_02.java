package week_06.assignments;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer :");
        long numberOfUser = input.nextLong();

        int sumOfDigits = sumDigits(numberOfUser);
        System.out.printf("The sum of the digits in %d is %d", numberOfUser, sumOfDigits);
    }

    public static int sumDigits(long number) {
        long sumOfDigits = 0;

        while (number > 0) {
            sumOfDigits += number % 10;
            number = number / 10;
        }
        return (int) sumOfDigits;
    }
}
