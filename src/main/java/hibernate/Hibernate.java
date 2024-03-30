package hibernate;

import models.Client;
import models.Planet;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Hibernate {
    private static final Hibernate INSTANCE;

     private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    static {
        INSTANCE = new Hibernate();
    }

    private Hibernate() {
        sessionFactory = new Configuration()
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Planet.class)
                .buildSessionFactory();
    }

    public static Hibernate getInstance() {
        return INSTANCE;
    }

    public void close() {
        sessionFactory.close();
    }

}
