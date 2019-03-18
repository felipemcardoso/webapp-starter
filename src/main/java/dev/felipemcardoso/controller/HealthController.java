package dev.felipemcardoso.controller;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/health")
@Singleton
public class HealthController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response isHealth() {
        return Response.status(200).build();
    }
}
