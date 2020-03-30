package com.ioc;/*
@Description:
@Author:liuxx
@Date:2020/3/26 17:48
*/

import org.omg.CORBA.Environment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.util.Map;
import java.util.Properties;
import java.util.Stack;

//@ComponentScan("com.ioc")
public class App {

    public static void main(String[] args) throws Exception{
       // ApplicationContext ac = new AnnotationConfigApplicationContext("com.ioc");
   ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"classpath:application-${test}.xml"},true,null);
        String[] beans = ac.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println(bean);
        }
    }

}
