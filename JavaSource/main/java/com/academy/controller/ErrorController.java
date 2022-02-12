package main.java.com.academy.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "error", urlPatterns = {"/error"})
public class ErrorController extends HttpServlet {
    private static final long serialVersionUID = 1L;

  
    public ErrorController() {
        super();
        // TODO Auto-generated constructor stub
    }

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        processError(request, response);
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        processError(request, response);
    }

   
    private void processError(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setDateHeader("Expires", 0);

        String error = null;

        String path = request.getContextPath();

        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");

        switch (statusCode) {

            case 500:
                error = "Internal Server Error";
                break;
            case 403:
                error = "Request Forbidden";
                break;
			case 400:
                error = "Bad Request";
                break;
            case 401:
                error = "Unauthorized";
                break;
            default:
                error = "Page Not Found";
        }

        request.setAttribute("statusCode", statusCode);
        request.setAttribute("error", error);
        request.setAttribute("path", path);

        request.getRequestDispatcher("error.jsp").forward(request, response);
    }
}
