package com.wang.design.bridge;

/**
 * Created by Administrator on 2015/9/9.
 */
public abstract class AbsNoodle {
    protected IStyle style;
    public  AbsNoodle(){}
    public AbsNoodle(IStyle style) {
        this.style = style;
    }
    public  abstract void eat();
}
