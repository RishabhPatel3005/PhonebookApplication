package phonebookApp;

import java.util.Scanner;

public class PhonebookApp {

	public static void main(String[] args) {
		
		Phonebook phonebook = new Phonebook();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Phonebook Application Menu: ");
			System.out.println("1. Add Contact");
			System.out.println("2. Search Contact");
			System.out.println("3. Update Contact");
			System.out.println("4. Delete Contact");
			System.out.println("5. View All Contacts");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter contact name: ");
				String name = scanner.nextLine();
				System.out.println("Enter phone number: ");
				String phoneNumber = scanner.nextLine();
				phonebook.addContact(name, phoneNumber);
				System.out.println("Contact added");
				break;
				
			case 2:
				System.out.println("Enter contact name to search: ");
				String searchName = scanner.nextLine();
				Contact foundContact = phonebook.searchContact(searchName);
				if(foundContact != null) {
					System.out.println("Name: " + foundContact.getName() + ", Phone Number: " + foundContact.getPhoneNumber());
				}
				else {
					System.out.println("Contact not found");
				}
				break;
			case 3:
				System.out.println("Enter contact name whose phone number needs to update: ");
				String updateName = scanner.nextLine();
				System.out.println("Enter new PhoneNumber: ");
				String updatePhoneNumber = scanner.nextLine();
				phonebook.updateContact(updateName, updatePhoneNumber);
				System.out.println("Phone Number succesfully updated");
				break;
			case 4:
				System.out.println("Enter contact name to delete: ");
				String deleteName = scanner.nextLine();
				phonebook.deleteContact(deleteName);
				System.out.println("Contact deleted");
				break;
			case 5:
				phonebook.displayAllContacts();
				break;
			case 6:
				System.out.println("Exiting Phonebook Application. Press Enter to exit...");
				scanner.nextLine(); // Wait for user to press Enter
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice.Please try again");
			}
		}
	}
}
