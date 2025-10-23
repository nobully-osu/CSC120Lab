package Module8.Lab830;
// Lab 8.30
import java.util.ArrayList;
// import Module8.Lab828.Student;

public class Course {

    private ArrayList<Student> roster;  // Collection of Student objects

    public Course() {
        roster = new ArrayList<Student>();
    }

    public int countHonors() {
        /* Type your code here */
        int honorsCount = 0;
        // loop thru students
        for (Student student : roster) {
            if (student.getGPA() >= 3.0) {
                honorsCount++;
            }
        }
        return honorsCount;
    }

    public void addStudent(Student s) {
        roster.add(s);
    }

    // main
    public static void main(String args[]) {
        Course cis162 = new Course();
        String first;  // first name
        String last;   // last name
        double gpa;    // grade point average

        first = "Henry";
        last = "Cabot";
        gpa = 3.2;
        cis162.addStudent(new Student(first, last, gpa));  // Add 1st student

        first = "Brenda";
        last = "Stern";
        gpa = 2.9;
        cis162.addStudent(new Student(first, last, gpa));  // Add 2nd student

        first = "Lynda";
        last = "Robison";
        gpa = 3.6;
        cis162.addStudent(new Student(first, last, gpa));  // Add 3rd student

        first = "Jake";
        last = "Flynn";
        gpa = 1.8;
        cis162.addStudent(new Student(first, last, gpa));  // Add 4th student

        int honors = cis162.countHonors();
        System.out.println("Honors count: " + honors); // Expect: 2
    }
}

