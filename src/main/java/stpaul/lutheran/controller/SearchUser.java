package stpaul.lutheran.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import stpaul.lutheran.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * A simple servlet to welcome the user.
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/searchUser"}
)

public class SearchUser extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.error("inSearchUser");


        GenericDao userDao = new GenericDao();

        logger.error("inSearchUser");

        String search = req.getParameter("search");

        logger.debug(search);

        if(search == null || search.length() == 0){
            /*HttpSession session = req.getSession();
            session.setAttribute("emptyMessage", "Please enter search information");*/
            req.setAttribute("users", userDao.getAll());
        } else {

            req.setAttribute("users", userDao.getByLastName(search));
        }

        logger.info(userDao.getAll());
        logger.info(userDao.getByLastName(search));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/AdminPages/displayUsers.jsp");
        dispatcher.forward(req, resp);
    }
}