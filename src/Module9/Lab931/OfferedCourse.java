package Module9.Lab931;

public class OfferedCourse extends Course {
    // private fields
    protected String instructorName;
    protected String location;
    protected String classTime;

    // mutator methods
    public void setInstructorName(String userInstructorName) {
        instructorName = userInstructorName;
    }

    public void setLocation(String userLocation) {
        location = userLocation;
    }

    public void setClassTime(String userClassTime) {
        classTime = userClassTime;
    }

    // accessor methods
    public String getInstructorName() {
        return instructorName;
    }

    public String getLocation() {
        return location;
    }

    public String getClassTime() {
        return classTime;
    }
}