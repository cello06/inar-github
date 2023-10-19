package week_08.assignments;

import java.util.Scanner;

public class Question_08_20 {
    public static void main(String[] args) {
        char[][] gameGrid = new char[6][7];
        playGame(gameGrid);
    }

    public static void playGame(char[][] gameGrid) {
        Scanner input = new Scanner(System.in);
        String[] tokens = {"Red", "Yellow"};
        do {
            displayGame(gameGrid);
            System.out.print("Drop a " + tokens[0] + "disk at column (0-6) :");
            int column = input.nextInt();
            if (isAvailable(gameGrid, column)) {
                putDisk(gameGrid, column, tokens[0]);
                swapTokens(tokens);
            } else {
                System.out.println("Invalid input");
            }

        } while (!isWin(gameGrid) && !isDraw(gameGrid));

        if (isWin(gameGrid)) {
            System.out.println("The " + tokens[1] + " player won.");
        } else {
            System.out.println("It is a draw");
        }
    }

    public static void displayGame(char[][] gameGrid) {
        for (int row = 0; row < gameGrid.length; row++) {
            for (int column = 0; column < gameGrid[row].length; column++) {
                if (gameGrid[row][column] == 'R') {
                    System.out.print("|R");
                } else if (gameGrid[row][column] == 'Y') {
                    System.out.print("|Y");
                } else {
                    System.out.print("| ");
                }

            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("-------------------");
    }

    public static boolean isAvailable(char[][] gameGrid, int column) {
        if (column < 0 || column > 6) {
            return false;
        }
        int countOfDiskInThatColumn = 0;
        for (int row = 0; row < gameGrid.length; row++) {
            if (gameGrid[row][column] != '\u0000') {
                countOfDiskInThatColumn++;
            }
        }
        if (countOfDiskInThatColumn == 6) {
            return false;
        }
        return true;
    }

    public static void putDisk(char[][] gameGrid, int column, String token) {
        for (int row = gameGrid.length - 1; row >= 0; row--) {
            if (gameGrid[row][column] == '\u0000') {
                gameGrid[row][column] = token.charAt(0);
                break;
            }
        }
    }

    public static void swapTokens(String[] tokens) {
        String temp = tokens[0];
        tokens[0] = tokens[1];
        tokens[1] = temp;
    }

    public static boolean isWin(char[][] gameGrid) {
        if (checkRows(gameGrid) ||
                checkColumns(gameGrid) ||
                checkMajorDiagonal(gameGrid) ||
                checkSubDiagonal(gameGrid)) {
            return true;
        }
        return false;
    }

    public static boolean checkRows(char[][] gameGrid) {
        for (int row = gameGrid.length - 1; row >= 3; row--) {
            for (int column = 0; column < gameGrid[row].length - 3; column++) {
                if ((gameGrid[row][column] != '\u0000') &&
                        gameGrid[row][column] == gameGrid[row][column + 1] &&
                        gameGrid[row][column] == gameGrid[row][column + 2] &&
                        gameGrid[row][column] == gameGrid[row][column + 3]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkColumns(char[][] gameGrid) {
        for (int column = 0; column < gameGrid[0].length; column++) {
            for (int row = gameGrid.length - 1; row >= 3; row--) {
                if (gameGrid[row][column] != '\u0000' &&
                        gameGrid[row][column] == gameGrid[row - 1][column] &&
                        gameGrid[row][column] == gameGrid[row - 2][column] &&
                        gameGrid[row][column] == gameGrid[row - 3][column]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkMajorDiagonal(char[][] gameGrid) {
        for (int mainRow = 0; mainRow < gameGrid.length - 3; mainRow++) {
            for (int mainColumn = 0; mainColumn < gameGrid[mainRow].length - 3; mainColumn++) {
                for (int row = mainRow; row < gameGrid.length - 3; row++) {
                    for (int column = mainColumn; column < gameGrid[row].length; column++) {
                        if (gameGrid[row][column] != '\u0000' &&
                                gameGrid[row][column] == gameGrid[row + 1][column + 1] &&
                                gameGrid[row][column] == gameGrid[row + 2][column + 2] &&
                                gameGrid[row][column] == gameGrid[row + 3][column + 3]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean checkSubDiagonal(char[][] gameGrid) {
        for (int mainRow = 0; mainRow < gameGrid.length - 3; mainRow++) {
            for (int mainColumn = gameGrid[mainRow].length - 1; mainColumn >= 3; mainColumn--) {
                for (int row = mainRow; row < gameGrid.length - 3; row++) {
                    for (int column = mainColumn; column >= 3; column--) {
                        if (gameGrid[row][column] != '\u0000' &&
                                gameGrid[row][column] == gameGrid[row + 1][column - 1] &&
                                gameGrid[row][row] == gameGrid[row + 2][column - 2] &&
                                gameGrid[row][row] == gameGrid[row + 3][column - 3]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean isDraw(char[][] gameGrid) {
        for (int row = 0; row < gameGrid.length; row++) {
            for (int column = 0; column < gameGrid[row].length; column++) {
                if (gameGrid[row][column] == '\u0000') {
                    return false;
                }
            }
        }
        return true;
    }
}
