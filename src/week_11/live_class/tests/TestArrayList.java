package week_11.live_class.tests;

import week_11.live_class.classes.CircleFromSimpleGeometricObject;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("Ankara");
        cityList.add("Istanbul");
        cityList.add("Antalya");
        cityList.add("Corum");
        cityList.add("Aksaray");


        System.out.println("List size? " + cityList.size());

        System.out.println("Is Miami in the list ? " +
                cityList.contains("Miami"));

        System.out.println("Is list empty ? " +
                cityList.isEmpty());

        cityList.add(1,"New York");
        cityList.remove("Ankara");
        cityList.remove(0);
        System.out.println(cityList.toString());

        for (int i = cityList.size() - 1; i >= 0 ; i--) {
            System.out.print(cityList.get(i) + " ");
        }
        System.out.println();
        ArrayList<CircleFromSimpleGeometricObject> list
                 = new ArrayList<>();

        list.add(new CircleFromSimpleGeometricObject(2));
        list.add(new CircleFromSimpleGeometricObject(3));

        System.out.println("The area of the circle ? " +
                list.get(0).getArea());
    }
}
