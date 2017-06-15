package br.com.felipemcardoso.infrastructure;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class ApplicationListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("contextInitialized");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("contextDestroyed");
    }
}
