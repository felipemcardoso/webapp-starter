package br.com.felipemcardoso.infrastructure;

import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {

        register(new ApplicationBinder());

        packages("br.com.felipemcardoso.controller",
                 "br.com.felipemcardoso.application",
                 "br.com.felipemcardoso.presentation");

        System.out.println(System.getProperty("LOG_HOME"));
    }
}
