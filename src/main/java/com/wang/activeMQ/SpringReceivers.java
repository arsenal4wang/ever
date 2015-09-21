package com.wang.activeMQ;

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
        while(true) {
            Map<String, Object> map =  (Map<String, Object>) jmsTemplate.receiveAndConvert();

            System.out.println("收到消息：" + map.get("message"));
        }
    }
}
