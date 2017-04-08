package pe.edu.upc.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrador on 08/04/17.
 */
@Entity
@Table
public class OpcionMenuUsuario {
    @Id
    @GeneratedValue
    private long idUsuario;
    private long idOpcionMenu;

    public OpcionMenuUsuario(){}

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public long getIdOpcionMenu() {
        return idOpcionMenu;
    }

    public void setIdOpcionMenu(long idOpcionMenu) {
        this.idOpcionMenu = idOpcionMenu;
    }
}
