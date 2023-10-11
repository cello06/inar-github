package week_07.assignments;

import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        eSchool();

    }

    public static void eSchool() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int countOfStudents = input.nextInt();
        System.out.println("Enter the name a score for each student: ");
        String[] namesOfStudents = new String[countOfStudents];
        int[] scoresOfStudents = new int[countOfStudents];
        for (int i = 0; i < countOfStudents; i++) {
            System.out.print("Student " + (i + 1) + " : ");
            namesOfStudents[i] = input.next();
            System.out.print("Score : ");
            scoresOfStudents[i] = input.nextInt();
        }
        sort(namesOfStudents, scoresOfStudents);
        printStudents(namesOfStudents);
    }

    public static void sort(String[] names, int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int currentMax = scores[i];
            int currentMaxIndex = i;
            String currentMaxName = names[i];

            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] > currentMax) {
                    currentMax = scores[j];
                    currentMaxIndex = j;
                    currentMaxName = names[j];
                }
            }
            if (currentMaxIndex != i) {
                scores[currentMaxIndex] = scores[i];
                scores[i] = currentMax;
                names[currentMaxIndex] = names[i];
                names[i] = currentMaxName;
            }
        }
    }

    public static void printStudents(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
