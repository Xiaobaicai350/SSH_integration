package com.haohao.action;

import com.haohao.entity.TeachInfo;
import com.haohao.service.TeachInfoService;
import com.haohao.service.impl.TeachInfoServiceImpl;
import com.opensymphony.xwork2.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller

public class FindTeacherAction implements Action {
    @Resource
    public TeachInfoService teachInfoService;
    int id;
    public TeachInfo teachInfo;
    @Override
    public String execute() throws Exception {
        //根据id查询教师
        teachInfo = teachInfoService.findOne(id);
        if (teachInfo!=null){
            return SUCCESS;

        }else {
            return ERROR;
        }
    }

    public TeachInfoService getTeachInfoService() {
        return teachInfoService;
    }

    public void setTeachInfoService(TeachInfoService teachInfoService) {
        this.teachInfoService = teachInfoService;
    }

    public TeachInfo getTeachInfo() {
        return teachInfo;
    }

    public void setTeachInfo(TeachInfo teachInfo) {
        this.teachInfo = teachInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
