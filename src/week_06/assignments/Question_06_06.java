package week_06.assignments;

import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int numberOfRows = input.nextInt();

        displayPatter(numberOfRows);
    }

    public static void displayPatter(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row - i); j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
