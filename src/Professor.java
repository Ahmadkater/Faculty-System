import java.util.ArrayList;
import java.util.Arrays;

public class Professor extends Person implements Employee , Staff{

    private int Salary;
    private ArrayList<String> TeachingCourses;

    public Professor(String name, String dateOfBirth, String phoneNum) {
        super(name, dateOfBirth, phoneNum);
    }

    public Professor(String name, String dateOfBirth, String phoneNum , int Salary ,  ArrayList<String> Courses) {
        super(name, dateOfBirth, phoneNum);
        this.Salary = Salary;
        this.TeachingCourses = Courses;
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

    public String toString()
    {
        return "Professor Name: " + getName() + " | " + "Salary: " + this.Salary + " | " +  "CoursesTaught: " + getTeachingCourses().toString();
    }

}
