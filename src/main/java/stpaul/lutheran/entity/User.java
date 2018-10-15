package stpaul.lutheran.entity;

        import org.hibernate.annotations.GenericGenerator;

        import javax.persistence.*;
        import java.io.Serializable;
        import java.time.LocalDate;
        import java.time.temporal.ChronoUnit;
        import java.util.HashSet;
        import java.util.Set;

/**
 * A class to represent a user.
 *
 * @author pwaite
 */
@Entity(name = "User")
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int userID;

    @Column(name = "user_name")
    private String userName;


    /**
     * Instantiates a new User.
     */
    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }








}
