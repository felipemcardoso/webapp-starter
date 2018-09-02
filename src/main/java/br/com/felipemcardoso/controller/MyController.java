package br.com.felipemcardoso.controller;

import br.com.felipemcardoso.application.MyCommand;
import br.com.felipemcardoso.application.MyService;
import br.com.felipemcardoso.query.model.MyDto;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
        MyDto dto = new MyDto();
        dto.setId(1);
        dto.setField("Field Value");

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
