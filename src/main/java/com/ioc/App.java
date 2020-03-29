package com.ioc;/*
@Description:
@Author:liuxx
@Date:2020/3/26 17:48
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Stack;

@ComponentScan("com.ioc")
public class App {
    public static void main(String[] args) throws Exception{
        ApplicationContext ac = new AnnotationConfigApplicationContext(App.class);
        String[] beans = ac.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println(bean);
        }
    }

}
