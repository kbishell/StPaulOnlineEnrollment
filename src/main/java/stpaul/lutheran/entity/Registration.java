package stpaul.lutheran.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Registration.
 */
@Entity(name = "Registration")
@Table(name = "Registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int registrationID;

    @Column(name = "timestamp")
    private int timestamp;
    @Column(name = "studentID")
    private int studentID;
    @Column(name = "studentTypeID")
    private int studentTypeID;

    /**
     * Instantiates a new Registration.
     */
    public Registration() {
    }

    /**
     * Instantiates a new Registration.
     *
     * @param timestamp     the timestamp
     * @param studentID     the student id
     * @param studentTypeID the student type id
     */
    public Registration(int timestamp, int studentID, int studentTypeID) {
        this.timestamp = timestamp;
        this.studentID = studentID;
        this.studentTypeID = studentTypeID;
    }

    /**
     * Gets registration id.
     *
     * @return the registration id
     */
    public int getRegistrationID() {
        return registrationID;
    }

    /**
     * Sets registration id.
     *
     * @param registrationID the registration id
     */
    public void setRegistrationID(int registrationID) {
        this.registrationID = registrationID;
    }

    /**
     * Gets timestamp.
     *
     * @return the timestamp
     */
    public int getTimestamp() {
        return timestamp;
    }

    /**
     * Sets timestamp.
     *
     * @param timestamp the timestamp
     */
    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Gets student id.
     *
     * @return the student id
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "studentID")
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
     * Gets student type id.
     *
     * @return the student type id
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "studentTypeID")
    public int getStudentTypeID() {
        return studentTypeID;
    }

    /**
     * Sets student type id.
     *
     * @param studentTypeID the student type id
     */
    public void setStudentTypeID(int studentTypeID) {
        this.studentTypeID = studentTypeID;
    }

}
