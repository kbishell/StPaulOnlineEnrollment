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
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


            GenericDao userDao = new GenericDao(Users.class);

            String userName = req.getUserPrincipal().getName();

            Users user = new Users();

            List<Users> users = (List<Users>) userDao.getByPropertyEqual("userName", userName);

            users.get(0).getContact();
            req.setAttribute("contact", users.get(0).getContact());


            RequestDispatcher dispatcher = req.getRequestDispatcher("/displayContactInformation.jsp");
            dispatcher.forward(req, resp);
        }
    }

