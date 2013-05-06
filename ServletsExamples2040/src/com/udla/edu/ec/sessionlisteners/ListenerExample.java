package com.udla.edu.ec.sessionlisteners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;

public class ListenerExample implements HttpSessionListener {
	private static Logger log = Logger.getLogger(ListenerExample.class);

	public void sessionCreated(HttpSessionEvent arg0) {
		
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		log.info("Ha finalizado la sesion");
	}

}
