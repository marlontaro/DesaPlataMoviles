package pe.edu.upc.dao;

import org.hibernate.Session;
import pe.edu.upc.bean.Usuario;
import pe.edu.upc.service.UsuarioService;

/**
 * Created by Administrador on 31/03/17.
 */
public class Prueba {
   /* public static void main(String[] args) {
        new Prueba().addUsuario();
    }

    public Prueba(){

    }

    public Usuario getUsuario(){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();

        Usuario user = new Usuario();
        user.setUsuario("cliente1");
        user.setClave("1234");
        user.setTipoUsuario("CLIENTE");

        UsuarioService usuarioService=new UsuarioService();
        user = usuarioService.getUsuario(user);
        if(user != null) {
            System.out.println(user.getId() + " - " + user.getUsuario());
        }else {
            System.out.println("no existe usuario");
        }
        HibernateUtil.shutdown();
        return user;
    }

    public Usuario addUsuario(){

        Usuario user = new Usuario();
        user.setUsuario("cliente2");
        user.setClave("1234");
        user.setTipoUsuario("CLIENTE");

        UsuarioService usuarioService=new UsuarioService();
        user = usuarioService.registrarUsuario(user);
        if(user != null) {
            System.out.println(user.getId() + " - " + user.getUsuario());
        }else {
            System.out.println("no existe usuario");
        }
        HibernateUtil.shutdown();
        return user;
    }*/
}
