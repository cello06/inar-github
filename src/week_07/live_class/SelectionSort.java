package week_07.live_class;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of list : ");
        int lengthOfList = input.nextInt();

        int[] numbers = createList(lengthOfList);
        printList(numbers);
        numbers = sortList(numbers);
        printList(numbers);
    }

    public static int[] createList(int length) {
        int[] list = new int[length];

        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100) + 1;
        }
        return list;
    }

    public static int[] sortList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length; j++) {
                if(list[i] > list[j]){
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }
    public static void printList(int [] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }
}
