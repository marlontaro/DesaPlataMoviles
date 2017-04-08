package pe.edu.upc.controller;

import pe.edu.upc.service.NanaService;
import pe.edu.upc.service.SolicitudService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Administrador on 04/04/17.
 */
@Path("/nanas")
public class NanaRestService {

    NanaService nanaService = new NanaService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNanas()
    {
        List listOfCountries = nanaService.getAllNanas();
        return Response.status(Response.Status.OK).entity(listOfCountries).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNanaById(@PathParam("id") int id)
    {
        try{
            Integer.valueOf(id);
        }catch(Exception e){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.status(Response.Status.OK).entity(nanaService.getNana(id)).build();
    }

    @GET
    @Path("/{id}/solicitudes")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSolicitudesByNanas(@PathParam("id")int idNana)
    {

        List listOfCountries = new SolicitudService().getSolicitudesByNana(idNana);
        return Response.status(Response.Status.OK).entity(listOfCountries).build();
    }

}
