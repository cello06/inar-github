package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_13 {
    public static void main(String[] args)
            throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Wrong input : \n" +
                    "Usage : java Question_12_13.java filePath");
            System.exit(1);
        }

        String filePath = args[0];
        File file = new File(filePath);

        Scanner input = new Scanner(file);
        int countOfCharacters = 0;
        int countOfWords = 0;
        int countOfLines = 0;

        while (input.hasNext()) {
            String line = input.nextLine();
            countOfLines++;
            countOfCharacters += line.length();
            countOfWords += getCountOfWords(line);
        }
        System.out.println("File : " + file.getName());
        System.out.println(countOfCharacters + " characters");
        System.out.println(countOfWords + " words");
        System.out.println(countOfLines + " lines");
    }

    public static int getCountOfWords(String line) {
        line = line.trim();
        String[] words = line.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        return words.length;
    }
}
