package br.com.felipemcardoso.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by felipe on 02/05/17.
 * felipe.computacao@gmail.com
 */
@Path("/hello")
public class HelloController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        String output = "Hello";

        return Response.status(200).entity(output).build();
    }
}
