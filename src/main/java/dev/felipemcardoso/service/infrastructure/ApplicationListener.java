package dev.felipemcardoso.service.infrastructure;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ApplicationListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //No-op
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        //No-op
    }
}
