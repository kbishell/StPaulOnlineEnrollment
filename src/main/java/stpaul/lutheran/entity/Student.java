package stpaul.lutheran.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Student.
 */
@Entity(name = "Student")
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int studentID;

    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "churchAffiliation")
    private String churchAffiliation;
    @Column(name = "dob")
    private String dob;
    @Column(name = "primaryAddress")
    private String primaryAddress;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zip")
    private String zip;
    @Column(name = "email")
    private String email;
    @Column(name = "baptized")
    private String baptized;
    @Column(name = "gender")
    private String gender;

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
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets church affiliation.
     *
     * @return the church affiliation
     */
    public String getChurchAffiliation() {
        return churchAffiliation;
    }

    /**
     * Sets church affiliation.
     *
     * @param churchAffiliation the church affiliation
     */
    public void setChurchAffiliation(String churchAffiliation) {
        this.churchAffiliation = churchAffiliation;
    }

    /**
     * Gets dob.
     *
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * Sets dob.
     *
     * @param dob the dob
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * Gets primary address.
     *
     * @return the primary address
     */
    public String getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets primary address.
     *
     * @param primaryAddress the primary address
     */
    public void setPrimaryAddress(String primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets zip.
     *
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets zip.
     *
     * @param zip the zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets baptized.
     *
     * @return the baptized
     */
    public String getBaptized() {
        return baptized;
    }

    /**
     * Sets baptized.
     *
     * @param baptized the baptized
     */
    public void setBaptized(String baptized) {
        this.baptized = baptized;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", churchAffiliation='" + churchAffiliation + '\'' +
                ", dob='" + dob + '\'' +
                ", primaryAddress='" + primaryAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", email='" + email + '\'' +
                ", baptized='" + baptized + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
