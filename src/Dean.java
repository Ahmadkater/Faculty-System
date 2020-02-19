public class Dean extends Person implements Employee {

    private int Salary;

    public static Dean deanInstance;

    public static Dean getDeanInstance() {
        if (deanInstance == null){
            deanInstance = new Dean("The Dean" , "Dean BD","Dean Num" , 0);
        }
        return deanInstance;
    }

    private Dean(String name, String dateOfBirth, String phoneNum) {
        super(name, dateOfBirth, phoneNum);
    }

    private Dean(String name, String dateOfBirth, String phoneNum,int Salary) {
        super(name, dateOfBirth, phoneNum);
        this.Salary = Salary;
    }

    private void announceFinalExamResults(){
        System.out.println("Results are Published");
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
    public String toString()
    {
        return "Dean Name: " + getName() + " | " + "DOB: " + getDateOfBirth() + " | " + "PhoneNumber: " + getPhoneNum() + " | " + "Salary: " + getSalary()  ;
    }

}
