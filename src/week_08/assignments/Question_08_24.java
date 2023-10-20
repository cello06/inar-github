package week_08.assignments;

import java.util.Scanner;

public class Question_08_24 {
    public static void main(String[] args) {
        int[][] sudokuGrid = getSudokuGrid();
        printValidityOfGrid(sudokuGrid);
    }

    public static int[][] getSudokuGrid() {
        Scanner input = new Scanner(System.in);
        int[][] sudokuGrid = new int[9][9];

        System.out.println("Enter a Sudoku puzzle solution : ");
        for (int row = 0; row < sudokuGrid.length; row++) {
            for (int column = 0; column < sudokuGrid[row].length; column++) {
                int number = input.nextInt();
                if (isAvailable(number)) {
                    sudokuGrid[row][column] = number;
                } else {
                    System.out.println("Invalid input!");
                    column--;
                }

            }
        }
        return sudokuGrid;
    }

    public static boolean isAvailable(int number) {
        return number >= 1 && number <= 9;
    }

    public static void printValidityOfGrid(int[][] grid) {
        System.out.println((isGridValid(grid) ? "Valid " : "Invalid ") + "solution");
    }

    public static boolean isGridValid(int[][] grid) {
        return checkRows(grid) && checkColumns(grid) && checkBoxes(grid);
    }

    public static boolean checkRows(int[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length - 1; column++) {
                for (int secondColumn = column + 1; secondColumn < grid[row].length; secondColumn++) {
                    if (grid[row][column] == grid[row][secondColumn]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean checkColumns(int[][] grid) {
        for (int column = 0; column < grid[0].length; column++) {
            for (int row = 0; row < grid.length - 1; row++) {
                for (int secondRow = row + 1; secondRow < grid.length; secondRow++) {
                    if (grid[row][column] == grid[secondRow][column]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean checkBoxes(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
                    for (int column = (j / 3) * 3; column < (j / 3) * 3 + 3; column++) {
                        if (row != i && column != j && grid[row][column] == grid[i][j]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
