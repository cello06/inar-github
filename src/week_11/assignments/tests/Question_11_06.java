package week_11.assignments.tests;

import week_10.assignments.classes.Circle2D;
import week_10.live_class.classes.Loan;


import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Question_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();

        Loan loan = new Loan();
        Date date = new Date();
        String str = "Inar Academy";
        Circle2D circle = new Circle2D();

        objects.add(loan);
        objects.add(date);
        objects.add(str);
        objects.add(circle);

        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i).toString());
            System.out.println("--------------------------");
        }
    }
}
