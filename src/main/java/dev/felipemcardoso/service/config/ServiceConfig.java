package dev.felipemcardoso.service.config;

import java.io.File;

public final class ServiceConfig {

    private static final String DEFAULT_CONTEXT = "";
    private static final String DEFAULT_PORT = "8080";

    private ServiceDomain domain;

    private ServiceConfig(String[] args) {
        this.domain = getDomain(args);
    }

    public static ServiceConfig newInstance(String[] args) {
        return new ServiceConfig(args);
    }

    public int port() {
        String port = System.getenv("PORT");

        if (port == null || port.isEmpty()) {
            port = DEFAULT_PORT;
        }

        return Integer.parseInt(port);
    }

    public String context() {
        return DEFAULT_CONTEXT;
    }

    public String docBase() {
        if (isProd()) {
            return System.getProperty("basedir") + this.domain.docBase();
        } else {
            return new File(this.domain.docBase()).getAbsolutePath();
        }
    }

    public String webInf() {
        if (isProd()) {
            return System.getProperty("basedir") + this.domain.webInfClasses();
        } else {
            return new File(this.domain.webInfClasses()).getAbsolutePath();
        }
    }

    public String webAppMount() {
        return this.domain.webInf();
    }

    private boolean isProd() {
        return ServiceDomain.PROD.equals(this.domain);
    }

    private static ServiceDomain getDomain(String[] args) {
        for (String arg : args) {
            if (ServiceDomain.PROD.name().equals(arg)) {
                return ServiceDomain.PROD;
            }
        }
        return ServiceDomain.DEVO;

    }
}
