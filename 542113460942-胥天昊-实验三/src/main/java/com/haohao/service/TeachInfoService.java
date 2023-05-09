package com.haohao.service;

import com.haohao.entity.TeachInfo;

import java.util.List;

public interface TeachInfoService {
    List<TeachInfo> getAllTeacher();
    boolean saveOne(TeachInfo teachInfo);
    TeachInfo findOne(int id);
    boolean updateOne(TeachInfo teachInfo);
    boolean deleteOne(int id);
}
