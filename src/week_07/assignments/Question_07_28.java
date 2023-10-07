package week_07.assignments;

import java.util.Scanner;

public class Question_07_28 {
    public static void main(String[] args) {
        int[] list = getList();
        printCombinations(list);
    }

    public static int[] getList() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static void printCombinations(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j) {
                    System.out.println(list[i] + " " + list[j]);
                }
            }
        }
    }
}
