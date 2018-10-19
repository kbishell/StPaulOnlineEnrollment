package stpaul.lutheran.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

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

    @Override
    public String toString() {
        return "StudentType{" +
                "studentTypeID=" + studentTypeID +
                ", grade='" + grade + '\'' +
                ", yearlyFee='" + yearlyFee + '\'' +
                '}';
    }
}

