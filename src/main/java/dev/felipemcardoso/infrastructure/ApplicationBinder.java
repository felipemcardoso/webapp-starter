package dev.felipemcardoso.infrastructure;

import dev.felipemcardoso.application.MyService;
import dev.felipemcardoso.application.MyServiceImpl;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

import javax.inject.Singleton;

public class ApplicationBinder extends AbstractBinder {

    protected void configure() {
        bind(MyServiceImpl.class).to(MyService.class).in(Singleton.class);
    }
}
