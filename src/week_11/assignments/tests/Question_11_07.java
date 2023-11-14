package week_11.assignments.tests;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getListFromUser();
        System.out.println("Before shuffling ..");
        printList(list);
        shuffle(list);
        System.out.println("After shuffling ..");
        printList(list);
    }

    public static ArrayList<Integer> getListFromUser() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter a list of integer ending with 0 : ");
        int value;
        do {
            value = input.nextInt();
            if (value != 0) {
                list.add(value);
            }

        } while (value != 0);
        return list;
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n");
    }

    public static void shuffle(ArrayList<Integer> list) {
        java.util.Collections.shuffle(list);
    }
}
