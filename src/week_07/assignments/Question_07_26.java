package week_07.assignments;

import java.util.Scanner;

public class Question_07_26 {
    public static void main(String[] args) {
        equalityOfLists();
    }

    public static void equalityOfLists() {
        int[] list1 = getList(1);
        int[] list2 = getList(2);
        printEquality(list1, list2);
    }

    public static int[] getList(int listNumber) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list" + listNumber + " :");
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        } else {
            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printEquality(int[] list1, int[] list2) {
        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two limits are not strictly identical");
        }
    }

}
