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
    private int studentID;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int studentTypeID;

    @Column(name = "timestamp")
    private String timestamp;

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
     * Gets student type id.
     *
     * @return the student type id
     */
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

    /**
     * Gets timestamp.
     *
     * @return the timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets timestamp.
     *
     * @param timestamp the timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "studentID=" + studentID +
                ", studentTypeID=" + studentTypeID +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
