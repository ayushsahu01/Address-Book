import java.util.ArrayList;

public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact Added Successfully!");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Address Book is Empty.");
            return;
        }

        for (Contact contact : contacts) {
            System.out.println(contact);
            System.out.println("---------------------------");
        }
    }
}