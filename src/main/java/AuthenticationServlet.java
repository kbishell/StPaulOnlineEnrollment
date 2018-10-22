import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class LoginServlet
 **/
public class AuthenticationServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {

  /*      try {

            Users user = new Users();
            user.setUserName(request.getParameter("j_username"));
            user.setPassword(request.getParameter("j_password"));
            user = UserDAO.login(user);

            if (user.isValid()) {
                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser", user);
                response.sendRedirect("userLogged.jsp");
            } else response.sendRedirect("invalidLogin.jsp");

            } catch(Throwable theException)

            {
                System.out.println(theException);
            }*/
    }
}
