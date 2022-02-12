package main.java.com.academy.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "logout", urlPatterns = {"/logout"})
public class LogoutController extends HttpServlet {
    private static final long serialVersionUID = 1L;

   
    public LogoutController() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        // TODO Auto-generated method stub

        HttpSession session = request.getSession(false);
        session.setAttribute("user", "");
        session.removeAttribute("user");
        session.invalidate();

        response.sendRedirect("home?logout-successful");
    }
}
