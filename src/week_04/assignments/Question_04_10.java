package week_04.assignments;

import java.util.Scanner;

public class Question_04_10 {
    public static void main(String[] args) {
        int birthday = 0;
        Scanner input = new Scanner(System.in);


        System.out.println("Is your birthday in Set1?");
        System.out.println(" 1   3   5   7\n" +
                " 9  11  13  15\n" +
                "17  19  21  23\n" +
                "25  27  29  31");
        System.out.print("Enter 0 for No and 1 for Yes : ");
        int answerOfSet1 = input.nextInt();
        if (answerOfSet1 == 1) {
            birthday += 1;
        }


        System.out.println("Is your birthday in Set2?");
        System.out.println(" 2   3   6   7\n" +
                "10  11  14  15\n" +
                "18  19  22  23\n" +
                "26  27  30  31");
        System.out.print("Enter 0 for No and 1 for Yes : ");
        int answerOfSet2 = input.nextInt();
        if (answerOfSet2 == 1) {
            birthday += 2;
        }


        System.out.println("Is your birthday in Set3?");
        System.out.println(" 4   5   6   7\n" +
                "12  13  14  15\n" +
                "20  21  22  23\n" +
                "28  29  30  31");
        System.out.print("Enter 0 for No and 1 for Yes : ");
        int answerOfSet3 = input.nextInt();
        if (answerOfSet3 == 1) {
            birthday += 4;
        }

        System.out.println("Is your birthday in Set4?");
        System.out.println(" 8   9  10  11\n" +
                "12  13  14  15\n" +
                "24  25  26  27\n" +
                "28  29  30  31");
        System.out.print("Enter 0 for No and 1 for Yes : ");
        int answerOfSet4 = input.nextInt();
        if (answerOfSet4 == 1) {
            birthday += 8;
        }

        System.out.println("Is your birthday in Set5?");
        System.out.println("16  17  18  19\n" +
                "20  21  22  23\n" +
                "24  25  26  27\n" +
                "28  29  30  31");
        System.out.print("Enter 0 for No and 1 for Yes : ");
        int answerOfSet5 = input.nextInt();
        if (answerOfSet5 == 1) {
            birthday += 16;
        }

        System.out.println("\n\n\n Your birthday is " + birthday + "!");
    }


}
