package week_08.assignments;

import java.util.Scanner;

public class Question_08_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] grid = new char[3][3];
        displayTable(grid);
        char[] tokens = {'X', 'O'};

        do {
            System.out.print("Enter a row(0 ,1 or 2) for player " + tokens[0] + " :");
            int row = input.nextInt();
            System.out.print("Enter a column(0 ,1 or 2) for player " + tokens[0] + " :");
            int column = input.nextInt();
            if (isAvailable(row, column, grid)) {
                putToken(row, column, grid, tokens[0]);
                displayTable(grid);
                swapTokens(tokens);
            } else {
                System.out.println("Invalid input ");
            }

        } while (!isWin(grid) && !isDraw(grid));

        if (isWin(grid)) {
            System.out.println(tokens[1] + " player won");
        } else {
            System.out.println("it is draw!");
        }
    }

    public static void displayTable(char[][] grid) {
        System.out.println("---------------");
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                System.out.print("| " + (grid[row][column] == (char) (0) ? "  " : grid[row][column] + " "));
            }
            System.out.println("|");
            System.out.println("---------------");
        }
    }

    public static boolean isAvailable(int row, int column, char[][] grid) {
        if (row < 0 || row > 2 || column < 0 || column > 2) {
            return false;
        }
        if (grid[row][column] != (char) (0)) {
            return false;
        }
        return true;
    }

    public static void putToken(int row, int column, char[][] grid, char token) {
        grid[row][column] = token;
    }

    public static void swapTokens(char[] tokens) {
        char temp = tokens[0];
        tokens[0] = tokens[1];
        tokens[1] = temp;
    }

    public static boolean isWin(char[][] grid) {
        return rowCheck(grid) || columnCheck(grid) || diagonalsCheck(grid);
    }

    public static boolean rowCheck(char[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            int count = 0;
            for (int column = 0; column < grid[row].length - 1; column++) {
                if (grid[row][column] != (char) (0) && grid[row][column] == grid[row][column + 1]) {
                    count++;
                }
                if (count == grid.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean columnCheck(char[][] grid) {
        for (int col = 0; col < grid[0].length; col++) {
            int count = 0;
            for (int row = 0; row < grid.length - 1; row++) {
                if (grid[row][col] != (char) (0) && grid[row][col] == grid[row + 1][col]) {
                    count++;
                }
                if (count == grid.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean diagonalsCheck(char[][] grid) {
        int count = 0;
        for (int row = 0; row < grid.length - 1; row++) {
            if (grid[row][row] != (char) (0) && grid[row][row] == grid[row + 1][row + 1]) {
                count++;
            }
            if (count == grid.length - 1) {
                return true;
            }
        }
        count = 0;
        for (int row = 0, column = grid[0].length - 1; row < grid.length - 1; column--, row++) {
            if (grid[row][column] != (char) (0) && grid[row][column] == grid[row + 1][column - 1]) {
                count++;
            }
            if (count == grid.length - 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDraw(char[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if (grid[row][column] == (char) (0)) {
                    return false;
                }
            }
        }
        return true;
    }
}
