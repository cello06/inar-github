package week_02.assignments;

import java.util.Scanner;

public class Question_02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int onesPlace = (number % 100) % 10;
        int tensPlace = (number / 10) % 10;
        int hudredsPlace = (number / 100);
        System.out.println("The sum of the digits is " + (hudredsPlace + tensPlace + onesPlace));
    }
}
