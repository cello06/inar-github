package week_11.assignments.classes;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();


    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public String[] getStudents() {
        String[] result = new String[students.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = students.get(i);
        }
        return result;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }
}
