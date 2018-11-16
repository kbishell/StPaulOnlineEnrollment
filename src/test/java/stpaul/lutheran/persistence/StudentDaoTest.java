package stpaul.lutheran.persistence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stpaul.lutheran.entity.Contact;
import stpaul.lutheran.entity.Student;
import stpaul.lutheran.entity.Student;
import stpaul.lutheran.entity.Student;
import stpaul.lutheran.test.util.Database;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentDaoTest {
    /**
     * The Dao.
     */
    GenericDao dao;
    GenericDao daoContact;


    /**
     * Creating the dao.
     */
    @BeforeEach
    void setUp() {
        dao = new GenericDao(Student.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Gets all student success.
     */
/*
     * Verifies gets all students successfully.
     */
    @Test
    void getAllSuccess() {
        List<Student> students = dao.getAll();
        assertEquals(5, students.size());
    }

    /**
     * Verifies gets student by last name successfully.
     */
    @Test
    void getByLastNameSuccess() {
        List<Student> student = dao.getByLastName("B");
        assertEquals(3, student.size());
    }

    /**
     * Verifies a student is returned correctly based on id search
     */
    @Test
    void getByIdSuccess() {
        Student retrievedUser = (Student) dao.getById(3);
        assertNotNull(retrievedUser);
        assertEquals("Cody", retrievedUser.getFirstName());
    }


    /**
     * Insert success.
     */
    @Test
    void insertSuccess() {

        Student student = new Student("Kim", "Brandt", "St Johns", "2012-03-02", "N76845 Cty Hwy Q", "Johnson Creek", "WI", "53549", "kb@gmail.com", "y", "f");
        int id = dao.insert(student);
        assertNotEquals(0,id);
        Student insertedUser = (Student) dao.getById(id);
        assertEquals("Kim", insertedUser.getFirstName());
    }

    /**
     * Delete success.
     */
  /*  @Test
    void deleteSuccess() {
        daoContact = new GenericDao(Contact.class);
        daoContact.delete(daoContact.getById(2));
        dao.delete(dao.getById(2));
        assertNull(dao.getById(2));
    }*/


    /**
     * Update success.
     */
    @Test
    void updateSuccess() {
        String newLastName = "Brown";
        Student studentToUpdate = (Student) dao.getById(3);
        studentToUpdate.setLastName(newLastName);
        dao.saveOrUpdate(studentToUpdate);
        Student retrievedStudent = (Student) dao.getById(3);
        assertEquals(newLastName, retrievedStudent.getLastName());
    }


    /**
     * Gets by property equal success.
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Student> student = dao.getByPropertyEqual("lastName", "Stern");
        assertEquals(1, student.size());
        assertEquals(3, student.get(0).getStudentID());
    }

    /**
     * Gets by property like success.
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Student> student = dao.getByPropertyLike("lastName", "G");
        assertEquals(0, student.size());
    }
}
