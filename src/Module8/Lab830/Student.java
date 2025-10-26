package Module8.Lab830;

public class Student {
    private String first;
    private String last;
    private double gpa;

    public Student(String inputFirst, String inputLast, double inputGPA) {
        first = inputFirst;
        last = inputLast;
        gpa = inputGPA;
    }

    public double getGPA() {
        return gpa;
    }
}
