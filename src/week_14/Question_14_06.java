package week_14;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_14_06 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getRandomlyGeneratedList();
        System.out.println("Original List : " + numbers);
        arrangeList(numbers);
        System.out.println("Rearranged List :" + numbers);
    }

    public static ArrayList<Integer> getRandomlyGeneratedList() {
        ArrayList<Integer> result = new ArrayList<>();
        boolean condition = true;
        while (condition) {
            try {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter the size of ArrayList :");
                int size = input.nextInt();
                for (int i = 0; i < size; i++) {
                    int randomNumber = (int) (Math.random() * 100);
                    result.add(randomNumber);
                }
                condition = false;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input !");
            }
        }
        return result;
    }

    public static void arrangeList(ArrayList<Integer> numbers) {
        int size = numbers.size();
        int count = 0;
        int numberOfEven = getCountOfEvenNumber(numbers);
        for (int i = 0; i < size; i++) {
            if (isEven(numbers.get(i))) {
                int temp = numbers.remove(i);
                numbers.add(temp);
                count++;
                if (count == numberOfEven) {
                    break;
                }
                i--;
            }
        }
    }

    public static int getCountOfEvenNumber(ArrayList<Integer> numbers) {
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (isEven(numbers.get(i))) {
                count++;
            }
        }
        return count;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
