package week_05.assignments;

import java.util.Scanner;

public class Question_05_38 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer : ");

        int decimalNumber = input.nextInt();

        int quotient = decimalNumber;


        String octalNumber = "";

        String remainder = "";


        while (quotient != 0) {

            remainder = Integer.toString(quotient % 8);

            quotient = quotient / 8;

            octalNumber = remainder.concat(octalNumber);

        }

        System.out.printf("The octal of %d is %s", decimalNumber, octalNumber);


    }
}
