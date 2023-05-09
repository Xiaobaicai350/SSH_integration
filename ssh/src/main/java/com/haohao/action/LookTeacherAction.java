package com.haohao.action;

import com.haohao.entity.TeachInfo;
import com.haohao.service.TeachInfoService;
import com.haohao.service.impl.TeachInfoServiceImpl;
import com.opensymphony.xwork2.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;
@Controller

public class LookTeacherAction implements Action {
    @Resource
    public TeachInfoService teachInfoService;
    private List<TeachInfo> teachInfoList;


    @Override
    public String execute() throws Exception {
        teachInfoList=teachInfoService.getAllTeacher();
        return SUCCESS;
    }
    public TeachInfoService getTeachInfoService() {
        return teachInfoService;
    }

    public void setTeachInfoService(TeachInfoService teachInfoService) {
        this.teachInfoService = teachInfoService;
    }
    public List<TeachInfo> getTeachInfoList() {
        return teachInfoList;
    }

    public void setTeachInfoList(List<TeachInfo> teachInfoList) {
        this.teachInfoList = teachInfoList;
    }
}
