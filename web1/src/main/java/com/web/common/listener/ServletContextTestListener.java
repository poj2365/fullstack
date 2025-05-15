package com.web.common.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextTestListener implements ServletContextListener, ServletContextAttributeListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("서버가 실행됨");
		ServletContext context =  sce.getServletContext();
		String path = context.getContextPath();
		String javaPath = System.getenv("JAVA_HOME");
		
		context.setAttribute("path", path);
		context.setAttribute("javaPath", javaPath);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("서버가 종료됨");
	}

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		ServletContextAttributeListener.super.attributeAdded(event);
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		ServletContextAttributeListener.super.attributeRemoved(event);
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		// TODO Auto-generated method stub
		ServletContextAttributeListener.super.attributeReplaced(event);
	}


}
