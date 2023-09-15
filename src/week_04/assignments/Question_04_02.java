package week_04.assignments;

import java.util.Scanner;

public class Question_04_02 {
    public static void main(String[] args) {

        final double AVERAGE_EARTH_RADIUS = 6_371.01;//kilometre

        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longtitude) in degrees : ");

        double latitudeOfPoint1AsDegrees = input.nextDouble();

        double longitudeOfPoint1AsDegrees = input.nextDouble();


        double latitudeOfPoint1AsRadians = Math.toRadians(latitudeOfPoint1AsDegrees);
        double longitudeOfPoint1AsRadians = Math.toRadians(longitudeOfPoint1AsDegrees);


        System.out.print("Enter point 2 (latitude and longtitude) in degrees : ");

        double latitudeOfPoint2AsDegrees = input.nextDouble();

        double longitudeOfPoint2AsDegrees = input.nextDouble();

        double latitudeOfPoint2AsRadians = Math.toRadians(latitudeOfPoint2AsDegrees);
        double longitudeOfPoint2AsRadians = Math.toRadians(longitudeOfPoint2AsDegrees);

        //d=radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

        double greatCircleDistance = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(latitudeOfPoint1AsRadians)
                * Math.sin(latitudeOfPoint2AsRadians)
                + Math.cos(latitudeOfPoint1AsRadians) * Math.cos(latitudeOfPoint2AsRadians)
                * Math.cos(longitudeOfPoint1AsRadians - longitudeOfPoint2AsRadians));
        System.out.println("The distance between the two points is " + greatCircleDistance + "km");

    }
}
