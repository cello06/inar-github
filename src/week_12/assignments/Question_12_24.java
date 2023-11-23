package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_24 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Celallettin\\workspace\\inar-java\\src\\week_12\\assignments\\classes\\Salary.txt";
        File file = new File(path);
        try {
            Scanner input = new Scanner(file);
            double totalSalaryForAssistants = 0;
            double totalSalaryForAssociates = 0;
            double totalSalaryForFulls = 0;
            int countOfPerson = 0;

            while (input.hasNext()) {
                String line = input.nextLine();
                if (line.contains("assistant")) {
                    totalSalaryForAssistants += getSalary(line);
                } else if (line.contains("associate")) {
                    totalSalaryForAssociates += getSalary(line);
                } else {
                    totalSalaryForFulls += getSalary(line);
                }
                countOfPerson++;
            }
            printResults(totalSalaryForAssistants,
                    totalSalaryForAssociates
                    , totalSalaryForFulls,
                    countOfPerson);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
    }

    public static double getSalary(String line) {
        String[] parts = line.split(" ");
        String salary = parts[3];//firstname lastname rank salary
        salary = salary.replace(',', '.');
        return Double.parseDouble(salary);
    }

    public static void printResults(double totalSalaryForAssistants,
                                    double totalSalaryForAssociates,
                                    double totalSalaryForFulls,
                                    int countOfPerson) {
        double totalSalaryForFaculty = totalSalaryForAssistants +
                totalSalaryForAssociates +
                totalSalaryForFulls;
        double averageSalaryForFaculty = totalSalaryForFaculty / countOfPerson;
        System.out.printf("Total salary for assistant professors : %.2f\n", totalSalaryForAssistants);
        System.out.printf("Total salary for associate professors : %.2f\n", totalSalaryForAssociates);
        System.out.printf("Total salary for full professors      : %.2f\n", totalSalaryForFulls);
        System.out.printf("Total salary for all faculty          : %.2f\n", totalSalaryForFaculty);
        System.out.println("---------------------------------------------------");
        System.out.printf("Average salary for assistant professors : %.2f\n", (totalSalaryForAssistants / countOfPerson));
        System.out.printf("Average salary for associate professors : %.2f\n", (totalSalaryForAssociates / countOfPerson));
        System.out.printf("Average salary for full professors      : %.2f\n", (totalSalaryForFulls / countOfPerson));
        System.out.printf("Average salary for all faculty          : %.2f\n", averageSalaryForFaculty);

    }
}
