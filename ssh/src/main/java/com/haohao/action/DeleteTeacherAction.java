package com.haohao.action;

import com.haohao.service.TeachInfoService;
import com.haohao.service.impl.TeachInfoServiceImpl;
import com.opensymphony.xwork2.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller

public class DeleteTeacherAction implements Action {
    @Resource
    public TeachInfoService teachInfoService;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;
    @Override
    public String execute() throws Exception {
        teachInfoService.deleteOne(id);
        return SUCCESS;
    }

    public TeachInfoService getTeachInfoService() {
        return teachInfoService;
    }

    public void setTeachInfoService(TeachInfoService teachInfoService) {
        this.teachInfoService = teachInfoService;
    }
}
