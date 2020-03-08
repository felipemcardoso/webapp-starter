package dev.felipemcardoso.service.infrastructure;

import dev.felipemcardoso.service.config.ConfigBinder;
import dev.felipemcardoso.service.infrastructure.exception.ValidationExceptionMapper;
import dev.felipemcardoso.webstarter.application.service.ServiceBinder;
import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        register(new ServiceBinder());
        register(new ConfigBinder());
        register(new ValidationExceptionMapper());

        packages("br.com.felipemcardoso.webstarter.controller",
                 "br.com.felipemcardoso.webstarter.application",
                 "br.com.felipemcardoso.presentation");
    }
}
