package pe.edu.upc.service;

import pe.edu.upc.bean.Usuario;
import pe.edu.upc.dao.UsuarioDao;

/**
 * Created by Administrador on 30/03/17.
 */
public class UsuarioService {


    public Usuario getUsuario(Usuario usuario) {
        Usuario user = null;
        try {
            user = new UsuarioDao().getUsuario(usuario);
        } catch (Exception ex) {
            user = null;
        }
        return user;
    }

    public Usuario registrarUsuario(Usuario usuario) {
        Usuario user = null;
        try {
            user = new UsuarioDao().registrarUsuario(usuario);
        } catch (Exception ex) {
            ex.printStackTrace();
            user = null;
        }
        return user;
    }


}
