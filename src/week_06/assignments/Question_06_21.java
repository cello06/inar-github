package week_06.assignments;

import java.util.Locale;
import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String strOfUser = input.nextLine();

        printNumber(strOfUser);
    }

    public static void printNumber(String unarrangedNumber) {
        String arrangedNumber = "";

        unarrangedNumber = unarrangedNumber.toUpperCase(Locale.ROOT);

        for (int i = 0; i < unarrangedNumber.length(); i++) {

            if (Character.isLetter(unarrangedNumber.charAt(i))) {

                arrangedNumber += getNumber(unarrangedNumber.charAt(i));

            } else {

                arrangedNumber += unarrangedNumber.charAt(i);
            }
        }
        System.out.println(arrangedNumber);
    }

    public static int getNumber(char uppercaseLetter) {
        int number = 0;

        if (uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C') {
            number = 2;
        } else if (uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F') {
            number = 3;
        } else if (uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I') {
            number = 4;
        } else if (uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L') {
            number = 5;
        } else if (uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O') {
            number = 6;
        } else if (uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R' || uppercaseLetter == 'S') {
            number = 7;
        } else if (uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V') {
            number = 8;
        } else if (uppercaseLetter == 'W' || uppercaseLetter == 'X' || uppercaseLetter == 'Y' || uppercaseLetter == 'Z') {
            number = 9;
        } else {
            System.out.println("Invalid Character!");
        }
        return number;
    }
}
