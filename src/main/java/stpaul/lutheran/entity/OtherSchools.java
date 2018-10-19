package stpaul.lutheran.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Other schools.
 */
@Entity(name = "OtherSchools")
@Table(name = "OtherSchools")
public class OtherSchools {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int otherSchoolsID;

    @Column(name = "schoolName")
    private String schoolName;
    @Column(name = "duration")
    private String duration;
    @Column(name = "gradeLevel")
    private String gradeLevel;

    /**
     * The Students schools.
     */
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "OtherSchools_Student",
            joinColumns = { @JoinColumn(name = "otherSchoolsID") },
            inverseJoinColumns = { @JoinColumn(name = "studentID") }
    )

    Set<Student> studentsSchools = new HashSet<>();

    /**
     * Instantiates a new Other schools.
     */
    public OtherSchools() {
    }

    /**
     * Instantiates a new Other schools.
     *
     * @param schoolName      the school name
     * @param duration        the duration
     * @param gradeLevel      the grade level
     * @param studentsSchools the students schools
     */
    public OtherSchools(String schoolName, String duration, String gradeLevel, Set<Student> studentsSchools) {
        this.schoolName = schoolName;
        this.duration = duration;
        this.gradeLevel = gradeLevel;
        this.studentsSchools = studentsSchools;
    }

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
     * Gets school name.
     *
     * @return the school name
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Sets school name.
     *
     * @param schoolName the school name
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * Gets grade level.
     *
     * @return the grade level
     */
    public String getGradeLevel() {
        return gradeLevel;
    }

    /**
     * Sets grade level.
     *
     * @param gradeLevel the grade level
     */
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    /**
     * Gets students schools.
     *
     * @return the students schools
     */
    public Set<Student> getStudentsSchools() {
        return studentsSchools;
    }

    /**
     * Sets students schools.
     *
     * @param studentsSchools the students schools
     */
    public void setStudentsSchools(Set<Student> studentsSchools) {
        this.studentsSchools = studentsSchools;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OtherSchools that = (OtherSchools) o;

        if (otherSchoolsID != that.otherSchoolsID) return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        if (gradeLevel != null ? !gradeLevel.equals(that.gradeLevel) : that.gradeLevel != null) return false;
        return studentsSchools != null ? studentsSchools.equals(that.studentsSchools) : that.studentsSchools == null;
    }

    @Override
    public int hashCode() {
        int result = otherSchoolsID;
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (gradeLevel != null ? gradeLevel.hashCode() : 0);
        result = 31 * result + (studentsSchools != null ? studentsSchools.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OtherSchools{" +
                "otherSchoolsID=" + otherSchoolsID +
                ", schoolName='" + schoolName + '\'' +
                ", duration='" + duration + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                ", studentsSchools=" + studentsSchools +
                '}';
    }
}
