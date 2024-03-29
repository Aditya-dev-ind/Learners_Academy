package main.java.com.academy.controller;

import main.java.com.academy.dao.SubjectDAO;
import main.java.com.academy.entity.Subjects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "subjects", urlPatterns = {"/subjects"})
public class SubjectController extends HttpServlet {
    private static final long serialVersionUID = 1L;

   
    public SubjectController() {
        super();
        // TODO Auto-generated constructor stub
    }

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setDateHeader("Expires", 0);

        List<Subjects> subjects = SubjectDAO.getAllSubjects();
        request.setAttribute("subjects", subjects);
        request.getRequestDispatcher("subjects.jsp")
                .forward(request, response);
    }
}
