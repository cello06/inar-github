package week_11.assignments.classes;

public class Student extends Person {
    private final String CLASS_STATUS;

    public Student() {
        this.CLASS_STATUS = "freshman";
    }

    public Student(String classStatus) {
        this.CLASS_STATUS = classStatus;
    }

    public Student(String classStatus, String name,
                   String address, long phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.CLASS_STATUS = classStatus;

    }

    public String getCLASS_STATUS() {
        return CLASS_STATUS;
    }

    @Override
    public String toString() {
        return "   _Student_\n" +
                "Name : " + super.getName() +
                "\nAdress : " + super.getAddress() +
                "\nPhone number : " + super.getPhoneNumber() +
                "\nEmail address : " + super.getEmail() +
                "\nClass Status : " + this.CLASS_STATUS;
    }
}
