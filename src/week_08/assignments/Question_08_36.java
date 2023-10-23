package week_08.assignments;

import java.util.Locale;
import java.util.Scanner;

public class Question_08_36 {
    public static void main(String[] args) {
        char[][] letters = getLetters();
        printIsLatinSquare(letters);
    }

    public static char[][] getLetters() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number n :  ");
        int dimensionOfSquare = input.nextInt();
        System.out.println("Enter " + dimensionOfSquare + " rows of letters separated by spaces :");
        char[][] letters = new char[dimensionOfSquare][dimensionOfSquare];
        for (int row = 0; row < letters.length; row++) {
            for (int column = 0; column < letters[row].length; column++) {
                char letter = input.next().toUpperCase(Locale.ROOT).charAt(0);
                if (isLetterLatin(letter, dimensionOfSquare)) {
                    letters[row][column] = letter;
                } else {
                    System.out.println("Wrong input : the letters must be from A to " + (char) ('A' + dimensionOfSquare - 1));
                    System.out.println("Enter this row again !");
                    column = -1;
                }

            }
        }
        return letters;
    }

    public static boolean isLetterLatin(char letter, int dimension) {
        return letter - 'A' < dimension;
    }

    public static void printIsLatinSquare(char[][] letters) {
        System.out.println("The input array is " + (isLatinSquare(letters) ? "" : "not ") + " a Latin square");
    }

    public static boolean isLatinSquare(char[][] letters) {
        for (int i = 0; i < letters.length; i++) {
            if (!rowCheck(letters[i]) || !columnCheck(i, letters)) {
                return false;
            }
        }
        return true;
    }

    public static boolean rowCheck(char[] rowOfLetters) {
        for (int firstLetter = 0; firstLetter < rowOfLetters.length; firstLetter++) {
            for (int otherLetter = 0; otherLetter < rowOfLetters.length; otherLetter++) {
                if (firstLetter != otherLetter
                        && rowOfLetters[firstLetter] == rowOfLetters[otherLetter]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean columnCheck(int column, char[][] letters) {
        for (int row = 0; row < letters.length; row++) {
            for (int otherRow = 0; otherRow < letters.length; otherRow++) {
                if (row != otherRow
                        && letters[row][column] == letters[otherRow][column]) {
                    return false;
                }
            }
        }
        return true;
    }
}
