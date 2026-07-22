import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Person> contacts = new ArrayList<>();

    // UC2 - Add Contact
    public void addContact(Person person) {
        contacts.add(person);
        System.out.println("Contact Added Successfully!");
    }

    // Display Contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No Contacts Available.");
            return;
        }

        for (Person person : contacts) {
            person.display();
        }
    }

    // UC3 - Edit Contact
    public void editContact(String name) {
        Scanner sc = new Scanner(System.in);

        for (Person person : contacts) {
            if (person.firstName.equalsIgnoreCase(name)) {

                System.out.print("Enter New Address: ");
                person.address = sc.nextLine();

                System.out.print("Enter New City: ");
                person.city = sc.nextLine();

                System.out.print("Enter New State: ");
                person.state = sc.nextLine();

                System.out.print("Enter New Zip: ");
                person.zip = sc.nextLine();

                System.out.print("Enter New Phone Number: ");
                person.phoneNumber = sc.nextLine();

                System.out.print("Enter New Email: ");
                person.email = sc.nextLine();

                System.out.println("Contact Updated Successfully!");
                return;
            }
        }

        System.out.println("Contact Not Found!");
    }

    // UC4 - Delete Contact
    public void deleteContact(String name) {
        Iterator<Person> iterator = contacts.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();

            if (person.firstName.equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Contact Deleted Successfully!");
                return;
            }
        }

        System.out.println("Contact Not Found!");
    }
}