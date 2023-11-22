package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_14 {
    public static void main(String[] args)
            throws FileNotFoundException {
        System.out.println("Enter a file's path name : ");
        String filePath = new Scanner(System.in).nextLine();

        File file = new File(filePath);
        Scanner input = new Scanner(file);
        int countOfScores = 0;
        double sumOfScores = 0;
        while (input.hasNext()) {
            String line = input.nextLine();
            line = line.trim();
            String[] scoresInCurrentLine = line.split(" ");
            for (String s : scoresInCurrentLine) {
                if (checkIfInteger(s)) {
                    sumOfScores += Double.parseDouble(s);
                    countOfScores++;
                }
            }
        }
        System.out.println("Sum of the numbers in the file : " + sumOfScores);
        System.out.println("Number of integers : " + countOfScores);
        System.out.println("Average : " + (sumOfScores / countOfScores));
    }

    public static boolean checkIfInteger(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
