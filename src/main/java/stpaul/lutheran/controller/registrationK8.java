package stpaul.lutheran.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
        urlPatterns = {"/reg"}
)
public class registrationK8 extends HttpServlet{

       private final Logger logger = LogManager.getLogger(this.getClass());


        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            logger.error("registering for K-8");


            GenericDao userDao = new GenericDao(Users.class);



            String first = req.getParameter("first");
            String last = req.getParameter("first");



            if(first == null || first.length() == 0){

                //output error to the screen
            } else {

                req.setAttribute("first", userDao.getByLastName(first));
            }

            RequestDispatcher dispatcher = req.getRequestDispatcher("/completeK8.jsp");
            dispatcher.forward(req, resp);
        }
    }

