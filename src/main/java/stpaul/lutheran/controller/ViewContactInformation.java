package stpaul.lutheran.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import stpaul.lutheran.entity.Contact;
import stpaul.lutheran.entity.Users;
import stpaul.lutheran.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        urlPatterns = {"/viewContactInformation"}
)
public class ViewContactInformation extends HttpServlet {

        private final Logger logger = LogManager.getLogger(this.getClass());


        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


            GenericDao contactDao = new GenericDao(Contact.class);

            String userName = req.getUserPrincipal().getName();

            List<Contact> contacts = (List<Contact>) contactDao.getByPropertyEqual("userName", userName);


                /*contacts.get(0).getFirstName();
                contacts.get(0).getLastName();
                contacts.get(0).getCellPhone();
                contacts.get(0).getEmail();
                contacts.get(0).getEmployer();
                contacts.get(0).getWorkPhone();
                contacts.get(0).getHoursWorked();
                contacts.get(0).getAddress();
                contacts.get(0).getCity();
                contacts.get(0).getState();
                contacts.get(0).getZip();
                contacts.get(0).getDob();
                contacts.get(0).getBaptized();
                contacts.get(0).getRelationshipToStudent();*/

                req.setAttribute("contact", contacts);




            RequestDispatcher dispatcher = req.getRequestDispatcher("/displayContactInformation.jsp");
            dispatcher.forward(req, resp);
        }
    }

