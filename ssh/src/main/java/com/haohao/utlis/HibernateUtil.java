package com.haohao.utlis;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static Session session;
    static {
        //1.读取hibernate配置文件
        Configuration configure = new Configuration().configure();
        //2.创sessionFactory工厂对象
        sessionFactory = configure.buildSessionFactory();
        session=sessionFactory.openSession();

    }

    public static void closeSession(Session session){
        if(session!=null&&session.isOpen()) {
            session.close();
        }
    }
}
