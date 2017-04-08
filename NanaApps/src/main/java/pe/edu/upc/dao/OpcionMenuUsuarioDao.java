package pe.edu.upc.dao;

import org.hibernate.Session;
import pe.edu.upc.bean.OpcionMenu;

import java.util.List;

/**
 * Created by Administrador on 08/04/17.
 */
public class OpcionMenuUsuarioDao {

    public List<OpcionMenu> getMenuUsuario(long idUsuario) {
        Session sesion = HibernateConnector.getInstance().getSession();
        String sql = "select m.* from nanaappsv2.opcionmenu m" +
                "inner join nanaappsv2.opcionmenuusuario mu" +
                "on m.idopcionmenu = mu.idopcionmenu" +
                "and mu.idusuario = :idusuario";
        List<OpcionMenu> menu = (List<OpcionMenu>) sesion.createSQLQuery(sql)
                                                .addEntity(OpcionMenu.class)
                                                .setParameter("idusuario", idUsuario).list();
        sesion.close();
        return menu;
    }

}
