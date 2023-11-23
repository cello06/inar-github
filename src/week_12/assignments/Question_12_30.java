package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            try {
                System.out.print("Enter the year : ");
                int year = input.nextInt();
                System.out.print("Enter the gender :");
                String gender = input.next();
                if (gender.length() != 1 ||
                        (gender.charAt(0) != 'M' && gender.charAt(0) != 'F')) {
                    System.out.println("You enter gender wrongly! Please check it !");
                    continue;
                }
                System.out.print("Enter the name :");
                String name = input.next();

                printResults(year, gender, name);

                condition = false;

            } catch (InputMismatchException ex) {
                System.out.println("Wrong input : " +
                        "\nEnter integer for year!" +
                        "\nEnter char for gender(M/F)" +
                        "\nEnter string for name!");
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            if (condition) {
                input.nextLine();
            }
        }
    }

    public static void printResults
            (int year, String gender, String name)
            throws FileNotFoundException {
        String filePath = "C:\\Users\\Celallettin\\workspace\\inar-java\\src\\week_12\\assignments\\classes\\"
                + "babynameranking" + year + ".txt";

        File file = new File(filePath);
        try {
            Scanner input = new Scanner(file);
            int count = 1;
            while (input.hasNext()) {
                String line = input.nextLine();
                //line = line.trim();

                if (checkLine(line, year, gender, name)) {
                    String[] parts = line.split("\t");
                    System.out.println(name + " is ranked #" + parts[0] + " in year " + year);
                    break;
                }
                if (count == 1000) {
                    System.out.println("The name " + name + " is not ranked in year " + year);
                }
                count++;
            }
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("Problem is printResult() method!");
        }

    }

    public static boolean checkLine
            (String line, int year, String gender, String name) {

        String[] parts = line.split("\t");
        if (gender.charAt(0) == 'M' &&
                parts[1].equals(name)) {
            return true;
        } else if (gender.charAt(0) == 'F' &&
                parts[1].equals(name)) {
            return true;
        } else {
            return false;
        }
    }
}
