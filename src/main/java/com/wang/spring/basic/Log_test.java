package com.wang.spring.basic;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by Administrator on 2015/9/18.
 */
public class Log_test {

    public static Logger logger = Logger.getLogger(Log_test.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        logger.info("1111");
        logger.debug("begin debug");
        logger.error("error");
    }
}
