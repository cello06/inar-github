package week_05.assigments;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean availableDifference = true;

        int yourWin = 0;

        int computerWin = 0;

        int numberOfComputer;

        int userNumber;


        String nameOfNumberOfComputer = "";

        String nameOfYourNumber = "";


        do {

            numberOfComputer = (int) (Math.random() * 3);//to make computer assign number between [0,2];

            System.out.print("scissor (0), rock (1), paper(2) : ");

            userNumber = input.nextInt();//taking a number from user


            switch (numberOfComputer) {//assign name of integer number which we assign to numberOfComputer
                case 0:
                    nameOfNumberOfComputer = "scissor";
                    break;
                case 1:
                    nameOfNumberOfComputer = "rock";
                    break;
                case 2:
                    nameOfNumberOfComputer = "paper";
                    break;
            }


            switch (userNumber) {//assign name of integer number which we took from user
                case 0:
                    nameOfYourNumber = "scissor";
                    break;
                case 1:
                    nameOfYourNumber = "rock";
                    break;
                case 2:
                    nameOfYourNumber = "paper";
                    break;
            }


            if (numberOfComputer == userNumber) {//firstly looking the condition of draw


                System.out.printf("The computer is %s.You are %s too. It is a draw.\n"
                        , nameOfNumberOfComputer, nameOfYourNumber);

                if (computerWin == 0 && yourWin == 0) {//if it is draw at the first game I want to continue iteration without doing anything
                    continue;
                }

            } else if (numberOfComputer == 0) {//looking condition in which computer's number is '0'...

                if (userNumber == 1) {//While computer '0' what happen if User is'1'...

                    System.out.printf("The computer is %s. You are %s. You win.\n"
                            , nameOfNumberOfComputer, nameOfYourNumber);

                    yourWin++;

                } else {//While computer '0' what happen if User is'2'...

                    System.out.printf("The computer is %s. You are %s. You lose.\n"
                            , nameOfNumberOfComputer, nameOfYourNumber);

                    computerWin++;

                }

            } else if (numberOfComputer == 1) {//looking condition in which computer's number is '1'...

                if (userNumber == 0) {//While computer '1' what happen if User is'0'...
                    System.out.printf("The computer is %s. You are %s. You lose.\n"
                            , nameOfNumberOfComputer, nameOfYourNumber);

                    computerWin++;

                } else {//While computer '1' what happen if User is'2'...

                    System.out.printf("The computer is %s. You are %s. You win.\n"
                            , nameOfNumberOfComputer, nameOfYourNumber);

                    yourWin++;

                }

            } else if (numberOfComputer == 2) {//looking condition in which computer's number is '2'...

                if (userNumber == 0) {//While computer '2' what happen if User is'0'...
                    System.out.printf("The computer is %s. You are %s. You win.\n"

                            , nameOfNumberOfComputer, nameOfYourNumber);

                    yourWin++;

                } else {//While computer '2' what happen if User is'1'...

                    System.out.printf("The computer is %s. You are %s. You lose.\n"
                            , nameOfNumberOfComputer, nameOfYourNumber);

                    computerWin++;

                }

            } else {//if the user enters sth wrong I want to exit System controlly

                System.out.println("Something wrong happen !!");
                System.exit(1);

            }


            System.out.println("Computer wins : " + computerWin);
            System.out.println("User wins : " + yourWin);


            //When one of the win numbers is zero I can not make a proper condition
            //to make system work. So I made an if statement to evaluate this condition
            //(I mean one of the win numbers is zero situation) different from other situations...


            if (computerWin == 0 || yourWin == 0) {
                if (Math.abs(computerWin - yourWin) == 1) {
                    availableDifference = true;
                } else {
                    availableDifference = false;
                }
            } else if ((computerWin > yourWin * 3 || yourWin > computerWin * 3)) {
                availableDifference = false;
            } else {
            }


        } while (availableDifference);
    }
}
