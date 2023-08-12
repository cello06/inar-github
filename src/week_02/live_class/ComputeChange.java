import java.util.Scanner;

public class ComputeChange {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);

		System.out.print("Enter amount for money: ");
		double amount= input.nextDouble();

		int remainingAmount =(int)(amount*100);
		int numberOfDollars=remainingAmount / 100;
		remainingAmount= remainingAmount % 100;

		int numberOfQuarters= remainingAmount / 25;
		remainingAmount = remainingAmount %25;

		int numberOfDimes = remainingAmount /10;
		remainingAmount = remainingAmount % 10;

		int numberOfNickels = remainingAmount /5;
		remainingAmount= remainingAmount%5;

		int numberOfPennies = remainingAmount;

		System.out.println("Your amount  "+amount+" consist of");
		System.out.println(numberOfDollars+" dollars");
		System.out.println(numberOfQuarters+" quarters");
		System.out.println(numberOfDimes+" dimes");
		System.out.println(numberOfNickels+" nickels");
		System.out.println(numberOfPennies+" pennies");
	
	
	
	
	}
}