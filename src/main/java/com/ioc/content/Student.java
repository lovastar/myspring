package com.ioc.content;/*
@Description:
@Author:liuxx
@Date:2020/3/26 17:50
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class Student {
    @Autowired
    private Environment environment;

    private Integer id;

    public Student() {
    }

    public void testEnvironment(){
        environment.getActiveProfiles();
    }
}
