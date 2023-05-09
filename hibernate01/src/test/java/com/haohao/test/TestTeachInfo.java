package com.haohao.test;

import com.haohao.entity.TeachInfo;
import com.haohao.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TestTeachInfo {

    @Test
    public void testAdd(){
        //1.读取hibernate配置文件
        Configuration configure = new Configuration().configure();
        //2.创sessionFactory工厂对象
        SessionFactory sessionFactory = configure.buildSessionFactory();
        //3.创Session对象
        //使用openSession()方法获取的session对象，用完需要手动关闭session
        Session session = sessionFactory.openSession();
        //4.开启事务
        Transaction transaction = session.beginTransaction();
        //5.持久化操作
        TeachInfo teachInfo = new TeachInfo();
        teachInfo.setName("瑶瑶");
        teachInfo.setAge(18);
        teachInfo.setSex("女");
        teachInfo.setDepartment("学生");
        try {
            //保存
            session.save(teachInfo);
            //提交事务
            transaction.commit();
        } catch (Exception e) {
            //回滚
            e.printStackTrace();
            transaction.rollback();
        } finally {
            if(null!=session){
                session.close();
            }
        }
    }
    @Test
    public void testGet(){
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        //get方法根据主键进行查询，找不到的返回null
        TeachInfo teachInfo = session.get(TeachInfo.class, 1);
        System.out.println(teachInfo);
        HibernateUtil.closeSession(session);
    }
    @Test
    public void testLoad(){
        //测试延迟加载
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        //不用就不会去查询，并且找不到的话会报错
        TeachInfo teachInfo = session.load(TeachInfo.class, 1);
//        System.out.println(teachInfo);
        HibernateUtil.closeSession(session);
    }
    @Test
    public void testDelete(){
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        //先查询再删除
        TeachInfo teachInfo = session.load(TeachInfo.class, 3);
        session.delete(teachInfo);

        transaction.commit();
        HibernateUtil.closeSession(session);
    }
    @Test
    public void testUpdate(){
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        TeachInfo teachInfo = new TeachInfo();
        teachInfo.setId(3);
        teachInfo.setName("郭瑶");
        session.update(teachInfo);

        transaction.commit();
        HibernateUtil.closeSession(session);
    }
}
