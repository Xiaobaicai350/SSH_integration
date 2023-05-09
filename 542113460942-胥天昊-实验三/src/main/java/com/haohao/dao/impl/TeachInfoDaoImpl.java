package com.haohao.dao.impl;

import com.haohao.dao.TeachInfoDao;
import com.haohao.entity.TeachInfo;
import com.haohao.utlis.SpringContextUtils;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class TeachInfoDaoImpl implements TeachInfoDao {
    private HibernateTemplate hibernateTemplate;


    @Override
    public void save(TeachInfo teachInfo) {
        hibernateTemplate= (HibernateTemplate) SpringContextUtils.ctx.getBean("hibernateTemplate");

        hibernateTemplate.save(teachInfo);
    }

    @Override
    public void update(TeachInfo teachInfo) {
        hibernateTemplate= (HibernateTemplate) SpringContextUtils.ctx.getBean("hibernateTemplate");

        hibernateTemplate.update(teachInfo);
    }

    @Override
    public void delete(TeachInfo teachInfo) {
        hibernateTemplate= (HibernateTemplate) SpringContextUtils.ctx.getBean("hibernateTemplate");

        hibernateTemplate.delete(teachInfo);
    }

    @Override
    public TeachInfo findById( Integer id) {
        hibernateTemplate= (HibernateTemplate) SpringContextUtils.ctx.getBean("hibernateTemplate");
        return hibernateTemplate.get(TeachInfo.class, id);
    }

    @Override
    public List<TeachInfo> findAll() {
        hibernateTemplate= (HibernateTemplate) SpringContextUtils.ctx.getBean("hibernateTemplate");
        return hibernateTemplate.loadAll(TeachInfo.class);
    }
}
