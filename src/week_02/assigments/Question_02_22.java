package week_02.assigments;

import java.util.Scanner;

public class Question_02_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount as integer, for " +
                "example 1156 for 11.56: ");
            /* One Dollar is;
               Quarters (25 cents each): 4 quarters
               Dimes (10 cents each): 10 dimes
               Nickels (5 cents each): 20 nickels
               Pennies (1 cent each): 100 pennies*/

        int amount = input.nextInt();
        int dollar = amount / 100;
        int remainingAmaount = amount % 100;

        int quarter = remainingAmaount / 25;
        remainingAmaount = remainingAmaount % 25;
        int dimes = remainingAmaount / 10;
        remainingAmaount = remainingAmaount % 10;
        int nickle = remainingAmaount / 5;
        remainingAmaount = remainingAmaount % 5;
        int penny = remainingAmaount;
        System.out.println("Your amount " + amount + " consist of\n" +
                dollar + " dollars\n" + quarter + " quarters\n" +
                dimes + " dimes\n" + nickle + " nickles\n" + penny + " pennies");
    }
}
