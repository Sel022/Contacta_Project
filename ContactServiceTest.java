package Project01CS320;

// Test class for ContactService methods
public class ContactServiceTest {

    // Test method to add a contact
    @Test
    public void testAddContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("9998887770","David","Pete","9998887770","2nd Street");
        contactService.addContact(contact);
        
        // Assert that the added contact is retrievable
        assertEquals(contact, contactService.getContact("9998887770"));
    }

    // Test method to delete a contact
    @Test
    public void testDeleteContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("9998887770","David","Pete","9998887770","2nd Street");
        contactService.addContact(contact);
        contactService.deleteContact("9998887770");

        // Assert that the deleted contact is no longer retrievable
        assertNull(contactService.getContact("1234567890"));
    }

    // Test method to update the first name of a contact
    @Test
    public void testUpdateFirstName() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("9998887770","David","Pete","9998887770","2nd Street");
        contactService.addContact(contact);
        contactService.updateFirstName("1234567890", "Jane");

        // Assert that the first name is updated correctly
        assertEquals("Dany", contactService.getContact("9998887770").getFirstName());
    }

    // Test method to update the last name of a contact
    @Test
    public void testUpdateLastName() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("9998887770","David","Pete","9998887770","2nd Street");
        contactService.addContact(contact);
        contactService.updateLastName("9998887770", "Siva");

        // Assert that the last name is updated correctly
        assertEquals("Siva", contactService.getContact("1234567890").getLastName());
    }

    // Test method to update the phone number of a contact
    @Test
    public void testUpdatePhone() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("9998887770","David","Pete","9998887770","2nd Street");
        contactService.addContact(contact);
        contactService.updatePhone("9998887770","3334445550");

        // Assert that the phone number is updated correctly
        assertEquals("0987654321", contactService.getContact("9998887770").getPhone());
    }

    // Test method to update the address of a contact
    @Test
    public void testUpdateAddress() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("9998887770","David","Pete","9998887770","2nd Street");
        contactService.addContact(contact);
        contactService.updateAddress("9998887770", "652 Palm St");

        // Assert that the address is updated correctly
        assertEquals("456 Elm St", contactService.getContact("9998887770").getAddress());
    }
}