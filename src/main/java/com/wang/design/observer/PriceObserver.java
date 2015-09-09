package com.wang.design.observer;

/**
 * Created by Administrator on 2015/9/9.
 */
public class PriceObserver implements Observer {
    @Override
    public void update(Subject subject, Object o) {
        if (o instanceof Double) {
            System.out.println("价格观察者 ----> " + subject.getClass().getName() + " ----> 它的价格已经改变为：" + o);
        }
    }
}
