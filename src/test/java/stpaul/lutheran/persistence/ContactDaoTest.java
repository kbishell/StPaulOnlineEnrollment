package stpaul.lutheran.persistence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stpaul.lutheran.entity.Contact;
import stpaul.lutheran.entity.Contact;
import stpaul.lutheran.entity.Student;
import stpaul.lutheran.test.util.Database;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The type Contact dao test.
 */
public class ContactDaoTest {
    /**
     * The Dao.
     */
    GenericDao dao;

    /**
     * Creating the dao.
     */
    @BeforeEach
    void setUp() {
        dao = new GenericDao(Contact.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Gets all success.
     */
    @Test
    void getAllSuccess() {
        List<Contact> contacts = dao.getAll();
        assertEquals(14, contacts.size());
    }

    /**
     * Verifies gets contact by last name successfully.
     */
    @Test
    void getByLastNameSuccess() {
        List<Contact> contact = dao.getByLastName("B");
        assertEquals(3, contact.size());
    }

    /**
     * Verifies a contact is returned correctly based on id search
     */
    @Test
    void getByIdSuccess() {
        Contact retrievedContact = (Contact) dao.getById(3);
        assertNotNull(retrievedContact);
        assertEquals("Robert", retrievedContact.getFirstName());
    }


    /**
     * Insert success.
     */
    @Test
    void insertSuccess() {

        Contact contact = new Contact("Charlie", "Bentley", "dad", "9202458989", "9209883454", "y", "matc, madison", "9-5", "", "Lake Mills", "WI", "53551", "cb@gmail.com", "1989-12-27"/*, students*/);
        int id = dao.insert(contact);
        assertNotEquals(0,id);
        Contact insertedContact = (Contact) dao.getById(id);
        assertEquals(contact, insertedContact);
    }

    /**
     * Delete success.
     */
   /* @Test
    void deleteSuccess() {
        dao.delete(dao.getById(3));
        assertNull(dao.getById(3));
    }
*/

    /**
     * Update success.
     */
    @Test
    void updateSuccess() {
        String newLastName = "Stern";
        Contact contactToUpdate = (Contact) dao.getById(3);
        contactToUpdate.setLastName(newLastName);
        dao.saveOrUpdate(contactToUpdate);
        Contact retrievedContact = (Contact) dao.getById(3);
        assertEquals(newLastName, retrievedContact.getLastName());
    }


    /**
     * Gets by property equal success.
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Contact> contact = dao.getByPropertyEqual("lastName", "Brock");
        assertEquals(1, contact.size());
        assertEquals(2, contact.get(0).getContactID());
    }

    /**
     * Gets by property like success.
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Contact> contact = dao.getByPropertyLike("lastName", "G");
        assertEquals(3, contact.size());
    }
}
