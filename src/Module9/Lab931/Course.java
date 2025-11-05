package Module9.Lab931;

public class Course {
    // private fields
    protected String courseNumber;
    protected String courseTitle;

    // mutator methods
    public void setCourseNumber(String userCourseNumber) {
        courseNumber = userCourseNumber;
    }

    public void setCourseTitle(String userCourseTitle) {
        courseTitle = userCourseTitle;
    }

    // accessor methods
    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    // printInfo method
    public void printInfo() {
        System.out.println("Course Information:");
        System.out.println("   Course Number: " + courseNumber);
        System.out.println("   Course Title: " + courseTitle);
    }
}
