package week_05.live_class;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean isPalindrome = false;


        System.out.print("Enter a string : ");

        String yourWord = input.nextLine();

        int lenght = yourWord.length();


        for (int i = 0; i <= (lenght / 2); i++) {

            if (yourWord.charAt(i) != yourWord.charAt(lenght - (i + 1))) {

                System.out.printf("%s is not a palindrome ", yourWord);
                break;

            }

            isPalindrome = true;
        }

        if (isPalindrome) {

            System.out.printf("%s is a palindrome", yourWord);
        }
    }
}
