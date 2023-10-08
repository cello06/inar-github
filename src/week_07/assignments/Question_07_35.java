package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_35 {
    public static void main(String[] args) {
        hangManGame();
    }

    public static void hangManGame() {
        Scanner input = new Scanner(System.in);
        boolean readyToNewGame = true;
        String[] words = {"write", "country", "school", "prison", "house", "meal", "dictionary", "program"};

        while (readyToNewGame) {
            int randomWordIndex = (int) (Math.random() * words.length);
            int missed = 0;
            String randomWord = words[randomWordIndex];
            char[] result = new char[randomWord.length()];
            Arrays.fill(result, '*');
            boolean keepGameContinue = true;
            while (keepGameContinue) {
                boolean wordCheck = true;
                boolean isAlready = false;
                boolean isMissed = true;
                System.out.print("(Guess) Enter a letter in word " + Arrays.toString(result) + " > ");
                String letter = input.next();
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
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
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
                    if (input.next().charAt(0) == 'y') {
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
