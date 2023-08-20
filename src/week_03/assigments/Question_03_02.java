package week_03.assigments;

import java.util.Scanner;

public class Question_03_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean result;
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);
        int sumOfNumber = number1 + number2 + number3;
        System.out.print("What is " + number1 + " + " + number2 + " + " +
                number3 + " = ? ");
        int answer = input.nextInt();
        if (answer == sumOfNumber) {
            result = true;
        } else {
            result = false;
        }

        System.out.println(number1 + " + " + number2 + " + " +
                number3 + " = " + answer + " is " + result);
    }
}
