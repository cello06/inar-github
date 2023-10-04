package week_07.assignments;

import java.util.Scanner;

public class Question_07_21 {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        //if slots number n the ball hits the nall n-1 times.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop : ");
        int countOfBalls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine : ");
        int countOfSlots = input.nextInt();
        int[] slots = new int[countOfSlots];

        letTheBallsFall(slots, countOfBalls);

        printHistogram(slots);
    }

    public static void letTheBallsFall(int[] slots, int countOfBalls) {
        int countOfSlots = slots.length;
        for (int i = 0; i < countOfBalls; i++) {
            //with countRInPath method I can find the number
            //of R in path so that I can increase particular index
            //of slots.
            slots[countRInPath(countOfSlots)]++;
        }
    }

    public static int countRInPath(int countOfSlots) {
        int countOfR = 0;
        char[] path = getPath(countOfSlots);
        System.out.println(path);//Print path can be another method !

        for (int i = 0; i < path.length; i++) {
            if (path[i] == 'R') {
                countOfR++;
            }
        }
        return countOfR;
    }

    public static char[] getPath(int countOfSlots) {
        char[] path = new char[countOfSlots - 1];
        //if random number is 2 it is R
        //if random number is 1 it is L
        for (int i = 0; i < path.length; i++) {
            path[i] = randomStepForPath();
        }
        return path;
    }

    public static char randomStepForPath() {
        int num = (int) (Math.random() * 2 + 1);
        return (num == 1) ? 'L' : 'R';
    }

    public static void printHistogram(int[] slots) {
        int maxBallInParticularSlot = getMax(slots);

        for (int i = 0; i < maxBallInParticularSlot; i++) {
            for (int j = 0; j < slots.length; j++) {
                if (slots[j] < (maxBallInParticularSlot - i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }

    public static int getMax(int[] slots) {
        int max = slots[0];
        for (int i = 1; i < slots.length; i++) {
            if (max < slots[i]) {
                max = slots[i];
            }
        }
        return max;
    }
}
