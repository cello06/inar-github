package week_06.assignments;

public class Question_06_01 {
    public static void main(String[] args) {
        final int NUMBER_OF_PENTAGONAL_NUMBER_TO_DISPLAY = 100;
        System.out.print("The first 100 pentagonal numbers, ten per line :");

        int number = 1;
        while (number <= NUMBER_OF_PENTAGONAL_NUMBER_TO_DISPLAY) {

            int pentagonalNumber = convertToPentagonal(number);

            printPentagonalNumber(pentagonalNumber, number);

            number++;
        }

    }
    public static int convertToPentagonal(int number) {
        int pentagonalNumber = number * ((3 * number) - 1) / 2;
        return pentagonalNumber;
    }
    public static void printPentagonalNumber(int pentagonalNumber, int numberForLine) {
        final int NUMBER_OF_PENTAGONAL_NUMBER_PER_LINE = 10;

        if ((numberForLine - 1) % NUMBER_OF_PENTAGONAL_NUMBER_PER_LINE == 0) {
            System.out.printf("\n%8d", pentagonalNumber);
        } else {
            System.out.printf("%8d", pentagonalNumber);
        }
    }

}
