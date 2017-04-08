package pe.edu.upc.controller;

import pe.edu.upc.bean.Usuario;
import pe.edu.upc.service.OpcionMenuUsuarioService;
import pe.edu.upc.service.SolicitudService;
import pe.edu.upc.service.UsuarioService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Administrador on 30/03/17.
 */
@Path("/usuarios")
public class UsuarioRestService {

    UsuarioService usuarioService=new UsuarioService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsuario(Usuario usuario)
    {
        if(usuario!= null){
            if(usuario.getUsuario()== null || usuario.getUsuario().isEmpty()){
                return Response.status(Response.Status.BAD_REQUEST).build();
            }
            if(usuario.getClave()== null || usuario.getClave().isEmpty()){
                return Response.status(Response.Status.BAD_REQUEST).build();
            }
            if(usuario.getTipoUsuario()== null || usuario.getTipoUsuario().isEmpty()){
                return Response.status(Response.Status.BAD_REQUEST).build();
            }
        }
        Usuario user = usuarioService.getUsuario(usuario);
        if(user == null){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.status(Response.Status.OK).entity(user).build();
    }

    /*@GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsuarioById(@PathParam("id") int id)
    {
        try{
            Integer.valueOf(id);
        }catch(Exception e){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.status(Response.Status.OK).entity(UsuarioService.getUsuario(id)).build();
    }*/

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addUsuario(Usuario user)
    {
        try {
            user = usuarioService.registrarUsuario(user);
            if(user == null){
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.status(Response.Status.OK).entity(user).build();
        }catch (Exception e){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e).build();
        }
    }

    /*@PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateUsuario(Usuario Usuario){
       // Usuario = UsuarioService.updateUsuario(Usuario);
        return Response.status(Response.Status.OK).entity(Usuario).build();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteUsuario(@PathParam("id") int id)
    {
      //  UsuarioService.deleteUsuario(id);
        return Response.status(Response.Status.OK).build();
    }*/


    @GET
    @Path("/{id}/opciones")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOpcionesByUsuario(@PathParam("id")int idUsuario)
    {
        List listaOpciones = new OpcionMenuUsuarioService().getMenu(idUsuario);
        return Response.status(Response.Status.OK).entity(listaOpciones).build();
    }
}
