package week_05.assigments;

import java.util.Scanner;

public class Question_05_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_QUESTİON=10;

        int currentQuestion = 1;

        int correctCount = 0;

        int answer;

        int number1;

        int number2;

        long startTime=System.currentTimeMillis();


        while(currentQuestion<=NUMBER_OF_QUESTİON){


            number1=(int)(Math.random()*15)+1;

            number2=(int)(Math.random()*15)+1;


            System.out.printf("What is %d + %d = ? --> ",number1,number2);

            answer = input.nextInt();


            if(answer == (number1+number2)){

                correctCount++;

            }

            currentQuestion++;

        }


        long finishTime = System.currentTimeMillis();

        int testTime = (int)((finishTime-startTime)/1000);

        System.out.printf("The correct number is --> %d\n"+
                "Test time is --> %d seconds ",correctCount,testTime);

    }
}
