package stpaul.lutheran.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

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

    public OtherSchools() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OtherSchools that = (OtherSchools) o;

        if (otherSchoolsID != that.otherSchoolsID) return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        return gradeLevel != null ? gradeLevel.equals(that.gradeLevel) : that.gradeLevel == null;
    }

    @Override
    public int hashCode() {
        int result = otherSchoolsID;
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (gradeLevel != null ? gradeLevel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OtherSchools{" +
                "otherSchoolsID=" + otherSchoolsID +
                ", schoolName='" + schoolName + '\'' +
                ", duration='" + duration + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }
}
