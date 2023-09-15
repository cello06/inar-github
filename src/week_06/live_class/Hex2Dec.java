package week_06.live_class;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a heximal number : ");
        String hexNumber = input.nextLine();
        int decimalNumber = hex2Dec(hexNumber);
        System.out.println(decimalNumber);
    }

    public static int hex2Dec(String hexNumber) {
        int decimal = 0;

        for (int i = 0; i < hexNumber.length(); i++) {
            if (Character.isDigit(hexNumber.charAt(i))) {
                decimal += Integer.parseInt("" + hexNumber.charAt(i)) * (Math.pow(16, (hexNumber.length() - (i + 1))));
            } else {
                decimal += decimalOfHexChar(hexNumber.charAt(i), hexNumber.length(), i);
            }
        }
        return decimal;
    }

    public static int decimalOfHexChar(char hex, int lengthOfNumber, int index) {
        int multiplayer = 0;
        int result = 0;
        switch (hex) {
            case 'A':
                multiplayer = 10;
                break;
            case 'B':
                multiplayer = 11;
                break;
            case 'C':
                multiplayer = 12;
                break;
            case 'D':
                multiplayer = 13;
                break;
            case 'E':
                multiplayer = 14;
                break;
            case 'F':
                multiplayer = 15;
                break;
            default:
                System.out.println("Wrong char value for Heximal number !");
        }
        result = multiplayer * (int) Math.pow(16, (lengthOfNumber - (index + 1)));
        return result;
    }
}
