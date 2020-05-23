package dev.felipemcardoso;

import dev.felipemcardoso.service.config.ServiceConfig;
import org.apache.catalina.Context;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

public class Service {

    public static void main(String[] args) throws Exception {
        ServiceConfig config = ServiceConfig.getInstance();

        Tomcat tomcat = new Tomcat();
        tomcat.getConnector();
        tomcat.setPort(config.port());

        Context serviceContext = tomcat.addWebapp(config.context(), config.docBase());
        WebResourceRoot webResourceRoot = createWebResource(config.webAppMount(), config.webInf(), serviceContext);
        serviceContext.setResources(webResourceRoot);

        printServiceDescription(config);

        tomcat.start();
        tomcat.getServer().await();
    }

    private static void printServiceDescription(ServiceConfig config) {
        System.out.println("###################################");
        System.out.println(String.format("- Starting Service at port %s", config.port()));
        System.out.println(String.format("- Domain: %s", config.domain()));
        System.out.println("###################################");
    }

    private static WebResourceRoot createWebResource(String webAppMount, String webInf, Context serviceContext) {
        WebResourceRoot serviceResources = new StandardRoot(serviceContext);
        DirResourceSet resourceSet = new DirResourceSet(serviceResources, webAppMount, webInf, "/");
        serviceResources.addPreResources(resourceSet);

        return serviceResources;
    }
}
