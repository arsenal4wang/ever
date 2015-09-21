package com.wang.annotation;


/**
 * Created by Administrator on 2015/9/6.
 */
public class Apple {


    @FruitName(value="app")
    private String appleName;


    @FruitColor(fruitColor= FruitColor.Color.RED)
    private String appleColor;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }


    public void displayName(){
        System.out.println("水果的名字是："+ this.appleName);
    }
}