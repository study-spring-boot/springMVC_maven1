package com.xywei.web.config;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.xywei.springMVC.config.SpringMVCConfig;

public class MyWebConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext configWebApplicationContext = new AnnotationConfigWebApplicationContext();
		configWebApplicationContext.register(SpringMVCConfig.class);
		configWebApplicationContext.setServletContext(servletContext);
		Dynamic servlet = servletContext.addServlet("dispatcher",
				(Servlet) new DispatcherServlet(configWebApplicationContext));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
	}

}
