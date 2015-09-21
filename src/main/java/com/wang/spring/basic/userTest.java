package com.wang.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/9/18.
 */
public class userTest{
    @Autowired
    private  User user;

    public void setUser(User user) {
        this.user = user;
    }
    public userTest(){}
    public userTest(User user){
        this.user=user;

    }
    public void show(){
        System.out.println(this.user.getName());
    }
    public static void  main(String[] args){
        userTest test=new userTest();
        test.show();
    }
}
