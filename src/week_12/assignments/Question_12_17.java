package week_12.assignments;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_12_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String path = "";
        File file = new File(path);
        boolean condition = true;
        while (condition) {
            System.out.println("Enter wordlist file pathname for Hangman game : ");
            path = input.nextLine();
            file = new File(path);
            if (!file.exists()) {
                System.out.println("File not found try again");
                continue;
            }
            condition = false;
        }
        try {
            hangManGame(file);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void hangManGame(File file)
            throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<>();
        Scanner inputFromUser = new Scanner(System.in);

        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String word = input.next();
            words.add(word);
        }
        boolean readyToNewGame = true;

        while (readyToNewGame) {
            int randomWordIndex = (int) (Math.random() * words.size());
            int missed = 0;
            String randomWord = words.get(randomWordIndex);
            char[] result = new char[randomWord.length()];
            Arrays.fill(result, '*');
            boolean keepGameContinue = true;
            while (keepGameContinue) {
                boolean wordCheck = true;
                boolean isAlready = false;
                boolean isMissed = true;
                System.out.print("(Guess) Enter a letter in word " + Arrays.toString(result) + " > ");
                String letter = inputFromUser.next();
                for (int i = 0; i < randomWord.length(); i++) {
                    for (int j = 0; j < result.length; j++) {
                        if (result[j] == letter.charAt(0)) {
                            System.out.println(letter.charAt(0) + " is already in the word");
                            isAlready = true;
                            break;
                        }
                    }
                    if (!isAlready) {
                        for (int j = 0; j < randomWord.length(); j++) {
                            if (randomWord.charAt(j) == letter.charAt(0)) {
                                result[j] = letter.charAt(0);
                                isMissed = false;
                            }
                        }
                        if (isMissed) {
                            System.out.println(letter.charAt(0) + " is not in the word");
                            missed++;
                        }
                    }
                    break;
                }
                for (int i = 0; i < result.length; i++) {
                    if (randomWord.charAt(i) != result[i]) {
                        wordCheck = false;
                        break;
                    }
                }
                if (wordCheck) {
                    System.out.println("The word is " + randomWord + ". You missed " + missed + ((missed > 1) ? " times" : " time"));
                    System.out.print("Do you want to guess another word ? Enter y or n ->");
                    if (inputFromUser.next().charAt(0) == 'y') {
                        break;
                    } else {
                        readyToNewGame = false;
                        keepGameContinue = false;
                    }
                }
            }
        }
    }
}
