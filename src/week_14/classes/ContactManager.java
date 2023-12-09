package week_14.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContactManager {
    private Map<String, String> contacts;

    public ContactManager() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        this.contacts.put(name, phoneNumber);
    }

    public String searchByName(String name) {
        return this.contacts.get(name);
    }

    public String searchByPhoneNumber(String phoneNumber) {
        Set<String> keySet = this.contacts.keySet();
        ArrayList<String> names = new ArrayList<>(keySet);
        for (int i = 0; i < names.size(); i++) {
            if (this.contacts.get(names.get(i)).equals(phoneNumber)) {
                return names.get(i);
            }
        }
        return "There is no name who use this phone number!";
    }

    public String showContacts() {
        StringBuilder contacts = new StringBuilder();
        ArrayList<String> names = new ArrayList<>(this.contacts.keySet());
        for (int i = 0; i < names.size(); i++) {
            contacts.append(names.get(i)).append(" ---> ").append(this.contacts.get(names.get(i))).append("\n");
        }
        return contacts.toString();
    }

}
