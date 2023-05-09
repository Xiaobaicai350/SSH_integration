package com.haohao.service.impl;

import com.haohao.dao.TeachInfoDao;
import com.haohao.dao.impl.TeachInfoDaoImpl;
import com.haohao.entity.TeachInfo;
import com.haohao.service.TeachInfoService;
//import com.haohao.utlis.HibernateUtil;
import com.haohao.utlis.SpringContextUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

public class TeachInfoServiceImpl implements TeachInfoService {
//    Session session=HibernateUtil.session;

    TeachInfoDao teachInfoDao;
    @Override
    public List<TeachInfo> getAllTeacher() {
//        Transaction transaction = session.beginTransaction();
//        Query query = session.createQuery("from TeachInfo");
//        List list = query.list();
//        transaction.commit();
        teachInfoDao = (TeachInfoDao) SpringContextUtils.ctx.getBean("teachInfoDao");
        List<TeachInfo> list = teachInfoDao.findAll();
        return list;
    }

    @Override
    public boolean saveOne(TeachInfo teachInfo) {
//        Transaction transaction = session.beginTransaction();
//        session.save(teachInfo);
//        transaction.commit();
        teachInfoDao = (TeachInfoDao) SpringContextUtils.ctx.getBean("teachInfoDao");
        teachInfoDao.save(teachInfo);
        return true;
    }

    @Override
    public TeachInfo findOne(int id) {
//        Transaction transaction = session.beginTransaction();
//        TeachInfo teachInfo = session.load(TeachInfo.class, id);
//        transaction.commit();
        teachInfoDao = (TeachInfoDao) SpringContextUtils.ctx.getBean("teachInfoDao");

        TeachInfo teachInfo = teachInfoDao.findById(id);
        return teachInfo;
    }

    @Override
    public boolean updateOne(TeachInfo teachInfo) {
        teachInfoDao = (TeachInfoDao) SpringContextUtils.ctx.getBean("teachInfoDao");
        teachInfoDao.update(teachInfo);
//        Transaction transaction = session.beginTransaction();
//        session.merge(teachInfo);
//        transaction.commit();
        return true;
    }

    @Override
    public boolean deleteOne(int id) {
        teachInfoDao = (TeachInfoDao) SpringContextUtils.ctx.getBean("teachInfoDao");
        TeachInfo teachInfo = new TeachInfo();
        teachInfo.setId(id);
        teachInfoDao.delete(teachInfo);
//        Transaction transaction = session.beginTransaction();
//        TeachInfo teachInfo = session.load(TeachInfo.class, id);
//        session.delete(teachInfo);
//        transaction.commit();
        return true;
    }
}
