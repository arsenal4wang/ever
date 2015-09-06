package com.wang.annotation;

/**
 * Created by Administrator on 2015/9/6.
 */
public interface Person {

    public String name();

    public String age();

   @Deprecated
    public void sing();

}
