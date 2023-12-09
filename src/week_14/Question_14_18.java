package week_14;

import week_14.classes.ContactManager;

public class Question_14_18 {
    public static void main(String[] args) {
        ContactManager teachers = new ContactManager();
        teachers.addContact("Celalettin", "05372521212");
        teachers.addContact("Emir", "053725223412");
        teachers.addContact("Ada", "05374561212");
        teachers.addContact("Musa", "05372331212");
        teachers.addContact("Merve", "05372523512");
        teachers.addContact("Sinan", "05372354512");
        teachers.addContact("Ozgür", "05372234512");
        teachers.addContact("Gürol", "05372234512");
        System.out.println(teachers.showContacts());
        System.out.println("Celalettin's phone number : " + teachers.searchByName("Celalettin"));
        System.out.println("05372331212 --> whose number :" + teachers.searchByPhoneNumber("05372331212"));
    }
}
