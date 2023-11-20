package week_12.assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers to sum :");
        boolean condition = true;
        while (condition) {
            try {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println
                        ("Sum of " + num1 + " + " + num2 + " = " + (num1 + num2));
                condition = false;
            } catch (InputMismatchException ex) {
                System.out.println(ex +
                        "\nWrong input !! Please enter integer -->");
                input.nextLine();
            }
        }
    }
}
