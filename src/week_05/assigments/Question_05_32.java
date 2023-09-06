package week_05.assigments;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstDigitOfLotteryNumber = 0;

        int secondDigitOfLotteryNumber = 0;

        String lotteryNumber = "";

        String yourNumber = "";

        boolean isDistinct = true;


        firstDigitOfLotteryNumber = (int) (Math.random() * 10);

        while (isDistinct) {

            secondDigitOfLotteryNumber = (int) (Math.random() * 9) + 1;

            if (firstDigitOfLotteryNumber != secondDigitOfLotteryNumber) {

                isDistinct = false;

            }
        }

        lotteryNumber = "" + firstDigitOfLotteryNumber + secondDigitOfLotteryNumber;


        System.out.print("Enter your lottery pick (two distinct digits) : ");

        yourNumber = input.nextLine();

        System.out.printf("The lottery number is %s\n", lotteryNumber);


        if (yourNumber.length() == 1) {

            yourNumber = "0".concat(yourNumber);

        }


        if (yourNumber.length() == 2) {

            if ((yourNumber.charAt(0) == lotteryNumber.charAt(0))
                    && (yourNumber.charAt(1) == lotteryNumber.charAt(1))) {

                System.out.println("Exact Match!! You win $10,000");

            } else if ((yourNumber.charAt(0) == lotteryNumber.charAt(1))
                    && (yourNumber.charAt(1) == lotteryNumber.charAt(0))) {

                System.out.println("Match all digits but wrong order!! You win $3,000");

            } else if ((yourNumber.charAt(0) == lotteryNumber.charAt(0)) && (yourNumber.charAt(1) != lotteryNumber.charAt(1))) {

                System.out.println("Match one digit : you win $1,000");

            } else if ((yourNumber.charAt(0) == lotteryNumber.charAt(1)) && (yourNumber.charAt(1) != lotteryNumber.charAt(0))) {

                System.out.println("Match one digit : you win $1,000");

            } else if ((yourNumber.charAt(1) == lotteryNumber.charAt(1)) && (yourNumber.charAt(0) != lotteryNumber.charAt(0))) {

                System.out.println("Match one digit : you win $1,000");

            } else if ((yourNumber.charAt(1) == lotteryNumber.charAt(0)) && (yourNumber.charAt(0) != lotteryNumber.charAt(1))) {

                System.out.println("Match one digit : you win $1,000");

            } else {

                System.out.println("Sorry , no match");

            }

        } else {

            System.out.println("You must enter only two digits!!");

        }


    }
}
