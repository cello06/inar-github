package week_05.assigments;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String yourStr = input.nextLine();

        yourStr = yourStr.toLowerCase();


        int numberOfVowels = 0;
        int numberOfConsonants = 0;


        for (int i = 0; i <= yourStr.length() - 1; i++) {

            char ch = yourStr.charAt(i);
            if (Character.isLetter(ch)) {

                if (yourStr.charAt(i) == 'a'
                        || yourStr.charAt(i) == 'e'
                        || yourStr.charAt(i) == 'i'
                        || yourStr.charAt(i) == 'o'
                        || yourStr.charAt(i) == 'u') {

                    numberOfVowels++;

                } else {

                    numberOfConsonants++;
                }
            }
        }

        System.out.printf("The number of vowels is %d\n" +
                "The number of consonants is %d", numberOfVowels, numberOfConsonants);
    }
}
