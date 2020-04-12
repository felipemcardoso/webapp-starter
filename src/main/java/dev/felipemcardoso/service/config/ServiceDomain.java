package dev.felipemcardoso.service.config;

enum ServiceDomain {

    DEVO("src/main/webapp/", "target/classes", "/WEB-INF/classes"),
    BETA("/webapp/", "/webapp/WEB-INF/classes", "/webapp/WEB-INF/classes"),
    PROD("/webapp/", "/webapp/WEB-INF/classes", "/webapp/WEB-INF/classes");

    private final String docBase;

    private final String webInfClasses;

    private final String webInf;

    ServiceDomain(String docBase, String webInfClasses, String webInf) {
        this.docBase = docBase;
        this.webInfClasses = webInfClasses;
        this.webInf = webInf;
    }

    String docBase() {
        return docBase;
    }

    String webInfClasses() {
        return webInfClasses;
    }

    String webInf() {
        return webInf;
    }

    public boolean isDevo() {
        return DEVO.equals(this);
    }
}
