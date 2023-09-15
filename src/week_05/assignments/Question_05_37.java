package week_05.assignments;

import java.util.Scanner;

public class Question_05_37 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer : ");

        int decimalNumber = input.nextInt();

        int quotient = decimalNumber;

        String binaryNumber = "";

        String remainder = "";


        while (quotient != 0) {

            remainder = Integer.toString(quotient % 2);

            quotient = quotient / 2;

            binaryNumber = remainder.concat(binaryNumber);
        }

        System.out.printf("The binary value of the decimal \"%d\" is : %s",decimalNumber,binaryNumber);


    }
}
