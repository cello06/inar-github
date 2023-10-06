package week_07.assignments;

import java.util.Arrays;

public class Question_07_22 {
    public static void main(String[] args) {

        int availableIndex;
        boolean isAvailable = true;
        int firstLineQueenIndex = 0;
        int secondLineQueenIndex = 0;
        int thirdLineQueenIndex = 0;
        int fourthLineQueenIndex = 0;
        int fifthLineQueenIndex = 0;
        int sixthLineQueenIndex = 0;
        int seventhLineQueenIndex = 0;
        int eightLineQueenIndex = 0;

        while (isAvailable) {
            for (int i = 0; i < 8; i++) {
                if (i == 0) {
                    availableIndex = (int) (Math.random() * 8);
                    firstLineQueenIndex = availableIndex;
                } else if (i == 1) {
                    if (!isBlankLeft(firstLineQueenIndex, firstLineQueenIndex + 1, firstLineQueenIndex - 1)) {
                        break;
                    }
                    availableIndex = pick(firstLineQueenIndex, firstLineQueenIndex + 1, firstLineQueenIndex - 1);
                    secondLineQueenIndex = availableIndex;
                } else if (i == 2) {
                    if (!isBlankLeft(secondLineQueenIndex, secondLineQueenIndex + 1, secondLineQueenIndex - 1
                            , firstLineQueenIndex, firstLineQueenIndex + 2, firstLineQueenIndex - 2)) {
                        break;
                    }
                    availableIndex = pick(secondLineQueenIndex, secondLineQueenIndex + 1, secondLineQueenIndex - 1
                            , firstLineQueenIndex, firstLineQueenIndex + 2, firstLineQueenIndex - 2);
                    thirdLineQueenIndex = availableIndex;
                } else if (i == 3) {
                    if (!isBlankLeft(thirdLineQueenIndex, thirdLineQueenIndex + 1, thirdLineQueenIndex - 1,
                            secondLineQueenIndex, secondLineQueenIndex + 2, secondLineQueenIndex - 2,
                            firstLineQueenIndex, firstLineQueenIndex + 3, firstLineQueenIndex - 3)) {
                        break;
                    }
                    availableIndex = pick(thirdLineQueenIndex, thirdLineQueenIndex + 1, thirdLineQueenIndex - 1,
                            secondLineQueenIndex, secondLineQueenIndex + 2, secondLineQueenIndex - 2,
                            firstLineQueenIndex, firstLineQueenIndex + 3, firstLineQueenIndex - 3);
                    fourthLineQueenIndex = availableIndex;
                } else if (i == 4) {
                    if (!isBlankLeft(fourthLineQueenIndex, fourthLineQueenIndex + 1, fourthLineQueenIndex - 1,
                            thirdLineQueenIndex, thirdLineQueenIndex + 2, thirdLineQueenIndex - 2,
                            secondLineQueenIndex, secondLineQueenIndex + 3, secondLineQueenIndex - 3,
                            firstLineQueenIndex, firstLineQueenIndex + 4, firstLineQueenIndex - 4)) {
                        break;
                    }
                    availableIndex = pick(fourthLineQueenIndex, fourthLineQueenIndex + 1, fourthLineQueenIndex - 1,
                            thirdLineQueenIndex, thirdLineQueenIndex + 2, thirdLineQueenIndex - 2,
                            secondLineQueenIndex, secondLineQueenIndex + 3, secondLineQueenIndex - 3,
                            firstLineQueenIndex, firstLineQueenIndex + 4, firstLineQueenIndex - 4);
                    fifthLineQueenIndex = availableIndex;
                } else if (i == 5) {
                    if (!isBlankLeft(fifthLineQueenIndex, fifthLineQueenIndex + 1, fifthLineQueenIndex - 1,
                            fourthLineQueenIndex, fourthLineQueenIndex + 2, fourthLineQueenIndex - 2,
                            thirdLineQueenIndex, thirdLineQueenIndex + 3, thirdLineQueenIndex - 3,
                            secondLineQueenIndex, secondLineQueenIndex + 4, secondLineQueenIndex - 4,
                            firstLineQueenIndex, firstLineQueenIndex + 5, firstLineQueenIndex - 5)) {
                        break;
                    }
                    availableIndex = pick(fifthLineQueenIndex, fifthLineQueenIndex + 1, fifthLineQueenIndex - 1,
                            fourthLineQueenIndex, fourthLineQueenIndex + 2, fourthLineQueenIndex - 2,
                            thirdLineQueenIndex, thirdLineQueenIndex + 3, thirdLineQueenIndex - 3,
                            secondLineQueenIndex, secondLineQueenIndex + 4, secondLineQueenIndex - 4,
                            firstLineQueenIndex, firstLineQueenIndex + 5, firstLineQueenIndex - 5);
                    sixthLineQueenIndex = availableIndex;
                } else if (i == 6) {
                    if (!isBlankLeft(sixthLineQueenIndex, sixthLineQueenIndex + 1, sixthLineQueenIndex - 1,
                            fifthLineQueenIndex, fifthLineQueenIndex + 2, fifthLineQueenIndex - 2,
                            fourthLineQueenIndex, fourthLineQueenIndex + 3, fourthLineQueenIndex - 3,
                            thirdLineQueenIndex, thirdLineQueenIndex + 4, thirdLineQueenIndex - 4,
                            secondLineQueenIndex, secondLineQueenIndex + 5, secondLineQueenIndex - 5,
                            firstLineQueenIndex, firstLineQueenIndex + 6, firstLineQueenIndex - 6)) {
                        break;
                    }
                    availableIndex = pick(sixthLineQueenIndex, sixthLineQueenIndex + 1, sixthLineQueenIndex - 1,
                            fifthLineQueenIndex, fifthLineQueenIndex + 2, fifthLineQueenIndex - 2,
                            fourthLineQueenIndex, fourthLineQueenIndex + 3, fourthLineQueenIndex - 3,
                            thirdLineQueenIndex, thirdLineQueenIndex + 4, thirdLineQueenIndex - 4,
                            secondLineQueenIndex, secondLineQueenIndex + 5, secondLineQueenIndex - 5,
                            firstLineQueenIndex, firstLineQueenIndex + 6, firstLineQueenIndex - 6);
                    seventhLineQueenIndex = availableIndex;
                } else {
                    if (!isBlankLeft(seventhLineQueenIndex, seventhLineQueenIndex + 1, seventhLineQueenIndex - 1,
                            sixthLineQueenIndex, sixthLineQueenIndex + 2, sixthLineQueenIndex - 2,
                            fifthLineQueenIndex, fifthLineQueenIndex + 3, fifthLineQueenIndex - 3,
                            fourthLineQueenIndex, fourthLineQueenIndex + 4, fourthLineQueenIndex - 4,
                            thirdLineQueenIndex, thirdLineQueenIndex + 5, thirdLineQueenIndex - 5,
                            secondLineQueenIndex, secondLineQueenIndex + 6, secondLineQueenIndex - 6,
                            firstLineQueenIndex, firstLineQueenIndex + 7, firstLineQueenIndex - 7)) {
                        break;
                    }
                    availableIndex = pick(seventhLineQueenIndex, seventhLineQueenIndex + 1, seventhLineQueenIndex - 1,
                            sixthLineQueenIndex, sixthLineQueenIndex + 2, sixthLineQueenIndex - 2,
                            fifthLineQueenIndex, fifthLineQueenIndex + 3, fifthLineQueenIndex - 3,
                            fourthLineQueenIndex, fourthLineQueenIndex + 4, fourthLineQueenIndex - 4,
                            thirdLineQueenIndex, thirdLineQueenIndex + 5, thirdLineQueenIndex - 5,
                            secondLineQueenIndex, secondLineQueenIndex + 6, secondLineQueenIndex - 6,
                            firstLineQueenIndex, firstLineQueenIndex + 7, firstLineQueenIndex - 7);
                    eightLineQueenIndex = availableIndex;
                    isAvailable = false;
                }
            }
        }
        int[] queenPlaces = {firstLineQueenIndex, secondLineQueenIndex,
                thirdLineQueenIndex, fourthLineQueenIndex,
                fifthLineQueenIndex, sixthLineQueenIndex,
                seventhLineQueenIndex, eightLineQueenIndex};

        printEightQueens(queenPlaces);

    }


    public static int pick(int... numbers) {
        //to pick available index for our queen to place
        boolean availableRandom = true;
        int random = (int) (Math.random() * 8);
        while (availableRandom) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == random) {
                    availableRandom = false;
                    break;
                }
            }
            if (!availableRandom) {
                random = (int) (Math.random() * 8);
                availableRandom = true;
            } else {
                break;
            }

        }
        return random;
    }

    public static boolean isBlankLeft(int... notAvailableIndexes) {
        //to check if there is enough blank to put our queen
        int[] blankPlaces = {0, 1, 2, 3, 4, 5, 6, 7};
        boolean isThereBlank;
        for (int i = 0; i < 8; i++) {
            isThereBlank = true;
            for (int j = 0; j < notAvailableIndexes.length; j++) {
                if (i == notAvailableIndexes[j]) {
                    isThereBlank = false;
                    break;
                }
            }
            if (isThereBlank) {
                return true;
            }
        }
        return false;
    }

    public static void printEightQueens(int[] queenPlaces) {
        String[] line = {"| ", "| ", "| ", "| ", "| ", "| ", "| ", "| |"};
        for (int i = 0; i < queenPlaces.length; i++) {
            if (queenPlaces[i] == 7) {
                line[queenPlaces[i]] = "|Q|";
            } else {
                line[queenPlaces[i]] = "|Q";
            }
            for (int j = 0; j < line.length; j++) {
                System.out.print(line[j]);
            }
            if (queenPlaces[i] == 7) {
                line[queenPlaces[i]] = "| |";
            } else {
                line[queenPlaces[i]] = "| ";
            }

            System.out.println();
        }
    }
}
