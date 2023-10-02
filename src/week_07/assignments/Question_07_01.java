package week_07.assignments;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        studentScoreCalculate();
    }

    public static void studentScoreCalculate() {

        int[] scoresOfStudents = getScoresOfStudents();

        int bestScore = findBestScore(scoresOfStudents);

        String[] gradesOfStudents = getGradesOfStudents(scoresOfStudents, bestScore);

        printScoresAndGradesOfStudents(scoresOfStudents, gradesOfStudents);
    }


    public static int[] getScoresOfStudents() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int countOfStudents = input.nextInt();
        int[] scoresOfStudents = new int[countOfStudents];
        System.out.print("Enter " + countOfStudents + " scores : ");

        for (int i = 0; i < scoresOfStudents.length; i++) {
            scoresOfStudents[i] = input.nextInt();
        }
        return scoresOfStudents;
    }

    public static int findBestScore(int[] scoresOfStudents) {
        int bestScore = scoresOfStudents[0];

        for (int i = 1; i < scoresOfStudents.length; i++) {
            if (scoresOfStudents[i] > bestScore) {
                bestScore = scoresOfStudents[i];
            }
        }
        return bestScore;

    }

    public static String[] getGradesOfStudents(int[] scoresOfStudents, int bestScore) {
        //Grade is A if score is Ú best - 10
        //Grade is B if score is Ú best - 20;
        //Grade is C if score is Ú best - 30;
        //Grade is D if score is Ú best - 40;
        //Grade is F otherwise
        String[] grades = new String[scoresOfStudents.length];

        for (int i = 0; i < grades.length; i++) {
            if (scoresOfStudents[i] >= bestScore - 10) {
                grades[i] = "A";
            } else if (scoresOfStudents[i] >= bestScore - 20) {
                grades[i] = "B";
            } else if (scoresOfStudents[i] >= bestScore - 30) {
                grades[i] = "C";
            } else if (scoresOfStudents[i] >= bestScore - 40) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        return grades;
    }

    public static void printScoresAndGradesOfStudents
            (int[] scoresOfStudents, String[] gradesOfStudents) {
        for (int i = 0; i < gradesOfStudents.length; i++) {
            System.out.println("Student " + i + " score is " + scoresOfStudents[i]
                    + " and grade is " + gradesOfStudents[i]);
        }
    }
}
