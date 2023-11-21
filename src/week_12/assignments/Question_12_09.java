package week_12.assignments;

import week_12.assignments.classes.BinaryFormatException;

import java.util.Scanner;

public class Question_12_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        String binary = input.nextLine();
        try {
            int decimal = bin2Dec(binary);
            System.out.println("The decimal value for binary number " +
                    binary + " is " + decimal);

        } catch (BinaryFormatException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static int bin2Dec(String binary)
            throws BinaryFormatException {
        int decimal = 0;
        int exponent = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            char charOfBinary = binary.charAt(i);
            decimal += charToDec(charOfBinary, exponent);
            exponent++;
        }
        return decimal;
    }

    public static int charToDec(char ch, int exponent)
            throws BinaryFormatException {
        if (ch == '1') {
            return (int) (Math.pow(2, exponent));
        } else if (ch == '0') {
            return 0;
        } else {
            throw new BinaryFormatException();
        }
    }
}
