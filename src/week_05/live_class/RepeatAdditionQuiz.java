package my_week_05;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int score=0;


        while (true) {
            number1 = (int) (Math.random() * 10);

            number2 = (int) (Math.random() * 10);

            int trueAnswer = number1 + number2;

            System.out.printf("What is %d + %d = ? --> ", number1, number2);

            int yourAnswer = input.nextInt();

            if(trueAnswer!=yourAnswer){
                System.out.printf("Your score is %d.\nThanks for your participation.",score);
                break;
            }else score++;

        }
    }
}
