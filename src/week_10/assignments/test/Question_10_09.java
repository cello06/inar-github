package week_10.assignments.test;

import week_10.assignments.classes.Course;

public class Question_10_09 {
    public static void main(String[] args) {
        Course course = new Course("Java Class");
        course.addStudent("Sinan Cetin");
        course.addStudent("Celalettin Aktürk");
        course.addStudent("Emir Uyanık");
        course.printStudents();
        System.out.println("----------------");
        course.dropStudent("Celalettin aktürk");
        course.printStudents();
        System.out.println("----------------");
    }
}
