package com.wang.design.observer;

/**
 * Created by Administrator on 2015/9/9.
 */
public class NameObserver implements Observer {
    @Override
    public void update(Subject subject, Object o) {
        if (o instanceof String) {
            System.out.println("名称观察者----> " + subject.getClass().getName() + " ----> 它的名称已经改变为：" + o);
        }
    }
}
