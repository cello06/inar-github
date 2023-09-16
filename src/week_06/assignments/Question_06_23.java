package week_06.assignments;

import java.util.Scanner;

public class Question_06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String strOfUser = input.nextLine();

        System.out.print("Enter a character that you want to count : ");
        char characterToCount = input.next().charAt(0);

        int countOfCharacterOfUser = count(strOfUser, characterToCount);

        System.out.println(countOfCharacterOfUser);
    }

    public static int count(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
