package com.udla.edu.ec.filter;

import java.io.IOException;
import java.io.Writer;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class FilterExample implements Filter {

	private static Logger log = Logger.getLogger(FilterExample.class);

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		Writer out = response.getWriter();
		
		HttpSession session = ((HttpServletRequest)request).getSession();
		if (session.getAttribute("username") == null) {			
			((HttpServletResponse)response).sendRedirect("/site/login.jsp");
		}
		
		try {
			out.write((new Date()).toString());
			chain.doFilter(request, response);
		} catch (Exception e) {
			log.error(e);
		}
		
	}

	public void init(FilterConfig fileConfig) throws ServletException {

	}

}
