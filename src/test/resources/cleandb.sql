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
CREATE TABLE Users (userID int NOT NULL AUTO_INCREMENT,userName varchar(20) NOT NULL,password varchar(20) NOT NULL,firstName varchar(30) NOT NULL,lastName varchar(30) NOT NULL,emailAddress varchar(200) NOT NULL,contactID int NOT NULL,CONSTRAINT Users_pk PRIMARY KEY (userID));
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
-- Reference: Users_Contact (table: Users)
ALTER TABLE Users ADD CONSTRAINT Users_Contact FOREIGN KEY Users_Contact (contactID)REFERENCES Contact (contactID);
-- End of file.
insert into Contact(firstName, lastName, relationshipToStudent, cellPhone, workPhone, baptized, employer, hoursWorked, address, city, state, zip, dob, email)values('Rebecca', 'Garth', 'mother', '9209886767', '9209446767', 'y', 'Chucky Cheese', '50', 'N7888 Hwy Q', 'Creek', 'MI', '53569', '1987-10-10', 'becky@gmail'),('Eileen', 'Brock', 'mother', '9209886789', '9209446722', 'y', 'Kwik Trip', '20', '235 N Stock Street', 'Lake Mills', 'WI', '53599', '1987-01-10', 'eileen@gmail'),('Robert', 'Stern', 'father', '9209886789', '9209446722', 'y', 'Sentry', '20', '2010 E Lake Street', 'Jefferson', 'WI', '53549', '1980-01-10', 'ss@gmail'),('Stan', 'Collier', 'father', '9209886789', '9209446722', 'y', 'Sentry', '20', '102 North Street', 'Jefferson', 'WI', '53549', '1985-01-25', 'funkytown@gmail'),('Judy', 'Brunner', 'mother', '9209776789', '9209446732', 'y', 'no', '0', '67 E Main Street', 'Lake Mills', 'WI', '53559', '1985-07-25', 'judes@gmail'),('Mary', 'Segal', 'physician', '9207459999', '9209445567', 'n', 'Lake Mills Clinic', '60', '89 S Main Street', 'Lake Mills', 'WI', '53559', '1962-07-25', 'ms@gmail'),('Kenneth', 'Draggs', 'emergency contact', '9209456767', '9209996732', 'y', 'Concrete Construction', '60', '235 E Wollin Street', 'Jefferson', 'WI', '53549', '1960-06-23', 'kend@gmail'),('Ben', 'Muller', 'emergency contact', '9209454343', '9209449087', 'y', 'American Family Insurance', '32', '2121 N Commer Street', 'Lake Mills', 'WI', '53559', '1965-08-23', 'benm@gmail'),('Becky', 'Dulers', 'emergency contact', '9209454376', '9209449089', 'y', 'American Family Insurance', '50', '200 N Bulton Street', 'Lake Mills', 'WI', '53578', '1965-09-25', 'bd@gmail'),('Benny', 'Mess', 'emergency contact', '9209554363', '9209449677', 'y', 'MATC Madison School', '32', '56 N Henn Street', 'Lake Mills', 'WI', '53559', '1967-12-23', 'benny@gmail'),('Betsy', 'Parker', 'physician', '9202454873', '9209889977', 'y', 'Watertown Meade Clinic', '25', 'N567 Hwy C', 'Watertown', 'WI', '53567', '1967-12-23', 'betsyParks@gmail'),('Keith', 'Dewy', 'emergency contact', '9209558363', '9209559677', 'y', 'Lake Mills Middle School', '32', '222 S Hollin Street', 'Lake Mills', 'WI', '53559', '1967-11-23', 'keith@gmail'),('Kathy', 'Dummer', 'mother', '9202458363', '9202229677', 'y', 'Lake Mills Middle School', '45', '52 S Collins Road', 'Lake Mills', 'WI', '53559', '1967-01-23', 'kathydummer@gmail');
insert into Users(userName, password, firstName, lastName, emailAddress, contactID)values('rgarth','password', 'Rebecca', 'Garth', 'rg@gmail.com', '1'),('ebdogs','password', 'Eileen', 'Brock', 'ebdogs@gmail.com', '2'),('scoll','password', 'Stan', 'Collier', 'scoll@gmail.com', '3'),('jbrunner','password', 'Judy', 'Brunner', 'jb@gmail.com', '4'),('dummer','password', 'Kathy', 'Dummer', 'dummer@gmail.com', '5');
insert into Role(userID, roleType, userName) values (1, 'administrator', 'rgarth'),(2, 'registered-user', 'ebdogs'),(3, 'registered-user', 'scoll'),(4, 'registered-user', 'jbrunner'),(5, 'registered-user', 'dummer');
insert into Student(firstName, lastName, churchAffiliation, dob, primaryAddress, city, state, zip, email, baptized, gender)values('Betsy', 'Brown', 'St Johns Watertown', '2010-10-10', 'N7888 Hwy Q', 'Creek', 'MI', '53569', 'bb@gmail.com', 'y', 'f'),('Stephanie', 'Brock', 'St Johns Madison', '2010-01-10', '235 N Stock Street', 'Lake Mills', 'WI', '53599', 'sb@gmail.com', 'y', 'f'),('Cody', 'Stern', 'Lake Mills Public', '2007-01-01', '2010 E Lake Street', 'Jefferson', 'WI', '53549', 'cs@gmail.com', 'y', 'm'),('Dan', 'Collier', 'St Johns Madison', '2012-12-10', '102 North Street', 'Creek', 'WI', '53549', 'dc@gmail.com', 'y', 'm'),('Kelly', 'Brunner', 'St Johns Fort Atkinson', '2000-01-10', '67 E Main Street', 'Lake Mills', 'WI', '53559', 'kb@gmail.com', 'y', 'f');
insert into Student_Contact(contactID, studentID)values(1, 1),(2, 2),(3, 3),(4, 4),(5, 5);
insert into Student_Contact(contactID, studentID)values(5, 3),(6, 3),(7, 3),(8, 3),(9, 3),(10, 4),(11, 4),(12, 4),(13, 4);