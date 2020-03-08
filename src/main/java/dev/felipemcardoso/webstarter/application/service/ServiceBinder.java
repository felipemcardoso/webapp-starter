package dev.felipemcardoso.webstarter.application.service;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import javax.inject.Singleton;

public class ServiceBinder extends AbstractBinder {

    protected void configure() {
        bind(MyService.class).to(dev.felipemcardoso.webstarter.application.MyService.class).in(Singleton.class);
    }
}
