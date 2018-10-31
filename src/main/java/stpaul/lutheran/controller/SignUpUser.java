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

import org.apache.logging.log4j.Logger;


/**
 * Created by kbishell
 */

@WebServlet(name = "SignUpUser", urlPatterns = { "/signUpUser" } )


public class SignUpUser extends HttpServlet {

    //private final Logger log = Logger.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Users user = new Users();
        user.setUserName(req.getParameter("userName"));
        user.setEmailAddress(req.getParameter("emailAddress"));
        user.setFirstName(req.getParameter("firstName"));
        user.setLastName(req.getParameter("lastName"));
        user.setPassword(req.getParameter("password"));

        //log.debug("Adding User: " + user);

        Role role = new Role();
        role.setUser(user);
        //role.setName("user");
        user.addRole(role);

        /*String gRecaptchaResponse = req.getParameter("g-recaptcha-response");
        System.out.println(gRecaptchaResponse);
        boolean isVerified = VerifyRecaptcha.verify(gRecaptchaResponse);

        if (isVerified) {
            // TODO check if user is already in the database
            AbstractDao dao = DaoFactory.createDao(User.class);
            dao.create(user);
        } else {
            req.setAttribute("errorMessage", "Failed Captcha - Please try again");
            log.info("Failed Captcha");
        }*/
        RequestDispatcher dispatcher = req.getRequestDispatcher("/signUpConfirmation" +
                ".jsp");
        dispatcher.forward(req, resp);
    }
}