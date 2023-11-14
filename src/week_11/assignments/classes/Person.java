package week_11.assignments.classes;

public class Person {
    private String name;
    private String address;
    private long phoneNumber;
    private String email;

    public Person() {

    }

    public Person(String name, String address, long phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "   _Person_\n" +
                "Name : " + this.name +
                "\nAdress : " + this.address +
                "\nPhone number : " + this.phoneNumber +
                "\nEmail address : " + this.email;
    }
}
