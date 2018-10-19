package stpaul.lutheran.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Other schools student.
 */
@Entity(name = "OtherSchools_Student")
@Table(name = "OtherSchools_Student")
public class OtherSchools_Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int otherSchoolsID;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int studentID;

    /**
     * Gets other schools id.
     *
     * @return the other schools id
     */
    public int getOtherSchoolsID() {
        return otherSchoolsID;
    }

    /**
     * Sets other schools id.
     *
     * @param otherSchoolsID the other schools id
     */
    public void setOtherSchoolsID(int otherSchoolsID) {
        this.otherSchoolsID = otherSchoolsID;
    }

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

    @Override
    public String toString() {
        return "OtherSchools_Student{" +
                "otherSchoolsID=" + otherSchoolsID +
                ", studentID=" + studentID +
                '}';
    }
}

