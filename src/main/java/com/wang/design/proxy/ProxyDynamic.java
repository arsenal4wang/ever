package com.wang.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2015/9/8.
 */
public class ProxyDynamic implements InvocationHandler {

    //要代理的原始对象
    private Object objOriginal;

    public ProxyDynamic() {
    }

    public ProxyDynamic(Object o) {
        this.objOriginal = o;
    }
    public Object createDynamicProxyObjectMethod(Object targetObject){
        this.objOriginal = targetObject;//因为是要真实对象的代理，所以这块必须引入真实对象
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), //这个参数是得到类的加载器
                targetObject.getClass().getInterfaces(),
                this); //此处的this急救等于 new DynaProxyObject()
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        this.before();
        result = method.invoke(objOriginal,args);
        this.after();
        return result;
    }

    public void before() {
        System.out.println("before---------------");
    }

    public void after() {
        System.out.println("after---------------");
    }
}
