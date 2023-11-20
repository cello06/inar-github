package week_12.assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = getRandomlyChosenArray();
        boolean condition = true;
        while (condition) {
            System.out.print("Enter the index of the array : ");
            try {
                int index = input.nextInt();
                System.out.println("You choose :" + array[index]);
                condition = false;
            } catch (InputMismatchException ex) {//if user does not enter integer for index
                System.out.println("Wrong input. You must enter integer");

            } catch (IndexOutOfBoundsException ex) {//if index number that user entered,out of bounds
                System.out.println("Out of Bounds !!");
            }
            input.nextLine();//this is for making possible to take number while iteration goes on
        }
    }

    public static int[] getRandomlyChosenArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        return array;
    }
}
