package dev.felipemcardoso.presentation;


import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.ParamConverter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParamConverter implements ParamConverter<Date> {

    public Date fromString(String value) {

        if (value == null || value.trim().equals("")) {
            return null;
        }

        SimpleDateFormat formatter = new SimpleDateFormat(AppJsonMapper.DATE_FORMAT);

        try {
            return formatter.parse(value);

        } catch (Exception ex) {
            throw new WebApplicationException(ex.getMessage(), 400);
        }
    }


    public String toString(Date date) {
        return new SimpleDateFormat(AppJsonMapper.DATE_FORMAT).format(date);
    }
}
