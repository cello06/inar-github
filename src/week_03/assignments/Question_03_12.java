package week_03.assignments;

import java.util.Scanner;

public class Question_03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer : ");
        int number = input.nextInt();
        /*A number is palindrome f it reads
        the same from right to left and from
         left to right. So onesplace and hundreds place
         must be equal.
         */
        int onesplaceOfNumber = number % 10;
        int hundredsplaceOfNumber = number / 100;
        if (onesplaceOfNumber == hundredsplaceOfNumber) {
            System.out.println(number + " is a pelindrome");
        } else {
            System.out.println(number + " is not a pelindrome");
        }
    }
}
