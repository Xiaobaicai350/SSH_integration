package com.haohao.service.impl;

import com.haohao.entity.TeachInfo;
import com.haohao.service.TeachInfoService;
import com.haohao.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class TeachInfoServiceImpl implements TeachInfoService {
    Session session= HibernateUtil.session;

    @Override
    public List<TeachInfo> getAllTeacher() {
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from TeachInfo");
        List list = query.list();
        transaction.commit();
        return list;
    }

    @Override
    public boolean saveOne(TeachInfo teachInfo) {
        Transaction transaction = session.beginTransaction();
        session.save(teachInfo);
        transaction.commit();
        return true;
    }

    @Override
    public TeachInfo findOne(int id) {
        Transaction transaction = session.beginTransaction();
        TeachInfo teachInfo = session.load(TeachInfo.class, id);
        transaction.commit();
        return teachInfo;
    }

    @Override
    public boolean updateOne(TeachInfo teachInfo) {
        Transaction transaction = session.beginTransaction();
        session.merge(teachInfo);
        transaction.commit();
        return true;
    }

    @Override
    public boolean deleteOne(int id) {
        Transaction transaction = session.beginTransaction();
        TeachInfo teachInfo = session.load(TeachInfo.class, id);
        session.delete(teachInfo);
        transaction.commit();
        return true;
    }
}
