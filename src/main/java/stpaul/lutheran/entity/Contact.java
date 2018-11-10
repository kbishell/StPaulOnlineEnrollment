package stpaul.lutheran.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Contact.
 */
@Entity(name = "Contact")
@Table(name = "Contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int contactID;

    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "relationshipToStudent")
    private String relationshipToStudent;
    @Column(name = "cellPhone")
    private String cellPhone;
    @Column(name = "workPhone")
    private String workPhone;
    @Column(name = "baptized")
    private String baptized;
    @Column(name = "employer")
    private String employer;
    @Column(name = "hoursWorked")
    private String hoursWorked;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zip")
    private String zip;
    @Column(name = "email")
    private String email;
    @Column(name = "dob")
    private String dob;
    /*@Column(name = "usersID")
    private Users usersID;*/


    /**
     * The Students.
     */
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Student_Contact",
            joinColumns = { @JoinColumn(name = "contactID") },
            inverseJoinColumns = { @JoinColumn(name = "studentID") }
    )
    Set<Student> students = new HashSet<>();

    /**
     * Instantiates a new Contact.
     */
    public Contact() {
    }

    /**
     * Instantiates a new Contact.
     *
     * @param firstName             the first name
     * @param lastName              the last name
     * @param relationshipToStudent the relationship to student
     * @param cellPhone             the cell phone
     * @param workPhone             the work phone
     * @param baptized              the baptized
     * @param employer              the employer
     * @param hoursWorked           the hours worked
     * @param address               the address
     * @param city                  the city
     * @param state                 the state
     * @param zip                   the zip
     * @param email                 the email
     * @param dob                   the dob
     * @param students              the students
     **/
    public Contact(String firstName, String lastName, String relationshipToStudent, String cellPhone, String workPhone, String baptized, String employer, String hoursWorked, String address, String city, String state, String zip, String email, String dob/*, Users usersID */, Set<Student> students) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.relationshipToStudent = relationshipToStudent;
        this.cellPhone = cellPhone;
        this.workPhone = workPhone;
        this.baptized = baptized;
        this.employer = employer;
        this.hoursWorked = hoursWorked;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.dob = dob;
        /*this.usersID = usersID;*/
        this.students = students;
    }

    /**
     * Gets contact id.
     *
     * @return the contact id
     */
    public int getContactID() {
        return contactID;
    }

    /**
     * Sets contact id.
     *
     * @param contactID the contact id
     */
    public void setContactID(int contactID) {
        this.contactID = contactID;
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
     * Gets relationship to student.
     *
     * @return the relationship to student
     */
    public String getRelationshipToStudent() {
        return relationshipToStudent;
    }

    /**
     * Sets relationship to student.
     *
     * @param relationshipToStudent the relationship to student
     */
    public void setRelationshipToStudent(String relationshipToStudent) {
        this.relationshipToStudent = relationshipToStudent;
    }

    /**
     * Gets cell phone.
     *
     * @return the cell phone
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * Sets cell phone.
     *
     * @param cellPhone the cell phone
     */
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * Gets work phone.
     *
     * @return the work phone
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets work phone.
     *
     * @param workPhone the work phone
     */
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
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
     * Gets employer.
     *
     * @return the employer
     */
    public String getEmployer() {
        return employer;
    }

    /**
     * Sets employer.
     *
     * @param employer the employer
     */
    public void setEmployer(String employer) {
        this.employer = employer;
    }

    /**
     * Gets hours worked.
     *
     * @return the hours worked
     */
    public String getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Sets hours worked.
     *
     * @param hoursWorked the hours worked
     */
    public void setHoursWorked(String hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
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
     * Gets users id.
     *
     * @return the users id
     */
    /*public Users getUsersID() {
        return usersID;
    }*/

    /**
     * Sets users id.
     *
     * @param usersID the users id
     */
    /*public void setUsersID(Users usersID) {
        this.usersID = usersID;
    }*/

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
     @param students the students*/
    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactID=" + contactID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", relationshipToStudent='" + relationshipToStudent + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", workPhone='" + workPhone + '\'' +
                ", baptized='" + baptized + '\'' +
                ", employer='" + employer + '\'' +
                ", hoursWorked='" + hoursWorked + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
