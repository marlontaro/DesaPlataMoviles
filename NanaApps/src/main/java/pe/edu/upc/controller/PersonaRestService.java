package pe.edu.upc.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Administrador on 08/04/17.
 */
@Path("/personas")
public class PersonaRestService {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPersonaById(@PathParam("id") long id)
    {
        List listOfCountries = nanaService.getAllNanas();
        return Response.status(Response.Status.OK).entity(listOfCountries).build();
    }
}
