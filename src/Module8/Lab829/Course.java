package Module8.Lab829;

import java.util.ArrayList;

// Lab 8.29
public class Course {
    private ArrayList<Student> roster; // Collection of Student objects

    public Course() {
        roster = new ArrayList<Student>();
    }

    public Student(String first, String last, double gpa) {

    }

    public Student findStudentHighestGpa() {

    }

    public void addStudent(Student s) {
        roster.add(s);
    }

    // main
    public static void main(String args[]) {
        Course course = new Course();
        String first;  // first name
        String last;   // last name
        double gpa;    // grade point average

        first = "Henry";
        last = "Nguyen";
        gpa = 3.5;
        course.addStudent(new Student(first, last, gpa));  // Add 1st student

        first = "Brenda";
        last = "Stern";
        gpa = 2.0;
        course.addStudent(new Student(first, last, gpa));  // Add 2nd student

        first = "Lynda";
        last = "Robison";
        gpa = 3.2;
        course.addStudent(new Student(first, last, gpa));  // Add 3rd student

        first = "Sonya";
        last = "King";
        gpa = 3.9;
        course.addStudent(new Student(first, last, gpa));  // Add 4th student

        Student student = course.findStudentHighestGpa();
        System.out.println("Top student: " + student);     //Expect: Sonya
    }
}
