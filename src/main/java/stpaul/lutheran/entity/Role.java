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
    private int roleID;

    @Column(name = "roleType")
    private String roleType;

    @Column(name = "userName")
    private String userName;

    @ManyToOne
    @JoinColumn(name = "userID")
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
     * Gets role id.
     *
     * @return the role id
     */
    public int getRoleID() {
        return roleID;
    }

    /**
     * Sets role id.
     *
     * @param roleID the role id
     */
    public void setRoleID(int roleID) {
        this.roleID = roleID;
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
     * Gets user id.
     *
     * @return the user id
     */
    public Users getUser() {
        return user;
    }

    /**
     * Sets user id.
     *
     * @param user the user id
     */
    public void setUser(Users user) {
        this.user = user;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (roleID != role.roleID) return false;
        if (roleType != null ? !roleType.equals(role.roleType) : role.roleType != null) return false;
        if (userName != null ? !userName.equals(role.userName) : role.userName != null) return false;
        return user != null ? user.equals(role.user) : role.user == null;
    }

    @Override
    public int hashCode() {
        int result = roleID;
        result = 31 * result + (roleType != null ? roleType.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleID=" + roleID +
                ", roleType='" + roleType + '\'' +
                ", userName='" + userName + '\'' +
                ", user=" + user +
                '}';
    }
}
