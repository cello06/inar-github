package week_14;

import week_14.classes.CompareY;
import week_14.classes.Point;

import java.util.*;

public class Question_14_03 {
    public static void main(String[] args) {
        List<Point> points = getRandomlyGeneratedPoints();
        //To have a good output I separately sort List
        // and then print the results in a clear way
        List<Point> sortedAccordingToX = sortAccordingToX(points);
        List<Point> sortedAccordingToY = sortAccordingToY(points);

        printResult(sortedAccordingToX, sortedAccordingToY);
    }

    public static List<Point> getRandomlyGeneratedPoints() {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            double randomX = Math.random() * 100;
            double randomY = Math.random() * 100;
            points.add(new Point(randomX, randomY));
        }
        return points;
    }

    public static List<Point> sortAccordingToX(List<Point> list) {
        List<Point> result = new ArrayList<>(list);
        //When we use Collections sort method
        //it sorts according to the compareTo() method
        //that we wrote in the Point class
        Collections.sort(result);
        return result;
    }

    public static List<Point> sortAccordingToY(List<Point> list) {
        List<Point> result = new ArrayList<>(list);
        //But if we create a class and implement this
        //class from Comparator<> interface and override the compareTo()
        //method of Comparator<> we can sort our points according to
        // this compareTo() method instead of other compareTo() , by using
        //the instance of the class that we implement from the Comparator<> interface.
        CompareY compareAccordingToY = new CompareY();

        result.sort(compareAccordingToY);
        return result;
    }

    public static void printResult
            (List<Point> xOrientedPoints, List<Point> yOrientedPoints) {
        System.out.println("Points sorted                    Points sorted");
        System.out.println("According to X                   According to Y");
        for (int i = 0; i < xOrientedPoints.size(); i++) {
            System.out.println(xOrientedPoints.get(i) + "                   " + yOrientedPoints.get(i));
        }
    }
}
