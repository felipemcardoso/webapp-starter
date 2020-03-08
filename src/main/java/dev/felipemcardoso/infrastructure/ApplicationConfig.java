package dev.felipemcardoso.infrastructure;

import dev.felipemcardoso.application.service.ServiceBinder;
import dev.felipemcardoso.infrastructure.exception.ValidationExceptionMapper;
import dev.felipemcardoso.service.config.ConfigBinder;
import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        register(new ServiceBinder());
        register(new ConfigBinder());
        register(new ValidationExceptionMapper());

        packages("br.com.felipemcardoso.controller",
                "br.com.felipemcardoso.application",
                "br.com.felipemcardoso.presentation");
    }
}
