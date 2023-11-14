package week_11.assignments.classes;

import week_10.assignments.classes.MyDate;

public class Employee extends Person {
    private int office;
    private double salary;
    private MyDate dateHired;

    public Employee() {
        dateHired = new MyDate();
    }

    public Employee(int office, double salary, MyDate dateHired,
                    String name, String address, long phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "   _Employee_\n" +
                "Name : " + super.getName() +
                "\nAddress : " + super.getAddress() +
                "\nPhone Number : " + super.getPhoneNumber() +
                "\nEmail address : " + super.getEmail() +
                "\nOffice : " + this.office +
                "\nSalary : " + this.salary +
                "\nHired Date :" + this.dateHired.toString();
    }
}
