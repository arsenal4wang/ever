package com.wang.annotation;

/**
 * Created by Administrator on 2015/9/6.
 */

public class Child implements Person {

    @Override
    public String name() {
        return "name is james";
    }

    @Override
    public String age() {
        return "child age 100" ;
    }
    @Override
    public void sing() {
        System.out.println("child is singing");
    }

}
