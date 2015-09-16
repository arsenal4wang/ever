package com.wang.design.proxy;

/**
 * Created by Administrator on 2015/9/8.
 */
public class ProxyTest {
    public static void main(String[] args) {
      /*
        ProxyStaticClass proxy = new ProxyStaticClass();
        proxy.sayHello();
      */
        ProxyDynamic dynamic = new ProxyDynamic();
        IAbstractClass say = (IAbstractClass) dynamic.createDynamicProxyObjectMethod(new RealClass());
        say.sayHello();

        IA ia= (IA) dynamic.createDynamicProxyObjectMethod(new A());
        ia.test();
    } }

