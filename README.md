# Kortney Bishell Individual Project

### Problem Statement

My 8 year old son attends a private grade school. Due to minimal funds his school has very little technology and resorts
to the old fashioned way of things, a paper trail. I have been trying to find ways to help out and contribute to his
school for a long time now, for this is where I went to grade school. My contribution is going to be creating an online
enrollment web app. This will allow them to go paperless, but also allow for families to go in and add/edit their
information at the click of a button.

I will be creating Home - Sign In - New Member - Emergency Contacts ---- Everything else will be stretch goals


### Project Technologies/Techniques 

* Security/Authentication
  * Tomcat's JDBC Realm Authentication
  * Admin role: create/read/update/delete (crud) of all data
  * User role: create account, edit account
  * Only the signed in user and the school administration can access the account information
* Database
  * MySQL
  * Store users and family information
* ORM Framework
  * Hibernate 5
* Dependency Management
  * Maven
* Web Services consumed using Java
  * N/A
* CSS 
  * Bootstrap
* Data Validation
  * Bootstrap Validator for front end
  * Explore Hibernate's validation
* Logging
  * Configurable logging using Log4J2. In production, only errors will normally be logged, but logging at a debug level 
    can be turned on to facilitate trouble-shooting. 
* Hosting
  * AWS
* Independent Research Topic/s
  * CI tools in AWS
  * Materialize
  * Hibernate Validation
  * Hibernate Search
* Project Lombok to eliminate boilerplate code like getters/setters/equals
* Unit Testing
  * JUnit tests to achieve 80%+ code coverage 
* IDE: IntelliJ IDEA

### Design

* [Home Screen Design](DesignDocuments/home.pdf)
* [New Member Screen Design](DesignDocuments/NewMember.pdf)
* [Sign In Screen Design](DesignDocuments/signIn.pdf)


### [Project Plan](DesignDocuments/projectPlan.md)

### [Application Flow](DesignDocuments/applicationFlow.md)

### [Journal Entry](DesignDocuments/journalEntry.md)

### [ERD](../DesignDocuments/ERDFinal.png)


