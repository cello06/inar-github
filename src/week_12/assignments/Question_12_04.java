package week_12.assignments;

import week_12.assignments.classes.Loan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_04 {
    public static void main(String[] args) {
       boolean condition = true;
        while (condition) {
            try {
                Loan loan = getLoan();
                System.out.println(loan.toString());
                condition = false;
            } catch (IllegalArgumentException ex) {
                System.out.println("Wrong input ! " + ex.getMessage());
            }
        }
    }



    public static Loan getLoan() {
        Scanner input = new Scanner(System.in);
        Loan loan = new Loan();
        boolean condition = true;
        while (condition) {
            try {

                System.out.print("Enter Annual Interest Rate(must be bigger than zero!) :");
                double annualInterestRate = input.nextDouble();
                System.out.print("Enter number of years(must be bigger than zero!) :");
                int numberOfYears = input.nextInt();
                System.out.print("Enter loan amount(must be bigger than zero!) :");
                double loanAmount = input.nextDouble();

                loan = new Loan(annualInterestRate,numberOfYears,loanAmount);
                condition = false;


            } catch (InputMismatchException ex) {
                System.out.println("Wrong input ! Enter an Integer!");
                input.nextLine();
            }
        }
        return loan;
    }
}
