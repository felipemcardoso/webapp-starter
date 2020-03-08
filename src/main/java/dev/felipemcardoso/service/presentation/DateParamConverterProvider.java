package dev.felipemcardoso.service.presentation;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;

@Provider
public class DateParamConverterProvider implements ParamConverterProvider {

    public ParamConverter<Date> getConverter(Class rawType, Type genericType, Annotation[] annotations) {

        if (rawType != Date.class) {
            return null;
        }

        return new DateParamConverter();
    }
}
