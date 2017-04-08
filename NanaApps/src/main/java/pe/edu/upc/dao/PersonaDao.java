package pe.edu.upc.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import pe.edu.upc.bean.Persona;

/**
 * Created by Administrador on 08/04/17.
 */
public class PersonaDao {
    public Persona getPersonaById(long idPersona){
        Persona persona = new Persona();
        //Session sesion = HibernateUtil.getSessionFactory().openSession();
        Session sesion = HibernateConnector.getInstance().getSession();
        String sql = "from Persona where idpersona=:id";
        Query query = sesion.createQuery(sql);
        query.setParameter("id",idPersona);
        persona = (Persona) query.uniqueResult();
        sesion.close();
        return persona;<
    }
}
