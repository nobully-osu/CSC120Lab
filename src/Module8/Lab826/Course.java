package Module8.Lab826;

import java.util.*;

// Lab 8.26
public class Course {

    private ArrayList<Student> roster;  // Collection of Student objects

    public Course() {
        roster = new ArrayList<Student>();
    }

    public int courseSize() {
        int size = 0;

        for (Student student : roster) {
            size++;
        }

        return size;
    }

    public void addStudent(Student s) {
        roster.add(s);
    }

    // main
    public static void main(String[] args) {
        Module8.Lab829.Course course = new Module8.Lab829.Course();
        String first;  // first name
        String last;   // last name
        double gpa;    // grade point average

        first = "Bo";
        last = "Lang";
        gpa = 3.1;
        course.addStudent(new Student(first, last, gpa));  // Add 1st student

        first = "Rahul";
        last = "Rose";
        gpa = 2.8;
        course.addStudent(new Student(first, last, gpa));  // Add 2nd student

        first = "Mariam";
        last = "Felix";
        gpa = 3.7;
        course.addStudent(new Student(first, last, gpa));  // Add 3rd student

        System.out.println("Course size: " + course.courseSize()); // Expect: 3
    }
}
