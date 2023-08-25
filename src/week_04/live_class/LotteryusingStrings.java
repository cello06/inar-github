package week_04.live_class;

import java.util.Scanner;

public class LotteryusingStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String lottery = "" + (int) (Math.random() * 10)
                + (int) (Math.random() * 10);

        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();
        if (guess.length() != 2) {
            System.out.println("You must enter two digits");
            System.exit(1);
        }
        if (!(Character.isDigit(guess.charAt(0)) && Character.isDigit(guess.charAt(1)))) {
            System.out.println("You must enter digits!");
            System.exit(1);
        }

        System.out.println("The lottery number is " + lottery);

        if (lottery.charAt(0) == guess.charAt(0) && lottery.charAt(1) == guess.charAt(1)) {
            System.out.println("Exact match: you win $10_000");
        } else if (lottery.charAt(0) == guess.charAt(1)
                && lottery.charAt(1) == guess.charAt(0)) {
            System.out.println("Match all digits: you win $3_000");
        } else if (lottery.charAt(0) == guess.charAt(0)
                || lottery.charAt(0) == guess.charAt(1)
                || lottery.charAt(1) == guess.charAt(0)
                || lottery.charAt(1) == guess.charAt(1)) {
            System.out.println("Match one digit: you win $1_000");
        }else System.out.println("Sorry : no match");

    }
}
