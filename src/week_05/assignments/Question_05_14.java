package week_05.assignments;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gcd = 1;


        System.out.print("Enter first integer : ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer : ");
        int number2 = input.nextInt();

        //swapping...
        if (number1 > number2) {
            int temp = number2;
            number2 = number1;
            number1 = temp;
        }


        for (int i = 1; i <= number1; i++) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                gcd = i;
            }
        }

        System.out.printf("The greatest common divisor for %d and %d is %d",
                number1, number2, gcd);
    }
}
