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

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "studentID")
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "studentTypeID")
    private StudentType studentType;

    /**
     * Instantiates a new Registration.
     */
    public Registration() {
    }

    /**
     * Instantiates a new Registration.
     *
     * @param timestamp   the timestamp
     * @param student     the student id
     * @param studentType the student type id
     */
    public Registration(int timestamp, Student student, StudentType studentType) {
        this.timestamp = timestamp;
        this.student = student;
        this.studentType = studentType;
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
     * Gets student.
     *
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * Sets student.
     *
     * @param student the student
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * Gets student type.
     *
     * @return the student type
     */
    public StudentType getStudentType() {
        return studentType;
    }

    /**
     * Sets student type.
     *
     * @param studentType the student type
     */
    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Registration that = (Registration) o;

        if (registrationID != that.registrationID) return false;
        if (timestamp != that.timestamp) return false;
        if (student != null ? !student.equals(that.student) : that.student != null) return false;
        return studentType != null ? studentType.equals(that.studentType) : that.studentType == null;
    }

    @Override
    public int hashCode() {
        int result = registrationID;
        result = 31 * result + timestamp;
        result = 31 * result + (student != null ? student.hashCode() : 0);
        result = 31 * result + (studentType != null ? studentType.hashCode() : 0);
        return result;
    }*/

    @Override
    public String toString() {
        return "Registration{" +
                "registrationID=" + registrationID +
                ", timestamp=" + timestamp +
                ", student=" + student +
                ", studentType=" + studentType +
                '}';
    }
}
