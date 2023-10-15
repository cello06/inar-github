package week_08.assignments;

import java.util.Scanner;

public class Question_08_09 {
    public static void main(String[] args) {
        gameOfTicTacToe();// :)
    }

    public static void gameOfTicTacToe() {
        Scanner input = new Scanner(System.in);
        char[][] ticTacToeGrid = new char[3][3];
        fillWithBlank(ticTacToeGrid);
        while (true) {
            printGameGrid(ticTacToeGrid);

            System.out.print("Enter a row(0,1 or 2) for player X : ");
            int rowX = input.nextInt();
            System.out.print("Enter a column(0,1 or 2) for player X : ");
            int columnX = input.nextInt();
            ticTacToeGrid[rowX][columnX] = 'X';

            if (isGameFinished(ticTacToeGrid)) {
                printGameGrid(ticTacToeGrid);
                System.out.println("X player won");
                break;
            }
            if (isGameDraw(ticTacToeGrid)) {
                System.out.println("It is a draw");
                break;
            }

            printGameGrid(ticTacToeGrid);

            System.out.print("Enter a row(0,1 or 2) for player O : ");
            int rowO = input.nextInt();
            System.out.print("Enter a column(0,1 or 2) for player O : ");
            int columnO = input.nextInt();
            ticTacToeGrid[rowO][columnO] = 'O';

            if (isGameFinished(ticTacToeGrid)) {
                printGameGrid(ticTacToeGrid);
                System.out.println("O player won");
                break;
            }
            if (isGameDraw(ticTacToeGrid)) {
                printGameGrid(ticTacToeGrid);
                System.out.println("It is a draw");
                break;
            }
        }
    }

    public static void printGameGrid(char[][] ticTacToeGrid) {
        for (int row = 0; row < ticTacToeGrid.length; row++) {
            System.out.print("-------------\n| ");
            for (int column = 0; column < ticTacToeGrid[row].length; column++) {
                System.out.print(ticTacToeGrid[row][column] + " | ");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }

    public static boolean isGameFinished(char[][] ticTacToeGrid) {
        //row check
        for (int row = 0; row < ticTacToeGrid.length; row++) {
            if ((ticTacToeGrid[row][0] == 'X' &&
                    ticTacToeGrid[row][1] == 'X'
                    && ticTacToeGrid[row][2] == 'X') ||
                    (ticTacToeGrid[row][0] == 'O' &&
                            ticTacToeGrid[row][1] == 'O'
                            && ticTacToeGrid[row][2] == 'O')) {
                return true;
            }
        }
        // column check
        for (int column = 0; column < ticTacToeGrid[0].length; column++) {
            if ((ticTacToeGrid[0][column] == 'X' &&
                    ticTacToeGrid[1][column] == 'X'
                    && ticTacToeGrid[2][column] == 'X') ||
                    (ticTacToeGrid[0][column] == 'O' &&
                            ticTacToeGrid[1][column] == 'O'
                            && ticTacToeGrid[2][column] == 'O')) {
                return true;
            }
        }
        //diagonal check
        if ((ticTacToeGrid[0][0] == 'X'
                && ticTacToeGrid[1][1] == 'X'
                && ticTacToeGrid[2][2] == 'X') ||
                (ticTacToeGrid[0][2] == 'X'
                        && ticTacToeGrid[1][1] == 'X'
                        && ticTacToeGrid[2][0] == 'X') ||
                (ticTacToeGrid[0][0] == 'O'
                        && ticTacToeGrid[1][1] == 'O'
                        && ticTacToeGrid[2][2] == 'O') ||
                (ticTacToeGrid[0][2] == 'O'
                        && ticTacToeGrid[1][1] == 'O'
                        && ticTacToeGrid[2][0] == 'O')) {
            return true;
        }
        return false;
    }

    public static void fillWithBlank(char[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                grid[row][column] = ' ';
            }
        }
    }

    public static boolean isGameDraw(char[][] grid) {
        int countOfSpace = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if (grid[row][column] == ' ') {
                    countOfSpace++;
                }
            }
        }
        return countOfSpace == 0;
    }
}
