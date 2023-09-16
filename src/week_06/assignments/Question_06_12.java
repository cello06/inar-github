package week_06.assignments;

public class Question_06_12 {
    public static void main(String[] args) {
        final int NUMBER_PER_LINE = 10;
        char firstCharacter = '1';
        char lastCharacter = 'Z';

        System.out.println("Characters per " + firstCharacter + " to " + lastCharacter);

        printChars(firstCharacter, lastCharacter, NUMBER_PER_LINE);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 0;
        while ((int) ch1 <= (int) ch2) {
            if ((count + 1) % numberPerLine == 0) {
                System.out.println(ch1);
            } else {
                System.out.print(ch1 + " ");
            }
            count++;
            //after increasing int value of ch1, again  cast it to char.
            ch1 = (char) ((int) (ch1) + 1);
        }
    }
}
