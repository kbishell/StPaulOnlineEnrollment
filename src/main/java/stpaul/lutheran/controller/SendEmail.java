package stpaul.lutheran.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import stpaul.lutheran.entity.Users;
import stpaul.lutheran.persistence.GenericDao;
import stpaul.lutheran.util.Emailer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;

/**
 * The type Send email.
 */
@WebServlet(
        urlPatterns = {"/sendEmail"}
)
public class SendEmail extends HttpServlet {

        private final Logger logger = LogManager.getLogger(this.getClass());


        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String name = "";
            String message = "";
            String subject = "";

            Properties properties = new Properties();

            //String userName = req.getUserPrincipal().getName();

            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");

            req.getParameter("name");
            req.getParameter("message");
            req.getParameter("subject");

            Emailer.sendEmail("kortney62@gmail.com", subject,
                    message, "bishelltest@gmail.com",
                    "bishelltest@gmail.com", "testTest");

            RequestDispatcher dispatcher = req.getRequestDispatcher("/confirmEmail.jsp");
            dispatcher.forward(req, resp);
        }


    }

