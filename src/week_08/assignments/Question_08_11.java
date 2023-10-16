package week_08.assignments;

import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {
        int[][] headsTails = getAllPossibilities();
        char[][] headsAndTailsInChar = convertToChar(headsTails);
        printResult(headsAndTailsInChar);
    }

    public static int[][] getAllPossibilities() {
        int[][] headsTails = new int[512][9];
        for (int matrix = 0; matrix < headsTails.length; matrix++) {
            for (int headOrTail = 0; headOrTail < headsTails[matrix].length; headOrTail++) {
                headsTails[matrix][headOrTail] = (int) (Math.random() * 2);
            }
            for (int i = 0; i < matrix; i++) {
                if (java.util.Arrays.equals(headsTails[i], headsTails[matrix])) {
                    matrix--;
                    break;
                }
            }

        }
        return headsTails;
    }

    public static char[][] convertToChar(int[][] headsTails) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511 : ");
        int checkNumber = input.nextInt();
        int count = 0;

        char[][] result = new char[3][3];
        for (int row = 0; row < result.length; row++) {
            for (int column = 0; column < result[row].length; column++) {
                if (headsTails[checkNumber][count] == 0) {
                    result[row][column] = 'H';
                } else {
                    result[row][column] = 'T';
                }
                count++;
            }
        }
        return result;
    }

    public static void printResult(char[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
