package week_07.assignments;

import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        evaluateStudents();

    }

    public static void evaluateStudents() {
        int countOfStudents = getCountOfStudents();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name a score for each student : ");

        String[] namesAndScoresOfStudents = new String[countOfStudents * 2];
        int[] scoresOfStudent = new int[countOfStudents];
        int index = 0;
        for (int i = 0; i < namesAndScoresOfStudents.length; i += 2) {
            System.out.print("Student " + (index + 1) + " : ");
            namesAndScoresOfStudents[i] = input.nextLine();
            System.out.print("Score : ");
            namesAndScoresOfStudents[i + 1] = input.nextLine();
            scoresOfStudent[index] = Integer.parseInt(namesAndScoresOfStudents[i + 1]);
            index++;
        }
        java.util.Arrays.sort(scoresOfStudent);
        printNameOfStudentsAccordingToScores(namesAndScoresOfStudents, scoresOfStudent);

    }


    public static int getCountOfStudents() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        return input.nextInt();
    }

    public static void printNameOfStudentsAccordingToScores
            (String[] namesAndScoresOfStudents, int[] scoresOfStudent) {
        int index = -1;
        for (int i = scoresOfStudent.length - 1; i >= 0; i--) {
            for (int j = 0; j < namesAndScoresOfStudents.length; j += 2) {
                if (namesAndScoresOfStudents[j + 1].equals("" + scoresOfStudent[i])) {

                        System.out.println(namesAndScoresOfStudents[j]);
                }
            }
        }
    }
}
//if the scores are equals I have problems ! ! !
