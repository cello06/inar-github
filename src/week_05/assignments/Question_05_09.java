package week_05.assignments;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int scoreOfHighestScoreStudent = 0;

        int scoreOfSecondHighestScoreStudent = 0;

        int scoreOfStudent;


        String nameOfHighestScoreStudent = "";

        String nameOfSecondHighestScoreStudent = "";

        String nameOfStudent = "";


        System.out.print("Enter the number of students : ");

        int numberOfStudents = input.nextInt();
        input.nextLine();


        for (int i = 1; i <= numberOfStudents; i++) {

            System.out.print("Enter the name of student : ");

            nameOfStudent = input.nextLine();

            System.out.print("Enter the score of that student : ");

            scoreOfStudent = input.nextInt();
            input.nextLine();

            if (scoreOfStudent > scoreOfHighestScoreStudent) {

                scoreOfSecondHighestScoreStudent = scoreOfHighestScoreStudent;

                nameOfSecondHighestScoreStudent = nameOfHighestScoreStudent;

                scoreOfHighestScoreStudent = scoreOfStudent;

                nameOfHighestScoreStudent = nameOfStudent;

            } else if (scoreOfStudent > scoreOfSecondHighestScoreStudent) {

                scoreOfSecondHighestScoreStudent = scoreOfStudent;

                nameOfSecondHighestScoreStudent = nameOfStudent;
            }
        }


        System.out.printf("\n\nThe Highest Score Student is %s with %d" +
                        "\n\nThe Second Highest Score Student is %s with %d"
                , nameOfHighestScoreStudent, scoreOfHighestScoreStudent,
                nameOfSecondHighestScoreStudent, scoreOfSecondHighestScoreStudent);
    }
}
