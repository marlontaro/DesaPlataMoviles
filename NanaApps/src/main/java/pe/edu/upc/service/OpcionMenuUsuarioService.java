package pe.edu.upc.service;

import pe.edu.upc.bean.OpcionMenu;

import java.util.List;

/**
 * Created by Administrador on 08/04/17.
 */
public class OpcionMenuUsuarioService {

    public List<OpcionMenu>  getMenu(long idUsuario) {
        List<OpcionMenu>  menu = new OpcionMenuUsuarioService().getMenu(idUsuario);
        return menu;
    }
}
