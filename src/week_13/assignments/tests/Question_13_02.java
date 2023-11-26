package week_13.assignments.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question_13_02 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(1.5);
        list.add(10);
        list.add(1.53);
        list.add(5);
        list.add(12.5);
        list.add(65);
        System.out.println("Before shuffle..");
        System.out.println(list);
        shuffle(list);
        System.out.println("After shuffle..");
        System.out.println(list);

    }

    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) (Math.random() * list.size());
            Number temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }
}
