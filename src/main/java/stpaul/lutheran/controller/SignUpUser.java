package stpaul.lutheran.controller;

import stpaul.lutheran.entity.Contact;
import stpaul.lutheran.entity.Role;
import stpaul.lutheran.entity.Users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import stpaul.lutheran.persistence.GenericDao;


/**
 * Created by kbishell
 */

@WebServlet(name = "SignUpUser", urlPatterns = { "/signUpUser" } )


public class SignUpUser extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao usersDao = new GenericDao(Users.class);
        GenericDao roleDao = new GenericDao(Role.class);
        GenericDao contactDao = new GenericDao(Contact.class);

        Contact contact = new Contact();
        contact.setFirstName(req.getParameter("firstName"));
        contact.setLastName(req.getParameter("lastName"));
        contact.setRelationshipToStudent(req.getParameter("relationshipToStudent"));
        contact.setCellPhone(req.getParameter("cellPhone"));
        contact.setWorkPhone(req.getParameter("workPhone"));
        contact.setBaptized(req.getParameter("baptized"));
        contact.setEmployer(req.getParameter("employer"));
        contact.setHoursWorked(req.getParameter("hoursWorked"));
        contact.setAddress(req.getParameter("address"));
        contact.setCity(req.getParameter("city"));
        contact.setState(req.getParameter("state"));
        contact.setZip(req.getParameter("zip"));
        contact.setEmail(req.getParameter("email"));
        contact.setDob(req.getParameter("dob"));

        Users user = new Users();
        user.setUserName(req.getParameter("userName"));
        user.setEmailAddress(req.getParameter("emailAddress"));
        user.setFirstName(req.getParameter("firstName"));
        user.setLastName(req.getParameter("lastName"));
        user.setPassword(req.getParameter("password"));

        Role role = new Role();
        role.setUser(user);
        role.setRoleType("registered-user");
        user.addRole(role);

        contactDao.insert(contact);
        usersDao.insert(user);
        roleDao.insert(role);

        logger.debug("Adding User + Contact + Role: " + user + contact + role);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/SignUpConfirmation.jsp");
        dispatcher.forward(req, resp);
    }
}