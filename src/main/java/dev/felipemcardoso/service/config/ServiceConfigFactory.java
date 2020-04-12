package dev.felipemcardoso.service.config;

import org.glassfish.hk2.api.Factory;

public class ServiceConfigFactory implements Factory<ServiceConfig> {

    @Override
    public ServiceConfig provide() {
        return ServiceConfig.getInstance();
    }

    @Override
    public void dispose(ServiceConfig serviceConfig) {
        //No-op
    }
}
