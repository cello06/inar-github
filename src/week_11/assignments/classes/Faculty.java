package week_11.assignments.classes;

import week_10.assignments.classes.MyDate;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty() {

    }

    public Faculty(String officeHours, String rank) {
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String officeHours, String rank, int office,
                   double salary, MyDate dateHired, String name,
                   String address, long phoneNumber, String email) {
        super(office, salary, dateHired, name, address, phoneNumber, email);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
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
                "\nOffice Hours : " + this.officeHours +
                "\nRank : " + this.rank;
    }
}
