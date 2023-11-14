package week_11.assignments.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getListFromUser();
        printMax(list);
    }

    public static ArrayList<Integer> getListFromUser() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sequence of numbers ending with 0 :");
        int value;
        do {
            value = input.nextInt();
            if (value != 0) {
                list.add(value);
            }

        } while (value != 0);
        return list;
    }

    public static void printMax(ArrayList<Integer> list) {
        System.out.println("The largest number in the list is " + max(list).toString());
    }

    public static Integer max(ArrayList<Integer> list) {
        return Collections.max(list);
    }
}
