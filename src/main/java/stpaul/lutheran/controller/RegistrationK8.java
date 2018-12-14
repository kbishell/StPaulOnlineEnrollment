package stpaul.lutheran.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import stpaul.lutheran.entity.Contact;
import stpaul.lutheran.entity.Student;
import stpaul.lutheran.entity.Users;
import stpaul.lutheran.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * The type Registration k 8.
 */
@WebServlet(name = "SignUpUser",
        urlPatterns = { "/signUpUser" }
        )

public class RegistrationK8 extends HttpServlet{

       private final Logger logger = LogManager.getLogger(this.getClass());


        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            logger.info("registering for K-8");


            GenericDao studentDao = new GenericDao(Student.class);

            Student student = new Student();
            student.setFirstName(req.getParameter("firstName"));
            student.setLastName(req.getParameter("lastName"));
            student.setChurchAffiliation(req.getParameter("churchAffiliation"));
            student.setDob(req.getParameter("dob"));
            student.setPrimaryAddress(req.getParameter("primaryAddress"));
            student.setCity(req.getParameter("city"));
            student.setState(req.getParameter("state"));
            student.setZip(req.getParameter("zip"));
            student.setBaptized(req.getParameter("baptized"));
            student.setGender(req.getParameter("gender"));

            studentDao.insert(student);

            RequestDispatcher dispatcher = req.getRequestDispatcher("/completeK8.jsp");
            dispatcher.forward(req, resp);
        }
    }

