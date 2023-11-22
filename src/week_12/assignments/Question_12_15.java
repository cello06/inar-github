package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_15 {
    public static void main(String[] args) {
        String currentPath = "C:\\Users\\Celallettin\\workspace\\inar-java\\src\\week_12\\assignments\\classes";
        String filePath = currentPath + "\\Question_12_15.txt";
        File file = new File(filePath);
        try {
            writeRandomNumbers(file);
            readNumbers(file);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeRandomNumbers(File file)
            throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            try {
                PrintWriter output = new PrintWriter(file);
                System.out.print("How many numbers that you want to write? : ");
                int countOfNumbers = input.nextInt();
                ArrayList<Integer> numbers = getRandomNumbers(countOfNumbers);

                for (int i = 0; i < numbers.size(); i++) {
                    output.print(numbers.get(i) + " ");
                }
                output.close();
                condition = false;
            } catch (IOException ex) {
                throw new FileNotFoundException("A problem occurred while writing on file!");
            } catch (InputMismatchException ex) {
                System.out.println("You must enter an integer!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            input.nextLine();
        }
    }

    public static ArrayList<Integer> getRandomNumbers(int countOfNumbers)
            throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();
        if (countOfNumbers <= 0) {
            throw new Exception("There is no number to write!");
        }
        for (int i = 0; i < countOfNumbers; i++) {
            int number = (int) (Math.random() * 100 + 1);
            numbers.add(number);
        }
        return numbers;
    }

    public static void readNumbers(File file)
            throws FileNotFoundException {
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                numbers.add(input.nextInt());
            }
            Collections.sort(numbers);
            printNumbers(numbers);
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("File not found to read !");
        }
    }

    public static void printNumbers(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if ((i + 1) % 10 == 0) {
                System.out.printf("%4d\n", numbers.get(i));
            } else {
                System.out.printf("%4d", numbers.get(i));
            }
        }
    }
}
