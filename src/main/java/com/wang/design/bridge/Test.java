package com.wang.design.bridge;

/**
 * Created by Administrator on 2015/9/9.
 */
public class Test {
    public static void main(String[] args) {
        AbsNoodle lamian=new LamianNoodel(new LaStyle());
        lamian.eat();

        AbsNoodle la=new LamianNoodel(new DanStyle());
        la.eat();
    }
}
