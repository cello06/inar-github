package week_03.assigments;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computer = (int) (Math.random() * (3 - 0)) + 0;
        System.out.print("scissor (0), rock (1), paper(2) : ");
        int you = input.nextInt();

        if (computer == 0) {
            if (you == 0) {
                System.out.println("The computer is scissor. You are scissor too. It is draw");
            } else if (you == 1) {
                System.out.println("The computer is scissor. You are rock. You won");
            } else if (you == 2) {
                System.out.println("The computer is scissor. You are paper. You lost");
            } else {
                System.out.println("Something wrong happenned");
                System.exit(1);
            }
        } else if (computer == 1) {
            if (you == 0) {
                System.out.println("The computer is rock. You are scissor. You lost");
            } else if (you == 1) {
                System.out.println("The computer is rock. You are rock too. It is a draw");
            } else if (you == 2) {
                System.out.println("The computer is rock. You are a paper. You won");
            } else {
                System.out.println("Something wrong happenned");
                System.exit(2);
            }
        } else if (computer == 2) {
            if (you == 0) {
                System.out.println("The computer is paper. You are scissor. You won");
            } else if (you == 1) {
                System.out.println("The computer is paper. You are rock. You lost");
            } else if (you == 2) {
                System.out.println("The computer is paper. You are paper too. It is a draw");
            }
        }

    }
}
