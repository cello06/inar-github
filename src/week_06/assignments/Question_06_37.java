package week_06.assignments;

import java.util.Scanner;

public class Question_06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and its width :");
        int number = input.nextInt();
        int width = input.nextInt();
        String formattedNumber = format(number, width);
        System.out.printf("%d formatted to width %d : %s", number, width, formattedNumber);
    }

    public static String format(int number, int width) {
        String stringOfNumber = Integer.toString(number);


        for (int i = stringOfNumber.length(); i < width; i++) {
            stringOfNumber = "0".concat(stringOfNumber);
        }
        return stringOfNumber;
    }
}
