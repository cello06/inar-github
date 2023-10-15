package week_08.assignments;

import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {
        int[][] workHours = getWorkHoursOfEmployees();
        int[] totalWorkHours = getTotalWorkHours(workHours);
        printTotalWorkHoursDecreasingOrder(totalWorkHours);
    }

    public static int[][] getWorkHoursOfEmployees() {

        final int DAYS_IN_WEEK = 7;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee number : ");
        int countOfEmployee = input.nextInt();
        int[][] workHours = new int[countOfEmployee][DAYS_IN_WEEK];
        System.out.println("Enter the working hours of employees :");
        for (int employee = 0; employee < workHours.length; employee++) {
            for (int day = 0; day < workHours[employee].length; day++) {
                workHours[employee][day] = input.nextInt();
            }
        }
        return workHours;
    }

    public static int[] getTotalWorkHours(int[][] workHours) {
        int[] totalWorkHours = new int[workHours.length];
        for (int employee = 0; employee < workHours.length; employee++) {
            int totalWorkHoursOfThisEmployee = 0;
            for (int day = 0; day < workHours[employee].length; day++) {
                totalWorkHoursOfThisEmployee += workHours[employee][day];
            }
            totalWorkHours[employee] = totalWorkHoursOfThisEmployee;
        }
        return totalWorkHours;
    }

    public static void printTotalWorkHoursDecreasingOrder(int[] totalWorkHours) {
        int[] employees = new int[totalWorkHours.length];

        //Employee numbers for sorting.
        for (int i = 0; i < employees.length; i++) {
            employees[i] = i;
        }


        for (int i = 0; i < totalWorkHours.length - 1; i++) {
            int currentMax = totalWorkHours[i];
            int currentMaxIndex = i;
            int indexOfMaxEmployee = i;
            for (int j = i + 1; j < totalWorkHours.length; j++) {
                if (currentMax < totalWorkHours[j]) {
                    currentMax = totalWorkHours[j];
                    currentMaxIndex = j;
                    indexOfMaxEmployee = employees[j];
                }
            }
            if (currentMaxIndex != i) {
                totalWorkHours[currentMaxIndex] = totalWorkHours[i];
                totalWorkHours[i] = currentMax;
                employees[currentMaxIndex] = employees[i];
                employees[i] = indexOfMaxEmployee;

            }
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + employees[i] + "' s total work hour is " + totalWorkHours[i]);
        }
    }
}
