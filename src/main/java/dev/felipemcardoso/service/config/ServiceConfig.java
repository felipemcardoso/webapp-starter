package dev.felipemcardoso.service.config;

import javax.inject.Singleton;
import java.io.File;

@Singleton
public final class ServiceConfig {

    private static final String DOMAIN = "DOMAIN";
    private static final String DEFAULT_PORT = "8080";
    private static final String DEFAULT_CONTEXT = "";

    private static ServiceConfig instance;

    private final ServiceDomain domain;

    private ServiceConfig(String domain) {
        this.domain = ServiceDomain.valueOf(domain.toUpperCase());
    }

    public static ServiceConfig getInstance() {
        if (instance == null) {
            instance = new ServiceConfig(System.getProperty(DOMAIN, ServiceDomain.DEVO.name()));
        }
        return instance;
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
        if (isDevo()) {
            return new File(this.domain.docBase()).getAbsolutePath();
        } else {
            return System.getProperty("basedir") + this.domain.docBase();
        }
    }

    public String webInf() {
        if (this.domain.isDevo()) {
            return new File(this.domain.webInfClasses()).getAbsolutePath();
        } else {
            return System.getProperty("basedir") + this.domain.webInfClasses();
        }
    }

    public String webAppMount() {
        return this.domain.webInf();
    }

    public ServiceDomain domain() {
        return this.domain;
    }

    private boolean isDevo() {
        return ServiceDomain.DEVO.equals(this.domain);
    }
}
