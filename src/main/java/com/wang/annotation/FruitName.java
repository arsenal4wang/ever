package com.wang.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2015/9/6.
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface FruitName {
   String value();

}
