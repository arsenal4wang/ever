package com.wang.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Administrator on 2015/9/7.
 */
public class SpringDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("spring_application.xml");
        AutoWiredTest show = (AutoWiredTest) ctx.getBean("show");
//        Show show = new Show();
        show.shows();
    }
}
