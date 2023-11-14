package week_11.assignments.tests;

import week_10.assignments.classes.MyDate;
import week_11.assignments.classes.*;

public class Question_11_02 {
    public static void main(String[] args) {
        Person person = new Person("Gurol",
                "Istanbul",
                9999999999L,
                "gurol@inar.com");
        Person student = new Student("Junior",
                "Nafiz",
                "Ankara",
                3333333333L,
                "nafiz@gmail.com");
        Person employee = new Employee(910,
                60_000,
                new MyDate(),
                "Recai",
                "Istanbul",
                6666666666L,
                "recai@gmail.com");
        Person faculty = new Faculty("10am to 6pm",
                "manager",
                101,
                50_000,
                new MyDate(),
                "Serhat",
                "Texas, Dallas",
                4133333333L,
                "serhat@inar.com");
        Person staff = new Staff("CEO",
                12,
                6005000,
                new MyDate(),
                "Elon",
                "California",
                2030222220L,
                "elon@musk.com");

        System.out.println(person);
        System.out.println("-------------");
        System.out.println(student);
        System.out.println("-------------");
        System.out.println(employee);
        System.out.println("-------------");
        System.out.println(faculty);
        System.out.println("-------------");
        System.out.println(staff);


    }
}
