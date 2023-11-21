package week_12.assignments.classes;

import java.util.Scanner;

public class Question_12_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number : ");

        String hex = input.nextLine();
        try {
            int hexInt = hexToDec(hex);
            System.out.println("The decimal value for hex number " +
                    hex + " is " + hexInt);

        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int hexToDec(String hex)
            throws NumberFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch)
            throws NumberFormatException {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (Character.isDigit(ch)) {
            return ch - '0';
        } else {
            throw new NumberFormatException("It is not a hex string!");
        }

    }
}
