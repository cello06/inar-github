package week_06.assignments;

import java.util.Scanner;

public class Question_06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String stringOfUser = input.nextLine();

        int letterNumber = countLetter(stringOfUser);

        System.out.printf("The number of letters in the string \n%s : %d", stringOfUser, letterNumber);
    }

    public static int countLetter(String s) {
        int countOfLetters = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                countOfLetters++;
            }
        }
        return countOfLetters;
    }
}
