package week_08.assignments;

public class Question_08_22 {
    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        displayMatrix(matrix);
        printRowsThatIncludeEven1s(matrix);
        printColumnsThatIncludeEven1s(matrix);
    }

    public static int[][] getMatrix() {
        int[][] matrix = new int[6][6];//Question tells dimension of matrix --> (6*6)
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void printRowsThatIncludeEven1s(int[][] matrix) {

        int countOfRowsThatIncludeEven1s = 0;
        for (int row = 0; row < matrix.length; row++) {
            int countOf1 = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 1) {
                    countOf1++;
                }
            }
            if (isEven(countOf1)) {
                countOfRowsThatIncludeEven1s++;
                //System.out.println("Row "+row+" has even number of 1s");
            }
        }
        if (countOfRowsThatIncludeEven1s == matrix.length) {
            System.out.println("Every row  have an even number of 1s");
        } else {
            System.out.println("Every row does not have an even number of 1s");
        }
    }

    public static void printColumnsThatIncludeEven1s(int[][] matrix) {
        int countOfColumnsThatIncludeEven1s = 0;
        for (int column = 0; column < matrix[0].length; column++) {
            int countOf1 = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][column] == 1) {
                    countOf1++;
                }
            }
            if (isEven(countOf1)) {
                countOfColumnsThatIncludeEven1s++;
                //System.out.println("Column "+column+" has even number of 1s");
            }
        }
        if (countOfColumnsThatIncludeEven1s == matrix[0].length) {
            System.out.println("Every column  have an even number of 1s");
        } else {
            System.out.println("Every column does not have an even number of 1s");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
