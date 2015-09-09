package com.wang.design.strategy;

/**
 * Created by Administrator on 2015/9/9.
 */
public class StrategyContext {
    IStrategy strategy;

    public IStrategy getStrategy() {
        return strategy;
    }

    public double getFinalPrice(double price) {
        if (strategy == null) {
            System.out.print("no strategy");
            strategy = new GerneralCustomer();
        }
        return strategy.getPrice(price);
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }
}
