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
public class OpcionMenu {
    @Id
    @GeneratedValue
    private long idOpcionMenu;
    private String descripcion;

    public OpcionMenu(){}

    public long getIdOpcionMenu() {
        return idOpcionMenu;
    }

    public void setIdOpcionMenu(long idOpcionMenu) {
        this.idOpcionMenu = idOpcionMenu;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
