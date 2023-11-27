package week_13.assignments.tests;

import week_13.assignments.classes.ComparableCircle;
import week_13.assignments.classes.GeometricObjectNotAbstract;

public class Question_13_06 {
    public static void main(String[] args) {
        ComparableCircle comparableCircle1 = new ComparableCircle(16.5);
        comparableCircle1.setColor("blue");
        comparableCircle1.setFilled(true);
        System.out.println("Comparable Circle 1 : \n" + comparableCircle1);
        System.out.println("---------------------------------------------");
        ComparableCircle comparableCircle2 = new ComparableCircle(20.3);
        comparableCircle2.setColor("purple");
        comparableCircle2.setFilled(true);
        System.out.println("Comparable Circle 2 : \n" + comparableCircle2);
        System.out.println("\n\n---------------------------------------------\n");

        if (comparableCircle1.compareTo(comparableCircle2) == 1) {
            System.out.println("ComparableCircle1 is the larger of two Circles");
        } else if (comparableCircle1.compareTo(comparableCircle2) == 0) {
            System.out.println("Both circle are equals");
        } else {
            System.out.println("ComparableCircle2 is the larger of two Circles");
        }
    }
}
