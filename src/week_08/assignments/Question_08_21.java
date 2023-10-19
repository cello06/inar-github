package week_08.assignments;

import java.util.Scanner;

public class Question_08_21 {
    public static void main(String[] args) {
        double[][] cities = getCitiesCoordinates();
        double[] totalDistancesOfCities = findTotalCities(cities);
        printCentralCity(totalDistancesOfCities, cities);
    }

    public static double[][] getCitiesCoordinates() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities :");
        int countOfCities = input.nextInt();
        double[][] cities = new double[countOfCities][2];// I wrote '2' for coordinates --> (x,y)
        System.out.print("Enter the coordinates of the cities : ");
        for (int city = 0; city < cities.length; city++) {
            cities[city][0] = input.nextDouble();
            cities[city][1] = input.nextDouble();
        }
        return cities;
    }

    public static double[] findTotalCities(double[][] cities) {
        double[] totalDistancesOfCities = new double[cities.length];
        for (int city = 0; city < cities.length; city++) {
            double sumOfDistancesOfThisCity = 0;
            for (int otherCity = 0; otherCity < cities.length; otherCity++) {
                if (city == otherCity) {
                    continue;
                }
                double x1 = cities[city][0];
                double y1 = cities[city][1];
                double x2 = cities[otherCity][0];
                double y2 = cities[otherCity][1];
                sumOfDistancesOfThisCity += getDistanceOfTwoPoint(x1, y1, x2, y2);
            }
            totalDistancesOfCities[city] = sumOfDistancesOfThisCity;
        }
        return totalDistancesOfCities;
    }

    public static double getDistanceOfTwoPoint(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void printCentralCity(double[] totalDistancesOfCities, double[][] cities) {
        int indexOfMinTotalDistance = getIndexOfMin(totalDistancesOfCities);
        System.out.println("The central city is at ("
                + cities[indexOfMinTotalDistance][0] + "," + cities[indexOfMinTotalDistance][1] + ")");
        System.out.printf("The total distance to all other cities is %.2f", totalDistancesOfCities[indexOfMinTotalDistance]);
    }

    public static int getIndexOfMin(double[] totalDistancesOfCities) {
        double currentMinDistance = totalDistancesOfCities[0];
        int indexOfCurrentMin = 0;
        for (int distance = 1; distance < totalDistancesOfCities.length; distance++) {
            if (currentMinDistance > totalDistancesOfCities[distance]) {
                currentMinDistance = totalDistancesOfCities[distance];
                indexOfCurrentMin = distance;
            }
        }
        return indexOfCurrentMin;
    }
}
