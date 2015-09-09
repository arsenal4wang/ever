package com.wang.design.strategy;

/**
 * Created by Administrator on 2015/9/9.
 */
public class DiscountCustomer implements IStrategy {
    @Override
    public double getPrice(double price) {
        return price*80/100;
    }
}
