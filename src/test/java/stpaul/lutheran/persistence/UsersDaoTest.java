package stpaul.lutheran.persistence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stpaul.lutheran.entity.Contact;
import stpaul.lutheran.entity.Role;
import stpaul.lutheran.entity.Users;
import stpaul.lutheran.entity.Users;
import stpaul.lutheran.test.util.Database;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Users dao test.
 */
public class UsersDaoTest {

        /**
         * The Dao.
         */
        GenericDao dao;
        GenericDao daoContact = new GenericDao(Users.class);


        /**
         * Creating the dao.
         */
        @BeforeEach
        void setUp() {
            dao = new GenericDao(Users.class);

            Database database = Database.getInstance();
            database.runSQL("cleandb.sql");
        }


        /*
         * Verifies gets all userss successfully.
         */
        @Test
        void getAllSuccess() {
            List<Users> users = dao.getAll();
            assertEquals(5, users.size());
        }

        /**
         * Verifies gets users by last name successfully.
         */
        @Test
        void getByLastNameSuccess() {
            List<Users> users = dao.getByLastName("B");
            assertEquals(2, users.size());
        }

        /**
         * Verifies a users is returned correctly based on id search
         */
        @Test
        void getByIdSuccess() {
            Users retrievedUsers = (Users) dao.getById(3);
            assertNotNull(retrievedUsers);
            assertEquals("Stan", retrievedUsers.getFirstName());

            System.out.println(retrievedUsers.getFirstName());
        }


        /**
         * Insert success.
         */
/*        @Test
        void insertSuccess() {
            Contact contact = (Contact) daoContact.getById(14);
            Users user = new Users("Kort", "password", "Kortney", "Bishell", "kort@gmail.org", contact);
            int id = dao.insert(user);
            assertNotEquals(0,id);
            Users insertedUser = (Users) dao.getById(id);
            assertEquals("Kortney", insertedUser.getFirstName());
        }*/

        /**
         * Delete success.
         */
  /*  @Test
    void deleteSuccess() {
        daoContact = new GenericDao(Contact.class);
        daoContact.delete(daoContact.getById(2));
        dao.delete(dao.getById(2));
        assertNull(dao.getById(2));
    }
*/

        /**
         * Update success.
         */
        @Test
        void updateSuccess() {
            String newLastName = "Brown";
            Users usersToUpdate = (Users) dao.getById(3);
            usersToUpdate.setLastName(newLastName);
            dao.saveOrUpdate(usersToUpdate);
            Users retrievedUsers = (Users) dao.getById(3);
            assertEquals(newLastName, retrievedUsers.getLastName());
        }


        /**
         * Gets by property equal success.
         */
        @Test
        void getByPropertyEqualSuccess() {
            List<Users> users = dao.getByPropertyEqual("lastName", "Brock");
            assertEquals(1, users.size());
            assertEquals(2, users.get(0).getUserID());
        }

        /**
         * Gets by property like success.
         */
        @Test
        void getByPropertyLikeSuccess() {
            List<Users> users = dao.getByPropertyLike("lastName", "H");
            assertEquals(1, users.size());
        }
    }





