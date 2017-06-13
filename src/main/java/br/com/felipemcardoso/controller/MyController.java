package br.com.felipemcardoso.controller;

import br.com.felipemcardoso.application.MyCommand;
import br.com.felipemcardoso.query.model.MyDto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/my-controller")
public class MyController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        MyDto dto = new MyDto();
        dto.setId(1);
        dto.setField("Field Value");

        return Response.status(200).entity(dto).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response post(@NotNull @Valid MyCommand command) {
        MyDto dto = new MyDto();
        dto.setId(1);
        dto.setField("Field Value");

        return Response.status(200).entity(dto).build();
    }

}
