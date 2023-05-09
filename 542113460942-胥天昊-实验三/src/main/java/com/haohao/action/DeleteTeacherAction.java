package com.haohao.action;

import com.haohao.service.TeachInfoService;
import com.haohao.service.impl.TeachInfoServiceImpl;
import com.haohao.utlis.SpringContextUtils;
import com.opensymphony.xwork2.Action;

public class DeleteTeacherAction implements Action {
    TeachInfoService teachInfoService;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;
    @Override
    public String execute() throws Exception {
        teachInfoService= (TeachInfoService) SpringContextUtils.ctx.getBean("teachInfoService");
        teachInfoService.deleteOne(id);
        return SUCCESS;
    }
}
