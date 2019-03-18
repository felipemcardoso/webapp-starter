package dev.felipemcardoso.presentation;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonDateDeserializer extends JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonParser jsonparser,
                            DeserializationContext deserializationcontext) throws IOException {

        SimpleDateFormat format = new SimpleDateFormat(AppJsonMapper.DATE_FORMAT);
        String date = jsonparser.getText();

        try {
            return format.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
