package com.haohao.service.impl;

import com.haohao.entity.TeachInfo;
import com.haohao.service.TeachInfoService;
import com.haohao.utlis.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeachInfoServiceImpl implements TeachInfoService {
    // 使用 Hibernate 提供的模板
    @Resource
    public HibernateTemplate hibernateTemplate;

    // 生成对应的 get 和 set 方法
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    @Override
    public List<TeachInfo> getAllTeacher() {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from TeachInfo");
        List list = query.list();
        transaction.commit();
        return list;
    }

    @Override
    public boolean saveOne(TeachInfo teachInfo) {
        Session session = hibernateTemplate.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();
        session.save(teachInfo);
        transaction.commit();
        return true;
    }

    @Override
    public TeachInfo findOne(int id) {
        Session session = hibernateTemplate.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();
        TeachInfo teachInfo = session.load(TeachInfo.class, id);
        transaction.commit();
        return teachInfo;
    }

    @Override
    public boolean updateOne(TeachInfo teachInfo) {
        Session session = hibernateTemplate.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();
        session.merge(teachInfo);
        transaction.commit();
        return true;
    }

    @Override
    public boolean deleteOne(int id) {
        Session session = hibernateTemplate.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();
        TeachInfo teachInfo = session.load(TeachInfo.class, id);
        session.delete(teachInfo);
        transaction.commit();
        return true;
    }
}
