package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {
        int[] list1 = getList(1);
        int[] list2 = getList(2);
        int[] mergedList = merge(list1, list2);
        printList(mergedList);
    }

    public static int[] getList(int listNumber) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list" + listNumber + " : ");
        int sizeOfList = input.nextInt();
        int[] list = new int[sizeOfList];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];
        int count = 0;
        for (int i = 0; i < mergedList.length; i++) {
            if (i < list1.length) {
                mergedList[i] = list1[i];
            } else {
                mergedList[i] = list2[count];
                count++;
            }
        }
        Arrays.sort(mergedList);
        return mergedList;
    }

    public static void printList(int[] mergedList) {
        System.out.print("The merged list is ");
        for (int j : mergedList) {
            System.out.print(j + " ");
        }
    }
}
