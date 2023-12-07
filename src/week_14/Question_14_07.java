package week_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_14_07 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getRandomlyGeneratedList();
        System.out.println("Generated List : " + numbers);
        int randomQueue = (int) (Math.random() * numbers.size() + 1);
        System.out.println("What is the " + randomQueue + ". greatest number ?");
        Collections.sort(numbers);
        System.out.println("The " + randomQueue + "th largest element is : " + numbers.get(numbers.size() - randomQueue));
    }

    public static ArrayList<Integer> getRandomlyGeneratedList() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        boolean condition = true;
        while (condition) {
            System.out.print("Enter the size of your ArrayList :");
            try {
                int size = input.nextInt();
                for (int i = 0; i < size; i++) {
                    int randomNumber = (int) (Math.random() * 100);
                    result.add(randomNumber);
                }
                condition = false;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input !");
                input.nextLine();
            }
        }
        return result;
    }
}
