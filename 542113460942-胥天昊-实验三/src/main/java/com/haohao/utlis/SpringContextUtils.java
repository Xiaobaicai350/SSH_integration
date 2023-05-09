package com.haohao.utlis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextUtils {
    public final static ClassPathXmlApplicationContext ctx;
    static {
        ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }
}
