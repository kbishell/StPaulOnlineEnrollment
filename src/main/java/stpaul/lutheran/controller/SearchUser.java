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


/**
 * The type Search user.
 */
@WebServlet(
        urlPatterns = {"/searchUser"}
)

public class SearchUser extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.info("inSearchUser");


        GenericDao userDao = new GenericDao(Users.class);

        logger.info("inSearchUser");

        String search = req.getParameter("search");

        logger.info(search);

        if(req.getParameter("submit").equals("search")){

            req.setAttribute("users", userDao.getByLastName(search));
        } else {

            req.setAttribute("users", userDao.getAll());
        }

        logger.info("ALL: " + userDao.getAll());
        logger.info("last name: " + userDao.getByLastName(search));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/displayUsers.jsp");
        dispatcher.forward(req, resp);
    }
}