package my_week_05;

import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args) {

        final int QUESTION_NUMBER = 5;

        Scanner input = new Scanner(System.in);

        int currentQuestion = 1;

        int number1;

        int number2;

        int correctNumber=0;

        String result="";

        long startTime = System.currentTimeMillis();



        while (currentQuestion<=QUESTION_NUMBER) {

            number1 = (int) (Math.random() * 10);

            number2 = (int) (Math.random() * 10);

            if (number2 > number1) {
                int temp = number2;
                number2 = number1;
                number1 = temp;
            }

            System.out.printf("What is %d - %d = ? --> ", number1, number2);

            int answer = input.nextInt();

            if(answer==number1-number2){

                System.out.println("You are correct!");
                result+=number1+" - "+number2+" = "+answer+" correct\n";
                correctNumber++;

            }else {

                System.out.println("Your answer is wrong.\n"+
                        number1+" - "+number2+" should be "+(number1-number2));
                result+=number1+" - "+number2+" = "+answer+" wrong\n";
            }

            currentQuestion++;

        }

        long finishTime = System.currentTimeMillis();

        int testTime=(int)((finishTime-startTime)/1000);

        System.out.printf("\nCorrect count is %d\nTest time is %d seconds\n\n%s",correctNumber,testTime,result);
    }
}
