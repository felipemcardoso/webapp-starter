package dev.felipemcardoso.webstarter.controller;

import dev.felipemcardoso.webstarter.application.MyService;
import dev.felipemcardoso.webstarter.application.service.MyCommand;
import dev.felipemcardoso.webstarter.query.model.MyDto;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/my-controller")
@Singleton
public class MyController {

    private final MyService myService;

    @Inject
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        myService.voila();

        MyDto dto = new MyDto();
        dto.setId(1);
        dto.setField("Field");

        return Response.status(200).entity(dto).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/date")
    public Response getDate() {
        MyDto dto = new MyDto();
        dto.setId(1);
        dto.setField("Field Value");
        dto.setMyDate(new Date());

        return Response.status(200).entity(dto).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response post(@NotNull @Valid MyCommand command) {

        myService.voila();

        return Response.status(200).build();
    }
}
