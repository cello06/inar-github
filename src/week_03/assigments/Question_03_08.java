package week_03.assigments;

import java.util.Scanner;

public class Question_03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 integers : ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber && secondNumber > thirdNumber) {
                System.out.println(thirdNumber + " < " + secondNumber + " < " + firstNumber);
            } else if (firstNumber < thirdNumber && secondNumber < thirdNumber) {
                System.out.println(secondNumber + " < " + firstNumber + " < " + thirdNumber);
            } else if (firstNumber > thirdNumber && thirdNumber > secondNumber) {
                System.out.println(secondNumber + " < " + thirdNumber + " < " + firstNumber);
            } else {
                System.exit(1);
            }
        } else if (secondNumber > firstNumber) {
            if (secondNumber > thirdNumber && firstNumber > thirdNumber) {
                System.out.println(thirdNumber + " < " + firstNumber + " < " + secondNumber);
            } else if (secondNumber > thirdNumber && thirdNumber > firstNumber) {
                System.out.println(firstNumber + " < " + thirdNumber + " < " + secondNumber);
            } else if (thirdNumber > secondNumber && thirdNumber > firstNumber) {
                System.out.println(firstNumber + " < " + secondNumber + " < " + thirdNumber);
            } else {
                System.exit(2);
            }
        } else {
            System.exit(3);
        }


    }
}
