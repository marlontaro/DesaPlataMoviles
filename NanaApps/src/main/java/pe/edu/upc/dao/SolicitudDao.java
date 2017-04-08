package pe.edu.upc.dao;

import org.hibernate.Session;
import pe.edu.upc.bean.Solicitud;

import java.util.List;

/**
 * Created by Administrador on 04/04/17.
 */
public class SolicitudDao {

    public Solicitud registrarSolicitud(Solicitud solicitud) {
        //Session sesion = HibernateUtil.getSessionFactory().openSession();
        Session sesion = HibernateConnector.getInstance().getSession();
        sesion.beginTransaction();
        sesion.save(solicitud);
        sesion.getTransaction().commit();
        sesion.close();
        return solicitud;
    }

    public List getSolicitudesByNana(int idNana) {
        //Session sesion = HibernateUtil.getSessionFactory().openSession();
        Session sesion = HibernateConnector.getInstance().getSession();
        String sql = "select s.idsolicitud,s.nombre,s.apellido,s.cantidadninos,s.horario,s.direccion,s.estado,s.comentario from nanaapps.solicitud s " +
                "inner join nanaapps.solicitudnana sn on s.idsolicitud = sn.idsolicitud " +
                "inner join nanaapps.nana n on sn.idnana = n.idnana " +
                "where n.idnana = :idNana " +
                "and sn.estado = 'ACTIVO'";
        List solicitudes = sesion.createSQLQuery(sql).setParameter("idNana", idNana).list();
        sesion.close();
        return solicitudes;
    }

    public Solicitud getSolicitud(int idSolicitud) {
        //Session sesion = HibernateUtil.getSessionFactory().openSession();
        Session sesion = HibernateConnector.getInstance().getSession();
        Solicitud solicitud = (Solicitud) sesion.createQuery("From Solicitud where idsolicitud= :id")
                .setParameter("id", idSolicitud)
                .uniqueResult();
        sesion.close();
        return solicitud;
    }

    public Solicitud updateSolicitud(Solicitud solicitud) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        //Session sesion = HibernateConnector.getInstance().getSession();
        sesion.beginTransaction();
        sesion.update(solicitud);
        sesion.getTransaction().commit();
        sesion.close();
        return solicitud;
    }


}
