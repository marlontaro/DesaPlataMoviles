package pe.edu.upc.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Administrador on 31/03/17.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        SessionFactory sesion = null;
        try {
            Configuration confi = new Configuration();
            confi = confi.configure();
            sesion = confi.buildSessionFactory();
        }catch (Exception ex){
            ex.printStackTrace();
            throw new ExceptionInInitializerError("error al iniciar sesion factory");
        }
        return sesion;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        sessionFactory.close();
    }
}
