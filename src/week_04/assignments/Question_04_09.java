package week_04.assignments;

import java.util.Scanner;

public class Question_04_09 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter a character : ");

        char yourChar=input.next().charAt(0);

        int unicodeOfYourChar=(int)yourChar;

        System.out.printf("The Unicode for the character %c is %d",yourChar,unicodeOfYourChar);
    }
}
