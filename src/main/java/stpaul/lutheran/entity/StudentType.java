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

    @ManyToMany(mappedBy = "types")
    private Set<Student> students = new HashSet<>();

    /**
     * Instantiates a new Student type.
     */
    public StudentType() {
    }

    /**
     * Instantiates a new Student type.
     *
     * @param grade     the grade
     * @param yearlyFee the yearly fee
     * @param students  the students
     */
    public StudentType(String grade, String yearlyFee, Set<Student> students) {
        this.grade = grade;
        this.yearlyFee = yearlyFee;
        this.students = students;
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

    /**
     * Gets students.
     *
     * @return the students
     */
    public Set<Student> getStudents() {
        return students;
    }

    /**
     * Sets students.
     *
     * @param students the students
     */
    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentType{" +
                "studentTypeID=" + studentTypeID +
                ", grade='" + grade + '\'' +
                ", yearlyFee='" + yearlyFee + '\'' +
                ", students=" + students +
                '}';
    }
}

