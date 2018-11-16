drop database enrollment;
create database enrollment;
use enrollment;
-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-10-31 14:17:56.148
-- tables
-- Table: Contact
CREATE TABLE Contact (contactID int NOT NULL AUTO_INCREMENT,firstName varchar(20) NOT NULL,lastName varchar(20) NOT NULL,relationshipToStudent varchar(30) NOT NULL,cellPhone varchar(10) NOT NULL,workPhone varchar(10) NOT NULL,baptized char(1) NOT NULL,employer varchar(30) NOT NULL,hoursWorked varchar(200) NOT NULL,address varchar(200) NOT NULL,city varchar(20) NOT NULL,state char(2) NOT NULL,zip int NOT NULL,dob date NOT NULL, email varchar(20),CONSTRAINT Contact_pk PRIMARY KEY (contactID));
-- Table: OtherSchools
CREATE TABLE OtherSchools (otherSchoolsID int NOT NULL AUTO_INCREMENT,schoolName varchar(50) NOT NULL,duration int NOT NULL,gradeLevel int NOT NULL,CONSTRAINT OtherSchools_pk PRIMARY KEY (otherSchoolsID));
-- Table: OtherSchools_Student
CREATE TABLE OtherSchools_Student (studentID int NOT NULL,otherSchoolsID int NOT NULL,CONSTRAINT OtherSchools_Student_pk PRIMARY KEY (studentID,otherSchoolsID));
-- Table: Registration
CREATE TABLE Registration (registrationID int NOT NULL,studentID int NOT NULL,studentTypeID int NOT NULL,timestamp timestamp NOT NULL,CONSTRAINT Registration_pk PRIMARY KEY (registrationID));
-- Table: Role
CREATE TABLE Role (roleID int NOT NULL AUTO_INCREMENT,userID int NOT NULL,roleType varchar(30) NOT NULL,userName varchar(20) NOT NULL,CONSTRAINT Role_pk PRIMARY KEY (roleID));
-- Table: Student
CREATE TABLE Student (studentID int NOT NULL AUTO_INCREMENT,firstName varchar(50) NOT NULL,lastName varchar(50) NOT NULL,churchAffiliation varchar(100) NOT NULL,dob date NOT NULL,primaryAddress varchar(100) NOT NULL,city varchar(50) NOT NULL,state varchar(2) NOT NULL,zip int NOT NULL,email varchar(50) NOT NULL,baptized char(1) NOT NULL,gender char(1) NOT NULL,CONSTRAINT Student_pk PRIMARY KEY (studentID));
-- Table: StudentType
CREATE TABLE StudentType (studentTypeID int NOT NULL AUTO_INCREMENT,grade int NOT NULL,yearlyFee int NOT NULL,CONSTRAINT StudentType_pk PRIMARY KEY (studentTypeID));
-- Table: Student_Contact
CREATE TABLE Student_Contact (contactID int NOT NULL,studentID int NOT NULL,CONSTRAINT Student_Contact_pk PRIMARY KEY (contactID,studentID));
-- Table: Users
CREATE TABLE Users (userID int NOT NULL AUTO_INCREMENT,userName varchar(20) NOT NULL,password varchar(20) NOT NULL,firstName varchar(30) NOT NULL,lastName varchar(30) NOT NULL,emailAddress varchar(200) NOT NULL,CONSTRAINT Users_pk PRIMARY KEY (userID));
-- foreign keys
-- Reference: OtherSchools_Students_OtherSchools (table: OtherSchools_Student)
ALTER TABLE OtherSchools_Student ADD CONSTRAINT OtherSchools_Students_OtherSchools FOREIGN KEY OtherSchools_Students_OtherSchools (otherSchoolsID)REFERENCES OtherSchools (otherSchoolsID);
-- Reference: OtherSchools_Students_Student (table: OtherSchools_Student)
ALTER TABLE OtherSchools_Student ADD CONSTRAINT OtherSchools_Students_Student FOREIGN KEY OtherSchools_Students_Student (studentID)REFERENCES Student (studentID);
-- Reference: Registration_Student (table: Registration)
ALTER TABLE Registration ADD CONSTRAINT Registration_Student FOREIGN KEY Registration_Student (studentID)REFERENCES Student (studentID);
-- Reference: Registration_StudentType (table: Registration)
ALTER TABLE Registration ADD CONSTRAINT Registration_StudentType FOREIGN KEY Registration_StudentType (studentTypeID)REFERENCES StudentType (studentTypeID);
-- Reference: Student_Contact_Contact (table: Student_Contact)
ALTER TABLE Student_Contact ADD CONSTRAINT Student_Contact_Contact FOREIGN KEY Student_Contact_Contact (contactID)REFERENCES Contact (contactID);
-- Reference: Student_Contact_Student (table: Student_Contact)
ALTER TABLE Student_Contact ADD CONSTRAINT Student_Contact_Student FOREIGN KEY Student_Contact_Student (studentID)REFERENCES Student (studentID);
-- Reference: role_Users (table: Role)
ALTER TABLE Role ADD CONSTRAINT role_Users FOREIGN KEY role_Users (userID)REFERENCES Users (userID);
-- End of file.
insert into Users(userName, password, firstName, lastName, emailAddress)values('rtennley','password', 'Robert', 'Tennley', 'rt@gmail.com'),('kbobby','password', 'Keith', 'Bobby', 'kb@gmail.com'),('hunter','password', 'Tim', 'Hunter', 'hunter@gmail.com'),('sselc','password', 'Sue', 'Selc', 'ss@gmail.com');
insert into Role(userID, roleType, userName) values (1, 'administrator', 'rtennley'),(2, 'registered-user', 'kbobby'),(3, 'registered-user', 'hunter'),(4, 'registered-user', 'sselc');
insert into Contact(firstName, lastName, relationshipToStudent, cellPhone, workPhone, baptized, employer, hoursWorked, address, city, state, zip, dob, email)values('Rebecca', 'Garth', 'mother', '9209886767', '9209446767', 'y', 'Chucky Cheese', '50', 'N7888 Hwy Q', 'Creek', 'MI', '53569', '1987-10-10', 'becky@gmail'),('Eileen', 'Brock', 'mother', '9209886789', '9209446722', 'y', 'Kwik Trip', '20', '235 N Stock Street', 'Lake Mills', 'WI', '53599', '1987-01-10', 'eileen@gmail'),('Robert', 'Stern', 'dad', '9209886789', '9209446722', 'y', 'Sentry', '20', '2010 E Lake Street', 'Jefferson', 'WI', '53549', '1980-01-10', 'ss@gmail'),('Stan', 'Collier', 'dad', '9209886789', '9209446722', 'y', 'Sentry', '20', '102 North Street', 'Jefferson', 'WI', '53549', '1985-01-25', 'funkytown@gmail'),('Judy', 'Brunner', 'mom', '9209776789', '9209446732', 'y', 'no', '0', '67 E Main Street', 'Lake Mills', 'WI', '53559', '1985-07-25', 'judes@gmail');
insert into Student(firstName, lastName, churchAffiliation, dob, primaryAddress, city, state, zip, email, baptized, gender)values('Betsy', 'Brown', 'St Johns Watertown', '2010-10-10', 'N7888 Hwy Q', 'Creek', 'MI', '53569', 'bb@gmail.com', 'y', 'f'),('Stephanie', 'Brock', 'St Johns Madison', '2010-01-10', '235 N Stock Street', 'Lake Mills', 'WI', '53599', 'sb@gmail.com', 'y', 'f'),('Cody', 'Stern', 'Lake Mills Public', '2007-01-01', '2010 E Lake Street', 'Jefferson', 'WI', '53549', 'cs@gmail.com', 'y', 'm'),('Dan', 'Collier', 'St Johns Madison', '2012-12-10', '102 North Street', 'Creek', 'WI', '53549', 'dc@gmail.com', 'y', 'm'),('Kelly', 'Brunner', 'St Johns Fort Atkinson', '2000-01-10', '67 E Main Street', 'Lake Mills', 'WI', '53559', 'kb@gmail.com', 'y', 'f');
insert into Student_Contact(contactID, studentID)values(1, 1),(2, 2),(3, 3),(4, 4),(5, 5);
insert into Student_Contact(contactID, studentID)values(3, 4),(4, 5);