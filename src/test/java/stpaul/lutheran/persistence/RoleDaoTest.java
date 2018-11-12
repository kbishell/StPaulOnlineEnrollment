package stpaul.lutheran.persistence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import stpaul.lutheran.entity.Role;
import stpaul.lutheran.test.util.Database;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class RoleDaoTest {



    /**
     * The Dao.
     */
    GenericDao dao;

    /**
     * Creating the dao.
     */
    @BeforeEach
    void setUp() {
        dao = new GenericDao(Role.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

    }

    /**
     * Gets all role success.
     */
/*
     * Verifies gets all roles successfully.
     */
   /*@Test
    void getAllSuccess() {
        List<Role> role = dao.getAll();
        assertEquals(4, role.size());
    }*/

    /**
     * Verifies a role is returned correctly based on id search
     */
    @Test
    void getByIdSuccess() {
        Role retrievedRole = (Role) dao.getById(3);
        assertNotNull(retrievedRole);
        assertEquals("hunter", retrievedRole.getUserName());
    }


    /**
     * Insert success.
     */
    /*@Test
    void insertSuccess(Role role) {

        Role newRole = new Role("administrator", role.getUser());
        int id = dao.insert(newRole);
        assertNotEquals(0,id);
        Role insertedUser = (Role) dao.getById(id);
        assertEquals("kbishell", insertedUser.getUserName());
    }*/

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
        String newRoleType = "administrator";
        Role roleToUpdate = (Role) dao.getById(3);
        roleToUpdate.setRoleType(newRoleType);
        dao.saveOrUpdate(roleToUpdate);
        Role retrievedRole = (Role) dao.getById(3);
        assertEquals(newRoleType, retrievedRole.getRoleType());
    }


    /**
     * Gets by property equal success.
     */
    /*@Test
    void getByPropertyEqualSuccess() {
        List<Role> role = dao.getByPropertyEqual("lastName", "Tennley");
        assertEquals(1, role.size());
        assertEquals(1, role.get(0).getRoleID());
    }*/

    /**
     * Gets by property like success.
     */
    /*@Test
    void getByPropertyLikeSuccess() {
        List<Role> role = dao.getByPropertyLike("lastName", "W");
        assertEquals(0, role.size());
    }*/
}




