package com.haohao.action;

import com.haohao.entity.TeachInfo;
import com.haohao.service.TeachInfoService;
import com.haohao.service.impl.TeachInfoServiceImpl;
import com.opensymphony.xwork2.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UpdateTeacherAction implements Action {
    Integer id;
    String name;
    String sex;
    Integer age;
    String department;
    @Resource
    public   TeachInfoService teachInfoService;

    public void setTeachInfoService(TeachInfoService teachInfoService) {
        this.teachInfoService = teachInfoService;
    }

    @Override
    public String execute() throws Exception {
        TeachInfo teachInfo = new TeachInfo(id, name, sex, age, department);
        teachInfoService.updateOne(teachInfo);
        return SUCCESS;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public TeachInfoService getTeachInfoService() {
        return teachInfoService;
    }
}
