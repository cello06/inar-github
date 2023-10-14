package week_08.live_class;

import java.util.Scanner;

public class CheckSudokuSolution {
    public static void main(String[] args) {
        int[][] grid = readSolution();
        System.out.println(isValid(grid) ? " Valid solution" : " Invalid solution");
    }

    public static int[][] readSolution() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Sudoku puzzle solution : ");
        int[][] grid = new int[9][9];
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                grid[row][column] = input.nextInt();
            }
        }
        return grid;
    }

    public static boolean isValid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(int i, int j, int[][] grid) {
        for (int column = 0; column < grid.length; column++) {
            if (column != j && grid[i][column] == grid[i][j]) {
                return false;
            }
        }
        for (int row = 0; row < grid.length; row++) {
            if (row != i && grid[row][j] == grid[i][j]) {
                return false;
            }
        }
        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
            for (int column = (j / 3) * 3; column < (j / 3) * 3 + 3; column++) {
                if (row != i && column != j && grid[row][column] == grid[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
