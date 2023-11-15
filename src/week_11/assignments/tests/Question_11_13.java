package week_11.assignments.tests;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getListFromUser();
        removeDuplicate(numbers);
        printDistinctNumbers(numbers);
    }

    public static ArrayList<Integer> getListFromUser() {
        ArrayList<Integer> result = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers :");
        for (int i = 0; i < 10; i++) {
            result.add(input.nextInt());
        }
        return result;
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }
    }

    public static void printDistinctNumbers(ArrayList<Integer> list) {
        System.out.println("The distinct integers are " + list);
    }
}
