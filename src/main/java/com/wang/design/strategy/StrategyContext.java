package com.wang.design.strategy;

/**
 * Created by Administrator on 2015/9/9.
 */
public class StrategyContext {
    IStrategy strategy;

    public IStrategy getStrategy() {
        return strategy;
    }

    public double getFinalPrice(double price){
              if (strategy==null){
                  strategy=new GerneralCustomer();

              }   else  if (strategy.getClass().getName().equals("VIPCustomer")){
                  System.out.println("VIP strategy" );
                  strategy=new VIPCustomer();

              }  else  if (strategy.getClass().getName().equals("DiscountCustomer")){
                  System.out.println("VIP strategy" );
                  strategy=new VIPCustomer();
              }
        return  strategy.getPrice(price);
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }
}
