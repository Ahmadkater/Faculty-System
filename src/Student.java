import java.util.ArrayList;


public class Student extends Person {

    private ArrayList CourseList;

    public Student(String name, String dateOfBirth, String phoneNum) {
        super(name, dateOfBirth, phoneNum);

    }

    public Student(String name, String dateOfBirth, String phoneNum, ArrayList courseList) {
        super(name, dateOfBirth, phoneNum);
        CourseList = courseList;

    }

    public ArrayList getCourseList() {
        return CourseList;
    }

    public void setCourseList(ArrayList courseList) {
        CourseList = courseList;
    }

    public String toString()
    {
        return "Student Name: " + getName() + " | " + "DOB: " + this.getDateOfBirth() + " | " + "PhoneNumber: " + getPhoneNum()
                + " | " + "Studying Courses: " +  getCourseList().toString() ;
    }

}
