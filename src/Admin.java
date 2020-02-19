public class Admin extends Person implements Employee{

    private int Salary;
    public Admin(String name, String dateOfBirth, String phoneNum) {
        super(name, dateOfBirth, phoneNum);
    }

    public Admin(String name, String dateOfBirth, String phoneNum,int Salary) {
        super(name, dateOfBirth, phoneNum);
        this.Salary = Salary;
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
        return "Admin Name: " + getName() + " | " + "DOB: " + this.getDateOfBirth() + " | " + "PhoneNumber: " + getPhoneNum()
                +" | " + "Salary: " + this.Salary ;
    }

}
