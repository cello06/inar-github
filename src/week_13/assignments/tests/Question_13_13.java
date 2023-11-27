package week_13.assignments.tests;

import week_13.assignments.classes.Course;

public class Question_13_13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course = new Course("Inar Academy");
        course.addStudent("Burak");
        course.addStudent("Emre");
        course.addStudent("Furkan");
        course.addStudent("Jack");
        System.out.println("Course Name : " + course.getCourseName());
        System.out.println("\nNumber of students in course1: " + course.getNumberOfStudents() +
                "\n" + course.toString());
        System.out.println("-----------------------------------");
        Course course2 = (Course) course.clone();
        course2.addStudent("Jonny");
        course2.addStudent("Tonny");
        System.out.println("\nNumber of students in course2: " + course2.getNumberOfStudents() +
                "\n" + course2.toString());

    }
}
