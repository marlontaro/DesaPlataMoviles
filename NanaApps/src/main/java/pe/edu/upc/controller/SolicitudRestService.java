package pe.edu.upc.controller;

import pe.edu.upc.bean.Solicitud;
import pe.edu.upc.bean.Usuario;
import pe.edu.upc.service.SolicitudService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Administrador on 04/04/17.
 */
@Path("/solicitudes")
public class SolicitudRestService {

    SolicitudService solicitudService = new SolicitudService();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addSolicitud(Solicitud sol)
    {
        try {
            sol = solicitudService.registrarSolicitud(sol);
            if(sol == null){
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.status(Response.Status.OK).entity(sol).build();
        }catch (Exception e){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSolicitudById(@PathParam("id") int id)
    {
        try{
            Integer.valueOf(id);
        }catch(Exception e){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.status(Response.Status.OK).entity(solicitudService.getSolicitud(id)).build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateEstadoSolicitud(Solicitud solicitud)
    {
        try{
            solicitud = solicitudService.updateSolicitud(solicitud);
            return Response.status(Response.Status.OK).build();
        }catch(Exception e){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }


}
