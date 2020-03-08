package dev.felipemcardoso.application.service;

import dev.felipemcardoso.service.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;

@Singleton
class MyService implements dev.felipemcardoso.application.MyService {

    private static Logger log = LoggerFactory.getLogger(MyService.class);

    private final AppConfig appConfig;

    @Inject
    public MyService(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @Transactional
    public void voila() {
        System.out.println(appConfig.find("version.number"));
        log.info("Voila Log");
    }
}
