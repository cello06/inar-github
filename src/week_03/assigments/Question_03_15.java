package week_03.assigments;

import java.util.Scanner;

public class Question_03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lotteryNumber = (int) (Math.random() * (1000 - 100)) + 100;
        int firstDigitOfLotteryNumber = lotteryNumber % 10;
        int secondDigitOfLotteryNumber = (lotteryNumber / 10) % 10;
        int thirdDigitOfLotteryNumber = lotteryNumber / 100;
        System.out.print("Enter your lottery pick (three digits) : ");
        int yourNumber = input.nextInt();
        int firstDigitOfYourNumber = yourNumber % 10;
        int secondDigitOfYourNumber = (yourNumber / 10) % 10;
        int thirdDigitOfYourNumber = yourNumber / 100;
        System.out.println("The lottery number is " + lotteryNumber);

        if (lotteryNumber == yourNumber) {
            System.out.println("Matched in the exact order! $10,000 Prize!!");
        }
        if (lotteryNumber != yourNumber) {
            if ((firstDigitOfLotteryNumber == firstDigitOfYourNumber
                    || firstDigitOfLotteryNumber == secondDigitOfYourNumber
                    || firstDigitOfLotteryNumber == thirdDigitOfYourNumber)
                    && (secondDigitOfLotteryNumber == firstDigitOfYourNumber
                    || secondDigitOfLotteryNumber == secondDigitOfYourNumber
                    || secondDigitOfLotteryNumber == thirdDigitOfYourNumber)
                    && (thirdDigitOfLotteryNumber == firstDigitOfYourNumber
                    || thirdDigitOfLotteryNumber == secondDigitOfYourNumber
                    || thirdDigitOfLotteryNumber == thirdDigitOfYourNumber)) {
                System.out.println("Matched all number but in wrong order! $3,000 Prize ");
            } else if (firstDigitOfLotteryNumber == firstDigitOfYourNumber
                    || firstDigitOfLotteryNumber == secondDigitOfYourNumber
                    || firstDigitOfLotteryNumber == thirdDigitOfYourNumber) {
                System.out.println("Matched one number!!! $1,000 Prize!!!");
            } else if (secondDigitOfLotteryNumber == firstDigitOfYourNumber
                    || secondDigitOfLotteryNumber == secondDigitOfYourNumber
                    || secondDigitOfLotteryNumber == thirdDigitOfYourNumber) {
                System.out.println("Matched one number!!! $1,000 Prize!!!");
            } else if (thirdDigitOfLotteryNumber == firstDigitOfYourNumber
                    || thirdDigitOfLotteryNumber == secondDigitOfYourNumber
                    || thirdDigitOfLotteryNumber == thirdDigitOfYourNumber) {
                System.out.println("Matched one number!!! $1,000 Prize!!!");
            }
        }


    }


}
