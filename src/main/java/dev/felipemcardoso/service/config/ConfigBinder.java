package dev.felipemcardoso.service.config;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import javax.inject.Singleton;

public class ConfigBinder extends AbstractBinder {

    @Override
    protected void configure() {
        bind(AppConfig.class).to(AppConfig.class).in(Singleton.class);
    }
}
