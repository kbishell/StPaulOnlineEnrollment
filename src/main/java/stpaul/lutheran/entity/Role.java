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

    @Override
    public String toString() {
        return "Role{" +
                "userID=" + userID +
                ", roleType='" + roleType + '\'' +
                '}';
    }
}
