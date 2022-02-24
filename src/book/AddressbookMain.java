package book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressbookMain {

	static Scanner scanner = new Scanner(System.in);
	ArrayList<AddressBook> person = new ArrayList<AddressBook>();

	// constructor
	public AddressbookMain() {
	}

	// new person added to record in array list after taking input

	public AddressBook addPerson() {
		System.out.println("Enter the First Name");
		String fName = scanner.next();
		System.out.println("Enter the Last Name");
		String lName = scanner.next();
		System.out.println("Enter the Address");
		String address = scanner.next();
		System.out.println("Enter the City");
		String city = scanner.next();
		System.out.println("Enter the State");
		String state = scanner.next();
		System.out.println("Enter the Zip");
		String zip = scanner.next();
		System.out.println("Enter the PhoneNumber");
		String phoneNumber = scanner.next();
		System.out.println("Enter the Email");
		String email = scanner.next();
		// creating constructor
		AddressBook addressBook = new AddressBook(fName, lName, address, city, state, zip, phoneNumber, email);

		// add the address book
		person.add(addressBook);

		// printing AddressBook object data inside
		System.out.println(addressBook);

		return addressBook;

	}// end of add person method

	// Edit AddressBook details using person name

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program in AddressBookMain class");
		AddressbookMain xy = new AddressbookMain();
		xy.addPerson();
	}
}
