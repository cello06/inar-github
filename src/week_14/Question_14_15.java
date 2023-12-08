package week_14;

import java.util.*;

public class Question_14_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number of elements (n) :");
            try {
                int n = input.nextInt();
                ArrayList<Integer> numbers = getNumbersFromUser(n, input);
                ArrayList<Integer> unFoundNumbers = getUnFoundNumbers(n, numbers);
                System.out.println("Numbers missing from ArrayList : " + unFoundNumbers);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!\nTry again!");
                input.nextLine();
            }
        }
    }

    public static ArrayList<Integer> getNumbersFromUser(int n, Scanner input) {
        Set<Integer> numbers = new HashSet<>();
        while (true) {
            System.out.println("Enter the elements of the ArrayList (each in range [1,n] ) : ");
            try {
                for (int i = 0; i < n; i++) {
                    int number = input.nextInt();
                    if (number > n) {
                        throw new InputMismatchException();
                    }
                    numbers.add(number);
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!\nTry again!");
                input.nextLine();
            }
        }
        return new ArrayList<>(numbers);
    }

    public static ArrayList<Integer> getUnFoundNumbers
            (int n, ArrayList<Integer> numbers) {
        ArrayList<Integer> unFoundNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!numbers.contains(i)) {
                unFoundNumbers.add(i);
            }
        }
        return unFoundNumbers;
    }
}
