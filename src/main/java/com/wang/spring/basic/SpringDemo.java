package com.wang.spring.basic;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import javax.annotation.Resource;
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
        AutoWiredTest show;
     // show = (AutoWiredTest) ctx.getBean("show");
        show = new AutoWiredTest();
        show.shows();
//      User user= (User) ctx.getBean("user");
//      System.out.println(user);

    }
}
