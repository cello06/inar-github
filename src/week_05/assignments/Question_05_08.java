package week_05.assignments;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nameOfHighestScoreStudent = "";
        int scoreOfHighestScoreStudent = 0;
        int numberOfStudents = 0;


        System.out.print("Enter the number of students : ");
        numberOfStudents = input.nextInt();
        input.nextLine();//to use  nextLine() properly after the nextInt()...

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter the name of student : ");
            String nameOfStudent = input.nextLine();

            System.out.print("The score of that student : ");
            int scoreOfStudent = input.nextInt();
            input.nextLine();//to use  nextLine() properly after the nextInt()...

            if (scoreOfStudent > scoreOfHighestScoreStudent) {
                scoreOfHighestScoreStudent = scoreOfStudent;
                nameOfHighestScoreStudent = nameOfStudent;
            }


        }

        System.out.printf("%s  with %d score is the highest score student!!!"
                , nameOfHighestScoreStudent, scoreOfHighestScoreStudent);

    }
}
