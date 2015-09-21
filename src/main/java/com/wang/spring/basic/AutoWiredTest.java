package com.wang.spring.basic;

import com.wang.spring.basic.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2015/9/7.
 */
public class AutoWiredTest {

    @Autowired
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AutoWiredTest(){
    }

    public static void main(String[] args) {
        new AutoWiredTest().shows();
    }
    public void shows() {
        System.out.println(user);
    }
}
