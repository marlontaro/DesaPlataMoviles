package pe.edu.upc.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrador on 30/03/17.
 */
@Entity
@Table
public class Usuario {
    @Id
    @GeneratedValue
    private long idUsuario;
    private String usuario;
    private String clave;
    private String tipoUsuario;

    public Usuario() {
    }

    public Usuario(String usuario, String clave, String tipoUsuario) {
        this.usuario = usuario;
        this.clave = clave;
        this.tipoUsuario = tipoUsuario;
    }

    public long getId() {
        return idUsuario;
    }

    public void setId(long id) {
        this.idUsuario = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
