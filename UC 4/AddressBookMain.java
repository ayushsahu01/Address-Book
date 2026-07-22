import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        int choice;

        do {
            System.out.println("\n===== ADDRESS BOOK MENU =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.print("First Name: ");
                    String firstName = sc.nextLine();

                    System.out.print("Last Name: ");
                    String lastName = sc.nextLine();

                    System.out.print("Address: ");
                    String address = sc.nextLine();

                    System.out.print("City: ");
                    String city = sc.nextLine();

                    System.out.print("State: ");
                    String state = sc.nextLine();

                    System.out.print("Zip: ");
                    String zip = sc.nextLine();

                    System.out.print("Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    Person person = new Person(firstName, lastName, address,
                            city, state, zip, phone, email);

                    addressBook.addContact(person);
                    break;

                case 2:
                    addressBook.displayContacts();
                    break;

                case 3:
                    System.out.print("Enter First Name to Edit: ");
                    String editName = sc.nextLine();
                    addressBook.editContact(editName);
                    break;

                case 4:
                    System.out.print("Enter First Name to Delete: ");
                    String deleteName = sc.nextLine();
                    addressBook.deleteContact(deleteName);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}