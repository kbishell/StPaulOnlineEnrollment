drop database enrollment;
create database enrollment;
use enrollment;
CREATE TABLE Contact (contactID int NOT NULL AUTO_INCREMENT,firstName varchar(20) NOT NULL,lastName varchar(20) NOT NULL,relationshipToStudent varchar(30) NOT NULL,cellPhone varchar(10) NOT NULL,workPhone varchar(10) NOT NULL,Baptized char(1) NOT NULL,employer varchar(30) NOT NULL,hoursWorked varchar(200) NOT NULL,address varchar(200) NOT NULL,city varchar(20) NOT NULL,state char(2) NOT NULL,zip int NOT NULL,birthdate date NOT NULL,CONSTRAINT Contact_pk PRIMARY KEY (contactID));
CREATE TABLE OtherSchools (OtherSchoolsID int NOT NULL AUTO_INCREMENT,schoolName varchar(50) NOT NULL,duration int NOT NULL,gradeLevel int NOT NULL,CONSTRAINT OtherSchools_pk PRIMARY KEY (OtherSchoolsID));
CREATE TABLE OtherSchools_Students (studentID int NOT NULL,OtherSchoolsID int NOT NULL,CONSTRAINT OtherSchools_Students_pk PRIMARY KEY (studentID,OtherSchoolsID));
CREATE TABLE Registration (studentID int NOT NULL,studentTypeID int NOT NULL,CONSTRAINT Registration_pk PRIMARY KEY (studentID,studentTypeID));
CREATE TABLE Role (roleType varchar(20) NOT NULL,userID int NOT NULL,CONSTRAINT Role_pk PRIMARY KEY (roleType));
CREATE TABLE Staff (staffID int NOT NULL AUTO_INCREMENT,firstName varchar(20) NOT NULL,lastName varchar(20) NOT NULL,CONSTRAINT Staff_pk PRIMARY KEY (staffID));
CREATE TABLE Student (studentID int NOT NULL AUTO_INCREMENT,firstName varchar(50) NOT NULL,lastName varchar(50) NOT NULL,churchAffiliation varchar(100) NOT NULL,dob date NOT NULL,primaryAddress varchar(100) NOT NULL,city varchar(50) NOT NULL,state varchar(2) NOT NULL,zip int NOT NULL,email varchar(50) NOT NULL,baptized char(1) NOT NULL,gender char(1) NOT NULL,birthdate date NOT NULL,CONSTRAINT Student_pk PRIMARY KEY (studentID));
CREATE TABLE StudentType (studenTypeID int NOT NULL AUTO_INCREMENT,Grade int NOT NULL,yearlyFee int NOT NULL,CONSTRAINT StudentType_pk PRIMARY KEY (studenTypeID));
CREATE TABLE Student_Contact (contactID int NOT NULL,studentID int NOT NULL,CONSTRAINT Student_Contact_pk PRIMARY KEY (contactID,studentID));
CREATE TABLE Users (userID int NOT NULL AUTO_INCREMENT,userName varchar(20) NOT NULL,password varchar(20) NOT NULL,staffID int NOT NULL,contactID int NOT NULL,CONSTRAINT Users_pk PRIMARY KEY (userID));
-- foreign keys
-- Reference: OtherSchools_Students_OtherSchools (table: OtherSchools_Students)
ALTER TABLE OtherSchools_Students ADD CONSTRAINT OtherSchools_Students_OtherSchools FOREIGN KEY OtherSchools_Students_OtherSchools (OtherSchoolsID)REFERENCES OtherSchools (OtherSchoolsID);
-- Reference: OtherSchools_Students_Student (table: OtherSchools_Students)
ALTER TABLE OtherSchools_Students ADD CONSTRAINT OtherSchools_Students_Student FOREIGN KEY OtherSchools_Students_Student (studentID)REFERENCES Student (studentID);
-- Reference: Registration_Student (table: Registration)
ALTER TABLE Registration ADD CONSTRAINT Registration_Student FOREIGN KEY Registration_Student (studentID)REFERENCES Student (studentID);
-- Reference: Registration_StudentType (table: Registration)
ALTER TABLE Registration ADD CONSTRAINT Registration_StudentType FOREIGN KEY Registration_StudentType (studentTypeID)REFERENCES StudentType (studenTypeID);
-- Reference: Student_Contact_Contact (table: Student_Contact)
ALTER TABLE Student_Contact ADD CONSTRAINT Student_Contact_Contact FOREIGN KEY Student_Contact_Contact (contactID)REFERENCES Contact (contactID);
-- Reference: Student_Contact_Student (table: Student_Contact)
ALTER TABLE Student_Contact ADD CONSTRAINT Student_Contact_Student FOREIGN KEY Student_Contact_Student (studentID)REFERENCES Student (studentID);
-- Reference: Users_Contact (table: Users)
ALTER TABLE Users ADD CONSTRAINT Users_Contact FOREIGN KEY Users_Contact (contactID)REFERENCES Contact (contactID);
-- Reference: Users_Staff (table: Users)
ALTER TABLE Users ADD CONSTRAINT Users_Staff FOREIGN KEY Users_Staff (staffID)REFERENCES Staff (staffID);
-- Reference: role_Users (table: Role)
ALTER TABLE Role ADD CONSTRAINT role_Users FOREIGN KEY role_Users (userID)REFERENCES Users (userID);
insert into Staff(firstName, lastName)values('Robert', 'Tennley'),('Betsy', 'Glock'),('Pat', 'Downey'),('Tessa', 'Willis'),('Stephanie', 'Barnes'),('Kathy', 'Banker');