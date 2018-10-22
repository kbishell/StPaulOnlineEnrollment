package stpaul.lutheran.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

/**
 * A class to represent staff.
 *
 * @author kbishell
 */
@Entity(name = "Staff")
@Table(name = "Staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int staffID;

    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "userID")
    private Users userID;

    /**
     * Instantiates a new Staff.
     */
    public Staff() {
    }

    /**
     * Instantiates a new Staff.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param userID   the user id
     */
    public Staff(String firstName, String lastName, Users userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
    }

    /**
     * Gets staff id.
     *
     * @return the staff id
     */
    public int getStaffID() {
        return staffID;
    }

    /**
     * Sets staff id.
     *
     * @param staffID the staff id
     */
    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Users getUserID() {
        return userID;
    }

    public void setUserID(Users userID) {
        this.userID = userID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Staff staff = (Staff) o;

        if (staffID != staff.staffID) return false;
        if (firstName != null ? !firstName.equals(staff.firstName) : staff.firstName != null) return false;
        if (lastName != null ? !lastName.equals(staff.lastName) : staff.lastName != null) return false;
        return userID != null ? userID.equals(staff.userID) : staff.userID == null;
    }

    @Override
    public int hashCode() {
        int result = staffID;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (userID != null ? userID.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffID=" + staffID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userID=" + userID +
                '}';
    }
}