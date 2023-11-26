package week_13.assignments.tests;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Question_13_03 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(1.5);
        list.add(10);
        list.add(new BigInteger("323232323232323232323"));
        list.add(1.53);
        list.add(5);
        list.add(12.5);
        list.add(65);
        System.out.println("Before sorting..");
        System.out.println(list);
        sort(list);
        System.out.println("After sorting..");
        System.out.println(list);
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Number currentMin = list.get(i);
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < currentMin.doubleValue()) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                Number temp = list.get(i);
                list.set(i, currentMin);
                list.set(currentMinIndex, temp);
            }
        }
    }

}
