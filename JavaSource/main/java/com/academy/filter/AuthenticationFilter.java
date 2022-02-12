package main.java.com.academy.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "authentication", urlPatterns = { "/*" })
public class AuthenticationFilter implements Filter {

	public AuthenticationFilter() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		HttpSession session = request.getSession(false);

		String user = null;

		if (session != null)
			user = (String) session.getAttribute("user");

		String servletPath = request.getServletPath();

		if (session == null || user == null || user.equals(" ")) {

			if (servletPath.equals("/home") || servletPath.equals("/login"))
				chain.doFilter(req, res);
			else
				response.sendRedirect("login?login-first");

		} else {

			if (servletPath.equals("/login"))
				response.sendRedirect("home?user-exists");
			else
				chain.doFilter(req, res);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
