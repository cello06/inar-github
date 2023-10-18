package week_08.assignments;

import java.util.Scanner;

public class Question_08_19 {
    public static void main(String[] args) {
        int[][] array = getArray();
        printConsecutiveNessFourOfArray(array);
    }

    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row number : ");
        int countOfRows = input.nextInt();
        System.out.print("Enter column number : ");
        int countOfColumns = input.nextInt();
        int[][] array = new int[countOfRows][countOfColumns];
        System.out.println("Fill the matrix");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextInt();
            }
        }
        return array;
    }

    public static void printConsecutiveNessFourOfArray(int[][] array) {
        if (isConsecutiveFour(array)) {
            System.out.println("Matrix has consecutive four numbers");
        } else {
            System.out.println("Matrix has not consecutive four numbers");
        }
    }

    public static boolean isConsecutiveFour(int[][] array) {
        if (array.length >= 4 && array[0].length >= 4) {
            if (checkRows(array) ||
                    checkColumns(array) ||
                    checkMajorDiagonal(array) ||
                    checkSubDiagonal(array)) {
                return true;
            }
        } else if (array.length >= 4) {
            if (checkColumns(array)) {
                return true;
            }
        } else if (array[0].length >= 4) {
            if (checkRows(array)) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    public static boolean checkRows(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length - 3; column++) {
                if (array[row][column] == array[row][column + 1] &&
                        array[row][column] == array[row][column + 2] &&
                        array[row][column] == array[row][column + 3]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkColumns(int[][] array) {
        for (int column = 0; column < array[0].length; column++) {
            for (int row = 0; row < array.length - 3; row++) {
                if (array[row][column] == array[row + 1][column] &&
                        array[row][column] == array[row + 2][column] &&
                        array[row][column] == array[row + 3][column]) {
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean checkMajorDiagonal(int[][] array) {
        for (int mainRow = 0; mainRow < array.length - 3; mainRow++) {
            for (int mainColumn = 0; mainColumn < array[mainRow].length - 3; mainColumn++) {
                for (int row = mainRow; row < array.length - 3; row++) {
                    for (int column = mainColumn; column < array[row].length; column++) {
                        if (array[row][column] == array[row + 1][column + 1] &&
                                array[row][column] == array[row + 2][column + 2] &&
                                array[row][column] == array[row + 3][column + 3]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean checkSubDiagonal(int[][] array) {
        for (int mainRow = 0; mainRow < array.length - 3; mainRow++) {
            for (int mainColumn = array[mainRow].length; mainColumn >= 3; mainColumn++) {
                for (int row = mainRow; row < array.length - 3; row++) {
                    for (int column = mainColumn; column >= 3; column++) {
                        if (array[row][column] == array[row + 1][column - 1] &&
                                array[row][row] == array[row + 2][column - 2] &&
                                array[row][row] == array[row + 3][column - 3]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
