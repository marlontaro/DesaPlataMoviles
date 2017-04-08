package pe.edu.upc.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import pe.edu.upc.bean.Persona;
import pe.edu.upc.bean.Usuario;

/**
 * Created by Administrador on 08/04/17.
 */
public class EmpleadoDao {
    public Usuario getEmpleado(Usuario usuario) {
        Usuario user = new Usuario();
        //Session sesion = HibernateUtil.getSessionFactory().openSession();
        Session sesion = HibernateConnector.getInstance().getSession();
        String sql = "select p.* from nanaappsv2.persona p" +
                        "inner join nanaappsv2.usuario u" +
                        "on p.idusuario = u.idusuario" +
                        "and u.usuario = :usuario" +
                        "and u.clave = :clave";
        Query query = sesion.createSQLQuery(sql).addEntity(Persona.class)
                .setParameter("usuario", usuario.getUsuario())
                .setParameter("clave", usuario.getClave());
        user = (Usuario) query.uniqueResult();
        sesion.close();
        return user;
    }
}
