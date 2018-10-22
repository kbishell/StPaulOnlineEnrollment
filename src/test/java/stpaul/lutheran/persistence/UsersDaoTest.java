package stpaul.lutheran.persistence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stpaul.lutheran.entity.Role;
import stpaul.lutheran.entity.Users;
import stpaul.lutheran.test.util.Database;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UsersDaoTest {

    UsersDao dao;

    /**
     * Creating the dao.
     */
    @BeforeEach
    void setUp() {
        dao = new UsersDao();

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

    }

    /**
     * Verifies gets all userss successfully.
     */
    @Test
    void getAllUsersSuccess() {
        List<Users> users = dao.getAllUsers();
        assertEquals(6, users.size());
    }

    /**
     * Verifies gets userss by last name successfully.
     */
    @Test
    void getUsersByLastNameSuccess() {
        List<Users> users = dao.getUserssByLastName("B");
        assertEquals(2, users.size());
    }

    /**
     * Verifies a users is returned correctly based on id search
     */
    @Test
    void getByIdSuccess() {
        Users retrievedUser = dao.getById(3);
        assertNotNull(retrievedUser);
        assertEquals("Pat", retrievedUser.getFirstName());
    }

    /**
     * Verify successful insert of a users
     */
    @Test
    void insertSuccess() {

        Users newUser = new Users("kbishell", "password", "Kortney", "Bishell", "bish@you.com");
        int id = dao.insert(newUser);
        assertNotEquals(0,id);
        Users insertedUser = dao.getById(id);
        assertEquals("Kortney", insertedUser.getFirstName());
    }

    /**
     * Verify successful delete of users
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(3));
        assertNull(dao.getById(3));
    }

    /**
     * Verify successful update of users
     */
    @Test
    void updateSuccess() {
        String newLastName = "Davis";
        Users usersToUpdate = dao.getById(3);
        usersToUpdate.setLastName(newLastName);
        dao.saveOrUpdate(usersToUpdate);
        Users retrievedUsers = dao.getById(3);
        assertEquals(newLastName, retrievedUsers.getLastName());
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Users> users = dao.getByPropertyEqual("lastName", "Glock");
        assertEquals(1, users.size());
        assertEquals(2, users.get(0).getUserID());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Users> users = dao.getByPropertyLike("lastName", "W");
        assertEquals(2, users.size());
    }
}


