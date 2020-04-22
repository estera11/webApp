package service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;

@WebServlet("/login")
public class LoginService extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private UserDAO userDao = new UserDAO();	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.sendRedirect("login.jsp");
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		        try {
		            authenticateUser(request, response);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }

	private void authenticateUser(HttpServletRequest request, HttpServletResponse response) {
		 String username = request.getParameter("username");
	     String password = request.getParameter("password");
	     
	     if(userDao.validateUserExists(username, password)) {
	    	 if(userDao.getUser(username, password).getType().equals("admin")) {
	    		 dispatch(request, response, "login-success-admin.jsp");
	    	 }
	    	 else if(userDao.getUser(username, password).getType().equals("customer")) {
	    		 dispatch(request, response, "login-success-customer.jsp");
	    	 }
	    	
	     }
	}

	private void dispatch(HttpServletRequest request, HttpServletResponse response, String file) {
		RequestDispatcher dispatcher = request.getRequestDispatcher(file);
		 try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
