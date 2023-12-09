package week_14;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_14_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        while (true) {
            try {
                int number = input.nextInt();
                int controlNumber = number;
                int count = 0;
                while (true) {
                    String strOfNumber = String.valueOf(controlNumber);
                    ArrayList<Integer> digitsOfNumber = new ArrayList<>();
                    for (int i = 0; i < strOfNumber.length(); i++) {
                        digitsOfNumber.add(Integer.parseInt(String.valueOf(strOfNumber.charAt(i))));
                    }
                    int newNumber = 0;
                    for (int i = 0; i < digitsOfNumber.size(); i++) {
                        newNumber += Math.pow(digitsOfNumber.get(i), 2);
                    }
                    controlNumber = newNumber;
                    if (newNumber == 1) {
                        System.out.println(number + " is a happy number");
                        break;
                    }
                    if (count == 1000) {
                        System.out.println(number + " is not a happy number!");
                        break;
                    }
                    count++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!\n" +
                        "To quit enter -1\n" +
                        "To try again press any button!");
                String check = input.nextLine();
                if (check.equals("-1")) {
                    System.exit(12);
                }
            }
        }
    }
}
