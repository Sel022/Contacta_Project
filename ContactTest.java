package Project01CS320;
//Selvadurai Pathmathasan SNHU CS 320 MODULE 03 Project 01
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for Contact creation
public class ContactTest {
    
    // Test method for Contact creation
    @Test
    public void testContactCreation() {
        Contact contact = new Contact("9998887770","David","Pete","9998887770","2nd Street");
        
        // Assert that contact is not null
        assertNotNull(contact);
        
        // Assert that contact fields match the provided values
        assertEquals("9998887770", contact.getContactID());
        assertEquals("David", contact.getFirstName());
        assertEquals("Pete", contact.getLastName());
        assertEquals("9998887770", contact.getPhone());
        assertEquals("2nd Street", contact.getAddress());
    }
}