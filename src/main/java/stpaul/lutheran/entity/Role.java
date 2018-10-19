package stpaul.lutheran.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Role.
 */
@Entity(name = "Role")
@Table(name = "Role")
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int userID;

    @Column(name = "roleType")
    private String roleType;

    @ManyToOne
    private Users user;

    /**
     * Instantiates a new Role.
     */
    public Role() {
    }

    /**
     * Instantiates a new Role.
     *
     * @param roleType the role type
     * @param user     the user
     */
    public Role(String roleType, Users user) {
        this.roleType = roleType;
        this.user = user;
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
     * Gets role type.
     *
     * @return the role type
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * Sets role type.
     *
     * @param roleType the role type
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public Users getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(Users user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (userID != role.userID) return false;
        if (roleType != null ? !roleType.equals(role.roleType) : role.roleType != null) return false;
        return user != null ? user.equals(role.user) : role.user == null;
    }

    @Override
    public int hashCode() {
        int result = userID;
        result = 31 * result + (roleType != null ? roleType.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Role{" +
                "userID=" + userID +
                ", roleType='" + roleType + '\'' +
                ", user=" + user +
                '}';
    }
}
