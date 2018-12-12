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

@WebServlet(
        urlPatterns = {"/viewContactInformation"}
)
public class ViewContactInformation extends HttpServlet {

        private final Logger logger = LogManager.getLogger(this.getClass());


        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


            GenericDao contactDao = new GenericDao(Contact.class);

            req.setAttribute("contact", contactDao.getAll());

            RequestDispatcher dispatcher = req.getRequestDispatcher("/displayContactInformation.jsp");
            dispatcher.forward(req, resp);
        }
    }

