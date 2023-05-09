package com.haohao.action;

import com.haohao.entity.TeachInfo;
import com.haohao.service.TeachInfoService;
import com.haohao.service.impl.TeachInfoServiceImpl;
import com.opensymphony.xwork2.Action;

public class AddTeacherAction implements Action {
    private final TeachInfoService teachInfoService=new TeachInfoServiceImpl();
    public Integer id;
    public String name;
    public String sex;
    public Integer age;
    public String department;
    @Override
    public String execute() throws Exception {
        TeachInfo teachInfo = new TeachInfo(id, name, sex, age, department);
        teachInfoService.saveOne(teachInfo);
        return SUCCESS;
    }

    public TeachInfoService getTeachInfoService() {
        return teachInfoService;
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
}
