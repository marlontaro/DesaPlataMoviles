package pe.edu.upc.dao;

import org.hibernate.Session;
import org.hibernate.Query;
import pe.edu.upc.bean.Nana;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrador on 04/04/17.
 */
public class NanaDao {

    public List getAllNanas(){
        List nanas = new ArrayList();
        //Session sesion = HibernateUtil.getSessionFactory().openSession();
        Session sesion = HibernateConnector.getInstance().getSession();
        nanas = sesion.createQuery("From Nana n").list();
        sesion.close();
        return nanas;
    }

    public Nana getNana(int id){
        Nana nana = new Nana();
        //Session sesion = HibernateUtil.getSessionFactory().openSession();
        Session sesion = HibernateConnector.getInstance().getSession();
        String sql = "from Nana where id=:id";
        Query query = sesion.createQuery(sql);
        query.setParameter("id",id);
        nana = (Nana) query.uniqueResult();
        sesion.close();
        return nana;
    }
}
