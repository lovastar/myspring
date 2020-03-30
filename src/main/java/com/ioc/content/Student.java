package com.ioc.content;/*
@Description:
@Author:liuxx
@Date:2020/3/26 17:50
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.FileUrlResource;
import org.springframework.util.PropertyPlaceholderHelper;
import org.springframework.core.io.Resource;

import java.net.MalformedURLException;

@Configuration
public class Student {
   @Autowired
   private PropertySourcesPlaceholderConfigurer  propertySourcesPlaceholderConfigurer ;


    private Integer stuId;
    private String stuName ;
    public Student() {
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void testEnvironment() throws MalformedURLException {
        Resource resurce = new FileUrlResource("classPath:student.properties");
        propertySourcesPlaceholderConfigurer.setLocation(resurce);
    }
}
