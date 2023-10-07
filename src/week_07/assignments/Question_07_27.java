package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_27 {
    public static void main(String[] args) {
        int[] list1 = getList(1);
        int[] list2 = getList(2);
        printEquality(list1, list2);
    }

    public static int[] getList(int listNumber) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list" + listNumber + " : ");
        int listLength = input.nextInt();
        int[] list = new int[listLength];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static void printEquality(int[] list1, int[] list2) {
        System.out.println(("The lists are" + (equals(list1, list2) ? " identical" : " not identical")));
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        Arrays.sort(list1);
        Arrays.sort(list2);

        return Arrays.equals(list1, list2);
    }
}
