package week_02.assignments;

import java.util.Scanner;

public class Question_02_11 {
    public static void main(String[] args) {
        final int CURRENT_POPULATION = 312_032_486;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years:  ");
        double year = input.nextDouble();
        double secondsInGivenYear = year * 365 * 24 * 60 * 60; //converting the number of years to seconds
        double birthNumber = secondsInGivenYear / 7;
        double deathNumber = secondsInGivenYear / 13;
        double immigrantsNumber = secondsInGivenYear / 45;
        int populationInGivenYear = CURRENT_POPULATION + (int) birthNumber + (int) immigrantsNumber -
                (int) deathNumber;
        System.out.println("The population in " + year + " years is " + populationInGivenYear);
    }
}
