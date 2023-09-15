package week_04.assignments;

import java.util.Scanner;

public class Question_04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code : ");

        int codeOfASCII = input.nextInt();

        char charOfCode = (char) codeOfASCII;

        System.out.printf("The character for ASCII code %d is %c", codeOfASCII, charOfCode);
    }
}
