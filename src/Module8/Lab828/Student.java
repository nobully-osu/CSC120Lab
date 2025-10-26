package Module8.Lab828;

// Lab 8.28
public class Student {
    // Build Student class with public methods and private fields listed above

    // TODO: Define two private fields
    private String name;
    private double gpa;

    public Student() {
        // TODO: Define default constructor
        name = "Louie";
        gpa = 1.0;
    }

    public void setName(String n) {
        // TODO: Assign parameter to private field
        name = n;
    }

    // TODO: Add three more public methods
    public String getName() {
        return name;
    }

    public void setGPA(double g) {
        gpa = g;
    }

    public double getGPA(){
        return gpa;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName() + "/" + student.getGPA());

        student.setName("Felix");
        student.setGPA(3.7);
        System.out.println(student.getName() + "/" + student.getGPA());
    }
}
