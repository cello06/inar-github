package week_06.assignments;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int numberOfUser = input.nextInt();

        if (isPalindrome(numberOfUser)) {
            System.out.printf("%d is a palindrome.", numberOfUser);
        } else {
            System.out.printf("%d is not a palindrome.", numberOfUser);
        }
    }

    public static boolean isPalindrome(int number) {
        if (number == reverse(number)) {
            return true;
        } else {
            return false;
        }
    }

    public static int reverse(int number) {
        String strOfReversedNumber = "";

        while (number > 0) {
            strOfReversedNumber += number % 10;
            number = number / 10;
        }
        int reversedNumber = Integer.parseInt(strOfReversedNumber);

        return reversedNumber;
    }
}
