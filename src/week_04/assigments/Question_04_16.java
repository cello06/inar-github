package week_04.assigments;

import java.util.Scanner;

public class Question_04_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int unicodeOfUpperCaseLetter = (int) (Math.random() * (90 - 65)) + 65;

        System.out.print((char) (unicodeOfUpperCaseLetter));

    }
}
