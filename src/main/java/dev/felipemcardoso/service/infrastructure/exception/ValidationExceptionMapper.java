package dev.felipemcardoso.service.infrastructure.exception;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ValidationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

    @Override
    public Response toResponse(ConstraintViolationException e) {
        return Response.status(Response.Status.BAD_REQUEST)
                       .type(MediaType.APPLICATION_JSON)
                       .entity(new ErrorMessage(buildMessage(e)))
                       .build();
    }

    private String buildMessage(ConstraintViolationException e) {
        StringBuilder message = new StringBuilder();

        for (ConstraintViolation<?> violation : e.getConstraintViolations()) {
            message.append(violation.getMessage()).append(System.lineSeparator());
        }

        if (message.length() > 0) {
            message.delete(message.lastIndexOf(System.lineSeparator()), message.length());
        }

        return message.toString();
    }
}


