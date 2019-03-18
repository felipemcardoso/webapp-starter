package dev.felipemcardoso.presentation;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class AppJsonMapper implements ContextResolver<ObjectMapper> {

    static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";

    private final ObjectMapper mapper;

    public AppJsonMapper() {
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        mapper = new ObjectMapper();
        mapper.setDateFormat(dateFormat);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        SimpleModule module = new SimpleModule();
        module.addSerializer(java.util.Date.class, new DateSerializer(false, dateFormat));
        module.addDeserializer(java.util.Date.class, new JsonDateDeserializer());
        mapper.registerModule(module);
    }

    public ObjectMapper getContext(Class<?> objectType) {
        return mapper;
    }
}