package com.wang.spring.basic;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Administrator on 2015/9/7.
 */
public class SpringDemo {
    public static void main(String[] args) throws FileNotFoundException {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("spring_application.xml");
//        AutoWiredTest show = (AutoWiredTest) ctx.getBean("show");
//        Show show = new Show();
       User user= (User) ctx.getBean("user");
       System.out.println(user);
    }
}
