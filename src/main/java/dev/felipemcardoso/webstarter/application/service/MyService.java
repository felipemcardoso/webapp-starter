package dev.felipemcardoso.webstarter.application.service;

import dev.felipemcardoso.service.config.AppConfig;
import dev.felipemcardoso.service.config.ServiceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;

@Singleton
class MyService implements dev.felipemcardoso.webstarter.application.MyService {

    private static final Logger log = LoggerFactory.getLogger(MyService.class);

    private final AppConfig appConfig;

    private final ServiceConfig serviceConfig;

    @Inject
    public MyService(AppConfig appConfig, ServiceConfig serviceConfig) {
        this.appConfig = appConfig;
        this.serviceConfig = serviceConfig;
    }

    @Transactional
    public void voila() {
        System.out.println(appConfig.find("version.number"));
        System.out.printf("Domain: %s%n", serviceConfig.domain());
        System.out.printf("Port: %s%n", serviceConfig.port());
        log.info("Voila Log");
    }
}
