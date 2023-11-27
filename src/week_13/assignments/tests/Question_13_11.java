package week_13.assignments.tests;

import week_13.assignments.classes.Octagon;

public class Question_13_11 {
    public static void main(String[] args) {
        Octagon octagon = new Octagon(5);
        System.out.println(octagon);

        try {
            System.out.println("\nCloning the Octagon..");
            Octagon clonedOctagon = (Octagon) octagon.clone();
            System.out.println("Octagon is " + ((octagon.equals(clonedOctagon)) ? "" : " not ") + "equal to its clone.");
        } catch (CloneNotSupportedException e) {
            System.out.println("Problem in cloning!");
        }
    }
}
