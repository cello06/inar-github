package week_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question_14_01 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        generateList(numbers);
        System.out.print("Generated integers :");
        //print(numbers);
        System.out.println(numbers);
        reverseList(numbers);
        System.out.print("Reversed list :");
        System.out.println(numbers);
        //print(numbers);
    }

    public static void generateList(ArrayList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 100);
            list.add(randomNumber);
        }
    }

    public static void reverseList(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void print(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n---------------------");
    }
}
