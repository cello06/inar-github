package week_05.assigments;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount : ");

        double loanAmount = input.nextDouble();

        System.out.print("Number of Years : ");

        int numberOfYears = input.nextInt();

        System.out.print("Annual Interest Rate : ");

        double annualInterestRate = input.nextDouble();


        double monthlyInterestRate = annualInterestRate / 1200;

        double interest;
        double principal;
        double balance = loanAmount;


        //Monthly Payment = [P * r * (1 + r)^n] / [(1 + r)^n - 1]
        //P kredi miktarını temsil eder (örneğiniz, 10,000 TL).
        //r, aylık faiz oranını temsil eder ve yıllık faiz oranını aylık faize dönüştürmek için kullanılır. Yıllık faiz oranını 12'ye bölerseniz aylık faiz oranını elde edersiniz.
        //n, kredi süresini aylık ödemelerde ifade eder. 1 yıl için 12 ay kullanabilirsiniz.


        double monthlyPayment = ((loanAmount * monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfYears * 12))
                / ((Math.pow((1 + monthlyInterestRate), numberOfYears * 12) - 1)));

        double totalAmount = monthlyPayment * numberOfYears * 12;


        System.out.printf("Monthly Payment : %.2f", monthlyPayment);


        System.out.printf("\nTotal Payment : %.2f\n", totalAmount);


        System.out.println("Payment#\t\tInterest\t\tPrincipal\t\tBalance");


        for (int i = 1; i <= numberOfYears * 12; i++) {

            interest = monthlyInterestRate * balance;

            principal = monthlyPayment - interest;

            balance = balance - principal;

            if ((i == numberOfYears * 12) && (balance != 0)) {//I am not sure from this!!!
                principal += balance;                         //I tried to make the balance zero by adding
                balance = 0;                                  //it to the principal... But as I said I am not sure...

            }

            System.out.printf("%d\t\t\t\t%.2f\t\t\t%.2f\t\t\t%.2f", i, interest, principal, balance);
            System.out.println();
        }
    }
}
