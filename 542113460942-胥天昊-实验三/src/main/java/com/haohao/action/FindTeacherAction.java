package com.haohao.action;

import com.haohao.entity.TeachInfo;
import com.haohao.service.TeachInfoService;
import com.haohao.service.impl.TeachInfoServiceImpl;
import com.haohao.utlis.SpringContextUtils;
import com.opensymphony.xwork2.Action;

public class FindTeacherAction implements Action {
    TeachInfoService teachInfoService;
    int id;
    public TeachInfo teachInfo;
    @Override
    public String execute() throws Exception {
        teachInfoService= (TeachInfoService) SpringContextUtils.ctx.getBean("teachInfoService");
        //根据id查询教师
        teachInfo = teachInfoService.findOne(id);
        if (teachInfo!=null){
            return SUCCESS;

        }else {
            return ERROR;
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
