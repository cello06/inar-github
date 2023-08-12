import java.util.Scanner;
public class ComputeLoan {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Annual interest rate: ");
		double annualInterestRate=input.nextDouble();
		System.out.print("Loan Amount :");
		double loanAmount=input.nextDouble();
		System.out.print("Number of years :");
		int numberOfYear=input.nextInt();
		//to find total payment we need to find monthly payment
		double monthltInterestRate=annualInterestRate/1200;
		double monthlyPayment=(loanAmount*monthltInterestRate)/
		(1-(1/(Math.pow(1+monthltInterestRate,numberOfYear*12))));
		double totalPayment=monthlyPayment*numberOfYear*12;
		System.out.println("The mounthly payment is $"+(int)(monthlyPayment*100)/100.0);
		System.out.println("The total payment is $"+(int)(totalPayment*100)/100.0);
			


	}
}
