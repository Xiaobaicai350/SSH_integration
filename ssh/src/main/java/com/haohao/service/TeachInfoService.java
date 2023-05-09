package com.haohao.service;

import com.haohao.entity.TeachInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeachInfoService {
    List<TeachInfo> getAllTeacher();
    boolean saveOne(TeachInfo teachInfo);
    TeachInfo findOne(int id);
    boolean updateOne(TeachInfo teachInfo);
    boolean deleteOne(int id);
}
