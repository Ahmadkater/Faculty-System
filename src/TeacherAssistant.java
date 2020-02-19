import java.util.ArrayList;
import java.util.Arrays;

public class TeacherAssistant extends Student implements Employee , Staff {

    private int Salary;
    private ArrayList<String> TeachingCourses;

    public TeacherAssistant(String name, String dateOfBirth, String phoneNum) {
        super(name, dateOfBirth, phoneNum);
    }

    public TeacherAssistant(String name, String dateOfBirth, String phoneNum, ArrayList courseList) {
        super(name, dateOfBirth, phoneNum, courseList);
    }

    public TeacherAssistant(String name, String dateOfBirth, String phoneNum, ArrayList courseList , int Salary ,  ArrayList<String> TeachingCourses) {
        super(name, dateOfBirth, phoneNum, courseList);
        this.Salary = Salary;
        this.TeachingCourses = TeachingCourses;
    }

    @Override
    public int getSalary() {
        return Salary;
    }

    @Override
    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    @Override
    public ArrayList<String> getTeachingCourses() {
        return this.TeachingCourses;
    }

    @Override
    public void setTeachingCourses(ArrayList<String> Courses) {
        this.TeachingCourses = Courses;
    }

    @Override
    public String toString()
    {
        return "TA Name: " + getName() + " | " + "Studying Courses: " + getCourseList().toString()
                +" | " + "Salary: " + this.Salary + " | " +  "CoursesTaught: " + getTeachingCourses().toString();
    }

}
