package Project01CS320;
//Selvadurai Pathmathasan CS 320 Module 03 Project01 Contact Test 
//Define the Contact class
public class Contact {
 // Private member variables for contact details
 String contactID;
 String firstName;
String lastName;
 String phone;
String address;

 // Constructor to initialize contact details
 public Contact(String contactID, String firstName, String lastName, String phone, String address) {
     this.contactID = contactID;
     this.firstName = firstName;
     this.lastName = lastName;
     this.phone = phone;
     this.address = address;
 }

 // Getter methods for accessing contact details

 // Method to get contact ID
 public String getContactID() {
     return contactID;
 }

 // Method to get first name
 public String getFirstName() {
     return firstName;
 }

 // Method to get last name
 public String getLastName() {
     return lastName;
 }

 // Method to get phone number
 public String getPhone() {
     return phone;
 }

 // Method to get address
 public String getAddress() {
     return address;
 }
}