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
     * @param timestamp     the timestamp
     * @param student    the student id
     * @param studentType the student type id
     */
    public Registration(int timestamp, Student student, StudentType studentType) {
        this.timestamp = timestamp;
        this.student = student;
        this.studentType = studentType;
    }

    public int getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(int registrationID) {
        this.registrationID = registrationID;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }
}
