package phonebookApp;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
private Map<String,Contact> contacts = new HashMap<>();
	
	public void addContact(String name,String phoneNumber) {
		Contact contact = new Contact(name,phoneNumber);
		contacts.put(name,contact);
	}
	
	public Contact searchContact(String name) {
		return contacts.get(name);
	}
	
	public void updateContact(String name,String newPhoneNumber) {
		Contact contact = contacts.get(name);
		if(contact != null) {
			contact = new Contact(name,newPhoneNumber);
			contacts.put(name,contact);
		}
		else {
			addContact(name,newPhoneNumber);
		}
	}
	
	public void deleteContact(String name) {
		contacts.remove(name);
	}
	
	public void displayAllContacts() {
		System.out.println("All Contacts: ");
		for(Contact contact : contacts.values()) {
			System.out.println("Name: " + contact.getName() + ", Phone Number: " + contact.getPhoneNumber());
		}
	}
}
