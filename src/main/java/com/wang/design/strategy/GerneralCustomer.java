package com.wang.design.strategy;

/**
 * Created by Administrator on 2015/9/9.
 */
public class GerneralCustomer implements IStrategy {
    @Override
    public double getPrice(double price) {
        return price;
    }
}
