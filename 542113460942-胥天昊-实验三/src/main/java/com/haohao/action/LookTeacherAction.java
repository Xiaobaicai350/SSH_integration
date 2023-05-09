package com.haohao.action;

import com.haohao.entity.TeachInfo;
import com.haohao.service.TeachInfoService;
import com.haohao.service.impl.TeachInfoServiceImpl;
import com.haohao.utlis.SpringContextUtils;
import com.opensymphony.xwork2.Action;

import java.util.ArrayList;
import java.util.List;

public class LookTeacherAction implements Action {
    private List<TeachInfo> teachInfoList;
    TeachInfoService teachInfoService;
    @Override
    public String execute() throws Exception {
        teachInfoService= (TeachInfoService) SpringContextUtils.ctx.getBean("teachInfoService");
        teachInfoList=teachInfoService.getAllTeacher();
        return SUCCESS;
    }

    public List<TeachInfo> getTeachInfoList() {
        return teachInfoList;
    }

    public void setTeachInfoList(List<TeachInfo> teachInfoList) {
        this.teachInfoList = teachInfoList;
    }
}
