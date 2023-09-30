package week_07.live_class;

import java.util.Scanner;

public class CountLettersInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many random lower case that you want :");
        int countOfLowerCase = input.nextInt();

        char[] lowerCaseLetters = getLowerCaseList(countOfLowerCase);
        printList(lowerCaseLetters);

        int[] countOfLetters = countLetters(lowerCaseLetters);
        printCountOfLetters(countOfLetters);
    }

    public static char[] getLowerCaseList(int countOfLowerCase) {

        char[] lowerCaseLetters = new char[countOfLowerCase];
        for (int i = 0; i < lowerCaseLetters.length; i++) {
            lowerCaseLetters[i] = getRandomLowerCaseLetter();
        }
        return lowerCaseLetters;
    }

    public static char getRandomLowerCaseLetter() {
        char randomLowerCase = (char) (Math.random() * ('z' - 'a' + 1) + 'a');
        return randomLowerCase;
    }

    public static void printList(char[] list) {
        System.out.println("The lowercase letters are : ");
        for (int i = 0; i < list.length; i++) {
            if ((i + 1) % 20 == 0) {
                System.out.println(list[i] + " ");
            } else {
                System.out.print(list[i] + " ");
            }
        }
    }

    public static int[] countLetters(char[] letters) {
        int[] counts = new int['z' - 'a' + 1];

        for (int i = 0; i < letters.length; i++) {
            counts[letters[i] - 'a']++;
        }
        return counts;
    }

    public static void printCountOfLetters(int[] countOfLetters) {
        System.out.println("The occurrences of each letter are : ");
        for (int i = 0; i < countOfLetters.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(countOfLetters[i] + " " + (char) ('a' + i));
            } else {
                System.out.print(countOfLetters[i] + " " + (char) ('a' + i) + " ");
            }
        }
    }
}
