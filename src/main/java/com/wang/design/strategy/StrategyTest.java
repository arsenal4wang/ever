package com.wang.design.strategy;

/**
 * Created by Administrator on 2015/9/9.
 */
public class StrategyTest {
    public static void main(String[] args) {
        StrategyContext context;
        /*no strategy
         */
        double price=100;

        context=new StrategyContext(null);
        System.out.println("under no strategy, the price is:"+context.getFinalPrice(price));

        context=new StrategyContext(new GerneralCustomer());
        System.out.println("under general strategy, the price is:"+context.getFinalPrice(price));

        context=new StrategyContext(new VIPCustomer());
        System.out.println("under VIP strategy, the price is:"+context.getFinalPrice(price));

        context=new StrategyContext(new DiscountCustomer());
        System.out.println("under discount strategy, the price is:"+context.getFinalPrice(price));
    }
}
