package com.haohao.action;

import com.haohao.entity.TeachInfo;
import com.haohao.service.TeachInfoService;
import com.haohao.service.impl.TeachInfoServiceImpl;
import com.haohao.utlis.SpringContextUtils;
import com.opensymphony.xwork2.Action;
import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.annotation.Resource;

@Component
@Data
public class AddTeacherAction implements Action {
//    private final TeachInfoService teachInfoService=new TeachInfoServiceImpl();
    @Autowired
    public  TeachInfoService teachInfoService;
    public Integer id;
    public String name;
    public String sex;
    public Integer age;
    public String department;

    @Override
    public String execute() throws Exception {
        teachInfoService= (TeachInfoService) SpringContextUtils.ctx.getBean("teachInfoService");
        TeachInfo teachInfo = new TeachInfo(id, name, sex, age, department);
        teachInfoService.saveOne(teachInfo);
        return SUCCESS;
    }




}
