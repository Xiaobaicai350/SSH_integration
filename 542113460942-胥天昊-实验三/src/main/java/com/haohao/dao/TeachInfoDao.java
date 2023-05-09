package com.haohao.dao;

import com.haohao.entity.TeachInfo;

import java.util.List;

public interface TeachInfoDao {
    void save(TeachInfo teachInfo);

    void update(TeachInfo teachInfo);

    void delete(TeachInfo teachInfo);


    TeachInfo findById(Integer id);

    List<TeachInfo> findAll();
}
