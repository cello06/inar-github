package week_11.assignments.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {
        ArrayList<Double> numbers = getListFromUser();
        double sumOfNumbers = sum(numbers);
        System.out.println("Sum of list : " + sumOfNumbers);
    }

    public static ArrayList<Double> getListFromUser() {
        ArrayList<Double> result = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers :");
        double value;
        do {
            value = input.nextDouble();
            if (value != 0) {
                result.add(value);
            }
        } while (value != 0);
        return result;
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
