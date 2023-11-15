package week_11.assignments.tests;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_14 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = getListFromUser(1);
        ArrayList<Integer> list2 = getListFromUser(2);
        ArrayList<Integer> unionList = union(list1, list2);
        displayUnionList(unionList);
    }

    public static ArrayList<Integer> getListFromUser(int listTag) {
        ArrayList<Integer> result = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five integer for list" + listTag + ": ");
        for (int i = 0; i < 5; i++) {
            result.add(input.nextInt());
        }
        return result;
    }

    public static ArrayList<Integer> union
            (ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    public static void displayUnionList(ArrayList<Integer> list) {
        System.out.println("The combined list is " + list);
    }
}
