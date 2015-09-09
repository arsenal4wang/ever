package com.wang.design.observer;

/**
 * Created by Administrator on 2015/9/9.
 */
public class Test {
    public static void main(String[] args) {
        Product p = new Product("电视机", 176);
        NameObserver observer = new NameObserver();
        PriceObserver obs = new PriceObserver();
        p.addObserver(observer);
        p.addObserver(obs);
//      p.removeObserver(obs);
        p.setName("wang");
        p.setPrice(199);
    }
}
