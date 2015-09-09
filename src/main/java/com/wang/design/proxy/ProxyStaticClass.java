package com.wang.design.proxy;

/**
 * Created by Administrator on 2015/9/8.
 */
public class ProxyStaticClass implements IAbstractClass {
    private RealClass realClass;

    public void before() {
        System.out.println("befor say hello in proxy class");
    }
    public void after() {
        System.out.println("after say hello in proxy class");
    }
    @Override
    public void sayHello() {
        this.before();
        realClass = new RealClass();
        realClass.sayHello();
        this.after();
    }
}
