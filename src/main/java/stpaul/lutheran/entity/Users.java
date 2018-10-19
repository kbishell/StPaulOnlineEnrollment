package stpaul.lutheran.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

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



}

