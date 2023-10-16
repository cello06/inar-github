package week_08.assignments;

import java.util.Scanner;

public class Question_08_12 {
    public static void main(String[] args) {
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        double tax = calculateTax(brackets, rates);
        printTax(tax);
    }

    public static double calculateTax(int[][] brackets, double[] rates) {
        Scanner input = new Scanner(System.in);
        System.out.print("(0-Single filer\n"
                + "1-Married jointly or qualifying widow(er)\n"
                + "2-Married separately\n"
                + "3-Head of household)\n"
                + "Enter the filing status : ");
        int filingStatus = input.nextInt();
        System.out.print("Enter the taxable income : ");
        int income = input.nextInt();
        double tax = 0;
        for (int taxRate = 0; taxRate < brackets[filingStatus].length - 1; taxRate++) {

            if (taxRate == 0) {
                if (income < brackets[filingStatus][taxRate]) {
                    tax += income * rates[taxRate];
                    break;
                }
                tax += brackets[filingStatus][taxRate] * rates[taxRate];
            } else {
                if (income < brackets[filingStatus][taxRate]) {
                    tax += (income - brackets[filingStatus][taxRate - 1]) * rates[taxRate];
                    break;
                }
                tax += (brackets[filingStatus][taxRate + 1] - brackets[filingStatus][taxRate]) * rates[taxRate];
            }

        }
        return tax;
    }

    public static void printTax(double tax) {
        System.out.printf("Tax is $%.2f", tax);
    }
}
