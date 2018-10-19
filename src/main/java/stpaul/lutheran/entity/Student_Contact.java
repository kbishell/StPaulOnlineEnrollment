package stpaul.lutheran.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Student contact.
 */
@Entity(name = "Student_Contact")
@Table(name = "Student_Contact")
public class Student_Contact {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int studentID;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int contactID;

    /**
     * Gets student id.
     *
     * @return the student id
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * Sets student id.
     *
     * @param studentID the student id
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     * Gets contact id.
     *
     * @return the contact id
     */
    public int getContactID() {
        return contactID;
    }

    /**
     * Sets contact id.
     *
     * @param contactID the contact id
     */
    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    @Override
    public String toString() {
        return "Student_Contact{" +
                "studentID=" + studentID +
                ", contactID=" + contactID +
                '}';
    }
}
