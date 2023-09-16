package week_06.assignments;

import java.util.Scanner;

public class Question_06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n :");
        int nOfMatrix = input.nextInt();

        printMatrix(nOfMatrix);
    }

    public static void printMatrix(int nOfMatrix) {
        int num = 0;
        for (int i = 1; i <= nOfMatrix; i++) {
            for (int j = 1; j <= nOfMatrix; j++) {
                num = (int) (Math.random() * 2);
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
