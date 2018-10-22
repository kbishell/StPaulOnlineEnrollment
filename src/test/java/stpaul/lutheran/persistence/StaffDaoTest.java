package stpaul.lutheran.persistence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stpaul.lutheran.entity.Staff;
import stpaul.lutheran.entity.Users;
import stpaul.lutheran.test.util.Database;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StaffDaoTest {

       StaffDao dao;

        /**
         * Creating the dao.
         */
        @BeforeEach
        void setUp() {
            dao = new StaffDao();

            Database database = Database.getInstance();
            database.runSQL("cleandb.sql");

        }

        /**
         * Verifies gets all staffs successfully.
         */
        @Test
        void getAllStaffSuccess() {
            List<Staff> staff = dao.getAllStaff();
            assertEquals(6, staff.size());
        }

        /**
         * Verifies gets staffs by last name successfully.
         */
        @Test
        void getStaffByLastNameSuccess() {
            List<Staff> staffs = dao.getStaffsByLastName("B");
            assertEquals(2, staffs.size());
        }

        /**
         * Verifies a staff is returned correctly based on id search
         */
        @Test
        void getByIdSuccess() {
            Staff retrievedStaff = dao.getById(3);
            assertNotNull(retrievedStaff);
            assertEquals("Pat", retrievedStaff.getFirstName());
        }

       /**
         * Verify successful insert of a staff
         *//
        @Test
        void insertSuccess() {

            Staff newStaff = new Staff("Kortney", "Bishell",);
            int id = dao.insert(newStaff);
            assertNotEquals(0,id);
            Staff insertedStaff = dao.getById(id);
            assertEquals("Kortney", insertedStaff.getFirstName());
        }

        /**
         * Verify successful delete of staff
         */
        @Test
        void deleteSuccess() {
            dao.delete(dao.getById(3));
            assertNull(dao.getById(3));
        }

        /**
         * Verify successful update of staff
         */
        @Test
        void updateSuccess() {
            String newLastName = "Davis";
            Staff staffToUpdate = dao.getById(3);
            staffToUpdate.setLastName(newLastName);
            dao.saveOrUpdate(staffToUpdate);
            Staff retrievedStaff = dao.getById(3);
            assertEquals(newLastName, retrievedStaff.getLastName());
        }

        /**
         * Verify successful get by property (equal match)
         */
        @Test
        void getByPropertyEqualSuccess() {
            List<Staff> staff = dao.getByPropertyEqual("lastName", "Glock");
            assertEquals(1, staff.size());
            assertEquals(2, staff.get(0).getStaffID());
        }

        /**
         * Verify successful get by property (like match)
         */
        @Test
        void getByPropertyLikeSuccess() {
            List<Staff> staffs = dao.getByPropertyLike("lastName", "W");
            assertEquals(2, staffs.size());
        }
}

