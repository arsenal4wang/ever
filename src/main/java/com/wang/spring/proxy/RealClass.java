package com.wang.spring.proxy;

/**
 * Created by Administrator on 2015/9/8.
 */
public class RealClass implements IAbstractClass {
    @Override
    public void sayHello() {
        System.out.println("say hello");
    }
}
