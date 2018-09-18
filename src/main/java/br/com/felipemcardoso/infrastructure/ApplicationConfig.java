package br.com.felipemcardoso.infrastructure;

import br.com.felipemcardoso.infrastructure.exception.ValidationExceptionMapper;
import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        register(new ApplicationBinder());
        register(new ValidationExceptionMapper());

        packages("br.com.felipemcardoso.controller",
                "br.com.felipemcardoso.application",
                "br.com.felipemcardoso.presentation");
    }
}
