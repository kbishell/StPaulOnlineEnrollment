package stpaul.lutheran.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Student type.
 */
@Entity(name = "StudentType")
@Table(name = "StudentType")
public class StudentType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int studentTypeID;

    @Column(name = "grade")
    private String grade;
    @Column(name = "yearlyFee")
    private String yearlyFee;

    @OneToMany(targetEntity=Registration.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "studentType")
    private Set<Registration> registrations = new HashSet<Registration>();

    /**
     * Instantiates a new Student type.
     */
    public StudentType() {
    }

    /**
     * Instantiates a new Student type.
     *
     * @param grade         the grade
     * @param yearlyFee     the yearly fee
     * @param registrations the registrations
     */
    public StudentType(String grade, String yearlyFee, Set<Registration> registrations) {
        this.grade = grade;
        this.yearlyFee = yearlyFee;
        this.registrations = registrations;
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
     * Gets grade.
     *
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets grade.
     *
     * @param grade the grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * Gets yearly fee.
     *
     * @return the yearly fee
     */
    public String getYearlyFee() {
        return yearlyFee;
    }

    /**
     * Sets yearly fee.
     *
     * @param yearlyFee the yearly fee
     */
    public void setYearlyFee(String yearlyFee) {
        this.yearlyFee = yearlyFee;
    }

    public Set<Registration> getRegistrations() {
        return registrations;
    }


    public void setRegistrations(Set<Registration> registrations) {
        this.registrations = registrations;
    }



    @Override
    public String toString() {
        return "StudentType{" +
                "studentTypeID=" + studentTypeID +
                ", grade='" + grade + '\'' +
                ", yearlyFee='" + yearlyFee + '\'' +
                ", registrations=" + registrations +
                '}';
    }
}

