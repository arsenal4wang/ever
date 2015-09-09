package com.wang.design.strategy;

/**
 * Created by Administrator on 2015/9/9.
 */
public class StrategyContext {
    IStrategy strategy;

    public IStrategy getStrategy() {
        return strategy;
    }

    /**
     * @param price
     * @return
     */
    public double getFinalPrice(double price) {
        if (strategy == null) {
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
