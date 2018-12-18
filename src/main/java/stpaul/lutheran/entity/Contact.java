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


    /**
     * The Students.
     */
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "Student_Contact",
            joinColumns = { @JoinColumn(name = "contactID") },
            inverseJoinColumns = { @JoinColumn(name = "studentID") }
    )
    Set<Student> students = new HashSet<>(0);

    /**
     * Instantiates a new Contact.
     */
    public Contact() {

        //contactID = 0;
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
     */
    public Contact(String firstName, String lastName, String relationshipToStudent, String cellPhone, String workPhone, String baptized, String employer, String hoursWorked, String address, String city, String state, String zip, String email, String dob) {
        //this();
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

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (contactID != contact.contactID) return false;
        if (firstName != null ? !firstName.equals(contact.firstName) : contact.firstName != null) return false;
        if (lastName != null ? !lastName.equals(contact.lastName) : contact.lastName != null) return false;
        if (relationshipToStudent != null ? !relationshipToStudent.equals(contact.relationshipToStudent) : contact.relationshipToStudent != null)
            return false;
        if (cellPhone != null ? !cellPhone.equals(contact.cellPhone) : contact.cellPhone != null) return false;
        if (workPhone != null ? !workPhone.equals(contact.workPhone) : contact.workPhone != null) return false;
        if (baptized != null ? !baptized.equals(contact.baptized) : contact.baptized != null) return false;
        if (employer != null ? !employer.equals(contact.employer) : contact.employer != null) return false;
        if (hoursWorked != null ? !hoursWorked.equals(contact.hoursWorked) : contact.hoursWorked != null) return false;
        if (address != null ? !address.equals(contact.address) : contact.address != null) return false;
        if (city != null ? !city.equals(contact.city) : contact.city != null) return false;
        if (state != null ? !state.equals(contact.state) : contact.state != null) return false;
        if (zip != null ? !zip.equals(contact.zip) : contact.zip != null) return false;
        if (email != null ? !email.equals(contact.email) : contact.email != null) return false;
        if (dob != null ? !dob.equals(contact.dob) : contact.dob != null) return false;
        return students != null ? students.equals(contact.students) : contact.students == null;
    }

    @Override
    public int hashCode() {
        int result = contactID;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (relationshipToStudent != null ? relationshipToStudent.hashCode() : 0);
        result = 31 * result + (cellPhone != null ? cellPhone.hashCode() : 0);
        result = 31 * result + (workPhone != null ? workPhone.hashCode() : 0);
        result = 31 * result + (baptized != null ? baptized.hashCode() : 0);
        result = 31 * result + (employer != null ? employer.hashCode() : 0);
        result = 31 * result + (hoursWorked != null ? hoursWorked.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zip != null ? zip.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (students != null ? students.hashCode() : 0);
        return result;
    }*/

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
