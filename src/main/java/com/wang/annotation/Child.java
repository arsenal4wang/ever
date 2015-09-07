package com.wang.annotation;

/**
 * Created by Administrator on 2015/9/6.
 */

public class Child implements Person {

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getAge() {
        return "child age 100" ;
    }
    @Override
    public void Sing() {
        System.out.println("child is singing");
    }

}
