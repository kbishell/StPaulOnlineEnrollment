package stpaul.lutheran.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * A class to represent a user.
 *
 * @author kbishell
 */
@Entity(name = "Users")
@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int userID;

    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "contactID")
    private Contact contactID;
    @Column(name = "staffID")
    private Staff staffID;

    @OneToMany(mappedBy = "Role", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Role> roles = new HashSet<>();

    /**
     * Instantiates a new Users.
     */
    public Users() {
    }

    /**
     * Instantiates a new Users.
     *
     * @param userName  the user name
     * @param password  the password
     * @param contactID the contact id
     * @param staffID   the staff id
     * @param roles     the roles
     */
    public Users(String userName, String password, Contact contactID, Staff staffID, Set<Role> roles) {
        this.userName = userName;
        this.password = password;
        this.contactID = contactID;
        this.staffID = staffID;
        this.roles = roles;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Sets user id.
     *
     * @param userID the user id
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets contact id.
     *
     * @return the contact id
     */
    public Contact getContactID() {
        return contactID;
    }

    /**
     * Sets contact id.
     *
     * @param contactID the contact id
     */
    public void setContactID(Contact contactID) {
        this.contactID = contactID;
    }

    /**
     * Gets staff id.
     *
     * @return the staff id
     */
    public Staff getStaffID() {
        return staffID;
    }

    /**
     * Sets staff id.
     *
     * @param staffID the staff id
     */
    public void setStaffID(Staff staffID) {
        this.staffID = staffID;
    }

    /**
     * Gets roles.
     *
     * @return the roles
     */
    public Set<Role> getRoles() {
        return roles;
    }

    /**
     * Sets roles.
     *
     * @param roles the roles
     */
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (userID != users.userID) return false;
        if (userName != null ? !userName.equals(users.userName) : users.userName != null) return false;
        if (password != null ? !password.equals(users.password) : users.password != null) return false;
        if (contactID != null ? !contactID.equals(users.contactID) : users.contactID != null) return false;
        if (staffID != null ? !staffID.equals(users.staffID) : users.staffID != null) return false;
        return roles != null ? roles.equals(users.roles) : users.roles == null;
    }

    @Override
    public int hashCode() {
        int result = userID;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (contactID != null ? contactID.hashCode() : 0);
        result = 31 * result + (staffID != null ? staffID.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", contactID=" + contactID +
                ", staffID=" + staffID +
                ", roles=" + roles +
                '}';
    }
}

