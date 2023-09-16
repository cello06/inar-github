package week_06.assignments;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password : ");
        String password = input.nextLine();

        checkPassword(password);
    }

    public static void checkPassword(String password) {
        if (controlLength(password)
                && controlIfConsistOfLettersAndDigits(password)
                && controlDigitNumber(password)) {
            System.out.print("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean controlLength(String password) {//to control its length
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    //to control if consist of only letters and digits
    public static boolean controlIfConsistOfLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isDigit(password.charAt(i)) ||
                    Character.isLetter(password.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean controlDigitNumber(String password) {//to control if contain at least two digits
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberOfDigits++;
            }
        }
        if (numberOfDigits >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
