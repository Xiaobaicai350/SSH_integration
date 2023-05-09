package com.haohao.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.awt.*;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    static {
        //1.读取hibernate配置文件
        Configuration configure = new Configuration().configure();
        //2.创sessionFactory工厂对象
        sessionFactory = configure.buildSessionFactory();
    }
    public static Session getSession(){
        //这个需要在配置文件中配置上下文
        //使用这个必须添加事务,要不然会报错！！
        return sessionFactory.getCurrentSession();
    }
    public static void closeSession(Session session){
        if(session!=null&&session.isOpen()) {
            session.close();
        }
        sessionFactory.close();
    }
}
