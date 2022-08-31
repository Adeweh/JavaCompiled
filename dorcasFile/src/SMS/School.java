package SMS;

import java.util.ArrayList;

public class School {


    private Student[] students = new Student[10];

    private Course[] courses = new Course[5];

    private int numberOfStudents =0;
    private int numberOfCourses = 0;

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            students[i] =student;
        }
        numberOfStudents++;
    }

    public int removeStudent(Student student) {
        return numberOfStudents--;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void addCourse(Course newCourse) {
        for (int i = 0; i < courses.length; i++) {
            courses[i] = newCourse;
        }
        numberOfCourses++;
    }

    public int getNumberOfCourses() {
        return numberOfCourses++;
    }

    public int removeCourse(Course newCourse) {
        return numberOfCourses--;
    }
}
