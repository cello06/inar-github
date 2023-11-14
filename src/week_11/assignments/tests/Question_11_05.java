package week_11.assignments.tests;

import week_11.assignments.classes.Course;

public class Question_11_05 {
    public static void main(String[] args) {
        Course course = new Course("INAR-JAVA");
        course.addStudent("Nisanur Altuntas");
        course.addStudent("Gürkan Serteser");
        course.addStudent("Sinan Cetin");
        course.addStudent("Mehmet Toprak");
        course.addStudent("Sefa Atakul");
        course.addStudent("Musa Deniz");
        course.addStudent("Berkan Eris");

        System.out.println("After adding student to the course ..");
        String[] students = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            if (i == course.getNumberOfStudents() - 1) {
                System.out.println(students[i]);
            } else if ((i + 1) % 3 == 0) {
                System.out.println(students[i]);
            } else {
                System.out.print(students[i] + "-");
            }
        }
        System.out.println("Number of Students : " + course.getNumberOfStudents());
        System.out.println("--------------------");
        course.dropStudent("Sinan Cetin");
        course.dropStudent("Mehmet Toprak");
        course.dropStudent("Berkan Eris");
        System.out.println("After dropping student from the course ..");
        String[] newStudents = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            if (i == course.getNumberOfStudents() - 1) {
                System.out.println(newStudents[i]);
            } else if ((i + 1) % 3 == 0) {
                System.out.println(newStudents[i]);
            } else {
                System.out.print(newStudents[i] + "-");
            }
        }
        System.out.println("Number of Students : " + course.getNumberOfStudents());
    }
}
