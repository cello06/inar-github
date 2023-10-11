package week_07.assignments;

import java.util.Scanner;

public class Question_07_32 {
    public static void main(String[] args) {
        int[] list = getList();
        int indexOfPivotAfterPartition = partition(list);
        int[] newList = listAfterPartition(list, indexOfPivotAfterPartition);
        printList(newList);
       //6 8 8 5 6 2 4 7 4 10
        //2 6 5 4 4 6 8 7 8 10
    }

    public static int[] getList() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list : ");
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static int partition(int[] list) {
        int indexOfPivotAfterPartition;
        int countOfNumbersLessThanPivot = 0;
        int pivot = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < pivot) {
                countOfNumbersLessThanPivot++;
            }
        }
        indexOfPivotAfterPartition = countOfNumbersLessThanPivot;
        return indexOfPivotAfterPartition;
    }

    public static int[] listAfterPartition(int[] list, int indexOfPivotAfterPartition) {
        int pivot = list[0];
        int[] newList = new int[list.length];

        int count = 0;

        for (int j = 1; j < list.length; j++) {
            if (list[j] < pivot) {
                newList[count] = list[j];
                count++;
            }
        }
        newList[indexOfPivotAfterPartition] = pivot;
        count++;

        for (int j = 1; j < list.length; j++) {
            if (list[j] > pivot) {
                newList[count] = list[j];
                count++;
            }
        }
        return newList;
    }

    public static void printList(int[] list) {
        System.out.print("After the partition, the list is ");
        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}
//the result is different!!! ASK IT