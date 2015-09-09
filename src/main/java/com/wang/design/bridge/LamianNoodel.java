package com.wang.design.bridge;

/**
 * Created by Administrator on 2015/9/9.
 */
public class LamianNoodel extends AbsNoodle {
    public LamianNoodel(IStyle style) {
        super(style);
    }

    @Override
    public void eat() {
        System.out.println("這是一碗拉面:"+super.style.style());
    }
}
