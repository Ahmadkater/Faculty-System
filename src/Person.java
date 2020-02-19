public class Person {

    private String Name ;
    private String DateOfBirth ;
    private String PhoneNum ;

    public Person(String name, String dateOfBirth, String phoneNum) {
        Name = name;
        DateOfBirth = dateOfBirth;
        PhoneNum = phoneNum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }
    @Override
    public String toString()
    {
        return "Name: " + getName() + " | " + "DOB: " + this.getDateOfBirth() + " | " + "PhoneNumber: " + getPhoneNum() ;
    }

}
