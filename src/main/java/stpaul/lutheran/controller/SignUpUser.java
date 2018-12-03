package stpaul.lutheran.controller;

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


/**
 * Created by kbishell
 */

@WebServlet(name = "SignUpUser", urlPatterns = { "/signUpUser" } )


public class SignUpUser extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Users user = new Users();

        user.setUserName(req.getParameter("userName"));
        user.setEmailAddress(req.getParameter("emailAddress"));
        user.setFirstName(req.getParameter("firstName"));
        user.setLastName(req.getParameter("lastName"));
        user.setPassword(req.getParameter("password"));

        logger.debug("Adding User: " + user);

        Role role = new Role();
        role.setUser(user);
        role.setRoleType("registered-user");
        user.addRole(role);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/signUpConfirmation" +
                ".jsp");
        dispatcher.forward(req, resp);
    }
}