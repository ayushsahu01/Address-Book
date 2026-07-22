import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Person> contacts = new ArrayList<>();

    public void addContact(Person person) {
        contacts.add(person);
        System.out.println("Contact Added Successfully!");
    }

    public void editContact(String name) {
        Scanner sc = new Scanner(System.in);

        for (Person person : contacts) {
            if (person.firstName.equalsIgnoreCase(name)) {

                System.out.println("Enter New Address:");
                person.address = sc.nextLine();

                System.out.println("Enter New City:");
                person.city = sc.nextLine();

                System.out.println("Enter New State:");
                person.state = sc.nextLine();

                System.out.println("Enter New Zip:");
                person.zip = sc.nextLine();

                System.out.println("Enter New Phone Number:");
                person.phoneNumber = sc.nextLine();

                System.out.println("Enter New Email:");
                person.email = sc.nextLine();

                System.out.println("Contact Updated Successfully!");
                return;
            }
        }

        System.out.println("Contact Not Found!");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No Contacts Available.");
            return;
        }

        for (Person person : contacts) {
            person.display();
            System.out.println("----------------------");
        }
    }
}