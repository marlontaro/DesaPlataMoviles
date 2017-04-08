package pe.edu.upc.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrador on 04/04/17.
 */
@Entity
@Table
public class Solicitud {
    @Id
    @GeneratedValue
    private int idSolicitud;
    private String nombreSolicitante;
    private String apellidoSolicitante;
    private String nombreNinos;
    private int cantidadNinos;
    private String horario;
    private String direccion;
    private String estado;
    private String comentario;

    public Solicitud(){

    }

    public int getId() {
        return idSolicitud;
    }

    public void setId(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    public String getApellidoSolicitante() {
        return apellidoSolicitante;
    }

    public void setApellidoSolicitante(String apellidoSolicitante) {
        this.apellidoSolicitante = apellidoSolicitante;
    }


    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreNinos() {
        return nombreNinos;
    }

    public void setNombreNinos(String nombreNinos) {
        this.nombreNinos = nombreNinos;
    }

    public int getCantidadNinos() {
        return cantidadNinos;
    }

    public void setCantidadNinos(int cantidadNinos) {
        this.cantidadNinos = cantidadNinos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
