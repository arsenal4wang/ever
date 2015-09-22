package com.wang.design.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2015/9/9.
 * 类似于发布订阅模式
 */
public abstract class Subject {
    ArrayList<Observer> list = new ArrayList<Observer>();

    /**
     * 从主題中注册一个观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    /**
     * 从主题上删除一个观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知该主题上的观察者
     *
     * @param value
     */
    public void notifyObservers(Object value) {
        if (list.size() < 1) {
            System.out.println("没有注册观察者");
        } else {
            for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
                Observer o = (Observer) iterator.next();
                o.update(this, value);

            }
        }
    }
}
