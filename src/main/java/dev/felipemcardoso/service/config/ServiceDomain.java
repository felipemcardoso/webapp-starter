package dev.felipemcardoso.service.config;

enum ServiceDomain {

    DEVO("src/main/webapp/", "target/classes", "/WEB-INF/classes"),
    PROD("/webapp/", "/webapp/WEB-INF/classes", "/webapp/WEB-INF/classes");

    private final String docBase;

    private final String webInfClasses;

    private final String webInf;

    ServiceDomain(String docBase, String webInfClasses, String webInf) {
        this.docBase = docBase;
        this.webInfClasses = webInfClasses;
        this.webInf = webInf;
    }

    public String docBase() {
        return docBase;
    }

    public String webInfClasses() {
        return webInfClasses;
    }

    public String webInf() {
        return webInf;
    }
}
