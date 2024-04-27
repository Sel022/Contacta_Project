package Project01CS320;

import java.util.HashMap;
import java.util.Map;

// Class for managing contacts
public class ContactService {
    private Map<String, Contact> contacts; // Map to store contacts

    // Constructor to initialize the contacts map
    public ContactService() {
        contacts = new HashMap<>();
    }

    // Method to add a contact to the map
    public void addContact(Contact contact) {
        contacts.put(contact.getContactID(), contact);
    }

    // Method to delete a contact from the map
    public void deleteContact(String contactID) {
        contacts.remove(contactID);
    }

    // Methods to update different fields of a contact
    public void updateFirstName(String contactID, String newFirstName) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.firstName = newFirstName;
        }
    }

    public void updateLastName(String contactID, String newLastName) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.lastName = newLastName;
        }
    }

    public void updatePhone(String contactID, String newPhone) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.phone = newPhone;
        }
    }

    public void updateAddress(String contactID, String newAddress) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.address = newAddress;
        }
    }

    // Method to get a contact by its ID
    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }
}
