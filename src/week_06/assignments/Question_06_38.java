package week_06.assignments;

public class Question_06_38 {
    public static void main(String[] args) {
        printRandomCharacter();
    }

    public static void printRandomCharacter() {
        final int NUMBER_OF_LETTERS = 100;
        final int NUMBER_OF_DIGITS = 100;
        final int CHARACTER_PER_LINE = 10;
        int count = 1;

        for (int i = 1; i <= NUMBER_OF_LETTERS; i++) {
            if ((count % CHARACTER_PER_LINE == 0)) {
                System.out.println(getRandomUpperCaseLetter());
            } else {
                System.out.print(getRandomUpperCaseLetter() + " ");
            }
            count++;
        }
        for (int i = 1; i <= NUMBER_OF_DIGITS; i++) {
            if ((count % CHARACTER_PER_LINE == 0)) {
                System.out.println(getRandomDigitCharacter());
            } else {
                System.out.print(getRandomDigitCharacter() + " ");
            }
            count++;
        }
    }

    public static char getRandomUpperCaseLetter() {
        char randomUpperCase = getRandomCharacter('A', 'Z');
        return randomUpperCase;
    }

    public static char getRandomDigitCharacter() {
        char randomDigit = getRandomCharacter('1', '9');
        return randomDigit;
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        char randomCharacter = (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
        return randomCharacter;
    }
}
