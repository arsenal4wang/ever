package com.wang.activeMQ;

import org.apache.log4j.PropertyConfigurator;
import org.apache.xbean.spring.context.FileSystemXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import java.util.Map;

/**
 * Created by wangyg.
 */
public class SpringReceivers {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("spring_application.xml");
        JmsTemplate jmsTemplate = (JmsTemplate) ctx.getBean("jmsTemplate");
        while (true) {
            System.out.println("开始接受消息。。。。");
            Map<String, Object> map = (Map<String, Object>) jmsTemplate.receiveAndConvert();
            if (map.get("message") != null) {
                System.out.println("收到消息：" + map.get("message"));
            } else {
                System.out.println("没有消息了");
                break;
            }
        }
    }
}

