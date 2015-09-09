package com.wang.design.observer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2015/9/9.
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Product p = new Product("name", 1000);
        NameObserver observer = new NameObserver();
        PriceObserver obs = new PriceObserver();
        p.addObserver(observer);
        p.addObserver(obs);
//      p.removeObserver(obs);
        p.setName("wang");
        p.setPrice(199);

        Class cls = Class.forName("com.wang.design.observer.Product");
        Method mtd = cls.getMethod("setName", new Class[]{String.class});
        Product o = (Product) cls.newInstance();
        o.addObserver(observer);
        mtd.invoke(o, new Object[]{"myName"});

    }
}
