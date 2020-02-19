import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> Courses = new ArrayList<String>();
        ArrayList<String> TeachingCourses = new ArrayList<>();


        System.out.println("Enter Person Data");
        System.out.print("Name : ");
        String Name = input.nextLine();
        System.out.print("Birth Of Date : ");
        String DateOfBirth = input.nextLine();
        System.out.print("Phone Number : ");
        String PhoneNumber = input.nextLine();


        System.out.println("Enter Your Job Title![student - staff (ta - professor - assistant professor - admin)]");
        String JobTitle = input.nextLine();

        if (JobTitle.equals("student")) {
            System.out.println("Write Courses list");
            Courses.add(input.nextLine());
            Courses.add(input.nextLine());

            System.out.println("Done!");

            Student s1 = new Student(Name, DateOfBirth, PhoneNumber, Courses);

            System.out.println(s1.toString());
        } if (JobTitle.equals("staff")) {

            System.out.print("Enter Salary : ");
            int Salary = input.nextInt();

            System.out.print("Select Staff Position : ");

            input.nextLine();
            String JobTitle2 = input.nextLine();

            if (JobTitle2.equals("ta")) {

                System.out.println("Write TA Studying Courses list");

                Courses.add(input.nextLine());
                Courses.add(input.nextLine());

                System.out.println("Write TA Teaching Courses list");

                TeachingCourses.add(input.nextLine());
                TeachingCourses.add(input.nextLine());


                System.out.println("Done!");
                TeacherAssistant t1 = new TeacherAssistant(Name, DateOfBirth, PhoneNumber, Courses, Salary, TeachingCourses);
                System.out.println(t1.toString());
            }

            if (JobTitle2.equals("professor") || JobTitle2.equals("assistant professor")){

                System.out.println("Write Teaching Courses list");

                TeachingCourses.add(input.nextLine());
                TeachingCourses.add(input.nextLine());


                System.out.println("Done!");
                Professor t1 = new Professor(Name, DateOfBirth, PhoneNumber, Salary, TeachingCourses);
                System.out.println(t1.toString());

            }

            if (JobTitle2.equals("admin")){
                System.out.println("Done!");
                Admin t1 = new Admin(Name, DateOfBirth, PhoneNumber, Salary);
                System.out.println(t1.toString());

            }


        }


        Dean dean = Dean.getDeanInstance();
        System.out.println(dean.toString());

        System.out.println("Do you change dean? Yes/No");
        String Change = input.nextLine();

        if (Change.equals("Yes")) {
            System.out.println("Enter New Dean Data");
            System.out.print("New Dean Name : ");
            dean.setName(input.nextLine());
            System.out.print("New Dean Date of Birth : ");
            dean.setDateOfBirth(input.nextLine());
            System.out.print("New Dean Phone Number : ");
            dean.setPhoneNum(input.nextLine());
            System.out.print("New Dean Salary : ");
            dean.setSalary(input.nextInt());
            input.nextLine();
        }

        System.out.println(dean.toString());



    }

}


