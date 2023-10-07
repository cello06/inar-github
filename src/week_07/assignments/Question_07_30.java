package week_07.assignments;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        checkConsecutiveness();
    }

    public static void checkConsecutiveness() {
        int[] list = getList();
        printConsecutiveness(list);

    }

    public static int[] getList() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values : ");
        int numberOfValues = input.nextInt();
        int[] list = new int[numberOfValues];
        System.out.print("Enter the values : ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static void printConsecutiveness(int[] list) {
        System.out.print("The list has" + (isConsecutiveFour(list) ? " consecutive fours" : " no consecutive fours"));
    }

    public static boolean isConsecutiveFour(int[] list) {
        if (list.length < 4) {
            return false;
        } else {
            for (int i = 0; i < list.length; i++) {
                if (i > 3 && list[i] == list[i - 1] && list[i] == list[i - 2] && list[i] == list[i - 3]) {
                    return true;
                }
            }
        }
        return false;
    }
}
