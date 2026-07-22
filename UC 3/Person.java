public class Person {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    public Person(String firstName, String lastName, String address,
                  String city, String state, String zip,
                  String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void display() {
        System.out.println("Name : " + firstName + " " + lastName);
        System.out.println("Address : " + address);
        System.out.println("City : " + city);
        System.out.println("State : " + state);
        System.out.println("Zip : " + zip);
        System.out.println("Phone : " + phoneNumber);
        System.out.println("Email : " + email);
    }
}