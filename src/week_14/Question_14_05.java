package week_14;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_14_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean condition = true;
        while (condition) {
            try {
                int countOfZero = 0;
                System.out.println("Enter integers for ArrayList nums (enter -1 to stop) :");
                int number = input.nextInt();
                while (number != -1) {
                    if (number == 0) {
                        countOfZero++;
                    } else {
                        numbers.add(number);
                    }
                    number = input.nextInt();
                }
                for (int i = 0; i < countOfZero; i++) {
                    numbers.add(0);
                }
                condition = false;
            } catch (ClassCastException e) {
                System.out.println("Wrong input for ArrayList<Integer> !");
            } catch (InputMismatchException e) {
                System.out.println("You need to enter integer!");
            }
            input.nextLine();

        }
        System.out.println("ArrayList after moving zeros to the end :\n" + numbers);
    }
}
