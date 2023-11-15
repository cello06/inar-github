package week_11.assignments.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getListFromUser();
        System.out.println("Before sorting..");
        printList(numbers);
        sort(numbers);
        System.out.println("\nAfter sorting..");
        printList(numbers);
    }

    public static ArrayList<Integer> getListFromUser() {
        ArrayList<Integer> result = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of integers ending with 0 :");
        int value;
        do {
            value = input.nextInt();
            if (value != 0) {
                result.add(value);
            }

        } while (value != 0);
        return result;
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
    //Own sort method

    //public static void sort(ArrayList<Integer>list){
    //  if(list.size() == 0){
    //    System.out.println("Nothing to sort");
    //      return;
    //   }

    //    for (int i = 0; i < list.size() - 1; i++) {
    //       int min = list.get(i);
    //       int minIndex = i;
    //       for (int j = i+1; j < list.size(); j++) {
    //          if(list.get(j) < min){
    //            min = list.get(j);
    //            minIndex = j;
    //           }
    //        }
    //        if(minIndex != i){
    //           list.remove(minIndex);
    //           list.add(minIndex,list.get(i));
    //           list.remove(i);
    //           list.add(i,min);
    //        }
    //   }
    //}

    //using Collections
    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}
