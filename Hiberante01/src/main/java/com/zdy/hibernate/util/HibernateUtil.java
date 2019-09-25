package com.zdy.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by DELL
 * Date: 2019/9/25.
 * Time: 9:20
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactoty ;
    static {
        try{
        sessionFactoty = new Configuration().configure().buildSessionFactory();
        }catch (Throwable ex){
            System.err.println("sessionFactory creation failed.");
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactoty(){
        return sessionFactoty;
    }
    public static void shutdowm(){
        getSessionFactoty().close();
    }
}
