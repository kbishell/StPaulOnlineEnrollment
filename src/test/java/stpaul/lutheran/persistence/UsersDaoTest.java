package stpaul.lutheran.persistence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stpaul.lutheran.entity.Role;
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

    /**
     * Creating the dao.
     */
    @BeforeEach
    void setUp() {
        dao = new GenericDao(Users.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

    }

    /**
     * Gets all users success.
     */
/*
     * Verifies gets all userss successfully.
     */
    @Test
    void getAllSuccess() {
        List<Users> users = dao.getAll();
        assertEquals(4, users.size());
    }

    /**
     * Verifies gets users by last name successfully.
     */
    @Test
    void getByLastNameSuccess() {
        List<Users> users = dao.getByLastName("B");
        assertEquals(1, users.size());
    }

    /**
     * Verifies a users is returned correctly based on id search
     */
    @Test
    void getByIdSuccess() {
        Users retrievedUser = (Users) dao.getById(3);
        assertNotNull(retrievedUser);
        assertEquals("Tim", retrievedUser.getFirstName());
    }


    /**
     * Insert success.
     */
    @Test
    void insertSuccess() {

        Users newUser = new Users("kbishell", "password", "Kortney", "Bishell", "bish@you.com" );
        int id = dao.insert(newUser);
        assertNotEquals(0,id);
        Users insertedUser = (Users) dao.getById(id);
        assertEquals("Kortney", insertedUser.getFirstName());
    }

    /**
     * Delete success.
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(3));
        assertNull(dao.getById(3));
    }


    /**
     * Update success.
     */
    @Test
    void updateSuccess() {
        String newLastName = "Davis";
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
        List<Users> users = dao.getByPropertyEqual("lastName", "Tennley");
        assertEquals(1, users.size());
        assertEquals(1, users.get(0).getUserID());
    }

    /**
     * Gets by property like success.
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Users> users = dao.getByPropertyLike("lastName", "W");
        assertEquals(0, users.size());
    }
}


