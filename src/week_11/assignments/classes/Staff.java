package week_11.assignments.classes;

import week_10.assignments.classes.MyDate;

public class Staff extends Employee {
    private String title;

    public Staff() {

    }

    public Staff(String title) {
        this.title = title;
    }

    public Staff(String title, int office, double salary,
                 MyDate dateHired, String name, String address,
                 long phoneNumber, String email) {
        super(office, salary, dateHired, name, address, phoneNumber, email);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "   _Faculty_\n" +
                "Name : " + super.getName() +
                "\nAddress : " + super.getAddress() +
                "\nPhone Number : " + super.getPhoneNumber() +
                "\nEmail address : " + super.getEmail() +
                "\nOffice : " + super.getOffice() +
                "\nSalary : " + super.getSalary() +
                "\nHired Date :" + super.getDateHired().toString() +
                "\nTitle : " + this.title;

    }
}
