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
    private String timestamp;
    @Column(name = "studentID")
    private String studentID;
    @Column(name = "studentTypeID")
    private String studentTypeID;

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
    public Registration(String timestamp, String studentID, String studentTypeID) {
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

    /**
     * Gets student id.
     *
     * @return the student id
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "studentID")
    public String getStudentID() {
        return studentID;
    }

    /**
     * Sets student id.
     *
     * @param studentID the student id
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * Gets student type id.
     *
     * @return the student type id
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "studentTypeID")
    public String getStudentTypeID() {
        return studentTypeID;
    }

    /**
     * Sets student type id.
     *
     * @param studentTypeID the student type id
     */
    public void setStudentTypeID(String studentTypeID) {
        this.studentTypeID = studentTypeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Registration that = (Registration) o;

        if (registrationID != that.registrationID) return false;
        if (timestamp != null ? !timestamp.equals(that.timestamp) : that.timestamp != null) return false;
        if (studentID != null ? !studentID.equals(that.studentID) : that.studentID != null) return false;
        return studentTypeID != null ? studentTypeID.equals(that.studentTypeID) : that.studentTypeID == null;
    }

    @Override
    public int hashCode() {
        int result = registrationID;
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (studentID != null ? studentID.hashCode() : 0);
        result = 31 * result + (studentTypeID != null ? studentTypeID.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "registrationID=" + registrationID +
                ", timestamp='" + timestamp + '\'' +
                ", studentID='" + studentID + '\'' +
                ", studentTypeID='" + studentTypeID + '\'' +
                '}';
    }
}
