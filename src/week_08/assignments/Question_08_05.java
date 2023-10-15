package week_08.assignments;

import java.util.Scanner;

public class Question_08_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        System.out.print("Enter matrix1 : ");
        for (int row = 0; row < matrix1.length; row++) {
            for (int colmumn = 0; colmumn < matrix1[row].length; colmumn++) {
                matrix1[row][colmumn] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix2 : ");
        for (int row = 0; row < matrix2.length; row++) {
            for (int colmumn = 0; colmumn < matrix2[row].length; colmumn++) {
                matrix2[row][colmumn] = input.nextDouble();
            }
        }
        double[][] sum = addMatrix(matrix1, matrix2);
        printCalculation(matrix1, matrix2, sum);
    }

    public static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] sum = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < sum.length; row++) {
            for (int column = 0; column < sum[row].length; column++) {
                sum[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }
        return sum;
    }

    public static void printCalculation
            (double[][] matrix1, double[][] matrix2, double[][] sum) {
        System.out.println("The matrices are added as follows");
        for (int row = 0; row < sum.length; row++) {
            for (int columnOfMatrix1 = 0; columnOfMatrix1 < matrix1[row].length; columnOfMatrix1++) {
                System.out.printf("%3.1f ", matrix1[row][columnOfMatrix1]);
            }
            if (row == 1) {
                System.out.print("   +   ");
            } else {
                System.out.print("       ");
            }
            for (int columnOfMatrix2 = 0; columnOfMatrix2 < matrix2[row].length; columnOfMatrix2++) {
                System.out.printf("%3.1f ", matrix2[row][columnOfMatrix2]);
            }
            if (row == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }
            for (int columnOfSum = 0; columnOfSum < sum[row].length; columnOfSum++) {
                System.out.printf("%3.1f ", sum[row][columnOfSum]);
            }
            System.out.println();
        }
    }
}
