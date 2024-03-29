package main.java.com.academy.controller;

import main.java.com.academy.dao.ClassDAO;
import main.java.com.academy.entity.Classes;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "report", urlPatterns = {"/report"})
public class ReportController extends HttpServlet {
    private static final long serialVersionUID = 1L;

  
    public ReportController() {
        super();
        // TODO Auto-generated constructor stub
    }

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setDateHeader("Expires", 0);

        int classId = 1;

        if (request.getParameter("classId") != null)
            classId = Integer.parseInt(request.getParameter("classId"));

        Classes cls = ClassDAO.getClassWithSubjectsTeachersStudents(classId);

        request.setAttribute("pages", ClassDAO.countOfClasses());

        request.setAttribute("cls", cls);

        request.setAttribute("currentPage", classId);

        request.getRequestDispatcher("report.jsp")
                .forward(request, response);
    }

}
