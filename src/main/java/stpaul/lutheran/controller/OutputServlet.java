package stpaul.lutheran.controller;

import stpaul.lutheran.entity.Users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "outputUsers",
        urlPatterns = { "/outputUsers" }
)
public class OutputServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    // This Method Is Called By The Servlet Container To Process A 'GET' Request.
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        handleRequest(request, response);
    }

    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        Users users = new Users();

        request.getSession().setAttribute("users", users);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/beanData.jsp");

        dispatcher.forward(request, response);
    }
}


