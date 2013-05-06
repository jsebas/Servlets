package com.udla.edu.ec.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.udla.edu.ec.hash.CustomHash;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		CustomHash ch = new CustomHash();
		HttpServletResponse httpResponse = response;
		Properties prop = new Properties();
        prop.load(new FileInputStream("/Users/CrisMacBook/Documents/workspace/ServletsExamples/build.properties"));
       
        String username = request.getParameter("username");
        
        String clave = prop.getProperty(username);
        
        String input = ch.hash(request.getParameter("password"));
        
        if (clave == null) {
        	httpResponse.sendRedirect("/site/login.jsp");
        } else if (clave.equals(input)) {
        	request.getSession().setAttribute("username", username);
        	httpResponse.sendRedirect("/site/welcome.jsp");
        } else {
        	httpResponse.sendRedirect("/site/login.jsp");
        }
        
	}
}
