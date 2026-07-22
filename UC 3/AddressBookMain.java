import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.println("Enter First Name:");
        String firstName = sc.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = sc.nextLine();

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        System.out.println("Enter City:");
        String city = sc.nextLine();

        System.out.println("Enter State:");
        String state = sc.nextLine();

        System.out.println("Enter Zip:");
        String zip = sc.nextLine();

        System.out.println("Enter Phone Number:");
        String phone = sc.nextLine();

        System.out.println("Enter Email:");
        String email = sc.nextLine();

        Person person = new Person(firstName, lastName, address, city, state, zip, phone, email);
        addressBook.addContact(person);

        System.out.println("\nContacts Before Editing:");
        addressBook.displayContacts();

        System.out.println("\nEnter First Name of Contact to Edit:");
        String editName = sc.nextLine();

        addressBook.editContact(editName);

        System.out.println("\nContacts After Editing:");
        addressBook.displayContacts();

        sc.close();
    }
}